package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Wills Pizza!");

        final char EXIT_CODE = 'E';
        final char CUST_CODE = 'C';
        final char MENU_CODE = 'M';
        final char SIZE_CODE = 'S';
        final char ORDE_CODE = 'O';
        final char TRAN_CODE = 'T';
        final char HELP_CODE = '?';
        char userAction;
        final String PROMPT_ACTION = "Add 'C'ustomer, List 'M'enu, Add 'O'rder, List 'T'ransaction, Add 'P'rice, Add 'S'ize or 'E'xit: ";
        ArrayList<Customer> cList = new ArrayList<>();
        ArrayList<Menu> mList = new ArrayList<>();
        ArrayList<Order> oList = new ArrayList<>();
        ArrayList<Size> sList = new ArrayList<>();
        ArrayList<Transaction> tList = new ArrayList<>();

        Customer cust1 = new Customer(1,"Wilmer Monsalve","2153296473");
        Order order1 = new Order(1,0,"",0,"");
        Transaction trans1 = new Transaction(1);

        Menu menu1 = new Menu(1, "Plain",3);
        Menu menu2 = new Menu(2, "Meat",6);
        Menu menu3 = new Menu(3, "Extra",6);
        Menu menu4 = new Menu(4, "Veg",7);
        Menu menu5 = new Menu(5, "Supreme",7);

        mList.add(menu1);
        mList.add(menu2);
        mList.add(menu3);
        mList.add(menu4);
        mList.add(menu5);



        Size size1 = new Size("1.Small is +$6.00, medium is $9.00, large is $12.00, extra large is $15.00",6,9,12,15);


        sList.add(size1);



        cList.add(cust1);

        oList.add(order1);

        tList.add(trans1);

        userAction = getAction(PROMPT_ACTION);

        while (userAction != EXIT_CODE) {
            switch(userAction) {
                case CUST_CODE : Customer.listCustomer(cList);//addCustomer();
                    break;
                case MENU_CODE : Menu.listMenu(mList);
                    break;
                case SIZE_CODE : Size.listSize(sList);
                    break;
                case ORDE_CODE : Order.listOrder(oList);//addOrders();
                    double price = oList.get(0).getitemNumber() * (mList.get(0).getMenuPrice() + sList.get(0).small );
                    System.out.println("Your total price will be $ " + price);
                    break;
                case TRAN_CODE : System.out.print("Transaction ID: "); Transaction.listTransaction(tList);//listTransactions();
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
}
