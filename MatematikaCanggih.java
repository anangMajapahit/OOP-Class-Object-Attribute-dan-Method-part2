/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematika;
import java.util.Scanner;

/**
 *
 * @author UmumPRT
 */
public class MatematikaCanggih extends Matematika {
    Scanner masukan = new Scanner(System.in);

    
    void Modulus(int a, int b){
        System.out.println("Masukkan angka pertama = ");
        a = masukan.nextInt();
        System.out.println("Masukkan angka kedua = ");
        b = masukan.nextInt();
        int hasil = a % b;
        System.out.println("Modulus : " + hasil);
    }
    public void pertambahan(int a, int b){
        System.out.println("Masukkan angka pertama = ");
        a = masukan.nextInt();
        System.out.println("Masukkan angka kedua = ");
        b = masukan.nextInt();
        int hasil = a + b;
        System.out.println("Hasil = " + hasil);
    }
    
    public void pengurangan (int a, int b){
        System.out.println("Masukkan angka pertama = ");
        a = masukan.nextInt();
        System.out.println("Masukkan angka kedua = ");
        b = masukan.nextInt();
        int hasil = a - b;
        System.out.println("Hasil = " + hasil);
    }
    public void perkalian (int a, int b){
        System.out.println("Masukkan angka pertama = ");
        a = masukan.nextInt();
        System.out.println("Masukkan angka kedua = ");
        b = masukan.nextInt();
        int hasil = a * b;
        System.out.println("Hasil = " + hasil);
    }
    public void pembagian (int a, int b){
        System.out.println("Masukkan angka pertama = ");
        a = masukan.nextInt();
        System.out.println("Masukkan angka kedua = ");
        b = masukan.nextInt();
        int hasil = a / b;
        System.out.println("Hasil = " + hasil);
    }
}
