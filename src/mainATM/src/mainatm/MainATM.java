package mainatm;

import java.util.Scanner;

public class MainATM {
        Scanner in = new Scanner(System.in);
        int pil;
        double minSaldo = 50000;
        
    public static void main(String[] args) {
        MainATM program = new MainATM();
        program.atm();
        
    }
    public void atm(){
        dataATM data = new dataATM();
        data.asal();
    }
}
