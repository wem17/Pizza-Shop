package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class Customer {
    //Class Level Variables - Protect the data
    private int customerId;
    private String CustomerName;
    private String customerNum;

    //Constructor Method
    public Customer(int _customerId, String _customerName,String _customerNum) {
        this.customerId = _customerId;
        this.CustomerName = _customerName;
        this.customerNum = _customerNum;
    }


    //Setters and Getters
    public int getcustomerId() {
        return customerId;
    }

    public void setcustomerId(int _customerId) {
        this.customerId = _customerId;
    }

    public String getCustomerName() {
        return CustomerName;    }

    public void setCustomerName(String _customerNme) {
        this.CustomerName = _customerNme;
    }

    public String getcustomerNum() {
        return customerNum;
    }

    public void setcustomerNum(String _customerNum) {
        this.CustomerName = _customerNum;
    }

    public static void listCustomer(ArrayList<Customer> cList) {
        for (Customer customer : cList) {
            System.out.println(customer.getcustomerId());
            System.out.println(customer.getCustomerName());
            System.out.println(customer.getcustomerNum());



        }
    }
}
