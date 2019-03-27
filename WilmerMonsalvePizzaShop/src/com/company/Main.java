/*
Project: Lab 10
Purpose Details: Pizza ordering application
Course: IST 242
Author: Wilmer Monsalve
Date Developed: 3/14/19
Last Date Changed: 3/25/19
Rev: 3
 */

package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    int cCount = 1;
    int oCount = 1;
    int tCount = 1;
    double price = 0.00;

    public static void main(String[] args) {

        System.out.println("Welcome to Wills Pizza!");

        Main main = new Main();

        final char EXIT_CODE = 'E';
        final char CUST_CODE = 'C';
        final char MENU_CODE = 'M';
        final char ORDE_CODE = 'O';
        final char TRAN_CODE = 'T';
        final char TRAN_PRNT = 'D';
        final char CUST_PRNT = 'P';
        final char ORDE_PRNT = 'S';
        final char HELP_CODE = '?';
        char userAction;
        final String PROMPT_ACTION = "Add 'C'ustomer,'S'how Order, 'P'rint Customer, Add 'D'isplay Transaction  List 'M'enu, Add 'O'rder, List 'T'ransaction or 'E'xit: ";
        ArrayList<Customer> cList = new ArrayList<>();
        ArrayList<Menu> mList = new ArrayList<>();
        ArrayList<Order> oList = new ArrayList<>();
        ArrayList<Transaction> tList = new ArrayList<>();


        Menu menu1 = new Menu(1, "Plain", 6.00);
        Menu menu2 = new Menu(2, "Meat", 9.00);
        Menu menu3 = new Menu(3, "Veggie", 12.00);
        Menu menu4 = new Menu(4, "Supreme", 15.00);


        mList.add(menu1);
        mList.add(menu2);
        mList.add(menu3);
        mList.add(menu4);

        userAction = getAction(PROMPT_ACTION);

        while (userAction != EXIT_CODE) {
            switch (userAction) {
                case CUST_CODE:
                    cList.add(main.addCustomer());
                    break;
                case CUST_PRNT:
                    Customer.printCustomer(cList);
                    break;
                case MENU_CODE:
                    Menu.listMenu(mList);
                    break;
                case ORDE_CODE:
                    oList.add(main.addOrder());//Order.addOrders();
                    break;
                case ORDE_PRNT:
                    Order.printOrder(oList);
                    break;
                case TRAN_CODE:
                    tList.add(main.addTransaction());
                    break;
                case TRAN_PRNT:
                    Transaction.printTransaction(tList);
                    Order.printOrder(oList);
                    break;
            }
            userAction = getAction(PROMPT_ACTION);
        }
    }


    public static char getAction(String prompt) {
        Scanner scnr = new Scanner(System.in);
        String answer = "";
        System.out.println(prompt);
        answer = scnr.nextLine().toUpperCase() + " ";
        char firstChar = answer.charAt(0);
        return firstChar;
    }

    public Customer addCustomer() {
        Customer cust = new Customer(cCount++);
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please Enter your Name: ");
        cust.setCustomerName(scnr.nextLine());
        System.out.println("Please Enter your Phone: ");
        cust.setCustomerPhoneNumber(scnr.nextLine());
        return cust;
    }

   public Order addOrder() {

        Order order = new Order(oCount++);
        Scanner scnr = new Scanner(System.in);
        System.out.println("what kind of pizza would you like?: ");
        order.setitemO(scnr.nextLine());
        System.out.println("What size would you like?");
        order.setitemSize(scnr.nextLine());
        System.out.println("how many pizzas would you like to order?: ");
        order.setitemNumber(scnr.nextInt());
        return order;

   }

    public Transaction addTransaction() {
        Transaction trans = new Transaction(tCount++);
        Scanner scnr = new Scanner(System.in);
        System.out.println("How would you like to pay cash or credit?");
        String paymentType = scnr.next().toLowerCase();
        if (paymentType.equals("cash")) {
            trans.setPaymentType(PaymentType.cash);
        }
        else if (paymentType.equals("credit")){
            trans.setPaymentType(PaymentType.credit);
        }
        return trans;
    }
    }

