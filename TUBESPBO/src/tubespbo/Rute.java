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
public class Rute {
    private Stasiun stasiun1;
    private Stasiun stasiun2;
    private Tiket[] daftarTiketDibeli = new Tiket[100];
    private int jmlTiket=0;

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
    
    public createTiket(int tanggal){
	if(jmlTiket<100){
	daftarTiketDibeli[jmlTiket] = new Tiket(tanggal);
	jmlTiket++;
	}
    }
    
}
