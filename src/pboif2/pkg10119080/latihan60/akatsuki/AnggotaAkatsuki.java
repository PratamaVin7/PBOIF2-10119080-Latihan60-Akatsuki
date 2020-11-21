/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119080.latihan60.akatsuki;

/**
 *
 * @author
 * NAMA     : Kevin Pratama Sinaga
 * KELAS    : PBOIF2
 * NIM      : 10119080
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * (OBJECT ORIENTED) Akatsuki
 */
public class AnggotaAkatsuki extends Ninja {
    private String cincin, makananFavorit;
    
    public String getCincin() {
        return this.cincin;
    }
    
    public void setCincin(String cincin) {
        this.cincin = cincin;
    }
    
    public String getMakananFavorit() {
        return this.makananFavorit;
    }
    
    public void setMakananFavorit(String makananFavorit) {
        this.makananFavorit = makananFavorit;
    }
    
    public void tampilAnggota() {
        System.out.println("Nama\t\t: " + super.getNama());
        System.out.println("Asal Desa\t: " + super.getAsalDesa());
        System.out.println("Identitas Cincin: " + getCincin());
        System.out.println("Makanan Favorit\t: " + getMakananFavorit());
        System.out.println();
    }
    
}