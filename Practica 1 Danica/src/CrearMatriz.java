
public class CrearMatriz {
	public int matriz[][];
	public int num;
	
	public CrearMatriz(){
		matriz = new int[4][4];
		crearMatriz();
	}

	public void crearMatriz() {
		
		for(int x=0;x<=3;x++){
            for(int y=0;y<=3;y++){
                do{
                	num = (int) (Math.random()*8 + 1);
                }while(verificarNum(num));
                matriz[x][y] = num;
            }
        }
//		imprimirMatriz();
	}

	private boolean verificarNum(int num2) {
		int cont=0;
		//se recorre la matriz, y comparas el numero que se esta generando
		//y si ya existe, el contador se eleva.
        for(int x=0;x<=3;x++){
            for(int y=0;y<=3;y++){
                if(matriz[x][y]==num2){
                	cont = cont+1;
                }
            }
        }
        //con esto se verifica que la cantidad de cartas sea la correcta
        //para cada numero.
        if((cont==5&&num2==1)||(cont==2&&num2==2)||(cont==2&&num2==3)||
           (cont==2&&num2==4)||(cont==2&&num2==5)||(cont==1&&num2==6)||
           (cont==1&&num2==7)||(cont==1&&num2==8)){
        	return true;
        }else{
        	return false;
        }
        
	}
	
	public void imprimirMatriz(){
        for(int x=0;x<=3;x++){
            for(int y=0;y<=3;y++){
                System.out.print(matriz[x][y] + "\t");
            }
            System.out.println("\n");
        }
    }
}
