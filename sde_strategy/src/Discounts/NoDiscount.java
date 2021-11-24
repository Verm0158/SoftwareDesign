package Discounts;

import com.hz.Customer;

public class NoDiscount implements Discount{
    @Override
    public double discount(Customer customer, int productIndex, int productCount) {
        return 0;
    }
}
