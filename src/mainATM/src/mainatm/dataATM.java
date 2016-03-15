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
        
    }
    }
}
