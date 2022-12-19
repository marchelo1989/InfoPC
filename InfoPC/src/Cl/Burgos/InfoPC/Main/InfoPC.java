/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cl.Burgos.InfoPC.Main;

import Cl.Burgos.InfoPC.Conf.Confi;
import Cl.Burgos.InfoPC.FUN.Actualizacion;
import Cl.Burgos.InfoPC.GUI.FrHome;
import javax.swing.JOptionPane;

/**
 *
 * @author march
 */
public class InfoPC {

    public static boolean Update=Update();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new FrHome().setVisible(true);
    }
    public static boolean Update(){
        boolean resp;
        if(Actualizacion.verificarConexion()){
            if(Actualizacion.obtenerVersion().equals(Confi.Version)){
                resp=false;
            }else{
                resp=true;                
                JOptionPane.showMessageDialog(null, "Hay Actualizacion Disponible");
            }
        }else{
            resp=false;
        }
        return resp;
    }
    
}
