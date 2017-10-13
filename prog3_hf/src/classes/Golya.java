/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

import java.util.ArrayList;
import java.util.List;


public class Golya extends Balozo{
private final double KEDVEZMENY_SZAZALEK=0.2;
private List<ZeneSzam> kivantSzamok;

    public Golya(int sorszam, String nev,int evfolyam) {
        super(sorszam, nev,evfolyam);
        kivantSzamok=new ArrayList<>();
    }


public  void kivalaszt(ZeneSzam z){
    kivantSzamok.add(z);
}

    public List<ZeneSzam> getKivantSzamok() {
        return kivantSzamok;
    }

    @Override
    public void fogyaszt(int osszeg) {
        super.fogyaszt((int) (osszeg-(osszeg*KEDVEZMENY_SZAZALEK))); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        if(super.getTancszam()==0) return super.getNev()+" (g)";
        return super.getNev()+" ("+super.getTancszam()+" tánc , "+super.getZsebpenz()+" Ft) (g)";
    }


}
