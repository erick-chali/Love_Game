import java.util.Scanner;


public class IniciaJuego {
	
	static CrearMatriz mazo;
	static Scanner entrada;
	
	public static void main(String[] args) {
		System.out.println("*****Bienvenido a LoveGame*****\n");
		Opciones();
	}

	public static void crearJuego() {
		entrada = new Scanner(System.in);
		mazo = new CrearMatriz();
		
	}

	public static void Opciones() {
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
        	
        }
        else if(op.equals("3")){
        	
        }
        else if(op.equals("4")){
        	
        }
        else{
            System.out.println("Debes ingresar un numero de opcion valido");
            Opciones();
        }
	}
	
	
	
}
