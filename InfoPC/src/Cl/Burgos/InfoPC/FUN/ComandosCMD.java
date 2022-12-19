/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cl.Burgos.InfoPC.FUN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
//import org.apache.log4j.Logger;

/**
 *
 * @author marcelo
 */
public class ComandosCMD {
    //Variables del Log4j
    //static Logger log =Logger.getLogger(ComandosCMD.class);
    
    public static String cmd(String comando){
        String s = null;
        try{
            
            // Ejecucion Basica del Comando
            Process proceso = Runtime.getRuntime().exec(comando);
 
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
            BufferedReader stdError = new BufferedReader(new InputStreamReader(proceso.getErrorStream()));
            
            //Si el comando tiene una salida la mostramos
            if((s=stdInput.readLine()) != null){
                // Leemos la salida del comando
//                System.out.println("Comando ejecutado Correctamente");
                while ((s=stdInput.readLine()) != null){
                    if(s.length()>1){
//                        System.out.println(s);
                        return s;
                    }
                }
                // Leemos los errores si los hubiera
                System.out.println("Ésta es la salida standard de error del comando (si la hay):\n");
                while ((s = stdError.readLine()) != null) {
//                        System.out.println(s);
                        JOptionPane.showMessageDialog(null, "Error"+stdError.readLine());
                        //log.info("Error "+stdError.readLine());
                        Log.log("Error "+stdError.readLine());
//                      return s;
                }
                stdInput.close();
            }else{
                System.out.println("No se a producido ninguna salida");
                //log.info("No se a producido ninguna salida");
                Log.log("No se a producido ninguna salida");
            }
        }catch (IOException e) {
                System.out.println("Excepción: "+e.getMessage());
                e.printStackTrace();
                //log.info("Excepción: "+e.getMessage());
                Log.log("Excepción: "+e.getMessage());
        }
        return s;
    }
    
    public static String terminal(String[] comando){
        String s = null;
        try{
            
            // Ejecucion Basica del Comando
            Process proceso = Runtime.getRuntime().exec(comando);
 
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
            BufferedReader stdError = new BufferedReader(new InputStreamReader(proceso.getErrorStream()));
            
            //Si el comando tiene una salida la mostramos
            if((s=stdInput.readLine()) != null){
                // Leemos la salida del comando
//                System.out.println("Comando ejecutado Correctamente");
                while ((s=stdInput.readLine()) != null){
                    if(s.length()>1){
//                        System.out.println(s);
                        return s;
                    }
                }
                // Leemos los errores si los hubiera
                System.out.println("Ésta es la salida standard de error del comando (si la hay):\n");
                while ((s = stdError.readLine()) != null) {
//                        System.out.println(s);
                        JOptionPane.showMessageDialog(null, "Error"+stdError.readLine());
                        //log.info("Error "+stdError.readLine());
                        Log.log("Error "+stdError.readLine());
//                      return s;
                }
                stdInput.close();
            }else{
                System.out.println("No se a producido ninguna salida");
                //log.info("No se a producido ninguna salida");
                Log.log("No se a producido ninguna salida");
            }
        }catch (IOException e) {
//                System.out.println("Excepción: ");
                e.printStackTrace();
                //log.info("Excepción: "+e.getMessage());
                Log.log("Excepción: "+e.getMessage());
        }
        return s;
    }
}
