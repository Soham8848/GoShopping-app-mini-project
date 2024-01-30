package com.goshopping;

public abstract class ShopFactory {

    public abstract ShopAcc getNewAcc(int accNo, String accNm, float charges);
    public abstract PrimeAcc getNewPrimeAcc(int accNo, String accNm,  boolean isPrime, float Charges);
    public abstract NormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharges);
}
