package com.goshopping;

public abstract class ShopAcc {
   private int accNo;
   private String accNm;
   private float Charges;

    public ShopAcc(int accNo, String accNm, float Charges) {
        this.accNo = accNo;
        this.accNm = accNm;
        this.Charges = Charges;
    }

    public int getAccNo() {
        return accNo;
    }

    public String getAccNm() {
        return accNm;
    }

    public float getCharges() {
        return Charges;
    }

    public abstract void bookProduct(float amount);
    public abstract void items(String item);
    public abstract String toString();

}
