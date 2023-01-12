/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematika;

/**
 *
 * @author UmumPRT
 */
public class Matematika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MatematikaCanggih mtk = new MatematikaCanggih();
        MatematikaCanggihBanget mtk2 = new MatematikaCanggihBanget(); 
        
        System.out.println("Masukkan Angka Yang Ingin diTambah(+) ");
        mtk2.pertambahanTiga(0,0,0);
        System.out.println("Masukkan Angka Yang Ingin dikurangi(-) ");
        mtk2.penguranganTiga(0,0,0);
        System.out.println("Masukkan Angka Yang Ingin dikali(x) ");
        mtk2.perkalianTiga(0,0,0);
        System.out.println("Masukkan Angka Yang Ingin dibagi (/) ");
        mtk2.pembagianTiga(0,0,0);
        System.out.println("Masukkan Angka Yang Ingin diTambah(+) ");
        mtk.pertambahan(0,0);
        System.out.println("Masukkan Angka Yang Ingin dikurangi(-) ");
        mtk.pengurangan(0,0);
        System.out.println("Masukkan Angka Yang Ingin dikali(x) ");
        mtk.perkalian(0,0);
        System.out.println("Masukkan Angka Yang Ingin diBagi(/) ");
        mtk.pembagian(0,0);
        System.out.println("Masukkan Angka Yang Ingin dimodulus(%) ");
        mtk.Modulus(0,0);
    }
}
