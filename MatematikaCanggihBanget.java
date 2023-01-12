/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematika;
import java.util.Scanner;


public class MatematikaCanggihBanget extends Matematika {
        Scanner masukan = new Scanner(System.in);

    
    public void pertambahanTiga(int a, int b, int c){
        System.out.println("Masukkan angka pertama = ");
        a = masukan.nextInt();
        System.out.println("Masukkan angka kedua = ");
        b = masukan.nextInt();
        System.out.println("Masukkan angaka ketiga = ");
        c = masukan.nextInt();
        int hasil = a + b + c;
        System.out.println("Hasil = " + hasil);
    }
    
    public void penguranganTiga (int a, int b, int c){
        System.out.println("Masukkan angka pertama = ");
        a = masukan.nextInt();
        System.out.println("Masukkan angka kedua = ");
        b = masukan.nextInt();
        System.out.println("Masukkan angka ketiga = ");
        c = masukan.nextInt();
        int hasil = a - b - c;
        System.out.println("Hasil = " + hasil);
    }
    public void perkalianTiga (int a, int b, int c){
        System.out.println("Masukkan angka pertama = ");
        a = masukan.nextInt();
        System.out.println("Masukkan angka kedua = ");
        b = masukan.nextInt();
        System.out.println("Masukkan angka ketiga = ");
        c = masukan.nextInt();
        int hasil = (a * b)*c ;
        System.out.println("Hasil = " + hasil);
    }
    public void pembagianTiga (int a, int b, int c){
        System.out.println("Masukkan angka pertama = ");
        a = masukan.nextInt();
        System.out.println("Masukkan angka kedua = ");
        b = masukan.nextInt();
        System.out.println("Masukkan angka ketiga = ");
        c = masukan.nextInt();
        int hasil = (a / b)/c;
        System.out.println("Hasil = " + hasil);
    }
}
