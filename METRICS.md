# Metrics

This document summarizes the metrics implemented or documented in this artifact.

## Primary Metrics from the Paper

### SLATAH
SLA violation time per active host.

### PDM
Performance degradation due to migration.

### SLAV
Combined SLA violation metric.

### Total Energy
Aggregate host energy consumption over the simulated horizon.

### Power Model
Linear host power model between idle and maximum power.

### Number of Migrations
Total VM migration count.

## Diagnostic Metric

### Degree of Imbalance (DI)
DI is included as a **diagnostic supplementary metric** for load-balancing analysis and cross-dataset comparison.

It is not treated as a primary claimed contribution unless explicitly stated in the evaluation section.

## Closed-Loop Validation Metrics

The artifact also exposes:
- residual magnitude over time
- feedback activation count
- online update ratio
- static vs dynamic comparison summaries

## Reporting Principle

Whenever possible, metrics are exported both:
1. per simulation step
2. as final aggregate summaries
