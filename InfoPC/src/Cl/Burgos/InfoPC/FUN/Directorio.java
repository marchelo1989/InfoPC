/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cl.Burgos.InfoPC.FUN;

import static Cl.Burgos.InfoPC.Conf.Confi.*;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
//import org.apache.log4j.Logger;

/**
 *
 * @author march
 */
public class Directorio {
    
    //Variables del Log4j
    //static Logger log =Logger.getLogger(Directorio.class);
//    static String carpeta = "RepararPC";
//    static String SO = System.getProperty("os.name");
//    static String userDir = System.getProperty("user.home");
    
    public static String selecDirectrorio(){
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fileChooser.showOpenDialog(null);
//        System.out.println(fileChooser.getSelectedFile());
        //String url = "c:/Users/march/Desktop/";
        String url = fileChooser.getSelectedFile().toString();
        //url=url.replace('\\', '/');
        return url;
    }
    public static void abrirArchivo(String url) throws IOException{
        File objetofile = new File (url);
        Desktop.getDesktop().open(objetofile);
    }
    public static void crearDirecPre(){
        if(SO.startsWith("Windows")){
            File directorio = new File(Url +"/"+ carpeta1 ); 
            directorio.mkdir(); 
        }else{
            File directorio = new File(Url +"/"+ carpeta1); 
            directorio.mkdir();
        } 
    }
    public static void crearDirecSec(){
        if(SO.startsWith("Windows")){
            File directorio = new File(Url +"/"+ carpeta1 +"/"+ carpeta2 ); 
            directorio.mkdir(); 
        }else{
            File directorio = new File(Url +"/"+ carpeta1 +"/"+ carpeta2 ); 
            directorio.mkdir();
        } 
    }
    public static void abrirDirecPre() throws IOException{
        if(SO.startsWith("Windows")){
            File directorio = new File(Url +"/"+ carpeta1 +"/"+ carpeta2 );
            Desktop.getDesktop().open(directorio);
        }else{
            File directorio = new File(userDir +"/"+ carpeta2 );
            Desktop.getDesktop().open(directorio);
        }
    }
    public static File selectDirecPre(){
        File f = null;
        if(SO.startsWith("Windows")){
            String url = Url +"/"+ carpeta1 +"/"+ carpeta2 ;
            f = new File(url);
        }else{
            String url = userDir +"/"+carpeta1;
            f = new File(url);
        }
        return f;
    }
    
    
}
