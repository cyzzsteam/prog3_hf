/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import interfaces.AdatInput;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author CyzZ
 */
public class FajlbolInput implements AdatInput{

    @Override
    public List<Balozo> balozoLista() throws Exception {
        List<Balozo> balozok=new ArrayList<>();
        try(Scanner sc=new Scanner(in))
        
        return balozok;
    }

    @Override
    public List<ZeneSzam> zeneLista() throws Exception {
        List<ZeneSzam> zenek=new ArrayList<>();
        
        
        return zenek;
    }
    
}
