package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {

    private int orderId;
    private int itemNumber;
    private String itemO;
    private String itemSize;
    private double itemPrice;


    //Constructor Method
    public Order(int _orderId){
        this.orderId = _orderId;

    }

    //Setters and Getters
    public int getorderId() { return orderId; }
    public void setorderId(int _orderId) {this.orderId = _orderId;}
    public int getitemNumber() { return itemNumber; }
    public void setitemNumber(int _itemNumber) {this.itemNumber = _itemNumber;}
    public String getitemSize() { return itemSize; }
    public void setitemSize(String _itemSize) {this.itemSize = _itemSize;}
    public String getitemO() { return itemO; }
    public void setitemO(String _itemO) {this.itemO = _itemO;}
    public double getItemPrice() {return itemPrice;}
    public void setItemPrice(double _itemPrice) {this.itemPrice = _itemPrice;}



    public static void printOrder(ArrayList<Order> oList) {
        for (Order order : oList) {
            System.out.println("item ordered:" + order.getitemO());
            System.out.println("item number:" + order.getitemNumber());
            System.out.println("item size:" + order.getitemSize());

        }

    }
}

