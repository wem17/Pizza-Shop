package com.company;

import java.util.ArrayList;

public class Size {
//Class variables
    String pizzaSize;
    double small;
    double medium;
    double large;
    double extraLarge;

    //Constructor
    public Size(String _pizzaSize, double _small, double _medium, double _large, double _extraLarge){
        this.pizzaSize = _pizzaSize;
        this.small = _small;
        this.medium = _medium;
        this.large = _large;
        this.extraLarge = _extraLarge;
    }
    //Set N get
    public String getpizzaSize() { return pizzaSize; }

    public void setPizzaSize(String _pizzaSize) {this.pizzaSize = _pizzaSize;}

    public double getsmall(){return small;}
    public void setSmall(double _small) {this.small = _small;}

    public double getmedium(){return medium;}
    public void setmedium(double _medium) {this.medium = _medium;}

    public double getlarge(){return large;}
    public void setlarge(double _large) {this.large = _large;}

    public double getExtraLarge(){return extraLarge;}
    public void setExtraLarge(double _extraLarge) {this.extraLarge = _extraLarge;}


    public static void listSize(ArrayList<Size> sList){
        for (Size size: sList){
            System.out.println(size.getpizzaSize());
            System.out.println(size.getsmall());
            System.out.println(size.getmedium());
            System.out.println(size.getlarge());
            System.out.println(size.getExtraLarge());
        }
    }
}