package reto4;

public class Funciones1 {
	private static String vocalesMayus(String s) {
		String letra=null;
		// Comprueba cada letra del string y si es una vocal la pone es mayuscula
		for (int i = s.length(); i> 0; i--) {
			 letra=s.substring(i,i);
			if (!letra.equals("a") || !letra.equals("e") || !letra.equals("i")|| letra.equals("o") || letra.equals("u")) {
			s=s+s.substring(i,i).toLowerCase();
			}
		}
		return letra;
	}
}
