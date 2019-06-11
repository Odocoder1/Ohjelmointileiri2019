/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tekstiseikkailu1;
import java.util.Scanner;

/**
 *
 * @author guest-mdg8q9
 */
public class Tekstiseikkailu1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
         System.out.println("Kerro nimesi:");
        String nimi = lukija.nextLine();
         System.out.println("Anna ikäsi:");
        int ika = Integer.parseInt(lukija.nextLine());
         System.out.println("Tervehdys sinulle " + nimi + ", söis olla " + ika);
         System.out.println("Kello käy jo " + 2 + 2 + ",");
         System.out.println("Ja polkuja haarautuu tästä " + (1 + 2) + ".");
         System.out.println("Käytkö polulle 1, 2 vai 3");
         int valinta = Integer.parseInt( lukija.nextLine() );
         
         if (valinta == 1) {
             System.out.println("Sankarin niin urhean, \nsöi kuitenkin lopulta hirviö.");
         }
         else if (valinta == 2) {
             System.out.println("Sankari löysi pienen majatolon johon hän jäi yöksi.");
         }
         else {
             System.out.println("Ja näin kannatti koittaa,\noli linnan ovi auki.");
         }
         System.out.println("Näkyi ovelta portaat ja sali,\nkumman valitsee sankari?");
         String kohde = lukija.nextLine();
         if ( kohde.equals("sali") ) {
             System.out.println("Kuului kauhea karjaisu, \npelästytti pois sankarin.");
         }
         else {
             System.out.println("Askelmat jyrkät,\nselvisi täpärästi " + nimi);
         }
         System.out.println("Torni kun paljastui tyhjäksi,\njatkoiko sankari ullakolle vai parvekkeelle?");
          kohde = lukija.nextLine();
         if ( kohde.equals("ullakolle") ) {
             System.out.println("Jäi sankarin seikkailu ilman palkkiota,\noli linna jo tyhjä.");
         }
         else {
             System.out.println("Selvisit seikkailusta                                                                                                                      melkein, lol oikeesti kuolit noob.");
         }
    }

}
