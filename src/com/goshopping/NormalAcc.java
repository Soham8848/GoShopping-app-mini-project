package com.goshopping;

public abstract class NormalAcc extends ShopAcc{

    private static final float deliveryCharges= 20.50f;

    public NormalAcc(int accNo, String accNm, float Charges, float deliveryCharges) {
        super(accNo, accNm,Charges);
    }
}
