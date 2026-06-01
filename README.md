MIT License

Copyright (c) 2026

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
# DL-GAA Artifact

A curated, reproducibility-oriented Java artifact for the DL-GAA cloud scheduling framework with self-adaptive closed-loop feedback and online continuous learning.

## Overview

This repository provides a structured and runnable research artifact that reflects the workflow described in the DL-GAA paper:

1. workload sequence ingestion
2. sequence-based workload forecasting
3. resource optimization using a GAA-style evolutionary scheduler
4. self-adaptive closed-loop residual feedback
5. online predictor refinement
6. metric export and traceable reporting

The artifact is designed for **workflow reproducibility** and **architectural transparency**, rather than bitwise reproduction of the original full simulator.

## Key Features

- Java 17 + Maven build
- Executable fat JAR
- Structured experiment configs
- Static vs dynamic execution modes
- Closed-loop residual feedback
- Threshold-based and damping-regulated online adaptation
- Traceability mapping from paper equations to code modules
- GitHub-friendly project organization

## Reproducibility Scope

This artifact reproduces the **algorithmic workflow** and **evaluation logic** of the proposed framework:
- initialization
- forecasting
- optimization
- feedback-driven correction
- metric computation

It does **not** claim to be an identical binary reproduction of any private or unavailable original simulator implementation.

## Implemented Paper Concepts

- workload forecasting abstraction
- GAA-inspired optimization flow
- residual-based closed-loop feedback
- online parameter adaptation
- stability threshold and damping control
- SLA / energy / migration accounting
- diagnostic degree of imbalance (DI)

## Repository Structure
```text
src/main/java/org/dlgaa/
  app/            Entry points and CLI
  config/         Config parsing and immutable settings
  dataset/        Workload traces and loaders
  history/        Time-series history management
  prediction/     Forecasting and online adaptation
  model/          Core domain entities
  optimization/   GAA-inspired scheduling optimizer
  simulation/     Scheduling and execution engine
  feedback/       Closed-loop control layer
  metrics/        Evaluation metrics
  output/         Result export
  experiment/     End-to-end experiment orchestration
