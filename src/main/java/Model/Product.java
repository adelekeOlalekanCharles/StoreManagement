package Model;

import java.util.ArrayList;

public class Product {
    private String productName;
    private Double productAmount;
    private boolean isAvailable;
    private int productQuantity;
    //ArrayList<Product> productLists;


    public Product(String productName, Double productAmount, boolean isAvailable, int productQuantity) {
        this.productName = productName;
        this.productAmount = productAmount;
        this.isAvailable = isAvailable;
        this.productQuantity = productQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(Double productAmount) {
        this.productAmount = productAmount;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productAmount=" + productAmount +
                ", isAvailable=" + isAvailable +
                ", productQuantity=" + productQuantity +
                '}';
    }
}
