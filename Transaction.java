package com.company;
import java.util.ArrayList;

public class Transaction {

    //Class Level Variables - Protect the data
    private int transactionId;



    //Constructor Method
    public Transaction(int _transactionId){
        this.transactionId = _transactionId;
    }

    //Setters and Getters
    public int getTransactionId() { return transactionId; }
    public void setTransactionId(int _transactionId) {this.transactionId = _transactionId;}

    public static void listTransaction(ArrayList<Transaction> tList) {
        for (Transaction transaction : tList) {
            System.out.println(transaction.getTransactionId());
        }
    }
}
