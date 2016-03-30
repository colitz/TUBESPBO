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
public class Gerbong {
        private String namaGerbong;
	private int bebanGerbong;
	private int maxBebanGerbong;
//	private Gerbong[] g; 

        
        public Gerbong(String nama, int max){
            this.namaGerbong = nama;
            this.bebanGerbong = 0;
            this.maxBebanGerbong = max;
        }
        
    /**
     * @return the namaGerbong
     */
    public String getNamaGerbong() {
        return namaGerbong;
    }

    /**
     * @param namaGerbong the namaGerbong to set
     */
    public void setNamaGerbong(String namaGerbong) {
        this.namaGerbong = namaGerbong;
    }
    /**
     * @return the bebanGerbong
     */
    public int getBebanGerbong() {
        return bebanGerbong;
    }

    /**
     * @param bebanGerbong the bebanGerbong to set
     */
    public void setBebanGerbong(int bebanGerbong) {
        this.bebanGerbong = bebanGerbong;
    }

    /**
     * @return the maxBebanGerbong
     */
    public int getMaxBebanGerbong() {
        return maxBebanGerbong;
    }

    /**
     * @param maxBebanGerbong the maxBebanGerbong to set
     */
    public void setMaxBebanGerbong(int maxBebanGerbong) {
        this.maxBebanGerbong = maxBebanGerbong;
    }

    /**
     * @return the k
     */
//    public Gerbong[] getG() {
//        return g;
//    }
//
//    /**
//     * @param k the k to set
//     */
//    public void setK(Gerbong[] g) {
//        this.g = g;
//    }   
}
