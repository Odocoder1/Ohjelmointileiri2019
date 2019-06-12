/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odo_projekti_paras_projekti;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author guest-mdg8q9
 */
//The Ultimate Calculator
//Versio 1.0
public class Odo_projekti_paras_projekti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        while(true) {
        System.out.println("\nValitse laskutoimitus, jonka haluat suorittaa:");
        System.out.println("1 = Yhteenlasku\n2 = Vähennyslasku\n3 = Kertolasku\n4 = Jakolasku\n5 = Potenssilasku\n");

        int operaattori = Integer.parseInt(lukija.nextLine());
        if (operaattori == 1) {
            Yhteenlasku();
        } else if (operaattori == 2) {
            Vähennyslasku();
        } else if (operaattori == 3) {
            Kertolasku();
        } else if (operaattori == 4) {
            Jakolasku();
        } else if (operaattori == 5) {
            Potenssilasku();
          
        } 
        
        else {
          System.out.println("Virhe!");
        } 
    }
                
    

     
    }
    

    

    public static void Yhteenlasku() {
        Scanner lukija = new Scanner(System.in);
        double luku2 =8745;
                double luku =5498;
        System.out.println("Anna jokin luku:");
        luku = Integer.parseInt(lukija.nextLine());
        while (luku2 != 0) {
         System.out.println("Anna lisättävä :");
         luku2 = Integer.parseInt(lukija.nextLine());
         System.out.println("Tämänhetkinen summa on " + (luku + luku2));
        
    }
        System.out.println("Summa on " + (luku + luku2));
    }
    
    public static void Vähennyslasku() {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna jokin luku:");
        double luku = Integer.parseInt(lukija.nextLine());
        System.out.println("Anna ensimmäisestä luvusta vähennettävä luku:");
        double luku2 = Integer.parseInt(lukija.nextLine());
        System.out.println("Erotus on " + (luku - luku2));
    }

    public static void Kertolasku() {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna ensimmäinen tulontekijä:");
        double luku = Integer.parseInt(lukija.nextLine());
        System.out.println("Anna toinen tulontekijä:");
        double luku2 = Integer.parseInt(lukija.nextLine());
        System.out.println("Tulo on " + (luku * luku2)); 
}
    public static void Jakolasku() {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna jaettava:");
        double luku = Integer.parseInt(lukija.nextLine());
        System.out.println("Anna jakaja:");
        double luku2 = Integer.parseInt(lukija.nextLine());
        System.out.println("Osamäärä on " + (luku / luku2));
} 
    public static void Potenssilasku() {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna kantaluku:");
        double luku = Integer.parseInt(lukija.nextLine());
        System.out.println("Anna eksponentti:");
        double luku2 = Integer.parseInt(lukija.nextLine());
        System.out.println("Potenssin tulos on " + ((int) Math.pow(luku, luku2)));
} 
    
}







//                                        Tekijät
//                                 Aarne Vuori-Teivainen  
//                                      Otto Suokas