package com.game.dnd.entity.character;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Attribute {
    
    List<Integer> boniAttributes = new ArrayList<Integer>();

      Integer STAERKE;
    Integer staerkeBONI;
    

      Integer GESCHICKLICHKEIT;
    Integer geschicklichkeitBONI;
    
  
      Integer KONSTITUTION;
    Integer konstitutionBONI;
    
    
      Integer INTELLIGENZ;
    Integer intelligenzBONI;
    
  
      Integer WEISHEIT;
    Integer weisheitBONI;
    
  
      Integer CHARISMA;
    Integer charismaBONI;


                    // public Integer setStaerke(Integer staerkeValue){
                    //     return staerkeValue;
                    // }


    // Getter Primer for privateVariables

                    // /**
                    //  * @param staerkePrimer the staerkePrimer to set
                    //  */
                    // public void setStaerkePrimer(int staerkePrimer) {
                    //     this.staerkePrimer = staerkePrimer;
                    // }

                    // /**
                    //  * @param geschicklichkeitPrimer the geschicklichkeitPrimer to set
                    //  */
                    // public void setGeschicklichkeitPrimer(int geschicklichkeitPrimer) {
                    //     this.geschicklichkeitPrimer = geschicklichkeitPrimer;
                    // }

                    // /**
                    //  * @param konstitutionPrimer the konstitutionPrimer to set
                    //  */
                    // public void setKonstitutionPrimer(int konstitutionPrimer) {
                    //     this.konstitutionPrimer = konstitutionPrimer;
                    // }

                    // /**
                    //  * @param intelligenzPrimer the intelligenzPrimer to set
                    //  */
                    // public void setIntelligenzPrimer(int intelligenzPrimer) {
                    //     this.intelligenzPrimer = intelligenzPrimer;
                    // }

                    // /**
                    //  * @param weisheitPrimer the weisheitPrimer to set
                    //  */
                    // public void setWeisheitPrimer(int weisheitPrimer) {
                    //     this.weisheitPrimer = weisheitPrimer;
                    // }

                    // /**
                    //  * @param charismaPrimer the charismaPrimer to set
                    //  */
                    // public void setCharismaPrimer(int charismaPrimer) {
                    //     this.charismaPrimer = charismaPrimer;
                    // };




    // Methodes

    //with Scanner
    public void setAllAttributes(){

        Scanner scn = new Scanner(System.in);

        System.out.println("Geben Sie nachfolgend die Basis-Werte für "
                        + " die Attribute, einzelnd ein.\n-Druecken Sie eine beliebige Taste...");
        String string = scn.nextLine();
        System.out.println("Staerke:");
        this.STAERKE = Integer.valueOf(scn.nextInt());
        System.out.println("Geschicklichkeit:");
        this.GESCHICKLICHKEIT = Integer.valueOf(scn.nextInt());
        System.out.println("Konstitution:");
        this.KONSTITUTION = Integer.valueOf(scn.nextInt());
        System.out.println("Intelligenz:");
        this.INTELLIGENZ = Integer.valueOf(scn.nextInt());
        System.out.println("Weisheit:");
        this.WEISHEIT = Integer.valueOf(scn.nextInt());
        System.out.println("Charisma:");
        this.CHARISMA = Integer.valueOf(scn.nextInt());
        System.out.println("--------------------");

        initializeAttributesBoni();

        System.out.println("Attribute:");
        System.out.println("Staerke: " + this.STAERKE + "\nBoni: " + this.boniAttributes.get(0) + "\n");
        System.out.println("Geschicklichkeit: " + this.GESCHICKLICHKEIT + "\nBoni: " + this.boniAttributes.get(1) + "\n");
        System.out.println("Konstitution: " + this.KONSTITUTION + "\nBoni: " + this.boniAttributes.get(2) + "\n");
        System.out.println("Intelligenz: " + this.INTELLIGENZ + "\nBoni: " + this.boniAttributes.get(3) + "\n");
        System.out.println("Weisheit: " + this.WEISHEIT + "\nBoni: " + this.boniAttributes.get(4) + "\n");
        System.out.println("Charisma: " + this.CHARISMA + "\nBoni: " + this.boniAttributes.get(5) + "\n");    

    }




    public void initializeAttributesBoni(){

        switch (this.STAERKE) {
            case 0:
            case 1:
                this.staerkeBONI = Integer.valueOf(-5);
                this.boniAttributes.add(this.staerkeBONI);
                break;
            case 2:
            case 3:
                this.staerkeBONI = Integer.valueOf(-4);
                this.boniAttributes.add(this.staerkeBONI);
                break;
            case 4:
            case 5:
                this.staerkeBONI = Integer.valueOf(-3);
                this.boniAttributes.add(this.staerkeBONI);
                break;
            case 6:
            case 7:
                this.staerkeBONI = Integer.valueOf(-2);
                this.boniAttributes.add(this.staerkeBONI);
                break;
            case 8:
            case 9:
                this.staerkeBONI = Integer.valueOf(-1);
                this.boniAttributes.add(this.staerkeBONI);
                break;
            case 10:
            case 11:
                this.staerkeBONI = Integer.valueOf(0);
                this.boniAttributes.add(this.staerkeBONI);
                break;
            case 12:
            case 13:
                this.staerkeBONI = Integer.valueOf(1);
                this.boniAttributes.add(this.staerkeBONI);
                break;
            case 14:
            case 15:
                this.staerkeBONI = Integer.valueOf(2);
                this.boniAttributes.add(this.staerkeBONI);
                break;
            case 16:
            case 17:
                this.staerkeBONI = Integer.valueOf(3);
                this.boniAttributes.add(this.staerkeBONI);
                break;
            case 18:
            case 19:
                this.staerkeBONI = Integer.valueOf(4);
                this.boniAttributes.add(this.staerkeBONI);
                break;
            default:
                break;
        }

        switch (this.GESCHICKLICHKEIT) {
            case 0:
            case 1:
                this.geschicklichkeitBONI = Integer.valueOf(-5);
                this.boniAttributes.add(this.geschicklichkeitBONI);
                break;
            case 2:
            case 3:
                this.geschicklichkeitBONI = Integer.valueOf(-4);
                this.boniAttributes.add(this.geschicklichkeitBONI);
                break;
            case 4:
            case 5:
                this.geschicklichkeitBONI = Integer.valueOf(-3);
                this.boniAttributes.add(this.geschicklichkeitBONI);
                break;
            case 6:
            case 7:
                this.geschicklichkeitBONI = Integer.valueOf(-2);
                this.boniAttributes.add(this.geschicklichkeitBONI);
                break;
            case 8:
            case 9:
                this.geschicklichkeitBONI = Integer.valueOf(-1);
                this.boniAttributes.add(this.geschicklichkeitBONI);
                break;
            case 10:
            case 11:
                this.geschicklichkeitBONI = Integer.valueOf(0);
                this.boniAttributes.add(this.geschicklichkeitBONI);
                break;
            case 12:
            case 13:
                this.geschicklichkeitBONI = Integer.valueOf(1);
                this.boniAttributes.add(this.geschicklichkeitBONI);
                break;
            case 14:
            case 15:
                this.geschicklichkeitBONI = Integer.valueOf(2);
                this.boniAttributes.add(this.geschicklichkeitBONI);
                break;
            case 16:
            case 17:
                this.geschicklichkeitBONI = Integer.valueOf(3);
                this.boniAttributes.add(this.geschicklichkeitBONI);
                break;
            case 18:
            case 19:
                this.geschicklichkeitBONI = Integer.valueOf(4);
                this.boniAttributes.add(this.geschicklichkeitBONI);
                break;
            default:
                break;
        }

        switch (this.KONSTITUTION) {
            case 0:
            case 1:
                this.konstitutionBONI = Integer.valueOf(-5);
                this.boniAttributes.add(this.konstitutionBONI);
                break;
            case 2:
            case 3:
                this.konstitutionBONI = Integer.valueOf(-4);
                this.boniAttributes.add(this.konstitutionBONI);
                break;
            case 4:
            case 5:
                this.konstitutionBONI = Integer.valueOf(-3);
                this.boniAttributes.add(this.konstitutionBONI);
                break;
            case 6:
            case 7:
                this.konstitutionBONI = Integer.valueOf(-2);
                this.boniAttributes.add(this.konstitutionBONI);
                break;
            case 8:
            case 9:
                this.konstitutionBONI = Integer.valueOf(-1);
                this.boniAttributes.add(this.konstitutionBONI);
                break;
            case 10:
            case 11:
                this.konstitutionBONI = Integer.valueOf(0);
                this.boniAttributes.add(this.konstitutionBONI);
                break;
            case 12:
            case 13:
                this.konstitutionBONI = Integer.valueOf(1);
                this.boniAttributes.add(this.konstitutionBONI);
                break;
            case 14:
            case 15:
                this.konstitutionBONI = Integer.valueOf(2);
                this.boniAttributes.add(this.konstitutionBONI);
                break;
            case 16:
            case 17:
                this.konstitutionBONI = Integer.valueOf(3);
                this.boniAttributes.add(this.konstitutionBONI);
                break;
            case 18:
            case 19:
                this.konstitutionBONI = Integer.valueOf(4);
                this.boniAttributes.add(this.konstitutionBONI);
                break;
            default:
                break;
        }

        switch (this.INTELLIGENZ) {
            case 0:
            case 1:
                this.intelligenzBONI = Integer.valueOf(-5);
                this.boniAttributes.add(this.intelligenzBONI);
                break;
            case 2:
            case 3:
                this.intelligenzBONI = Integer.valueOf(-4);
                this.boniAttributes.add(this.intelligenzBONI);
                break;
            case 4:
            case 5:
                this.intelligenzBONI = Integer.valueOf(-3);
                this.boniAttributes.add(this.intelligenzBONI);
                break;
            case 6:
            case 7:
                this.intelligenzBONI = Integer.valueOf(-2);
                this.boniAttributes.add(this.intelligenzBONI);
                break;
            case 8:
            case 9:
                this.intelligenzBONI = Integer.valueOf(-1);
                this.boniAttributes.add(this.intelligenzBONI);
                break;
            case 10:
            case 11:
                this.intelligenzBONI = Integer.valueOf(0);
                this.boniAttributes.add(this.intelligenzBONI);
                break;
            case 12:
            case 13:
                this.intelligenzBONI = Integer.valueOf(1);
                this.boniAttributes.add(this.intelligenzBONI);
                break;
            case 14:
            case 15:
                this.intelligenzBONI = Integer.valueOf(2);
                this.boniAttributes.add(this.intelligenzBONI);
                break;
            case 16:
            case 17:
                this.intelligenzBONI = Integer.valueOf(3);
                this.boniAttributes.add(this.intelligenzBONI);
                break;
            case 18:
            case 19:
                this.intelligenzBONI = Integer.valueOf(4);
                this.boniAttributes.add(this.intelligenzBONI);
                break;
            default:
                break;
        }

        switch (this.WEISHEIT) {
            case 0:
            case 1:
                this.weisheitBONI = Integer.valueOf(-5);
                this.boniAttributes.add(this.weisheitBONI);
                break;
            case 2:
            case 3:
                this.weisheitBONI = Integer.valueOf(-4);
                this.boniAttributes.add(this.weisheitBONI);
                break;
            case 4:
            case 5:
                this.weisheitBONI = Integer.valueOf(-3);
                this.boniAttributes.add(this.weisheitBONI);
                break;
            case 6:
            case 7:
                this.weisheitBONI = Integer.valueOf(-2);
                this.boniAttributes.add(this.weisheitBONI);
                break;
            case 8:
            case 9:
                this.weisheitBONI = Integer.valueOf(-1);
                this.boniAttributes.add(this.weisheitBONI);
                break;
            case 10:
            case 11:
                this.weisheitBONI = Integer.valueOf(0);
                this.boniAttributes.add(this.weisheitBONI);
                break;
            case 12:
            case 13:
                this.weisheitBONI = Integer.valueOf(1);
                this.boniAttributes.add(this.weisheitBONI);
                break;
            case 14:
            case 15:
                this.weisheitBONI = Integer.valueOf(2);
                this.boniAttributes.add(this.weisheitBONI);
                break;
            case 16:
            case 17:
                this.weisheitBONI = Integer.valueOf(3);
                this.boniAttributes.add(this.weisheitBONI);
                break;
            case 18:
            case 19:
                this.weisheitBONI = Integer.valueOf(4);
                this.boniAttributes.add(this.weisheitBONI);
                break;
            default:
                break;
        }

        switch (this.CHARISMA) {
            case 0:
            case 1:
                this.charismaBONI = Integer.valueOf(-5);
                this.boniAttributes.add(this.charismaBONI);
                break;
            case 2:
            case 3:
                this.charismaBONI = Integer.valueOf(-4);
                this.boniAttributes.add(this.charismaBONI);
                break;
            case 4:
            case 5:
                this.charismaBONI = Integer.valueOf(-3);
                this.boniAttributes.add(this.charismaBONI);
                break;
            case 6:
            case 7:
                this.charismaBONI = Integer.valueOf(-2);
                this.boniAttributes.add(this.charismaBONI);
                break;
            case 8:
            case 9:
                this.charismaBONI = Integer.valueOf(-1);
                this.boniAttributes.add(this.charismaBONI);
                break;
            case 10:
            case 11:
                this.charismaBONI = Integer.valueOf(0);
                this.boniAttributes.add(this.charismaBONI);
                break;
            case 12:
            case 13:
                this.charismaBONI = Integer.valueOf(1);
                this.boniAttributes.add(this.charismaBONI);
                break;
            case 14:
            case 15:
                this.charismaBONI = Integer.valueOf(2);
                this.boniAttributes.add(this.charismaBONI);
                break;
            case 16:
            case 17:
                this.charismaBONI = Integer.valueOf(3);
                this.boniAttributes.add(this.charismaBONI);
                break;
            case 18:
            case 19:
                this.charismaBONI = Integer.valueOf(4);
                this.boniAttributes.add(this.charismaBONI);
                break;
            default:
                break;
        }





    };
}
