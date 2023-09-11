package Model;

import Enums.Sex;

public class Customer extends Person{

    public Customer() {
    }

    public Customer(String name, int age, String phoneNumber, Sex sex) {
        super(name, age, phoneNumber, sex);
    }
}
