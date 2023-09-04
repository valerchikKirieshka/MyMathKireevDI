package org.example;

public class MyMath {
    public static final double PI = 3.1415926535;
    public static final double E = 2.71828;
    //1
    public int setNegative(int number){
        return -number;
    }
    public double setNegative(double number){
        return -number;
    }
    public float setNegative(float number){
        return -number;
    }
    public long setNegative(long number){
        return -number;
    }
    //2
    public double cotan(int angle){
        return 0;
    }

    public double arccotan(int angle){
        return 0;
    }

    public double findRoundLength(int radius){
        return 0;
    }

    public int showSimpleNumbers(int start, int end){
        return 0;
    }
    //3
    public double sQ(double number){

        double t;
        double squareRoot = number / 2;
        do
        {
            t=squareRoot;
            squareRoot=(t+(number/t))/2;
        }
        while ((t-squareRoot)!= 0);
        return squareRoot;

    }
}

