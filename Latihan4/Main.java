package Latihan4;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("masukan nilai");
        int nilai = userInput.nextInt();
        System.out.println("anda memasukan nilai = " + nilai);

        printNilai(nilai);
        jumlahNilai(nilai);

    }
    // fungsi rekursif sederhana

    private static int jumlahNilai(int parameter) {
        System.out.println("parameter = " + parameter);

        if (parameter == 0) {
            return parameter;
        }

        return parameter + jumlahNilai(parameter - 1);
    }

    private static void printNilai(int parameter) {
        System.out.println("nilai = " + parameter);

        if (parameter == 0) {
            return;
        }

        parameter--;

        printNilai(parameter);
    }
}
