/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainatm;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class dataATM {
    Scanner in = new Scanner (System.in);
    ATM atm = new ATM();
    MainATM main = new MainATM();
    double minSaldo = 50000;
    int pil;
    
    public void asal(){
    atm.setSaldo(5000000);
    login();
    }
    public void login(){
       int pin;
        System.out.println("====================================");
        System.out.println("|   Selamat datang di ATM bank JFE  |");
        System.out.println("");
        System.out.println("====================================");
        System.out.print("Masukkan PIN anda : ");
        pin = in.nextInt();
        if (atm.getPin()==pin) {
            menu();}
        else {System.out.println("Pin salah, ulangi lagi");
        login();}
            
        }
    public void menu(){
        System.out.println("=====================================");
        System.out.println("|   >> Pilih Transaksi <<   |");
        System.out.println("");
        System.out.println("|   (1).Cek Saldo       (2).Transfer    |");
        System.out.println("");
        System.out.println("|   (3).Tarik Tunai     (4).Keluar      |");
        System.out.println("");
        System.out.println("=====================================");
        System.out.print("        Masukkan Pilihan Anda : ");
        pil = in.nextInt();
        switch (pil) {
            case 1 : lihatSaldo();break;
            case 2 : transfer();break;
            case 3 : tarik();break;
            case 4 : System.out.println("=============================");
                System.out.println("Terima Kasih telah menggunakan layanan kami \n Silahkan ambil kartu ATM anda");
                break;
            default : System.out.println("Pilihan angka yang anda masukkan tidak sesuai silahkan login kembali");
                      login();break;
        }              
        
                      
    }
    public void lihatSaldo(){
    dataATM data = new dataATM();
        System.out.println("============================");
        System.out.println("|        Cek Saldo         |");
        System.out.println("============================");
        System.out.println("Sisa Saldo anda sebesar Rp. "+ atm.getSaldo());
        transaksiLagi();
    
    }
    public void transfer(){
        int norek;
        double nom;
        System.out.println("============================");
        System.out.println("|         Transfer         |");
        System.out.println("============================");
        System.out.print("    Masukkan Nomor Rekening : ");
        norek = in.nextInt();
        System.out.print("    Masukkan Nominal Transfer : ");
        nom = in.nextDouble();
        transferNominal(nom,norek);
        
    }
    public void transferNominal(double nom,int norek){
    
    }
    public void tarik(){
        
    }
    public void transaksiLagi(){
    
    }
    }

