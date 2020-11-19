/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10117125.latihan60.akatsuki;

/**
 *
 * @author Zulfi
 */
public class AnggotaAkatsuki extends KlanAkatsuki{
    private String nama;
    private String asalDesa;
    private String senjata;
    private String tipeKarakter;
    private String jurusAndalan;
    private String tewas;
    private String cincin;
    private boolean havePartner;

    public AnggotaAkatsuki(String nama, String asalDesa, String senjata, String tipeKarakter, 
                  String jurusAndalan, String tewas, String cincin, boolean 
                  havePartner, String pakaian, String tujuan) {
        super(pakaian, tujuan);
        this.nama = nama;
        this.asalDesa = asalDesa;
        this.senjata = senjata;
        this.tipeKarakter = tipeKarakter;
        this.jurusAndalan = jurusAndalan;
        this.tewas = tewas;
        this.cincin = cincin;
        this.havePartner = havePartner;
        
    }
    
    public String getnama() {
        return nama;
    }
    
    public String getsenjata() {
        return senjata;
    }

    public String gettipeKarakter() {
        return tipeKarakter;
    }

    public String getjurusAndalan() {
        return jurusAndalan;
    }

    public String gettewas() {
        return tewas;
    }

    public boolean isHavePartner() {
        return havePartner;
    }
    
    public void displayAnggota() {
        System.out.println("-------------------");
        System.out.println("Nama : " + nama);
        System.out.println("-------------------");
        System.out.println("Asal : " + asalDesa);
        System.out.println("Senjata : " + senjata);
        System.out.println("Character Type : " + tipeKarakter);
        System.out.println("Jurus Andalan : " + jurusAndalan);
        System.out.println("Cincin yang digunakan : " + cincin);
        System.out.println("Kematian : " + tewas);
        if(isHavePartner()) {
            System.out.println("Mission Type : Team");
        } else {
            System.out.println("Mission Type : Solo");
        }
        System.out.println();
    }
    
}
