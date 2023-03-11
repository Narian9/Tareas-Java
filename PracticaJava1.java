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

		// 10. Escribir un programa para sumar 2 numeros sin usar operadores aritmeticos
		static void decimoMetodo(int numberOne, int numberTwo) {
			System.out.println("La suma de: " + numberOne + " y "+numberTwo+ "es:" + Math.addExact(numberOne, numberTwo));
				
		// 9. Escribir mostrar en pantalla los primeros 100 numeros primos
		static void novenoMetodo() {
			int num = 0;
			int i =1;
			while( i <=100 ) {
				boolean respuesta ;
				respuesta = (i>7)?((num%2 != 0)&&(num%3 != 0)&&(num%5 !=0)&&(num%7 !=0)&&(num%9 !=0)&&(num%11 !=0)&&(num%13 !=0)&&(num%15 !=0)&&(num%17 !=0)&&(num%19 !=0)&&(num%21 !=0)&&(num%23 !=0)):
						(i >4)? ((num%2 != 0)&&(num%3 != 0)&&(num%5 !=0)&&(num%7 !=0)&&(num%9 !=0)):
					   (num==	2)||(num%2 != 0)&&(num!=1);
				if(respuesta) {
					System.out.println(num +", ");
					//System.out.println(i +"i ");
					num = num +0;
					i = i + 1;

				}
				num = num + 1;
			}
			
			
		}
		
		// 10. Escribir un programa para sumar 2 numeros sin usar operadores aritmeticos
		static void decimoMetodo(int numberOne, int numberTwo) {
			System.out.println("La suma de: " + numberOne + " y "+numberTwo+ "es:" + Math.addExact(numberOne, numberTwo));
		}
		
		// 11. Escribir un método para verificar si un numero positivo de 2 digitos es palindromo
		static void onceavoMetodo(int num	) {
			if(num>0) {
				StringBuilder number = new StringBuilder(num);
				StringBuilder compareNumber = number.reverse();
				
				System.out.println("Es un numero palindromo " +number + " "+ ((number ==compareNumber)?"Sí":"No"));
			}
					
		}
		
		// 12. Sin usar loops, escribir un metodo para sumar todos los digitos de un numero donde 99 >= n >= 10
		static void doceavoMetodo(int n ) {
			
			if( 99>= n && n>=10) {
				String str = Integer.toString(n);
				int a = Character.getNumericValue(str.charAt(0));
				int b = Character.getNumericValue(str.charAt(1));
				System.out.println(a + b);
			}
			
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
			 novenoMetodo();
			 decimoMetodo(5,7);
			 onceavoMetodo(33);
			 doceavoMetodo(22);
		 }
		
		
}
