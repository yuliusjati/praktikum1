package halo;

import java.util.Scanner;

public class suhu {
    
    public static void main(String[] args) {
        // deklarasi
        Double fahrenheit;
        int celsius;
        
        // membuat scanner baru
        Scanner baca = new Scanner(System.in);
        
        // Input
        System.out.println("== Program hitung suhu ==");
        System.out.print("celsius: ");
        celsius = baca.nextInt();
        
        //proses
        fahrenheit = Double.valueOf((celsius * 9 / 5) + 32);
  
        // output
        System.out.println("Fahrenheit: " + fahrenheit);
    
    }
}
 