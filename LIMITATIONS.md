# Limitations

This artifact is intentionally designed as a curated reproducibility package.

## Scope

The repository focuses on:
- workflow transparency
- algorithmic traceability
- runnable experimentation
- closed-loop scheduling logic

## Known Simplifications

1. The predictor implementation is an **LSTM-like abstraction** rather than a full industrial-grade deep learning stack.
2. The evolutionary optimizer is a curated GAA-inspired implementation intended to reproduce scheduling logic, not necessarily the exact private source behavior.
3. Some datasets may be represented through normalized or synthetic adapters for portability and licensing safety.
4. DI is used as a diagnostic load-balancing metric and should be reported as such.
5. Results are intended for methodological reproducibility, not exact binary identity with unavailable original infrastructure.

## Why this is still useful

Despite these simplifications, the artifact preserves:
- the four-phase workflow
- the closed-loop feedback logic
- the residual-driven online adaptation design
- the comparative static vs dynamic experimental framing
- traceable metric computation
