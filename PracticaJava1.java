package practica1;


import java.time.LocalTime;

public class PracticaJava1 {
	
	 
	// 1 Escribir un metodo para encontrar el área de un triángulo a partir de 3
	    // lados ingresados
	    // Revisar si es un triángulo válido
	 	static void primerMetodo(double ladoA,double ladoB,double ladoC ) {
	 		double s = (ladoA + ladoB + ladoC)/2, producto = s*(s-ladoA )*(s-ladoB )*(s-ladoC );
	 		
		System.out.println("Área de un triángulo: " +  Math.sqrt(producto));		
	 	}
	    // 2 Escribir un metodo para encontrar el area y la circumferencia de un circulo
	    // dado el radio
	    // Utilizar PI de la libreria de Java
		static void segundoMetodo(float radio) {
			System.out.print( "Area: " );		
			System.out.println( Math.PI*Math.pow(radio, 2));	
			System.out.println( "Circunferencia: " + Math.PI * radio * 2);	
		}


	    /* 3 Escribir un metodo que muestre por consola la hora del sistema
	    / Utilizar e investigar la libreria de Java*/
		static void tercerMetodo() {
		    LocalTime hour = LocalTime.now();
		    System.out.println(hour);
		}

		// 4 Escribir un metodo que convierta n cantidad de segundos a (hora, minutos,
	    // segundos) segun sea el caso
	    // ej 3600 = "1 hora = 60 min = 3600 seg"
		static void cuartoMetodo(float seg) {
			
			System.out.println(seg/3600);		
		}
	    // 5 Escribir un metodo para encontrar el volumen de una esfera dado el radio
		static void quintoMetodo(float radio) {
			
			System.out.println("Volumen esfera: " + (Math.PI*Math.pow(radio, 3)*4)/3);		
		}
	    // 6 Escribir un metodo para encontrar el volumen de un cono a dado el radio y
	    // la altura
		static void sextoMetodo(double radio, double altura) {
			System.out.println("Volumen cono: " + (altura*Math.PI*Math.pow(radio, 2))/3);		
		}

	    // 7 Encontrar el area superficial de un cubo dado un lado a
		static void septimoMetodo(double lado) {
			System.out.println("area superficial de un cubo: " + (6*Math.pow(lado, 2)));		
		}
	    // 8 Escribir un metodo para descubrir si un año ingresado es bisiesto o no
		static void octavoMetodo(int anio) {
			System.out.println("Es bisiesto o no: " + ((anio%4 == 0)?"Sí es":"No es"));		
		}
		
		 public static void main(String[] args) {
			 primerMetodo(3,5,4);
			 segundoMetodo(2);
			 tercerMetodo();
			 cuartoMetodo(60);
			 quintoMetodo(2);
			 sextoMetodo(2,2);
			 septimoMetodo(1);
			 octavoMetodo(2024);
		 }
		
		
}
