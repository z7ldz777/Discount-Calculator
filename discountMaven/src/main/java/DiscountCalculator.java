public class DiscountCalculator {

        public static int calculateDiscount(
                String customerType,
                int totalOrdersInLastYear,
                boolean isSubscribedToNewsletter
        ) {
            // Infeasible combination
            if (customerType.equals("NEW") && totalOrdersInLastYear >= 10) {
                throw new IllegalArgumentException(
                        "NEW customer cannot have 10 or more orders"
                );
            }

            int discount = 5;

            if (isSubscribedToNewsletter) {
                discount += 2;
            }

            switch (customerType) {
                case "REGULAR":
                    discount += 3;
                    break;
                case "PREMIUM":
                    discount += 5;
                    break;
            }

            if (totalOrdersInLastYear >= 10) {
                discount += 5;
            }

            return Math.min(discount, 15);
        }
}
