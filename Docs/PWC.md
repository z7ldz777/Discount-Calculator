# Pair-Wise Coverage (PWC)

This document defines the Pair-Wise Coverage (PWC) test requirements
derived from the Input Domain Model (IDM) for the
`calculateDiscount` method.

Pair-wise testing ensures that every possible pair of input choices
from any two characteristics is covered by at least one test case.

---

## Characteristics

- C1: Customer Type
- C2: Total Orders in Last Year
- C3: Newsletter Subscription

---

## Pair-Wise Test Requirements

### Pairs between C1 and C2

- (C1.1 NEW, C2.1 0–9 orders)
- (C1.1 NEW, C2.2 10 or more orders)
- (C1.2 REGULAR, C2.1 0–9 orders)
- (C1.2 REGULAR, C2.2 10 or more orders)
- (C1.3 PREMIUM, C2.1 0–9 orders)
- (C1.3 PREMIUM, C2.2 10 or more orders)

---

### Pairs between C1 and C3

- (C1.1 NEW, C3.1 Not subscribed)
- (C1.1 NEW, C3.2 Subscribed)
- (C1.2 REGULAR, C3.1 Not subscribed)
- (C1.2 REGULAR, C3.2 Subscribed)
- (C1.3 PREMIUM, C3.1 Not subscribed)
- (C1.3 PREMIUM, C3.2 Subscribed)

---

### Pairs between C2 and C3

- (C2.1 0–9 orders, C3.1 Not subscribed)
- (C2.1 0–9 orders, C3.2 Subscribed)
- (C2.2 10 or more orders, C3.1 Not subscribed)
- (C2.2 10 or more orders, C3.2 Subscribed)

---

## Summary

A total of sixteen (16) pair-wise test requirements were derived.
These requirements will be used to design a minimal set of test cases
that achieve full pair-wise coverage.