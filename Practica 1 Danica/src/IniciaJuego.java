import java.util.Scanner;


public class IniciaJuego {
	
	static CrearMatriz mazo;
	
	static Scanner entrada;
	
	public static void main(String[] args) {
		crearJuego();
	}

	public static void crearJuego() {
		entrada = new Scanner(System.in);
		mazo = new CrearMatriz();
		
	}
	
	
	
}
