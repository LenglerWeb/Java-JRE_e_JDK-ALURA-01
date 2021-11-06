
public class TestaEscopoDeVariavel {
	public static void main(String[] args) {
		System.out.println("Teste de Escopo de Variável");

		int idade = 20;
		int qntPessoas = 3;
		// boolean acompanhado = qntPessoas >= 2;
		boolean acompanhado;

		if (qntPessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		System.out.println("Valor da variável acompanhado é " + acompanhado);

		if(idade >= 18 && acompanhado) {
			System.out.println("Seja Bem-vindo");
		} else {
			System.out.println("Infeilzmente você não tem idade e não está acompanhado(a).");
		}
		
		
	}

}
