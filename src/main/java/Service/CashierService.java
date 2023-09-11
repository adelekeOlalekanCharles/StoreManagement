package Service;

import Model.Customer;
import Model.Product;

public interface CashierService {
    void sellProduct(Product product, int amount, Customer customer);

}
