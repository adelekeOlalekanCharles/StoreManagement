package Service;

import Model.Customer;
import Model.Product;

public interface CustomerService {
    void buyProduct(Product product, int amount, int quantity, Customer customer);

}
