package Service.Implementation;

import Model.Customer;
import Model.Product;
import Service.CustomerService;

public class CustomerImplementation implements CustomerService {
    @Override
    public void buyProduct(Product product,int amount, int quantity, Customer customer) {
        double totalAmount = product.getProductAmount() * quantity;
    if (product.isAvailable() && product.getProductAmount() <= amount && product.getProductQuantity() >= quantity) {

        System.out.println(" Product successfully Purchased by: " + customer.getName());
    } else if (amount < totalAmount) {
        System.out.println("Insufficient funds");
    } else if (!product.isAvailable()) {
        System.out.println("Out of stock");

    } else if (product.getProductQuantity() < quantity) {
        System.out.println(" Quantity insufficient , only " + product.getProductQuantity() + "left");

    }
    }

}
