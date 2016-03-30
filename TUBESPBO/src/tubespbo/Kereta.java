/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Kereta {
    private ArrayList<Gerbong> daftarGerbong;
    private String namaKereta;
    private int kapasitasKereta;

    public Kereta(String nama){
        this.namaKereta = nama;
        this.daftarGerbong = new ArrayList();
        this.kapasitasKereta = 0;
    }
    
    public void addGerbong(Gerbong g){
        this.daftarGerbong.add(g);
        this.kapasitasKereta = this.kapasitasKereta + g.getMaxBebanGerbong();
    }

    public String getNamaKereta() {
        return namaKereta;
    }

    public void setNamaKereta(String namaKereta) {
        this.namaKereta = namaKereta;
    }

    public ArrayList<Gerbong> getDaftarGerbong() {
        return daftarGerbong;
    }

    public int getKapasitasKereta() {
        return kapasitasKereta;
    }
    
    /**
     * @return the dg
     */
//    public daftarGerbong[] getDg() {
//        return dg;
//    }

    /**
     * @param dg the dg to set
     */
//    public void setDg(daftarGerbong[] dg) {
//        this.dg = dg;
//    }

//    public void addGerbong(Gerbong g){
//        if (daftarGerbong<=10){
//            Gerbong[daftarGerbong] = new Gerbong(namaGerbong);
//            Gerbong++;
//        }
//    }
//    
//    public void removeGerbong(Gerbong g){
//        Gerbong[daftarGerbong]--;
//    }
}
