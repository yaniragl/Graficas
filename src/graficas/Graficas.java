/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficas;
//Paso 1-Importar Libreria Gráfica
import javax.swing.*;//Libreria gráfica estandar multiplataforma
import java.awt.*;//Libreria Gráfica del Sistema Operativo
//Paso 8 -Importar la clase que contiene la GUI
import gui.MiVentana;//Paquete.clase 
/**
 *
 * @author ceduc
 */
public class Graficas {

    /**
     * @param args the command line arguments
     */
    //Paso 9 - LLamado a la clase
    public static void main(String[] args) 
    {
        MiVentana miventana = new MiVentana();// Creamos un objeto tipo JFrame
        miventana.setVisible(true);//esta sentencia muestra la ventana
        miventana.setBounds(0, 0,400, 400);//Le asignamos tamaño a la ventana
        miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Esta sentencia cierra esta ventana
    }
    
}
