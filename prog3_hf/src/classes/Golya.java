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

    public Golya(int sorszam, String nev) {
        super(sorszam, nev);
        kivantSzamok=new ArrayList<>();
    }


private void kivalaszt(ZeneSzam z){
    kivantSzamok.add(z);
}

    @Override
    public void fogyaszt(int osszeg) {
        super.fogyaszt((int) (osszeg-(osszeg*KEDVEZMENY_SZAZALEK))); //To change body of generated methods, choose Tools | Templates.
    }


}
