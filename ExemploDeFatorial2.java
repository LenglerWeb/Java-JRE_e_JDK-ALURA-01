
public class ExemploDeFatorial2 {
	public static void main(String[] args) {
		int numero = 5;
		int fatorial = 1;
		int i =1;
		
		while(i <= numero) {
			fatorial = fatorial * i;
			i++;
		}
		
		System.out.println("O fatorial de " + numero + " é " + fatorial);
	}

}
