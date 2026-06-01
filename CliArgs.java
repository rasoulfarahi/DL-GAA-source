package org.dlgaa.app;

import org.dlgaa.util.Validate;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public final class CliArgs {
    private final String configPath;
    private final String scenario;
    private final long seed;
    private final Path outputRoot;
    private final boolean quiet;

    private CliArgs(String configPath, String scenario, long seed, Path outputRoot, boolean quiet) {
        this.configPath = configPath;
        this.scenario = scenario;
        this.seed = seed;
        this.outputRoot = outputRoot;
        this.quiet = quiet;
    }

    public String configPath() {
        return configPath;
    }

    public String scenario() {
        return scenario;
    }

    public long seed() {
        return seed;
    }

    public Path outputRoot() {
        return outputRoot;
    }

    public boolean quiet() {
        return quiet;
    }

    public static CliArgs parse(String[] args) {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < args.length; i++) {
            String key = args[i];
            if (!key.startsWith("--")) {
                continue;
            }
            if (i + 1 < args.length && !args[i + 1].startsWith("--")) {
                map.put(key, args[i + 1]);
                i++;
            } else {
                map.put(key, "true");
            }
        }

        String config = map.getOrDefault("--config", "config/smoke.properties");
        String scenario = map.getOrDefault("--scenario", "smoke");
        long seed = parseLong(map.getOrDefault("--seed", "42"), 42L);
        Path out = Paths.get(map.getOrDefault("--out", "output")).toAbsolutePath().normalize();
        boolean quiet = Boolean.parseBoolean(map.getOrDefault("--quiet", "false"));

        Validate.notBlank(config, "config");
        Validate.notBlank(scenario, "scenario");

        return new CliArgs(config, scenario, seed, out, quiet);
    }

    private static long parseLong(String value, long fallback) {
        try {
            return Long.parseLong(value.trim());
        } catch (Exception e) {
            return fallback;
        }
    }

    public static String help() {
        return String.join(System.lineSeparator(),
                "DL-GAA Artifact",
                "",
                "Usage:",
                "  java -jar target/dl-gaa-artifact-1.0.0.jar --config config/smoke.properties --scenario smoke --seed 42 --out output",
                "",
                "Options:",
                "  --config   configuration file path",
                "  --scenario scenario name",
                "  --seed     random seed",
                "  --out      output root directory",
                "  --quiet    true|false",
                "  --help     prints this help");
    }
}
