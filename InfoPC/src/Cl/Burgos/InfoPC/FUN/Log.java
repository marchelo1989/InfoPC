/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cl.Burgos.InfoPC.FUN;

import Cl.Burgos.InfoPC.Conf.Confi;
import Cl.Burgos.InfoPC.FUN.Directorio;
import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author marchelo
 */
public class Log {
    public static void log(String msg){
//        String url="c:/Users/march/Desktop/myfile.log";
//        String url="f:/myfile.log";
        String url=Directorio.selectDirecPre()+"/"+Confi.nameLog;
        
        try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(url, true)))) {
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            out.println(dateFormat.format(date) + ":"+ msg + "\r\n");
            
            AbrirLog();
//            Directorio.abrirArchivo(url);
            
        }catch (IOException e) {
            //exception handling left as an exercise for the reader
            JOptionPane.showMessageDialog(null,"Hubo un error"+e);
        }
    }
    
    public static void AbrirLog(){
        //Archivo Log
        String url=Directorio.selectDirecPre()+"/"+Confi.nameLog;
        //Archivo Log4jLib
        String url2=Directorio.selectDirecPre()+"/"+Confi.nameLog4jLib;
        //Archivo Log4jApli
        String url3=Directorio.selectDirecPre()+"/"+Confi.nameLog4jApli;
        
        try {
            Directorio.abrirArchivo(url);
            Directorio.abrirArchivo(url2);
            Directorio.abrirArchivo(url3);
            Directorio.abrirDirecPre();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"Hubo un error"+ex);
        }
        
    }
}
