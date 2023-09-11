package Service.Implementation;

import Model.Customer;
import Model.Product;
import Service.CashierService;

public class CashierImplementation implements CashierService {
    @Override
    public void sellProduct(Product product, int amount, Customer customer) {
        if (product.isAvailable() && product.getProductQuantity() >= 1 && product.getProductAmount() <= amount ){
            System.out.println(" Sold successful");
        }
        else System.out.println(" Not successfully sold");
    }
}
