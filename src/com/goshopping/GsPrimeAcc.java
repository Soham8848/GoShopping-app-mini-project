package com.goshopping;

import java.util.Scanner;

public class GsPrimeAcc extends PrimeAcc{

    private static final float Charges=50.00f;

    public GsPrimeAcc(int accNo, String accNm, boolean isPrime, float Charges) {
        super(accNo, accNm, isPrime, Charges);
    }

    @Override
    public void bookProduct(float amount) {


        System.out.println("Choose a product to buy:");
        System.out.println("1. Laptop");
        System.out.println("2. Smartphone");
        System.out.println("3. Coffee Maker");
        System.out.println("4. Fitness Tracker");
        System.out.println("5. Bluetooth Speaker");
        System.out.println("6. Running Shoes");
        System.out.println("7. Digital Camera");
        System.out.println("8. Portable Charger");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number corresponding to your choice: ");
        int Choose = sc.nextInt();

        switch (Choose) {
            case 1:
                System.out.println("You have selected: Laptop");
                // Add code for purchasing a laptop
                break;
            case 2:
                System.out.println("You have selected: Smartphone");
                // Add code for purchasing a smartphone
                break;
            case 3:
                System.out.println("You have selected: Coffee Maker");
                // Add code for purchasing a coffee maker
                break;
            case 4:
                System.out.println("You have selected: Fitness Tracker");
                // Add code for purchasing a fitness tracker
                break;
            case 5:
                System.out.println("You have selected: Bluetooth Speaker");
                // Add code for purchasing a Bluetooth speaker
                break;
            case 6:
                System.out.println("You have selected: Running Shoes");
                // Add code for purchasing running shoes
                break;
            case 7:
                System.out.println("You have selected: Digital Camera");
                // Add code for purchasing a digital camera
                break;
            case 8:
                System.out.println("You have selected: Portable Charger");
                // Add code for purchasing a portable charger
                break;
            default:
                System.out.println("Invalid choice. Please choose a number between 1 and 8.");
        }

        // Close the scanner
        sc.close();

    }

    @Override
    public void items(String item) {


    }

    @Override
    public String toString() {
        return "ShopAcc{" +
                "accNo=" + getAccNo() +
                ", accNm='" + getAccNm() + '\'' +
                ", Charges=" + getCharges() +
                '}';
    }
}
