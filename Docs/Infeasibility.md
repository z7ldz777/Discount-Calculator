# Infeasibility Analysis

This document identifies and justifies infeasible test requirements
derived from the Pair-Wise Coverage (PWC) analysis for the
`calculateDiscount` method.

---

## Identified Infeasible Combination

- Customer Type: NEW
- Total Orders in Last Year: 10 or more
- Newsletter Subscription: either value

---

## Justification

According to the system requirements, a customer classified as
**NEW** cannot have placed ten or more orders in the last year.
This constraint reflects the business rule that a new customer
does not have a sufficient purchase history to reach this number
of orders.

As a result, any test case that combines the customer type
**NEW** with **10 or more orders** represents an invalid system
state and is therefore infeasible.

---

## Handling of Infeasible Input

The system explicitly handles this infeasible input by throwing
an `IllegalArgumentException` when such a combination is detected.
This behavior ensures that invalid input states are rejected and
that the system maintains logical consistency.

---

## Summary

The infeasible pair (NEW, 10 or more orders) was identified during
the PWC analysis and intentionally excluded from executable test
cases. Its handling is verified through an exception-based test
case rather than a normal functional test.