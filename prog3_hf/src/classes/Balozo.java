/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;


public class Balozo {
    private int sorszam;
    private String nev;
    private int zsebpenz;
    private int koltseg;
    private int tancszam;
    //Evfolyamot csak vizsgálatra használjuk, hogy gólya e. Majdnem kihagytam emiatt az osztályból.
    private int evfolyam;

    public Balozo(int sorszam, String nev,int evfolyam) {
        this.sorszam = sorszam;
        this.nev = nev;
    }
    
    public void penztKap(int osszeg){
    if(osszeg>0){
    zsebpenz+=osszeg;
    }
    }
    
    public void fogyaszt(int osszeg){
    if(osszeg>0&&osszeg<zsebpenz){
    zsebpenz-=osszeg;
    koltseg+=osszeg;
    } 
      }
    public void tancol(){
    tancszam++;
    }
    public int getSorszam() {
        return sorszam;
    }

    public String getNev() {
        return nev;
    }

    public int getKoltseg() {
        return koltseg;
    }

    public int getTancszam() {
        return tancszam;
    }
}
