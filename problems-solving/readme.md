# Senior Java Backend Interview Prep 30-Day Plan

This repository contains a tight, 30-problem curated list tailored for **Senior Java Backend interviews**. The plan is structured to be completed in \~1–2 problems per day over one month. All solutions should be implemented in **Java 17**, with proper **unit tests**, and practice explaining them out loud.

---

## 📅 Week 1 — Arrays & Strings (Speed + Patterns)

* **Two Sum** — pattern: hashmap lookup
* **Best Time to Buy and Sell Stock** — running min/max
* **Valid Anagram** — counting vs sorting
* **Group Anagrams** — canonical key (sorted/counts)
* **Longest Substring Without Repeating Characters** — sliding window
* **Product of Array Except Self** — prefix/suffix
* **Maximum Subarray** — Kadane’s algorithm
* **Top K Frequent Elements** — heap/bucket

---

## 📅 Week 2 — Intervals, Two-Pointers, Linked Lists

* **Merge Intervals** — sort + sweep
* **Insert Interval** — careful merging
* **3Sum** — two-pointer after sort
* **Meeting Rooms II** — min-heap on end times
* **Reverse Linked List** — iterative + recursive
* **Linked List Cycle** — Floyd’s tortoise/hare
* **LRU Cache** — LinkedHashMap / custom DLL+HashMap

---

## 📅 Week 3 — Trees & Graphs (Backend Must-Know)

* **Binary Tree Level Order Traversal** — BFS queue
* **Validate Binary Search Tree** — inorder bounds
* **Lowest Common Ancestor (BST or general tree)** — recursion logic
* **Number of Islands** — DFS/BFS grid
* **Course Schedule** — topo sort (Kahn/DFS)
* **K Closest Points to Origin** — heap/quickselect

---

## 📅 Week 3.5 — SQL & JPA (Very Common in Senior Rounds)

* **SQL: Top N per group** — window functions (`ROW_NUMBER / PARTITION BY`)
* **SQL: Find active users last 30 days** — DATE ops, indexes, explain plan

👉 Practice both queries in **PostgreSQL** locally, then rewrite via **Spring Data JPA** with `@Query`. Use `EXPLAIN ANALYZE` to measure performance.

---

## 📅 Week 4 — Concurrency (Java) + Extras that Close Offers

* **Print in Order (LeetCode 1114)** — CountDownLatch / volatile / lock
* **Fizz Buzz Multithreaded (1195)** — semaphore/locks
* **Building H₂O (1117)** — barrier/semaphore
* **Dining Philosophers (1226)** — lock ordering / tryLock / deadlock-free
* **Binary Search Variants** — lower/upper bound (library code you re-use)
* **Design Rate Limiter** — token bucket / sliding window (Java impl)
* **Design Hit Counter / Moving Average** — queue + time buckets

---

## ✅ Usage

1. Clone this repo.
2. Create a folder per problem (`week1/two-sum`, etc.).
3. Implement in **Java 17**.
4. Add **unit tests** with JUnit5.
5. Document your thought process in a short `README.md` inside each folder.

---

## 🔗 References

* [LeetCode](https://leetcode.com/)
* [Java 17 Docs](https://docs.oracle.com/en/java/javase/17/)
* [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
* [PostgreSQL Docs](https://www.postgresql.org/docs/)

---

🚀 Stick to the plan, and by the end of 30 days you’ll be **interview-ready** for senior-level backend roles.
