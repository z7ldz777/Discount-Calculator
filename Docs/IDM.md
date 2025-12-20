# Input Domain Model (IDM)

This document defines the Input Domain Model for the
`calculateDiscount` method in the Discount Calculator system.
The goal of the IDM is to identify all input parameters and
partition their possible values into disjoint and complete
equivalence classes (choices) for systematic test design.

---

## Input Parameters

The method `calculateDiscount` has the following input parameters:

- `customerType` (String)
- `totalOrdersInLastYear` (int)
- `isSubscribedToNewsletter` (boolean)

---

## Characteristics and Choices

### C1: Customer Type (`customerType`)
This characteristic represents the type of customer.

- C1.1: NEW
- C1.2: REGULAR
- C1.3: PREMIUM

---

### C2: Total Orders in Last Year (`totalOrdersInLastYear`)
This characteristic represents the number of orders placed by the
customer in the last year.

- C2.1: 0 – 9 orders
- C2.2: 10 or more orders

---

### C3: Newsletter Subscription (`isSubscribedToNewsletter`)
This characteristic indicates whether the customer is subscribed
to the newsletter.

- C3.1: Not subscribed (false)
- C3.2: Subscribed (true)

---

## Summary

The input domain is modeled using three characteristics with a total
of seven choices. These choices will be used in the next step to
derive Pair-Wise Coverage (PWC) test requirements.