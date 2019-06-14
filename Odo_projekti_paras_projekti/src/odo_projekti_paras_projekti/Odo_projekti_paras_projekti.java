/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odo_projekti_paras_projekti;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author guest-mdg8q9
 */
//The Ultimate Calculator
//Versio 1.8.8
public class Odo_projekti_paras_projekti {

    /**int)System.out.println("Ympyrän tilavuus on " + (4/3*3.14* Math.pow(sade, 3))he command line argument
     * @param args t
         System.out.println("Ympyrän tilavuus on " + (4/3*3.14* Math.pow(sade, 3))he command line arguments
     */
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        while(true) {
        System.out.println("\nValitse laskutoimitus, jonka haluat suorittaa:");
        System.out.println("1 = Yhteenlasku\n2 = Vähennyslasku\n3 = Kertolasku\n4 = Jakolasku\n5 = Potenssilasku\n6 = Pallon tilavuus\n7 = Luvun arpoja\n8 = Funktiolaskin  Coming soon...");
        double operaattori = Double.parseDouble(lukija.nextLine());
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
        } else if (operaattori == 7) {
            RandomGenerator();
        }
        
        else {
          System.out.println("Virhe! Kokeile uudelleen.");
        } 
    }
                
    

     
    }
    

    

    public static void Yhteenlasku() {
        Scanner lukija = new Scanner(System.in);
        double luku2 =2.0;
                double luku =2.0;
                double summa =2.0;
        System.out.println("Paina 0 päättääksesi laskun.");
        System.out.println("Anna jokin luku:");
        luku = Double.parseDouble(lukija.nextLine());
        while (luku2 != 0) {
         System.out.println("Anna lisättävä:");
         if(luku2 == 0) {
             break;
         }
         luku2 = Double.parseDouble(lukija.nextLine());
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
        luku = Double.parseDouble(lukija.nextLine());
        while (luku2 != 0) {
         System.out.println("Anna vähennettävä :");
         luku2 = Double.parseDouble(lukija.nextLine());
         System.out.println("Tämänhetkinen erotus on " + (luku - luku2));
        luku -= luku2;
    }
        System.out.println("Lopullinen erotus on " + (luku));
    }

    public static void Kertolasku() {
        Scanner lukija = new Scanner(System.in);
        double luku2 =1.0;
                double luku =1.0;
                double tulo =1.0;
        System.out.println("Paina 1 päättääksesi laskun.");
        System.out.println("Anna kerrottava:");
        luku = Double.parseDouble(lukija.nextLine());
        
        while (luku2 != 0) {
         System.out.println("Anna kerroin:");
         luku2 = Double.parseDouble(lukija.nextLine());
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
        double luku2 =2.0;
                double luku =2.0;
                double osamäärä =2.0;
        System.out.println("Paina 0 päättääksesi laskun.");
        System.out.println("Anna jaettava:");
        luku = Double.parseDouble(lukija.nextLine());
       
        while (luku2 != 0) {
         System.out.println("Anna jakaja:");
         luku2 = Double.parseDouble(lukija.nextLine());
         
         if(luku2 == 0) {
             break;
         }
         System.out.println("Tämänhetkinen osamäärä on " + (luku / luku2));
          luku /= luku2;
    }    
        System.out.println("Lopullinen osamäärä on " + (luku));
} 
    public static void Potenssilasku() {
        Scanner lukija = new Scanner(System.in);
        double luku2 =2.0;
                double luku =1.0;
                double tulos =1.0;
        System.out.println("Paina 1 päättääksesi laskun.");
        System.out.println("Anna kantaluku:");
        luku = Double.parseDouble(lukija.nextLine());
        
        while (luku2 != 1) {
         System.out.println("Anna eksponentti:");
         luku2 = Double.parseDouble(lukija.nextLine());
         
         if(luku2 == 1) {
             break;
         }
         System.out.println("Tämänhetkinen tulos on " + ((double) Math.pow(luku, luku2)));
          luku = ((double) Math.pow(luku, luku2));
    } 
        System.out.println("Lopullinen tulos on " + (luku));
    } 
    public static void PallonTilavuus() {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Syötä pallon säde:");
        double r=lukija.nextDouble();
        double tilavuus= (4*22*r*r*r)/(3*7);
         System.out.println("Pallon tilavuus on " + tilavuus);
    }
    
    public static void RandomGenerator() {
        
        Scanner lukija = new Scanner(System.in);
        int luku = 98753;
        int luku2 = 987654;
        System.out.println("Ilmoita luvut joiden väliltä haluat arpoa. Huom! Käytä tasalukuja.");
        luku = Integer.parseInt(lukija.nextLine());
        luku2 = Integer.parseInt(lukija.nextLine());
        Random rand = new Random();
    double x = (Math.random()*((luku-luku2)+1))+luku2;
    System.out.println(x);
    }
    public static void FunktioLaskin() {
        
    }
}






//                                        Tekijät
//                                 Aarne Vuori-Teivainen  
//                                      Otto Suokas