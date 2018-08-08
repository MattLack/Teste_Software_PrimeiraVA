package calc;

public class Calculadora {
	
	public static float valor(int diarias, float kmPercorridos){
		float kmMaximo = diarias*100;
		float kmExcedente = 0;
		if(kmPercorridos > kmMaximo){
			kmExcedente = kmPercorridos-kmMaximo;
		}
		float valor;
		if(diarias > 16){
			valor = diarias*70 + kmExcedente;						
		}else if(diarias > 6) {
			valor = diarias*80 + kmExcedente*5;			
		}else{
			valor = diarias*90 + kmExcedente*10;
		}
		return valor;
	}

}
