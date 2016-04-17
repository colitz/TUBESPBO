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
    private String idTiket;
    private Rute rute;
    private int hargaTiket;
    private int tiketTersedia;
    private int tanggal;
    private Kereta k;

    /**
     * @return the hargaTiket
     */
    public Tiket(String idTiket,Rute rute, int hargaTiket, int tiketTersedia, int tanggal){
        this.idTiket=idTiket;
        this.rute=rute;
        this.hargaTiket=hargaTiket;
        this.tiketTersedia=tiketTersedia;
        this.tanggal=tanggal;
    }

    public String getIdTiket() {
        return idTiket;
    }

    public void setIdTiket(String idTiket) {
        this.idTiket = idTiket;
    }
    
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
