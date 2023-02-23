package ssg10forloop;

import java.util.Scanner;

public class ForLoop07 {
    public static void main(String[] args) {

    /*
    belirlenen sayının 1 den 10 a kadar çarpım sonuçlarını yapan Java programını yazınız.
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(sayi + " X " + i + " = " + sayi * i);


        }
    }
}
