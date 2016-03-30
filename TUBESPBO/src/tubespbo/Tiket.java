/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

/**
 *
 * @author Lenovo
 */
public class Tiket {
    private Rute rute;
    private int hargaTiket;
    private int tiketTersedia;
    private int tanggal;

    /**
     * @return the hargaTiket
     */
    public int getHargaTiket() {
        return hargaTiket;
    }

    /**
     * @param hargaTiket the hargaTiket to set
     */
    public void setHargaTiket(int hargaTiket) {
        this.hargaTiket = hargaTiket;
    }

    /**
     * @return the tiketTersedia
     */
    public int getTiketTersedia() {
        return tiketTersedia;
    }

    /**
     * @param tiketTersedia the tiketTersedia to set
     */
    public void setTiketTersedia(int tiketTersedia) {
        this.tiketTersedia = tiketTersedia;
    }

    /**
     * @return the rute
     */
    public Rute getRute() {
        return rute;
    }

    /**
     * @return the tanggal
     */
    public int getTanggal() {
        return tanggal;
    }

    /**
     * @param tanggal the tanggal to set
     */
    public void setTanggal(int tanggal) {
        this.tanggal = tanggal;
    }
    
    
}
