package com.mba;

public class Main {

    public static void main(String[] args) {
        System.out.println(toMilesPerHour(1.5));
        System.out.println(toMilesPerHour(10.25));
        System.out.println(toMilesPerHour(-5.6));
        System.out.println(toMilesPerHour(25.42));
        System.out.println(toMilesPerHour(75.114));
        System.out.println(toMilesPerHour(100.0));

        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
        printConversion(100.0);

    }

    public static long toMilesPerHour(double kilometersPerHour){
        long retVal = 0L;
        double conversionFactorKPH2MPH = 1.609;
        if(kilometersPerHour < 0){
            retVal = -1;
        } else {
            retVal = Math.round(kilometersPerHour / conversionFactorKPH2MPH);
        }
        return retVal;
    }
    
    public static void printConversion(double klometersPerHour){
        if(klometersPerHour < 0){
            System.out.println("Invalid Value");
        } else {
            double conversionFactorKPH2MPH = 1.609;
            System.out.println(klometersPerHour + " km/h = " + toMilesPerHour(klometersPerHour) + " mi/h");
        }
    }

}
