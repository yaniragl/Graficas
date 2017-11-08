/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
//Paso 1-Importar Libreria Gráfica
import graficas.*;
import javax.swing.*;//Libreria gráfica estandar multiplataforma
import java.awt.*;//Libreria Gráfica del Sistema Operativo
/**
 *
 * @author ceduc
 */
//Paso 2- Heredar mi clase desde JFrame
public class MiVentana extends JFrame{

    //paso 3 -Declarar los elementos que vamos a utilizar
    JPanel mipanel;//Creacion de objeto JPanel
    JLabel milabel;
    JTextField mitexto;
    JButton miboton;
    //Paso 4 -Definicion del constructor de la clase
    public MiVentana()//Tiene el mismo nombre de la clase
    {
      //paso 5 - Crear e Inicializar los Objetos  que utilizaremos
      mipanel =new JPanel();//Creamos el objeto
      milabel = new JLabel();
      mitexto = new JTextField(10);//10 son los caracteres
      miboton = new JButton ();
      //Paso 6 - Agregar los elementos al JFrame
      this.add(mipanel);// Agrego el JPanel al Jframe
      mipanel.add(milabel);//Agrego los elementos al JPanel
      mipanel.add(mitexto);
      mipanel.add(miboton);
      //paso 7 - Propiedades de los elementos 
      milabel.setText("campo");//
      miboton.setText("presioname");
      
    }
    
    
   /*public static void main(String[] args) 
    {
        JFrame miventana = new JFrame();// Creamos un objeto tipo JFrame
        miventana.setVisible(true);//esta sentencia muestra la ventana
        miventana.setBounds(0, 0,400, 400);//Le asignamos tamaño a la ventana
        miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Esta sentencia cierra esta ventana*/
    }
    
}
