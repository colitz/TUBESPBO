/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

/**
 *
 * @author Bagus
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AplikasiTiketKA {
    static int pilihan;
    static Scanner pil = new Scanner(System.in);
    static Scanner scanner = new Scanner(System.in);
    static Scanner in = new Scanner(System.in);
    
    private List<Gerbong> daftarGerbong = new ArrayList<Gerbong>();
    private List<Kereta> daftarKereta = new ArrayList<Kereta>();
    private List<Stasiun> daftarStasiun = new ArrayList<Stasiun>();
    private List<Tiket> daftarTiket = new ArrayList<Tiket>();
    private List<Rute> daftarRute = new ArrayList<Rute>();
    
    
    //-------------------FungsiAdd------------------
    public void addGerbong(String namaGerbong, int maxBebanGerbong){
        Gerbong gerbong = new Gerbong(namaGerbong,maxBebanGerbong);
        daftarGerbong.add(gerbong);
    }
    
    public void addKereta(String namaKereta){
        Kereta kereta = new Kereta(namaKereta);
        daftarKereta.add(kereta);
    }
    
    public void addStasiun(String namaStasiun){
        Stasiun stasiun = new Stasiun(namaStasiun);
        daftarStasiun.add(stasiun);
    }
    
    public void addTiket(String idTiket,Rute rute, int hargaTiket, int tiketTersedia, int tanggal){
        Tiket tiket = new Tiket(idTiket,rute,hargaTiket,tiketTersedia,tanggal);
        daftarTiket.add(tiket);
    }
    
    public void addRute(Stasiun s1, Stasiun s2, Kereta k){
        Rute rute = new Rute(s1,s2,k);
        daftarRute.add(rute);
    }
    
    // -------------------FungsiGet----------------- 
    public Gerbong getGerbong(String namaGerbong){
        for(int i=0;i<daftarGerbong.size();i++){
            Gerbong gerbong = daftarGerbong.get(i);
            if(namaGerbong.equals(gerbong.getNamaGerbong())){
                return gerbong;
            }
        }
        return null;
    }
    
    public Kereta getKereta(String namaKereta){
        for (int i=0; i<daftarKereta.size();i++){
            Kereta kereta = daftarKereta.get(i);
            if(namaKereta.equals(kereta.getNamaKereta())){
                return kereta;
            }
        }
        return null;
    }
    
    public Stasiun getStasiun(String namaStasiun){
        for (int i=0;i<daftarStasiun.size();i++){
            Stasiun stasiun = daftarStasiun.get(i);
            if(namaStasiun.equals(stasiun.getNamaStasiun())){
                return stasiun;
            }
        }
        return null;
    }
    
    public Tiket getTiket(String idTiket){
        for (int i=0;i<daftarTiket.size();i++){
            Tiket tiket = daftarTiket.get(i);
            if(idTiket.equals(tiket.getIdTiket())){
                return tiket;
            }
        }
        return null;
    }
    
    public Rute getRute(String idRute){
        for (int i=0;i<daftarRute.size();i++){
            Rute rute = daftarRute.get(i);
            if(idRute.equals(rute.getIdRute())){
                return rute;
            }
        }
        return null;
    }
    
    
    //------------------FungsiDelete----------------
    public void delGerbong(String namaGerbong){
        for(int i=0;i<daftarGerbong.size();i++){
            Gerbong gerbong = daftarGerbong.get(i);
            if(namaGerbong.equals(gerbong.getNamaGerbong())){
                daftarGerbong.remove(i);
            }
        }
    }
    
    
    public void delKereta(String namaKereta){
        for (int i=0; i<daftarKereta.size(); i++) {
            Kereta kereta = daftarKereta.get(i);
            if(namaKereta.equals(kereta.getNamaKereta())) {
                daftarKereta.remove(i);
            }
        }
    }
    
    public void delStasiun(String namaStasiun){
        for (int i=0; i<daftarStasiun.size(); i++) {
            Stasiun stasiun = daftarStasiun.get(i);
            if(namaStasiun.equals(stasiun.getNamaStasiun())) {
                daftarStasiun.remove(i);
            }
        }
    }
    
    public void delTiket(String idTiket){
        for (int i=0; i<daftarTiket.size(); i++) {
            Tiket tiket = daftarTiket.get(i);
            if(idTiket.equals(tiket.getIdTiket())) {
                daftarTiket.remove(i);
            }
        }
    }
 
    public void delRute(String idRute){
        for (int i=0; i<daftarRute.size(); i++) {
            Rute rute = daftarRute.get(i);
            if(idRute.equals(rute.getIdRute())) {
                daftarRute.remove(i);
            }
        }
    }
    
    
    //================MAIN~MENU===============
    
    public void mainMenu(){
        String username,password;
        System.out.print("UeSeRnAmE : ");
            username = in.next();
        System.out.print("PaSsWoRd  : ");
            password = in.next();
            
            if(username.equals("admin") && password.equals("admin")){
                admin();
            
            } else if (username.equals("user") && password.equals("user")) {
                user();
             }
            else
                System.out.println("Username and Password are Wrong");
    }

    private void admin() {
        System.out.println("=========WELCOME BACK ADMIN==========");
        System.out.println("~~Aplikasi Tiket Kereta Api~~");
        System.out.println("1.Data Gerbong");
        System.out.println("2.Data Kereta");
        System.out.println("3.Data Stasiun");
        System.out.println("4.Data Tiket");
        System.out.println("5.Data Rute");
        System.out.println("6.L-O-G-O-U-T");
        
        System.out.print("Pilihan... ");
        pilihan = pil.nextInt();
            if (pilihan == 1){
                gerbong();
            }
            else if (pilihan == 2) {
                kereta();                        
            }
            else if (pilihan == 3){
                stasiun();
            }
            else if (pilihan == 4){
                tiket();
            }
            else if (pilihan == 5){
                rute();
            }
            else if (pilihan == 6){
                mainMenu();
            }
            else
                System.out.println("Wrong Insert!");
                admin();
    }

    private void user() {
        System.out.println("=========WELCOME USER==========");
        System.out.println("~~Aplikasi Tiket Kereta Api~~");
        System.out.println("1.Pesan Tiket");
        System.out.println("2.Lihat Jadwal Kereta");
        System.out.println("3.Print Tiket");
        System.out.println("4.L-O-G-O-U-T");
        
        System.out.print("Pilihan... ");
        pilihan = pil.nextInt();
            if (pilihan == 1) {
                mainMenu();                        
            }
            else if (pilihan == 2){
                mainMenu();
            }
            else if (pilihan == 3){
                mainMenu();
            }
            else if (pilihan == 4){
                mainMenu();
            }
            else
                System.out.println("Wrong Insert!");
                user();
    }
    
    private void gerbong(){
        System.out.println("");
        System.out.println("============= ADMIN =============");
        System.out.println("========== Data Gerbong ==========");
        System.out.println("1.View Data Gerbong");
        System.out.println("2.Add Data Gerbong");
        System.out.println("3.Delete Data Gerbong");
        System.out.println("4.BACK");
        System.out.print("Pilihan... ");
        pilihan = pil.nextInt();
            if(pilihan == 1){
                viewDataGerbong();
            }
            else if(pilihan == 2){
                addDataGerbong();
            }
            else if(pilihan == 3){
                delDataGerbong();
            }
            else if(pilihan == 4){
                admin();
            }
            else
                System.out.println("Wrong Insert!");
                gerbong();
    }

    private void kereta() {
        System.out.println("");
        System.out.println("============= ADMIN =============");
        System.out.println("========== Data Kereta ==========");
        System.out.println("1.View Data Kereta");
        System.out.println("2.Add Data Kereta");
        System.out.println("3.Delete Data Kereta");
        System.out.println("4.Tambah Gerbong");
        System.out.println("5.Hapus Gerbong");
        System.out.println("6.BACK");
        
        System.out.print("Pilihan... ");
        pilihan = pil.nextInt();
            if (pilihan == 1) {
                viewDataKereta();                        
            }
            else if (pilihan == 2){
                addDataKereta();
            }
            else if (pilihan == 3){
                delDataKereta();
            }
            else if (pilihan == 4){
                //tambahGerbong();
            }
            else if (pilihan == 5){
                //hapusGerbong();
            }
            else if (pilihan == 6){
                admin();
            }
            else
                System.out.println("Wrong Insert!");
                kereta();
    }

    private void stasiun() {
        System.out.println("");
        System.out.println("============= ADMIN =============");
        System.out.println("========== Data Stasiun ==========");
        System.out.println("1.View Data Stasiun");
        System.out.println("2.Add Data Stasiun");
        System.out.println("3.Delete Data Stasiun");
        System.out.println("4.BACK");
        
        System.out.print("Pilihan... ");
        pilihan = pil.nextInt();
            if (pilihan == 1) {
                //viewDataStasiun();                        
            }
            else if (pilihan == 2){
                //addDataStasiun();
            }
            else if (pilihan == 3){
                //delDataStasiun();
            }
            else if (pilihan == 4){
                admin();
            }
            else
                System.out.println("Wrong Insert!");
                stasiun();
    }

    private void tiket() {
        System.out.println("");
        System.out.println("============= ADMIN =============");
        System.out.println("========== Data Tiket ==========");
        System.out.println("1.View Data Tiket");
        System.out.println("2.Add Data Tiket");
        System.out.println("3.Delete Data Tiket");
        System.out.println("4.BACK");
        
        System.out.print("Pilihan... ");
        pilihan = pil.nextInt();
            if (pilihan == 1) {
                //viewDataTiket();                        
            }
            else if (pilihan == 2){
                //addDataTiket();
            }
            else if (pilihan == 3){
                //delDataTiket();
            }
            else if (pilihan == 4){
                admin();
            }
            else
                System.out.println("Wrong Insert!");
                tiket();
    }

    private void rute() {
        System.out.println("");
        System.out.println("============= ADMIN =============");
        System.out.println("========== Data Rute ==========");
        System.out.println("1.View Data Rute");
        System.out.println("2.Add Data Rute");
        System.out.println("3.Delete Data Rute");
        System.out.println("4.BACK");
        
        System.out.print("Pilihan... ");
        pilihan = pil.nextInt();
            if (pilihan == 1) {
                //viewDataRute();                        
            }
            else if (pilihan == 2){
                //addDataRute();
            }
            else if (pilihan == 3){
                //delDataRute();
            }
            else if (pilihan == 4){
                admin();
            }
            else
                System.out.println("Wrong Insert!");
                rute();
    }
    
//----------------------------GERBONG------------------------------
    public void viewDataGerbong(){
        if(daftarGerbong.isEmpty()){
            System.out.println("Data Tidak Tersedia");
        }
        else{
            System.out.println("---DataGerbong---");
            for(int i=0;i<daftarGerbong.size();i++){
                Gerbong gerbong = daftarGerbong.get(i);
                System.out.println("Nama Gerbong         : "+gerbong.getNamaGerbong());
                System.out.println("Beban Gerbong        : "+gerbong.getBebanGerbong());
                System.out.println("Kapasitas Max Gerbong: "+gerbong.getMaxBebanGerbong());
                System.out.println("");
            }
        }
        gerbong();
    }
    
    public void addDataGerbong(){
        System.out.println("---AddGerbong---");
        Scanner inn = new Scanner(System.in);
        Gerbong gerbong = null;
        String namaGerbong;
        int maxBebanGerbong;
        
        System.out.print("Nama Gerbong           : ");
            namaGerbong = inn.next();
            
        System.out.println("Beban Gerbong        : ");
            
        System.out.print("Kapasitas max Gerbong  : ");
            maxBebanGerbong = 50;
        
        gerbong = new Gerbong(namaGerbong,maxBebanGerbong);
        daftarGerbong.add(gerbong);
        gerbong();
    }
    
    public void delDataGerbong(){
        System.out.println("---DeleteGerbong---");
        Scanner scanner = new Scanner(System.in);        
        String namaGerbong;
        System.out.print("Masukkan Nama Gerbong : ");
            namaGerbong = scanner.next();
        for(int i=0; i<daftarGerbong.size(); i++) {
            Gerbong gerbong = daftarGerbong.get(i);            
            if(namaGerbong.equals(gerbong.getNamaGerbong())) {
                System.out.println("Nama Gerbong         : "+gerbong.getNamaGerbong());
                System.out.println("Beban Gerbong        : "+gerbong.getBebanGerbong());
                System.out.println("Kapasitas max Gerbong: "+gerbong.getMaxBebanGerbong());
                
                System.out.println();
                System.out.println("Yakin Data Akan di Hapus ? Y/N" );
                String hapus;
                hapus = scanner.next();
                switch (hapus) {
                    case "Y":
                        daftarGerbong.remove(i);
                        System.out.println("BERHASIL DI HAPUS");
                        gerbong();
                        break;
                    case "y":
                        daftarGerbong.remove(i);
                        System.out.println("BERHASIL DI HAPUS");
                        gerbong();
                        break;
                    case "N":
                        gerbong();
                        break;
                    case "n":
                        gerbong();
                        break;
                }
            }            
        }
    }
    
//---------------------------KERETA--------------------------
    public void viewDataKereta(){
        if(daftarKereta.isEmpty()){
            System.out.println("Data Tidak Tersedia");
        }
        else{
            System.out.println("---DataKereta---");
            for(int i=0;i<daftarKereta.size();i++){
                Kereta kereta = daftarKereta.get(i);
                System.out.println("Nama Kereta         : "+kereta.getNamaKereta());
                System.out.println("Kapasitas Kereta    : "+kereta.getKapasitasKereta());
                System.out.println("Daftar Gerbong      : "+kereta.getDaftarGerbong());
                System.out.println("");
            }
        }
        kereta();
    }
    
    public void addDataKereta(){
        System.out.println("---AddKereta---");
        Scanner inn = new Scanner(System.in);
        Kereta kereta = null;
        String namaKereta,kapasitasKereta;
        ArrayList<Gerbong> daftarGerbong;
        
        System.out.print("Nama Kereta       : ");
            namaKereta = inn.next();
            
        System.out.print("Kapasitas Kereta  : ");
            kapasitasKereta = inn.next();
            
        System.out.println("Daftar Gerbong  : ");
            daftarGerbong = new ArrayList();
        
        kereta = new Kereta(namaKereta);
        daftarKereta.add(kereta);
        kereta();
    }
    
    public void delDataKereta(){
        System.out.println("---DeleteKereta---");
        Scanner scanner = new Scanner(System.in);        
        String namaKereta;
        System.out.print("Masukkan Nama Kereta : ");
            namaKereta = scanner.next();
        for(int i=0; i<daftarKereta.size(); i++) {
            Kereta kereta = daftarKereta.get(i);            
            if(namaKereta.equals(kereta.getNamaKereta())) {
                System.out.println("Nama Kereta         : "+kereta.getNamaKereta());
                System.out.println("Kapasitas Kereta    : "+kereta.getKapasitasKereta());
                System.out.println("Daftar Gerbong      : "+kereta.getDaftarGerbong());
                
                System.out.println();
                System.out.println("Yakin Data Akan di Hapus ? Y/N" );
                String hapus;
                hapus = scanner.next();
                switch (hapus) {
                    case "Y":
                        daftarKereta.remove(i);
                        System.out.println("BERHASIL DI HAPUS");
                        kereta();
                        break;
                    case "y":
                        daftarKereta.remove(i);
                        System.out.println("BERHASIL DI HAPUS");
                        kereta();
                        break;
                    case "N":
                        kereta();
                        break;
                    case "n":
                        kereta();
                        break;
                }
            }            
        }
    }
    
//-----------------------------STASIUN---------------------------
    
    public void viewDataStasiun(){
        if(daftarStasiun.isEmpty()){
            System.out.println("Data Tidak Tersedia");
        }
        else{
            System.out.println("---DataStasiun---");
            for(int i=0;i<daftarStasiun.size();i++){
                Stasiun stasiun = daftarStasiun.get(i);
                System.out.println("Nama Stasiun  : "+stasiun.getNamaStasiun());
                System.out.println("Max Kereta    : "+stasiun.getMaxKereta());
                System.out.println("Jml Kereta    : "+stasiun.getnKereta());
                System.out.println("");
            }
        }
        stasiun();
    }
    
    public void addDataStasiun(){
        System.out.println("---AddStasiun---");
        Scanner inn = new Scanner(System.in);
        Stasiun stasiun = null;
        String namaStasiun;
        int maxKereta;
        
        System.out.print("Nama Stasiun      : ");
            namaStasiun = inn.next();
            
        System.out.print("Max Kereta        : ");
            maxKereta = 5;
            
        System.out.println("Jml Kereta      : ");
            daftarKereta = new ArrayList();
        
        stasiun = new Stasiun(namaStasiun);
        daftarStasiun.add(stasiun);
        stasiun();
    }
    
    public void delDataStasiun(){
        System.out.println("---DeleteStasiun---");
        Scanner scanner = new Scanner(System.in);        
        String namaStasiun;
        System.out.print("Masukkan Nama Stasiun : ");
            namaStasiun = scanner.next();
        for(int i=0; i<daftarStasiun.size(); i++) {
            Stasiun stasiun = daftarStasiun.get(i);            
            if(namaStasiun.equals(stasiun.getNamaStasiun())) {
                System.out.println("Nama Stasiun  : "+stasiun.getNamaStasiun());
                System.out.println("Max Kereta    : "+stasiun.getMaxKereta());
                System.out.println("Jml Kereta    : "+stasiun.getnKereta());
                
                System.out.println();
                System.out.println("Yakin Data Akan di Hapus ? Y/N" );
                String hapus;
                hapus = scanner.next();
                switch (hapus) {
                    case "Y":
                        daftarStasiun.remove(i);
                        System.out.println("BERHASIL DI HAPUS");
                        stasiun();
                        break;
                    case "y":
                        daftarStasiun.remove(i);
                        System.out.println("BERHASIL DI HAPUS");
                        stasiun();
                        break;
                    case "N":
                        stasiun();
                        break;
                    case "n":
                        stasiun();
                        break;
                }
            }            
        }
    }
    
//-------------------------------RUTE-------------------------------
    public void viewDataRute(){
    
    }
    
    public void addDataRute(){
        
    }
    
    public void delDataRute(){
        
    }
    
//-------------------------------TIKET--------------------------------
    public void viewDataTiket(){
        
    }
    
    
    
//----------------------------- USER ONLY -----------------------------
    public void pesanTiket(){
        
    }
    
    public void lihatJadwal(){
        
    }
    
    public void printTiket(){
        
    }
}
