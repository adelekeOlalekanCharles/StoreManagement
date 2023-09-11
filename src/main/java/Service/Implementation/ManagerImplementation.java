package Service.Implementation;

import Model.Applicant;
import Model.Cashier;
import Model.Product;
import Model.Store;
import Service.ManagerService;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerImplementation implements ManagerService {
   Store store = new Store();
    @Override
    public void hireApplicant(Applicant applicant, Store store) {
        if (applicant.getAge() < store.getMinAge() || applicant.getAge() > store.getMaxAge()){
            System.out.println(" you are not hired ");
        }
        else {
            System.out.println("You are hired ");
        }
    }


    @Override
    public void fireCashier(Cashier cashier,Store store) {
        if (cashier.getWorkTime() < store.getMinWorkTime() || !cashier.isGoodCustomerRelationship()){
            System.out.println(" Fired ");
        }
            else System.out.println("promoted");
        }
        

//    @Override
//    public void addItemToStore(Store store, Store item) {
//        Scanner scanner = new Scanner(System.in);
//        while(true){
//            System.out.println("Add products to the store ");
//            System.out.println("Enter name of product ");
//            String productName = scanner.next();
//            System.out.println("Enter amount of product ");
//            double productAmount = scanner.nextDouble();
//            System.out.println("Enter the quantity of product ");
//            int productQuantity = scanner.nextInt();
//            System.out.println("Press 0 to stop adding items to the store");
//            product.add(new Product(productName,productAmount,true,productQuantity));
//            int zero = scanner.nextInt();
//            if (zero == 0){
//                break;
//            }
//            store.setProduct(product);
//        }
//        return products;

//    @Override
//    public void setStoreCriteria(Store store) {
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<Product> products = new ArrayList<>();
//        System.out.println("Enter the details of your store ");
//        System.out.println("Enter the name of your store ");
//        String storeName = scanner.next();
//        store.setStoreName(storeName);
//        store.getStoreName();
//        System.out.println("Enter the address of your store ");
//        String storeAddress = scanner.next();
//        store.setAddress(storeAddress);
//        store.getAddress();
//        System.out.println("Enter the phoneNumber of your store ");
//        String storephoneNumber = scanner.next();
//        store.setPhoneNumber(storephoneNumber);
//        store.getPhoneNumber();
//        System.out.println("Enter the minimum age of your store ");
//        int minimumStoreAge = scanner.nextInt();
//        store.setMinAge(minimumStoreAge);
//        store.getMinAge();
//        System.out.println("Enter the maximum age of your store ");
//        int maximumStoreAge = scanner.nextInt();
//        store.setMaxAge(maximumStoreAge);
//        store.getMaxAge();
//        System.out.println("Enter your store minimum work time ");
//        int minimumWorkTime = scanner.nextInt();
//        store.setMinWorkTime(minimumWorkTime);
//        store.getMinWorkTime();
//        store.setProduct(addProductToStore(store));
//
//
//    }
//
//    @Override
//    public ArrayList<Product> addProductToStore(Store store) {
//        ArrayList<Product> products = new ArrayList<>();
//    }
}

