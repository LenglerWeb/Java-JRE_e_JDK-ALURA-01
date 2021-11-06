
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando Condiconais");
		
		int idade =16;
		int qntPessoas = 3;
		
		if(idade >= 18) {
			System.out.println("Você tem mais de 18 anos.");
			System.out.println("Seja bemv indo");
		} else {
			if(qntPessoas >= 2) {
				System.out.println("Você não tem 18 anos, mas pode entrar pois está acompanhado(a)");
			} else {
				System.out.println("Infelizmente você não pode entrar.");
			}
			
		}
	}
}
