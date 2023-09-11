package org.example;

import Enums.Sex;
import Model.*;
import Service.Implementation.CashierImplementation;
import Service.Implementation.CustomerImplementation;
import Service.Implementation.ManagerImplementation;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     //   ArrayList<Product> products = new ArrayList<>();
    //    products.add(new Product("Bread",100.00,false,10));
     //   products.add(new Product("Milk",1000.89,true,6));
       // products.add(new Product("Phone",50000.00,true,8));

        Store store = new Store("Shoprite","Alagbaka",products,"089765766756",18,40,8);
        Manager manager = new Manager("Tolanimi",35,"081535336", Sex.Male,987);
        Customer customer = new Customer("David",34,"090887665",Sex.Female);
        Cashier cashier1 = new Cashier("Tola",24,"09889787565",Sex.Female,9087,8,true);
        Applicant applicant= new Applicant("Oloye",24,"0908867564",Sex.Male);
        Store store1 = new Store();

       // Scanner scanner2 = new Scanner(System.in);


//        Cashier cashier1 = new Cashier("Tolulope",25,"09012225664",Sex.Female,998,9,true);
//        System.out.println("Application form for an applicant");
//        System.out.println("Enter applicant name: ");
//        String applicantName = scanner.next();
//        System.out.println("Enter applicant age: ");
//        int applicantAge = scanner.nextInt();
//        System.out.println("Enter applicant phoneNumber: ");
//        String applicantPhoneNumber = scanner.next();





//        Applicant applicant = new Applicant(applicantName,applicantAge,applicantPhoneNumber,Sex.Female);


        ManagerImplementation managerImplementation = new ManagerImplementation();
        managerImplementation.setStoreCriteria(store1);
        System.out.println(store1);
  //      managerImplementation.addItemToStore(store1,products);





       // managerImplementation.hireApplicant(applicant,store);
        ArrayList<Products> products = new ArrayList<Products>();
        products.addAll(managerImplementation.addItemToStore(store1, products));

        System.out.println("Enter number list of products ");
        int productList = scanner.nextInt();
        System.out.println("The name of the product you choose is " + products.productName());
        System.out.println("The amount of this product per 1 is: " + product.get(productList).getProductAmount());
        System.out.println(":Enter the quantity " );
        int productQuantity = scanner.nextInt();
        System.out.println("Total amount you have to pay of this item is: " + product.get(productList).getProductName);
        int myAmount = scanner.nextInt();
        CustomerImplementation customerImplementation = new CustomerImplementation();
        customerImplementation.buyProduct(product.get(productList), myAmount,productQuantity, customer);



       //managerImplementation.fireCashier(cashier1, store);
       // System.out.println("Enter list of products");
       // int productListNumber = scanner.nextInt();
      //  System.out.println("The name of the product you use is " + products.get(productListNumber).getProductName());
        //System.out.println("The amount of the product is " + products.get(productListNumber).getProductAmount());
       // System.out.println("Enter quantity you want to buy");
       // int productQuantity = scanner.nextInt();
        //System.out.println("Total amount to pay for the product is " + productQuantity * products.get(productListNumber).getProductAmount() );
       // System.out.println("Enter your amount");
       // int myAmount = scanner.nextInt();


       // Customer customer = new Customer("Princess",20,"091234556", Sex.Female);

        //CustomerImplementation customerImplementation = new CustomerImplementation();
       // customerImplementation.buyProduct(products.get(productListNumber),myAmount,productQuantity,customer);





    }
}