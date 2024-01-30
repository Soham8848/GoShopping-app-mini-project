package com.goshopping;

import java.util.Scanner;

public class GsShopFactory extends ShopFactory{


    public  ShopAcc getNewAcc(int accNo, String accNm, float charges){

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose the type of account to create:");
        System.out.println("1. Normal Account");
        System.out.println("2. Prime Account");

        int choice = sc.nextInt();

        switch (choice){

            case 1:
                return getNewNormalAcc(accNo, accNm, charges,50.00f);

            case 2:
                return getNewPrimeAcc(accNo, accNm, true, charges);

            default:
                System.out.println("Invalid choice. No account created.");
                return null;
        }


    }

    @Override
    public  GsNormalAcc getNewNormalAcc(int accNo, String accNm, float Charges, float deliveryCharges) {
        System.out.println("Create Normal shopping account with GoShopping:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Full Name:");
        accNm = sc.nextLine();
        float tax = 20.00f;
        Charges = deliveryCharges + tax;
        deliveryCharges = 50.00f;

        return new GsNormalAcc(accNo, accNm, Charges, deliveryCharges);
    }

    @Override
    public GsPrimeAcc getNewPrimeAcc(int accNo, String accNm, boolean isPrime, float Charges) {
        System.out.println("Create Prime shopping account with GoShopping:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Full Name:");
        accNm = sc.nextLine();
        float tax = 20.00f;
        Charges = tax;
        return new GsPrimeAcc(accNo,accNm,true, Charges);


    }
}

