
package halo;

import java.util.Scanner;

public class LuasSegitiga {
  
    public static void main(String[] args) {
        // deklarasi
        Double cookelat;
        int spongebob, patrick;
        
        // membuat scanner baru
        Scanner data = new Scanner(System.in);
        
        //Input
        System.out.println("== Program hitung luas Segitiga ==");
        System.out.print("Input spongebob:  ");
        spongebob = data.nextInt();
        System.out.print("Input patrick:  ");
        patrick = data.nextInt();
        
        //proses
        cookelat = Double.valueOf((spongebob * patrick) / 2);
        String dibagikan = null ;
        
        //output
        System.out.println("cookelat = " + cookelat + dibagikan );
        
       
    }
}
