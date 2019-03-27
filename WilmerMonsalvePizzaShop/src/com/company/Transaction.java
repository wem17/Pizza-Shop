package com.company;
import java.util.ArrayList;

enum PaymentType {cash, credit}

public class Transaction {

    //Class Level Variables - Protect the data
    private int transactionId = 0;
    private PaymentType pType;
    private Order order;


    //Constructor Method
    public Transaction(int _transactionId){
        this.transactionId = _transactionId;

    }


    //Setters and Getters
    public int getTransactionId() { return transactionId; }
    public void setTransactionId(int _transactionId) {this.transactionId = _transactionId;}

    public Order getOrder() { return order; }
    public void setOrder(Order _order) {this.order = _order;}

    public PaymentType getPaymentType() { return pType; }
    public void setPaymentType(PaymentType _pType) {this.pType = _pType;}

    public static void printTransaction(ArrayList<Transaction> tList){
        for (Transaction trans: tList){
            System.out.println("Transaction ID: "+ trans.getTransactionId());
            System.out.println("Payment Type: " + trans.getPaymentType());
            System.out.println("Your Order is :" );
            }
    }

}