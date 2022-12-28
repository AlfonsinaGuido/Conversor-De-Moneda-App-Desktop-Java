package views;

import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

/** 
Conversor App Desktop
@author Alfonsina Guido
@version 1.0Alpha
@date: 27/12/2022
*/

/*
* Este programa funciona como conversor de moneda, de temperatura y de medidas.
* Se puede convertir de peso argentino a 5 tipos de divisas extranjeras 
* (Dólares, Euros, Libras Esterlinas, Yen Japonés y Won Surcoreano) y viceversa.
*/

public class Conversor {

	public static void main(String[] args) {

	      //Declaración de variables
	      int dolar, euro, libra, yen, won;

	      //Proceso

	      //Objetos Iconos
	      Icon miIcono = new ImageIcon("ball8-120.gif");
	      Icon miIcono2 = new ImageIcon("nah-120.gif");
	      Icon miIcono3 = new ImageIcon("galleta-120.gif");
	      Icon miIcono4 = new ImageIcon("ball-star-120.gif");

	      //Declaro Variables adicionales
	      String str1, tipo;
	      int num1;

	      //Bienvenida
	      //Ventana de diálogo con primer parámetro siempre null, segundo el mensaje del cuerpo, tercero el título, cuarto con -1 indicamos que no queremos ícono por defecto sino que pondremos uno a elección nuestra y quinto indicamos el objeto ícono que queremos que aparezca.
	      JOptionPane.showMessageDialog(null, "Te doy la bienvenida al Conversor", "Bienvenida",-1, miIcono);
	      
	      tipo = (String) JOptionPane.showInputDialog(null, "Selecciona el tipo de conversión que deseas realizar", "Conversor",-1, miIcono2,null, "");

	      //Inicializo un cuadro del tipo input. Este contiene los mismos parámetros que showMessageDialog pero al ser del tipo input y contener un ícono objeto requiere además dos parámetros más que siempre serán null y parámetro vacío ("").
	      //Con la variable str1 lo que hacemos es capturar el dato genérico que ingresa por el input y hacemos el casteo pasándolo a string.
	      str1 = (String) JOptionPane.showInputDialog(null, "Ingresa el valor que deseas convertir", "Conversor",-1, miIcono2,null, "");

	      //Parseo: pasamos el string capturado a número y lo almacenamos en la variable num1.
	      num1 = Integer.parseInt(str1);

	      //Inicialización de variables con expresiones matemáticas
	      dolar = (int) Math.floor(5*num1); //Utilizamos el método floor para redondear el resultado
	      euro = (int) Math.floor(7*num1); //Utilizamos el método floor para redondear el resultado
	      libra = (int) Math.floor(2*num1); //Utilizamos el método floor para redondear el resultado
	      yen = (int) Math.floor(4*num1); //Utilizamos el método floor para redondear el resultado
	      won = (int) Math.floor(3*num1); //Utilizamos el método floor para redondear el resultado

	      switch (tipo) {
	      	case "de pesos argentinos a Dólares":
	      		JOptionPane.showMessageDialog(null,"Tienes "+ dolar + " dólares.","Resultado",-1,miIcono3);
	      		break ;
	      	case "de pesos argentinos a Euros":
	      		JOptionPane.showMessageDialog(null,"Tienes "+ euro + " euros.","Resultado",-1,miIcono3);
	      		break ;
	      	case "de pesos argentinos a Libras Esterlinas":
	      		JOptionPane.showMessageDialog(null,"Tienes "+ dolar + " libras.","Resultado",-1,miIcono3);
	      		break ;
	      	case "de pesos argentinos a Yen Japonés":
	      		JOptionPane.showMessageDialog(null,"Tienes "+ euro + " yenes.","Resultado",-1,miIcono3);
	      		break ;
	      	case "de pesos argentinos a Won Surcoreano":
	      		JOptionPane.showMessageDialog(null,"Tienes "+ euro + " wones.","Resultado",-1,miIcono3);
	      		break ;
	      	default:
	      		JOptionPane.showMessageDialog(null,"Error, intenta de nuevo");
               break;
	      }

	      //Ventana de diálogo con primer parámetro siempre null, segundo el mensaje del cuerpo, tercero el título, cuarto con -1 indicamos que no tenemos ícono por defecto sino que pondremos uno a elección nuestra y quinto indicamos el objeto ícono que queremos que aparezca.
	      JOptionPane.showMessageDialog(null, "*** ¡Gracias por utilizar el Conversor! ***","¡Adiós!", -1, miIcono4);

	}

}
      