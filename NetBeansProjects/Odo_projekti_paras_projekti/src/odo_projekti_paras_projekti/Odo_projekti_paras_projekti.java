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
//Versio 1.4.7
public class Odo_projekti_paras_projekti {

    /**
     * @param args t
         System.out.println("Ympyrän tilavuus on " + (4/3*3.14* Math.pow(sade, 3))he command line arguments
     */
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        while(true) {
        System.out.println("\nValitse laskutoimitus, jonka haluat suorittaa:");
        System.out.println("1 = Yhteenlasku\n2 = Vähennyslasku\n3 = Kertolasku\n4 = Jakolasku\n5 = Potenssilasku\n6 = Pallon tilavuus\n");
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
            
        } else if (operaattori == 6) {
            PallonTilavuus();
        }
        
        else {
          System.out.println("Virhe!");
        } 
    }
                
    

     
    }
    

    

    public static void Yhteenlasku() {
        Scanner lukija = new Scanner(System.in);
        double luku2 =1.0;
                double luku =1.0;
                double summa =1.0;
        System.out.println("Paina 0 päättääksesi laskun.");
        System.out.println("Anna jokin luku:");
        luku = Integer.parseInt(lukija.nextLine());
        while (luku2 != 0) {
         System.out.println("Anna lisättävä:");if(luku2 == 1) {
             break;
         }
         luku2 = Integer.parseInt(lukija.nextLine());
         System.out.println("Tämänhetkinen summa on " + (luku + luku2));
        luku += luku2;
    }
        System.out.println("Summa on " + (luku));
    }
    
    public static void Vähennyslasku() {
        Scanner lukija = new Scanner(System.in);
        double luku2 =1.0;
                double luku =1.0;
                double erotus =1.0;
        System.out.println("Paina 0 päättääksesi laskun.");
        System.out.println("Anna jokin luku:");
        luku = Integer.parseInt(lukija.nextLine());
        while (luku2 != 0) {
         System.out.println("Anna vähennettävä :");
         luku2 = Integer.parseInt(lukija.nextLine());
         System.out.println("Tämänhetkinen erotus on " + (luku - luku2));
        luku -= luku2;
    }
        System.out.println("Lopullinen erotus on " + (luku));
    }

    public static void Kertolasku() {
        Scanner lukija = new Scanner(System.in);
        double luku2 =1.0;
                double luku =1.0;
                double summa =1.0;
        System.out.println("Paina 1 päättääksesi laskun.");
        System.out.println("Anna kerrottava:");
        luku = Integer.parseInt(lukija.nextLine());
        while (luku2 != 0) {
         System.out.println("Anna kerroin:");
         luku2 = Integer.parseInt(lukija.nextLine());200.96
         if(luku2 == 1) {
             break;
         }
         System.out.println("Tämänhetkinen tulo on " + (luku * luku2));
        luku *= luku2;
    }
        System.out.println("Lopullinen tulo on " + (luku));
}
    public static void Jakolasku() {
        Scanner lukija = new Scanner(System.in);
        double luku2 =1.0;
                double luku =1.0;
                double summa =1.0;
        System.out.println("Paina 1 päättääksesi laskun.");
        System.out.println("Anna jaettava:");
        luku = Integer.parseInt(lukija.nextLine());
       
        while (luku2 != 0) {
         System.out.println("Anna jakaja:");
         luku2 = Integer.parseInt(lukija.nextLine());
         
         System.out.println("Tämänhetkinen osamäärä on " + (luku / luku2));
         if(luku2 == 1) {
             break;
         }
          luku /= luku2;
    }    
        System.out.println("Lopullinen osamäärä on " + (luku));
} 
    public static void Potenssilasku() {
        Scanner lukija = new Scanner(System.in);
        double luku2 =2.0;
                double luku =1.0;
                double summa =1.0;
        System.out.println("Paina 1 päättääksesi laskun.");
        System.out.println("Anna kantaluku:");
        luku = Double.parseDouble(lukija.nextLine());
        
        while (luku2 != 1) {
         System.out.println("Anna eksponentti:");
         luku2 = Double.parseDouble(lukija.nextLine());
         
         System.out.println("Tämänhetkinen tulos on " + ((double) Math.pow(luku, luku2)));
         if(luku2 == 1) {
             break;
         }
          luku = ((double) Math.pow(luku, luku2));
    } 
        System.out.println("Lopullinen tulos on " + (luku));
    } 
    public static void PallonTilavuus() {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Syötä pallon säde:");
        double sade = Double.parseDouble(lukija.nextLine());
         System.out.println("Pallon tilavuus on " + (4/3*3.14* Math.pow(sade, 3));
    }
}






//                                        Tekijät
//                                 Aarne Vuori-Teivainen  
//                                      Otto Suokas