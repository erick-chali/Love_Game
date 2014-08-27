import java.util.Scanner;


public class IniciaJuego {
	
	static CrearMatriz mazo;
//	static Scanner entrada;
	
	public static void main(String[] args) {
		System.out.println("*****Bienvenido a LoveGame*****\n");
		Opciones();
	}

	public static void crearJuego() {
//		entrada = new Scanner(System.in);
		mazo = new CrearMatriz();
		
	}

	public static void Opciones() {
		Scanner entrada = new Scanner(System.in);
		String op;
		System.out.println("---------------Menu-------------------");
		System.out.println("1. Iniciar el Juego");
		System.out.println("2. Elegir la cantidad de tokens.");
		System.out.println("3. Mostrar reglas del juego.");
		System.out.println("4. Salir");
		System.out.println("Ingrese el numero de opcion que desea.");
		System.out.println("--------------------------------------\n");
		op = entrada.nextLine().toString();
		if(op.equals("1")){
			crearJuego();
        }
        else if(op.equals("2")){
        	elegirTokens();
        }
        else if(op.equals("3")){
        	
        }
        else if(op.equals("4")){
        	
        }
        else{
            System.out.println("Debes ingresar un numero de opcion valido\n\n\n");
            Opciones();
        }
	}

	public static int elegirTokens() {
		Scanner entrada = new Scanner(System.in);
		int token = 0;
		System.out.println("Con cuantos tokens desea jugar (De 1 a 3)");
		try{
			token = Integer.parseInt(entrada.nextLine().toString());
			if((token==1)||(token==2)||(token==3)){
				
			}else{
				System.out.println("Solo puede ingresar un numero entero entre 1 y 3\n\n\n");
				elegirTokens();
			}
		}catch(NumberFormatException e){
			System.out.println("Solo puede ingresar un numero entero entre 1 y 3\n\n\n");
			elegirTokens();
		}
		return token;
	}
	
	
	
}
