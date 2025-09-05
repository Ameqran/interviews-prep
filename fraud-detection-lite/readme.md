# Mini-Ravelin (Fraud Detection) — Weekly Prep Plan

This README tracks the **Spring Boot microservices part** of the fraud detection project. Inspired by Ravelin-style real-time risk scoring.

---

## 📅 Week 1 — Setup & Foundations

* **Day 1**

  * Create repo `fraud-detection-lite` (Maven multi-module).
  * Add root `docker-compose.yml` with Postgres + Adminer.
  * Add `fraud-ingestor` (Spring Boot 3) → REST endpoint `POST /v1/transactions`.
  * Add `risk-service` (Spring Boot 3) → empty skeleton.
  * Commit basic structure + health endpoints.

* **Day 2**

  * Define transaction schema via Flyway: `(id, ts, userId, cardId, amount, ip, location, status)`.
  * Implement `fraud-ingestor` persistence with Spring Data JPA.
  * Seed database with dummy transactions.

* **Day 3**

  * Implement `risk-service` skeleton:

    * Expose `GET /v1/risk/{transactionId}`.
    * Connect to DB and fetch transaction.
  * Add simple rules: e.g., `amount > 1000 → suspicious`.

* **Day 4**

  * Introduce **Drools** or custom rules engine in `risk-service`.
  * Write 2–3 basic fraud rules (same IP + multiple cards, blacklisted location, high amount).

* **Day 5**

  * Add Kafka broker in `docker-compose.yml`.
  * Publish each transaction event to topic `transactions`.
  * Subscribe in `risk-service` and auto-score in real time.

---

## 📅 Week 2 — Extending & Observability

* Add `alerts-service` that listens to `fraudulent-transactions` topic.
* Store high-risk events in Postgres + expose via REST.
* Add basic Angular/React dashboard (optional later).
* Add integration tests with Testcontainers.
* Document rules in a Markdown file.

---

## ✅ Deliverables Each Day

* Code committed with clear folder structure.
* Health endpoints working.
* Small README updates.
* ClickUp tasks for key learnings/questions.

---

## 🧩 Modules

* **fraud-ingestor**: accepts transactions & stores them.
* **risk-service**: applies rules & scores risk.
* **alerts-service** (week 2): raises alerts.
* **common-dto**: shared models (if needed).

---

## 🛠️ Tech Stack

* Java 17 / Spring Boot 3
* Postgres + Flyway
* Kafka + Docker Compose
* Drools (rules engine)
* JUnit 5 + Testcontainers
