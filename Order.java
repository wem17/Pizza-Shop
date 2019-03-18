package com.company;
import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    //Class Level Variables - Protect the data
    private int orderId;
    public double itemNumber;
    public String itemO;
    private double totalPrice;
    public String itemSize;

    //Constructor Method
    public Order(int _orderId, double _itemNumber, String _itemO, double _totalPrice, String _itemSize){
        this.orderId = _orderId;
        this.itemNumber = _itemNumber;
        this.itemO = _itemO;
        this.totalPrice = _totalPrice;
        this.itemSize = _itemSize;
    }


    //Setters and Getters
    public int getorderId() { return orderId; }
    public void setorderId(int _orderId) {this.orderId = _orderId;}

    public double getitemNumber(){
        System.out.println("please enter how many items you would like to order: ");
        Scanner reader = new Scanner(System.in);
        double itemNumber = reader.nextInt();

        return itemNumber;}
    public double setitemNumber(double _itemNumber) {


        return itemNumber;
    }
        public String getitemO () {
        System.out.println("What item would you like to order: ");
        Scanner reader = new Scanner(System.in);

            String itemO = reader.nextLine();

            return itemO;
        }

        public String setitemO (String _itemO){


            return itemO;
        }
    public String getitemSize () {
        System.out.println("please enter the size of your pizza: ");
        Scanner reader = new Scanner(System.in);
        String itemSize = reader.nextLine();

        return itemSize;
    }
    public String setitemSize (String _itemSize){


        return itemSize;
    }



    public static void listOrder(ArrayList<Order> oList) {
        for (Order order : oList) {
            System.out.println(order.getorderId());
            System.out.println(order.getitemO());
            System.out.println(order.getitemSize());
        }
    }

}

