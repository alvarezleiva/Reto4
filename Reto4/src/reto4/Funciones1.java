package reto4;

public class Funciones1 {
<<<<<<< HEAD
=======

>>>>>>> branch 'main' of https://github.com/alvarezleiva/Reto4.git
	public static String vocalesMayus(String s) {
		String letra=null;
		// Comprueba cada letra del string y si es una vocal la pone es mayuscula
		for (int i = s.length(); i> 0; i--) {
			 letra=s.substring(i,i);
			// Si es vocal lo añade al string en mayusculas
			 if (!letra.equals("a") || !letra.equals("e") || !letra.equals("i")|| letra.equals("o") || letra.equals("u")) {
			s=s+s.substring(i,i).toLowerCase();
			}
		}
		// Devuelve el string
		return letra;
	}
}
