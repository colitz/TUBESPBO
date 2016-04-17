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
public class Rute {
    private int idRute;
    private Stasiun stasiun1;
    private Stasiun stasiun2;
//    private Tiket[] daftarTiketDibeli = new Tiket[100];
    private ArrayList<Tiket> daftarTiketDibeli;
    private int jmlTiket=0;
    private Kereta kereta;

    
    public Rute(){};
    
    public Rute(int idRute){
        this.idRute = idRute;
    }
    public Rute(Stasiun s1, Stasiun s2, Kereta k){
        this.daftarTiketDibeli = new ArrayList();
        this.stasiun1 = s1;
        this.stasiun2 = s2;
        this.kereta = k;
    };

    public void setIdRute(int idRute) {
        this.idRute = idRute;
    }

    public int getIdRute() {
        return idRute;
    }
    
    /**
     * @return the stasiun1
     */
    public Stasiun getStasiun1() {
        return stasiun1;
    }

    /**
     * @param stasiun1 the stasiun1 to set
     */
    public void setStasiun1(Stasiun stasiun1) {
        this.stasiun1 = stasiun1;
    }

    /**
     * @return the stasiun2
     */
    public Stasiun getStasiun2() {
        return stasiun2;
    }

    /**
     * @param stasiun2 the stasiun2 to set
     */
    public void setStasiun2(Stasiun stasiun2) {
        this.stasiun2 = stasiun2;
    }
    
    
//    public createTiket(int tanggal){
//	if(jmlTiket<100){
//	daftarTiketDibeli[jmlTiket] = new Tiket(tanggal);
//	jmlTiket++;
//	}
//    }

    public ArrayList<Tiket> getDaftarTiketDibeli() {
        return daftarTiketDibeli;
    }

    public void setDaftarTiketDibeli(ArrayList<Tiket> daftarTiketDibeli) {
        this.daftarTiketDibeli = daftarTiketDibeli;
    }

    public int getJmlTiket() {
        return jmlTiket;
    }

    public void setJmlTiket(int jmlTiket) {
        this.jmlTiket = jmlTiket;
    }

    public Kereta getKereta() {
        return kereta;
    }

    public void setKereta(Kereta kereta) {
        this.kereta = kereta;
    }
    
}
