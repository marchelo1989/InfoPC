/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Cl.Burgos.InfoPC.Conf;

/**
 *
 * @author march
 */
public interface Confi {
    //Configuraciones para Update
    static String nameArchivo = "ApliInfoPC.zip";
    static String CarpetaUpdate = "Update/";
    static String Version = "1.0";
    static String UrlVersion = "https://raw.githubusercontent.com/marchelo1989/InfoPC/main/Archivos/Version.txt";
    static String UrlDescarga = "https://raw.githubusercontent.com/marchelo1989/InfoPC/main/Archivos/Descarga.txt";
    
     //Configuracion de Log
    String nameLog="LogGeneral.log";
    //Configuracion del Log4j
    // Nombre de Referencia del Archivo Log4j.properties
    String nameLog4jLib="Log4jLib.log";
    String nameLog4jApli="Log4jApli.log";
    // Ubicacion del los Archivos
    static String urlDirec="C:\\InfoPC\\";
    
    //Configuracion de Directorio
    static String Url = "C:\\";
    static String carpeta1 = "Aplicaciones";
    static String carpeta2 = "RepararPC";
    static String SO = System.getProperty("os.name");
    static String userDir = System.getProperty("user.home");
    static String userProgra = System.getProperty("user.dir");
}
