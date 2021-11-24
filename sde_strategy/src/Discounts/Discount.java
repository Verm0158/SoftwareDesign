package Discounts;

import products.Product;
import com.hz.Customer;

public interface Discount {
     double discount(Customer customer, int productIndex, int productCount);
}
