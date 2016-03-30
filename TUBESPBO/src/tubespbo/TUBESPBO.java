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
public class TUBESPBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Gerbong g1 = new Gerbong("A",10);
        Gerbong g2 = new Gerbong("B",5);
        Gerbong g3 = new Gerbong("C",8);
        
        Kereta k1 = new Kereta("Lodaya");
        k1.addGerbong(g1);
        k1.addGerbong(g2);
        k1.addGerbong(g3);
        
        Kereta k2 = new Kereta("Serayu");
        k2.addGerbong(g3);
        
        Stasiun s1 = new Stasiun("Bandung");
        Stasiun s2 = new Stasiun("Purwokerto");
        Stasiun s3 = new Stasiun("Surabaya");
        
        Rute BdgPwt = new Rute(s1,s2,k2);
        
        System.out.println("Kereta 1");
        for(int i=0;i<k1.getDaftarGerbong().size();i++){
            System.out.print(k1.getDaftarGerbong().get(i).getNamaGerbong()+ " ");
        }
        System.out.println();
        System.out.println("Max Kapasitas :" + k1.getKapasitasKereta());
        
        System.out.println();
        System.out.println("Kereta 2");
        for(int i=0;i<k2.getDaftarGerbong().size();i++){
            System.out.print(k2.getDaftarGerbong().get(i).getNamaGerbong()+ " ");
        }
        System.out.println();
        System.out.println("Max Kapasitas :" + k2.getKapasitasKereta());
        
        System.out.println();
        System.out.println("Rute Bandung Purwokerto - " + BdgPwt.getKereta().getNamaKereta());
        System.out.println(BdgPwt.getStasiun1().getNamaStasiun());
        System.out.println(BdgPwt.getStasiun2().getNamaStasiun());
    }    
}
