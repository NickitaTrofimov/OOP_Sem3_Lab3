package ru.mirea;

import java.lang.String;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Furniture furniture = new Chair("Chair", 2300, "Tree", 100);
        Furniture furniture1 = new Table("Table", 5000, "Maple", 12 , 5);
        Furniture furniture2 = new Wardrobe("Wardrobe", 1295, "Pine", 2200, 1500);

        ((Wardrobe) furniture2).display_Info();
        ((Table) furniture1).display_Info();
        ((Chair) furniture).display_Info();

    }
}
