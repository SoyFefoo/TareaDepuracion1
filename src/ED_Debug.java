
public class ED_Debug {

	
	public static void funcion1() {
		
		int a=2;
		
		String string1 = "string1";

		String string2 = "string2";
		
		
		// Que hacen estas dos lineas de codigo???
		
		string2= string2.substring(0, string2.length()-1);
		string2=string2+"1";
		
		// Esta funcion tiene errores
		// Por que no va el ==   ???
		
		// Que tengo que hacer para solucionarlo ???
		
			if(string1.equals(string2)) {
				System.out.println("SON IGUALES " + a);
					
			}
			else {
				
				System.out.println("SON DIFERENTES");			
			}
		
	}
	
	
	public static void funcion2() {
		
		System.out.println("--------------------");
		System.out.println("Esta es la funcion 2");
		System.out.println("Como hago la llamada para que funcione????");
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 3;
		int i;
		for(i = 0; i<10; i++)
			a *= i;
		
		System.out.println("El valor de a es: "+a);
		
		
		funcion1();
		
		
		//Esta funcion no me va ... ¿ por que ?
		// Tengo dos soluciones .. ¿como?
		
		funcion2();
	}

}
