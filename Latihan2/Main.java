package Latihan2;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("masukan nilai");
        int nilai = userInput.nextInt();
        System.out.println("anda memasukan nilai = " + nilai);

        printNilai(nilai);

    }
    // fungsi rekursif sederhana

    private static void printNilai(int parameter) {
        System.out.println("nilai = " + parameter);

    }
}
