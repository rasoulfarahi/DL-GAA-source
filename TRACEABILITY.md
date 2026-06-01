# Traceability Matrix

This file maps paper equations and algorithmic concepts to code modules in the artifact.

| Paper Section | Equation / Concept | Code Module | Notes |
|---|---|---|---|
| Section 3.4.1 | Eq. (17) Residual feedback | `prediction/ResidualFeedbackSignal.java` | normalized residual computation |
| Section 3.4.2 | Eq. (18) Online update | `prediction/OnlineUpdateRule.java` | gradient-like online correction |
| Section 3.4.3 | Eq. (19) Threshold + damping | `feedback/StabilityRegulator.java` | regulated parameter update |
| Algorithm 1 | Forecasting phase | `prediction/*` | sequence-based forecasting |
| Algorithm 1 | Optimization phase | `optimization/GaaOptimizer.java` | candidate scheduling search |
| Algorithm 1 | Closed-loop update | `feedback/ClosedLoopController.java` | feedback orchestration |
| Metrics | Eq. (30) | `metrics/SlaMetrics.java` | SLATAH |
| Metrics | Eq. (31) | `metrics/SlaMetrics.java` | PDM |
| Metrics | Eq. (32) | `metrics/SlaMetrics.java` | SLAV |
| Metrics | Eq. (33) | `metrics/EnergyMetrics.java` | total energy |
| Metrics | Eq. (34) | `simulation/PowerModel.java` | power model |
| Metrics | Eq. (35) | `metrics/MigrationMetrics.java` | migration count |
| Empirical analysis | Eq. (40) DI | `metrics/ImbalanceMetrics.java` | supplementary diagnostic metric |
