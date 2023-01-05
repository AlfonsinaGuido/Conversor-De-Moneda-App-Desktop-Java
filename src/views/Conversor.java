package views;

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
* Este programa funciona como Conversor de Moneda.
* Se puede convertir de peso argentino a 5 tipos de divisas extranjeras 
* (Dólares, Euros, Libras Esterlinas, Yen Japonés y Won Surcoreano) y viceversa.
*/

public class Conversor {

	public static void main(String[] args) {

	      //Declaración de variables
	      int dolar, euro, libra, yen, won, pesosD, pesosE, pesosL, pesosY, pesosW;

	      //Proceso

	      //Objetos Iconos
	      Icon miIcono = new ImageIcon("src/imagenes/monedas.gif");
	      Icon miIcono2 = new ImageIcon("src/imagenes/billetes.gif");
	      Icon miIcono3 = new ImageIcon("src/imagenes/flecha.gif");
	      Icon miIcono4 = new ImageIcon("src/imagenes/tio-mcpato.gif");

	      //Declaro Variables adicionales
	      String str1, tipo;
	      int num1;

	      //Bienvenida
	      //Ventana de diálogo con primer parámetro siempre null, segundo el mensaje del cuerpo, tercero el título, cuarto con -1 indicamos que no queremos ícono por defecto sino que pondremos uno a elección nuestra y quinto indicamos el objeto ícono que queremos que aparezca.
	      JOptionPane.showMessageDialog(null, "Te doy la bienvenida al Conversor de Monedas", "Bienvenida",-1, miIcono);
	      
	      tipo = (String) JOptionPane.showInputDialog(null, "Selecciona el tipo de conversión que deseas realizar", "Divisas", JOptionPane.PLAIN_MESSAGE, miIcono2,new Object[] 
	    		  {"Selecciona", "de pesos argentinos a Dólares", "de pesos argentinos a Euros", "de pesos argentinos a Libras Esterlinas", "de pesos argentinos a Yen Japonés", "de pesos argentinos a Won Surcoreano",
	    		  "de Dólares a pesos argentinos", "de Euros a pesos argentinos", "de Libras Esterlinas a pesos argentinos", "de Yen Japonés a pesos argentinos", "de Won Surcoreano a pesos argentinos"}, "");

	      
	      if (tipo != "Selecciona") {
	    	  //Inicializo un cuadro del tipo input. Este contiene los mismos parámetros que showMessageDialog pero al ser del tipo input y contener un ícono objeto requiere además dos parámetros más que siempre serán null y parámetro vacío ("").
		      //Con la variable str1 lo que hacemos es capturar el dato genérico que ingresa por el input y hacemos el casteo pasándolo a string.
		      str1 = (String) JOptionPane.showInputDialog(null, "Ingresa el valor que deseas convertir (solo números enteros)", "Conversor",-1, miIcono2,null, "");

		      //Parseo: paso el string capturado a número y lo almacenamos en la variable num1. Esto lo hacemos dentro del bloque try catch para capturar la excepeción NumberFormatException que aparece en caso de que el usuario ingrese caracteres no numéricos.
		      
		      try {
		    	  num1 = Integer.parseInt(str1);
		    	  
		    	//Inicialización de variables con expresiones matemáticas
			      dolar = (int) Math.floor(num1/350); //Utilizo el método floor para redondear el resultado
			      euro = (int) Math.floor(num1/376); //Utilizo el método floor para redondear el resultado
			      libra = (int) Math.floor(num1/333.24); //Utilizo el método floor para redondear el resultado
			      yen = (int) Math.floor(num1/2.65); //Utilizo el método floor para redondear el resultado
			      won = (int) Math.floor(num1/0.28); //Utilizo el método floor para redondear el resultado
			      pesosD = (int) Math.floor(num1*350); //Utilizo el método floor para redondear el resultado
			      pesosE = (int) Math.floor(num1*376); //Utilizo el método floor para redondear el resultado
			      pesosL = (int) Math.floor(num1*333.24); //Utilizo el método floor para redondear el resultado
			      pesosY = (int) Math.floor(num1*2.65); //Utilizo el método floor para redondear el resultado
			      pesosW = (int) Math.floor(num1*0.28); //Utilizo el método floor para redondear el resultado
			      
			      switch (tipo) {
			      	case "de pesos argentinos a Dólares":
			      		JOptionPane.showMessageDialog(null,"Tienes "+ dolar + " dólares.","Resultado",-1,miIcono3);
			      		break ;
			      	case "de pesos argentinos a Euros":
			      		JOptionPane.showMessageDialog(null,"Tienes "+ euro + " euros.","Resultado",-1,miIcono3);
			      		break ;
			      	case "de pesos argentinos a Libras Esterlinas":
			      		JOptionPane.showMessageDialog(null,"Tienes "+ libra + " libras.","Resultado",-1,miIcono3);
			      		break ;
			      	case "de pesos argentinos a Yen Japonés":
			      		JOptionPane.showMessageDialog(null,"Tienes "+ yen + " yenes.","Resultado",-1,miIcono3);
			      		break ;
			      	case "de pesos argentinos a Won Surcoreano":
			      		JOptionPane.showMessageDialog(null,"Tienes "+ won + " wones.","Resultado",-1,miIcono3);
			      		break ;
			      	case "de Dólares a pesos argentinos":
			      		JOptionPane.showMessageDialog(null,"Tienes "+ pesosD + " pesos.","Resultado",-1,miIcono3);
			      		break ;
			      	case "de Euros a pesos argentinos":
			      		JOptionPane.showMessageDialog(null,"Tienes "+ pesosE + " pesos.","Resultado",-1,miIcono3);
			      		break ;
			      	case "de Libras Esterlinas a pesos argentinos":
			      		JOptionPane.showMessageDialog(null,"Tienes "+ pesosL + " pesos.","Resultado",-1,miIcono3);
			      		break ;
			      	case "de Yen Japonés a pesos argentinos":
			      		JOptionPane.showMessageDialog(null,"Tienes "+ pesosY + " pesos.","Resultado",-1,miIcono3);
			      		break ;
			      	case "de Won Surcoreano a pesos argentinos":
			      		JOptionPane.showMessageDialog(null,"Tienes "+ pesosW + " pesos.","Resultado",-1,miIcono3);
			      		break ;
			      }
		      } catch (NumberFormatException ex){
		    	  ex.printStackTrace();
		    	  JOptionPane.showMessageDialog(null,"Error, solo puedes ingresar caracteres numéricos. Intenta de nuevo");
		    	  return;
		      }
	      }else {
	    	  JOptionPane.showMessageDialog(null,"Error, no seleccionaste el tipo. Intenta de nuevo");
	    	  return;
	      }

	      //Ventana de diálogo con primer parámetro siempre null, segundo el mensaje del cuerpo, tercero el título, cuarto con -1 indicamos que no tenemos ícono por defecto sino que pondremos uno a elección nuestra y quinto indicamos el objeto ícono que queremos que aparezca.
	      JOptionPane.showMessageDialog(null, "*** ¡Gracias por utilizar el Conversor! ***","¡Adiós!", -1, miIcono4);

	}

}
      