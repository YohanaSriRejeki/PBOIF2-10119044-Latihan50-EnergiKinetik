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

class BolaBaseball {
    private double massa;
    private double kecepatan;
    
    public double getMassa(){
        return massa;
    }
    
    public void setMassa(double massa){
        this.massa = massa;
    }
    
    public double getKecepatan(){
        return kecepatan;
    }
    
    public void setKecepatan(double kecepatan){
        this.kecepatan = kecepatan;
    }
    
    public double konversiSatuanBerat(){
        return getMassa() / 1000;
    }
    
    public double hitungEnergiKinetik2(){
        return 0.5 * konversiSatuanBerat() * Math.pow(getKecepatan(),2);
    }
    
    public double hitungEnergiKinetik1(){
        return 0;
    }
    
    public double hitungUsaha(){
        return hitungEnergiKinetik2() - hitungEnergiKinetik1();
    }
}
