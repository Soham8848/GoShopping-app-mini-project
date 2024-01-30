package com.goshopping;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to GoShopping Application");


        ShopFactory shopFactory = new GsShopFactory();
        ShopAcc acc = shopFactory.getNewAcc(1001, "", 0.00f);
//        ShopAcc getNewAcc = GsShopFactory.getNewAcc(1001, "", 0.00f);
//        GsShopFactory gsShopFactory = new GsShopFactory();
//        gsShopFactory.getNewAcc(1001, "", 0.00f);

        System.out.println("Account created successfully");
        System.out.println("Account Details:");
        System.out.println(acc);

        PrimeAcc primeAcc = new GsPrimeAcc(1001, acc.getAccNm(), true, acc.getCharges());
        primeAcc.bookProduct(100);


    }
}