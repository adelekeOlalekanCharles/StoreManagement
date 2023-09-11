package Service;

import Model.Applicant;
import Model.Cashier;
import Model.Product;
import Model.Store;

import java.util.ArrayList;

public interface ManagerService {
    void hireApplicant( Applicant applicant, Store store);
    void fireCashier(Cashier cashier, Store store);
//    void updatePrice(Product product, Store store);
//    void  removeItemFromStore(Product product, Store store);
//    void addItemToStore(Store store, Store item);
//    void setStoreCriteria(Store store);
//    ArrayList<Product>addProductToStore(Store store);

}
