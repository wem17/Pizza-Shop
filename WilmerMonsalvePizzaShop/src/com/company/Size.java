package com.company;

import java.util.ArrayList;

public class Size {
//Class variables
    String pizzaSize;
    double sizePrice;

    //Constructor
    public Size(String _pizzaSize, double _sizePrice){
        this.pizzaSize = _pizzaSize;
        this.sizePrice = _sizePrice;

    }
    //Set N get
    public String getpizzaSize() { return pizzaSize; }

    public void setPizzaSize(String _pizzaSize) {this.pizzaSize = _pizzaSize;}

    public double getsizePrice(){return sizePrice;}
    public void setsizePrice(double _sizePrice) {this.sizePrice = _sizePrice;}



    public static void listSize(ArrayList<Size> sList){
        for (Size size: sList){
            System.out.println(size.getpizzaSize());
            System.out.println(size.getsizePrice());

        }
    }
}