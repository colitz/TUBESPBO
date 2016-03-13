/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

/**
 *
 * @author Lenovo
 */
public class Kereta {
 private daftarGerbong[] dg = new daftarGerbong[10];

    /**
     * @return the dg
     */
    public daftarGerbong[] getDg() {
        return dg;
    }

    /**
     * @param dg the dg to set
     */
    public void setDg(daftarGerbong[] dg) {
        this.dg = dg;
    }

    public void addGerbong(Gerbong g){
        if (daftarGerbong<=10){
            Gerbong[daftarGerbong] = new Gerbong(namaGerbong);
            Gerbong++;
        }
    }
    
    public void removeGerbong(Gerbong g){
        Gerbong[daftarGerbong]--;
    }
}
