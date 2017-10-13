/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import interfaces.AdatInput;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author CyzZ
 */
public class FajlbolInput implements AdatInput{
    private final String BALOZOK_PATH;
    private final String ZENEK_PATH;
    public FajlbolInput(String balozok,String zenek) {
        BALOZOK_PATH=balozok;
        ZENEK_PATH=zenek;
    }
    
    @Override
    public List<Balozo> balozoLista() throws Exception {
        List<Balozo> balozok=new ArrayList<>();
        try(Scanner fileScanner = new Scanner(new File(this.getClass().getResource(BALOZOK_PATH).toURI()));){
        String sor,nev,adatok[];
        int evfolyam,id=1;
        Balozo b;
        while(fileScanner.hasNextLine()){
        sor=fileScanner.nextLine();
        adatok=sor.split(";");
        nev=adatok[0];
        evfolyam=Integer.parseInt(adatok[1]);
        if(evfolyam==1){
                    b=new Golya(id, nev,evfolyam);
               }else{
                    b=new Balozo(id, nev,evfolyam);
               }
                    balozok.add(b);
                    id++;
        }
        }
        
        return balozok;
    }

    @Override
    public List<ZeneSzam> zeneLista() throws Exception {
        List<ZeneSzam> zenek=new ArrayList<>();
        try(Scanner fileScanner = new Scanner(new File(this.getClass().getResource(ZENEK_PATH).toURI()));){
        String eloado,cim,sor,adatok[];
        ZeneSzam z;
        while(fileScanner.hasNextLine()){
        sor=fileScanner.nextLine();
        adatok=sor.split(";");
        eloado=adatok[0];
        cim=adatok[1];
        z=new ZeneSzam(cim, eloado);
        zenek.add(z);
        }
        }
        
        return zenek;
    }
    
}
