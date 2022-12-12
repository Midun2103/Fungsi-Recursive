#   NAMA    : MIDUN HAKIKI
#   NIM     : 312210583

#   LANGKAH - LANGKAH CARA MEMBUAT RECURSIVE

#  1.) Buatlah terlebih dahulu folder dengan Latihan 1, lalu masukan codingnya sebagai berikut :

        package Latihan1;

        import java.util.*;

        public class Main {

            public static void main(String[] args) {

                System.out.println("test");

                Scanner userInput = new Scanner(System.in);
                System.out.print("masukan nilai");
                int nilai = userInput.nextInt();
                System.out.println("anda memasukan nilai = " + nilai);
            }
        }

#   HASIL SETELAH OUTPUT
        Masukan nilai (di sini bisa masukan nilai berapa saja) seperti contoh bawah ini, saya masukan nilai = 10.

![](../Latihan1/img2%20(Hasil%20Run).png)

#   2.) Untuk folder yang selanjutnya saya buat Latihan 2, lalu masukan codingnya :

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

#   HASIL SETELAH OUTPUT
        Masukan nilai (di sini bisa masukan nilai berapa saja) seperti contoh bawah ini, saya masukan nilai = 10.
    
![](../Latihan2/img2.png)

#   3.) Latihan 3, (dari nilai yang tinggi ke yang nilah rendah) masukan codingnya :


        package Latihan3;

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

                if (parameter == 0) {
                    return;
                }

                parameter--;

                printNilai(parameter);
            }
        }

#   HASIL SETELAH OUTPUT
        Masukan nilai (di sini bisa masukan nilai berapa saja) seperti contoh bawah ini, saya masukan nilai = 20.
            ket : Dari nilai yang tinggi ke nilai yang rendah.

![](../Latihan3/img2.png)

#   4.) Buatlah dengan folder Latihan 4, (cara menampilkan nilai & parameter) masukan codingnya :

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

#   HASIL SETELAH OUTPUT
        
        Masukan nilai (di sini bisa masukan nilai berapa saja) contoh seperti di bawah ini, saya masukan nilai = 10. dan akan muncul otomatif nilai  & parameter.

![](../Latihan4/img3.png)

#   5.) Buatlah dengan folder Latihan 5, (cara menjumlahkan parameter) masukan codingnya :

        package Latihan5;

        import java.util.*;

        public class Main {

            public static void main(String[] args) {

                Scanner userInput = new Scanner(System.in);
                System.out.print("masukan nilai");
                int nilai = userInput.nextInt();
                System.out.println("anda memasukan nilai = " + nilai);

                printNilai(nilai);
                int jumlah = jumlahNilai(nilai);
                System.out.println("jumlah = " + jumlah);
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
#   HASIL SETELAH OUTPUT

-   contoh 1 
        Masukan nilai (di sini bisa masukan nilai berapa saja) seperti bawah ini, saya masukan nilai = 10. maka akan langsung otomotis jumluh parameter yaitu 55 seperti di bawah ini.


![](../Latihan5/Contoh1.png)

-   contoh 2 
        saya masukan nilai = 8. maka akan langsung otomotis jumluh parameter yaitu 36 seperti di bawah ini.


![](../Latihan5/Contoh2.png)

#   6.) Folder Latihan ke 6, (cara menjumlahkan hasil perkalian) masukan codingnya :

-   Ket :  if (parameter == 1), (di sini bisa mengubah jika kita menambahkan angka yang berbeda seperti 1, 2, 3, dan seterusnya).

        package Latihan6;

        import java.util.*;

        public class Main {

            public static void main(String[] args) {

                Scanner userInput = new Scanner(System.in);
                System.out.print("masukan nilai");
                int nilai = userInput.nextInt();
                System.out.println("anda memasukan nilai = " + nilai);

                printNilai(nilai);
                int jumlah = jumlahNilai(nilai);
                System.out.println("jumlah = " + jumlah);

                int faktorial = hitungFaktorial(nilai);
                System.out.println("hasil faktorial = " + faktorial);
            }

            // fungsi rekursif sederhana
            private static int hitungFaktorial(int parameter) {
                System.out.println("parameter = " + parameter);

                if (parameter == 1) {
                    return parameter;
                }

                return parameter * hitungFaktorial(parameter - 1);
            }

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



#   HASIL SETELAH OUTPUT

-   Contoh 1
        masukan nilai paramater dan di sini saya masukan nilai parameternya = 1. maka 
            - hasil jumlah parameter yaitu = 15, 
            - dan hasil faktorial = 120

![](Contoh%20Nilai%201.png)

-   Contoh 2
        masukan nilai paramater dan di sini saya masukan nilai parameternya = 2. maka 
            - hasil jumlah parameter yaitu = 15, 
            - dan hasil faktorial = 120
        Tetap sama karena perkalian.

![](Contoh%20Nilai%202.png)

-   Contoh 3
        masukan nilai paramater dan di sini saya masukan nilai parameternya = 3. maka 
            - hasil jumlah parameter yaitu = 15, 
            - dan hasil faktorial = 160
  
![](contoh%20Nilai%203.png)

#   Inilah langkah - langkah cara membuat fungsi recursive
#   SEKIAN DAN TERIMAKASIH...
#   SALAM ANAK IT...
















