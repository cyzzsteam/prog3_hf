/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import classes.Balozo;
import classes.ZeneSzam;
import java.util.List;

/**
 *
 * @author CyzZ
 */
public interface AdatInput {
    public List<Balozo> balozoLista() throws Exception;
    public List<ZeneSzam> zeneLista() throws Exception;
}
