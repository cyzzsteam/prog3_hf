/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import interfaces.AdatInput;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CyzZ
 */
public class AdatbazisInput implements AdatInput{

    private Connection connection;
    public AdatbazisInput(Connection con){
    connection=con;
    }

    @Override
    public List<Balozo> balozoLista() throws Exception {
    List<Balozo> balozok=new ArrayList<>();
    String sqlCommand = "select * from BALOZOK";
    try(Statement sqlRequest = connection.createStatement();
    ResultSet resultSet = sqlRequest.executeQuery(sqlCommand);){
    Balozo b;
    int id,evfolyam;
    String nev;
    while(resultSet.next()){
            id=resultSet.getInt("id");
            evfolyam=resultSet.getInt("evfolyam");
            nev=resultSet.getString("nev");
                if(evfolyam==1){
                    b=new Golya(id, nev,evfolyam);
               }else{
                    b=new Balozo(id, nev,evfolyam);
               }
                    balozok.add(b);
    }}
    return balozok;
    }

    @Override
    public List<ZeneSzam> zeneLista() throws Exception {
    List<ZeneSzam> zenek=new ArrayList<>();
    String sqlCommand = "select * from ZENEK";
    try(Statement sqlRequest = connection.createStatement();
    ResultSet resultSet = sqlRequest.executeQuery(sqlCommand);){
    ZeneSzam z;
    String eloado,cim;
    while(resultSet.next()){
      eloado=resultSet.getString("eloado");
      cim=resultSet.getString("cim");
      z=new ZeneSzam(cim, eloado);
      zenek.add(z);
    }}
    return zenek;
    }
    
}
