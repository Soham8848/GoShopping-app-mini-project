package com.goshopping;

public abstract class PrimeAcc extends ShopAcc {

    private boolean isPrime;
    private static final float deliveryCharges;

    static {
        deliveryCharges= 50.00f;
    }

    public float getDeliveryCharges() {
        return deliveryCharges;
    }
    public PrimeAcc(int accNo, String accNm,  boolean isPrime, float deliveryCharges) {
        super(accNo, accNm,deliveryCharges);
        this.isPrime = isPrime;

    }


    public abstract void bookProduct(float amount);
    public abstract String toString();
}
