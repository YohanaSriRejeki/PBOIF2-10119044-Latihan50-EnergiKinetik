/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119044.latihan50.energikinetik;

/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : IF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini bertujuan menampilkan hasil energi kinetik dan usaha
 */

public class PBOIF210119044Latihan50EnergiKinetik {
    public static void main(String[] args) {
        BolaBaseball objBB = new BolaBaseball();
        System.out.println("Soal : "+"\n"+"Sebuah bola baseball dengan massa 145g"
                         + " dilempar dengan kecepatan 25m/s"+ "\n" +"a. Berapakah energi kinetiknya?" + "\n"
                         + "b. Berapakah usaha yang dilakukan pada bola untuk mencapai kecepatan ini,"
                         + "jika dimulai dari keadaan diam"+"\n");
        objBB.setMassa(145);
        objBB.setKecepatan(25);
        System.out.println("Dketahui : " +"\n"+"a. Massa = "+objBB.getMassa()+"g"+"\n"+"b. Kecepatan = "+objBB.getKecepatan()+"m/s"+"\n");
        System.out.println("Jawab : ");
        System.out.println("Hasil konversi Massa dari gram (g) ke kilogram (kg) : "+objBB.konversiSatuanBerat());
        System.out.println("a. Energi kinetiknya sebesar "+objBB.hitungEnergiKinetik2()+" Joule");
        System.out.println("b. Usaha yang dilakukan sebesar "+objBB.hitungUsaha()+" Joule");
    }
    
}
