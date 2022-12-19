/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cl.Burgos.InfoPC.FUN;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
//import org.apache.log4j.Logger;

/**
 *
 * @author march
 */
public class FormatoFecha {
    
    //Variables del Log4j
    //static  Logger log =Logger.getLogger(FormatoFecha.class);
    
    public static String mostrarFechaCompleta(Date date){
        //Mostrar la fecha completa
        String co = "Fecha Anterio Completa: "+date;
//        System.out.println(co);
        return co;
    }
    public static String mostrarFechaCompletaEditada(Date date){
        DateFormat dateFormatDia = new SimpleDateFormat("EEEE");
        DateFormat dateFormatFecha = new SimpleDateFormat("dd/MM/yyyy");
        DateFormat dateFormatHoras = new SimpleDateFormat("hh:mm:ss");
        DateFormat dateFormatZona = new SimpleDateFormat("z");
        String dp=dateFormatDia.format(date);
        String d=dateFormatFecha.format(date);
        String h=dateFormatHoras.format(date);
        String z=dateFormatZona.format(date);
        String fecha = dp+" "+d+" "+h+" "+z;
        String fecha2 = "Fecha Anterio Completa: "+dp+" "+d+" "+h+" "+z;
//        System.out.println(fecha2);
        return fecha;
    }
    public static String mostrarFechaHora(Date date){
        //Muestra la dia mes año
        DateFormat dateFormatFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String d=dateFormatFecha.format(date);
//        System.out.println("Muestra El dia-mes-año-hora-minutos-segundos: "+d);
        return d;
    }
    public static String mostrarFecha(Date date){
        //Muestra la dia mes año
        DateFormat dateFormatFecha = new SimpleDateFormat("dd/MM/yyyy");
        String d=dateFormatFecha.format(date);
//        System.out.println("Muestra El dia-mes-año: "+d);
        return d;
    }
    public static Date mostrarFechaD(String date) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyy");
        Date d = sdf.parse(date);
        return d;
    }
    public static Date mostrarFechaDMYHMS(String date) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        Date d = sdf.parse(date);
        return d;
    }
    public static Date mostrarFechaYMD(String date) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse(date);
        return d;
    }
    public static Date mostrarFechaYMDHMS(String date) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date d = sdf.parse(date);
        return d;
    }
    public String mostrarHora(Date date){
        //Muestra horas minutoa y segundos
        DateFormat dateFormatHoras = new SimpleDateFormat("HH:mm:ss");
        String h=dateFormatHoras.format(date);
//        System.out.println("Muestra la Hora-Minuto-segundo: "+h);
        return h;
    }
    public String mostrarAno(Date date){
        //Muestra horas minutoa y segundos
        DateFormat dateFormatAno = new SimpleDateFormat("yyyy");
        String a=dateFormatAno.format(date);
//        System.out.println("Muestra El año: "+a);
        return a;
    }
    public String mostraDiaPalabras(Date date){
        //Muestra El dia en palabras
        DateFormat dateFormatDia = new SimpleDateFormat("EEEE");
        String dp=dateFormatDia.format(date);
//        System.out.println("Muestra el Dia En Palabras: "+dp);
        return dp;
    }
    public String mostraZonaHoraria(Date date){
        //Muestra la zona horaria
        DateFormat dateFormatZona = new SimpleDateFormat("z");
        String z=dateFormatZona.format(date);
//        System.out.println("Muestra la Zona Horaria: "+z);
        return z;
    }
    public String mostraSenanaAno(Date date){
        //Muestra senana del año
        DateFormat dateFormatSena = new SimpleDateFormat("w");
        String sa=dateFormatSena.format(date);
//        System.out.println("Muestra senana del año: "+sa);
        return sa;
    }
    public String mostraSenanaMes(Date date){
        //Muestra senana del mes
        DateFormat dateFormatSenaAno = new SimpleDateFormat("W");
        String sm=dateFormatSenaAno.format(date);
//        System.out.println("Muestra senana del mes"+sm);
        return sm;
    }
    //Fecha completa Sin Editar con java.sql
    public static String fDateS (java.util.Date fecha){
        String formato = "dd-MM-yyyy";
        SimpleDateFormat df = new SimpleDateFormat(formato);
        String d = df.format(fecha);
        return d;
    }
    
}
