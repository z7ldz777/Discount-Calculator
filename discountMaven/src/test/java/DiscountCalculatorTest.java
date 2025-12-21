import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class DiscountCalculatorTest {
        @Test
        void newCustomerFewOrdersNoSubscription() {
            int result =
                    DiscountCalculator.calculateDiscount("NEW", 5, false);
            assertEquals(5, result);
        }

        @Test
        void newCustomerFewOrdersWithSubscription() {
            int result = DiscountCalculator.calculateDiscount("NEW", 5, true);
            assertEquals(7, result);
        }

        @Test
        void regularCustomerManyOrdersWithSubscription() {
            int result = DiscountCalculator.calculateDiscount("REGULAR", 10, true);
            assertEquals(15, result);
        }

        @Test
        void premiumCustomerManyOrdersWithSubscriptionCapped() {
            int result = DiscountCalculator.calculateDiscount("PREMIUM", 10, true);
            assertEquals(15, result);
        }

        @Test
        void premiumCustomerFewOrdersNoSubscription() {
            int result = DiscountCalculator.calculateDiscount("PREMIUM", 5, false);
            assertEquals(10, result);
        }

        @Test
        void newCustomerManyOrdersThrowsException() {
            assertThrows(IllegalArgumentException.class, () -> {
                DiscountCalculator.calculateDiscount("NEW", 10, true);
            });

        }
}
