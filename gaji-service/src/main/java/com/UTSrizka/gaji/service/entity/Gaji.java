/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.UTSrizka.gaji.service.entity;

/**
 *
 * @author DELL
 */
public class Gaji {
    private String id;
    private int bulan;
    private int tahun;
    private String nip;
    private String nama;
    private int golongan;
    private int gajipokok;
    private int tunjangan;
    private double tunjangan_anak;
    private double tunjangan_istri;
    private int potongan;
    private double gaji_bersih;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getBulan() {
        return bulan;
    }

    public void setBulan(int bulan) {
        this.bulan = bulan;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getGolongan() {
        return golongan;
    }

    public void setGolongan(int golongan) {
        switch (golongan){
            case 1:
                gajipokok = 2000000;
                tunjangan = gajipokok * 20/100;
                break;
            case 2:
                gajipokok = 2500000;
                tunjangan = gajipokok * 30/100;
                break;
            case 3:
                gajipokok = 3000000;
                tunjangan = gajipokok * 40/100;
                break;                
        }
        this.golongan = golongan;
    }

    public int getGajipokok() {
        return gajipokok;
    }

    public void setGajipokok(int gajipokok) {
        this.gajipokok = gajipokok;
    }

    public int getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    public double getTunjangan_anak() {
        tunjangan_anak = 15/100 * gajipokok;
        return tunjangan_anak;
    }

    public void setTunjangan_anak(double tunjangan_anak) {
        this.tunjangan_anak = tunjangan_anak;
    }

    public double getTunjangan_istri() {
        tunjangan_istri = 15/100 * gajipokok;
        return tunjangan_istri;
    }

    public void setTunjangan_istri(double tunjangan_istri) {
        this.tunjangan_istri = tunjangan_istri;
    }

    public int getPotongan() {
        return potongan;
    }

    public void setPotongan(int potongan) {
        this.potongan = potongan;
    }

    public double getGaji_bersih() {
        gaji_bersih = gajipokok + tunjangan + tunjangan_anak + tunjangan_istri;
        return gaji_bersih;
    }

    public void setGaji_bersih(double gaji_bersih) {
        this.gaji_bersih = gaji_bersih;
    }

    
      
}
