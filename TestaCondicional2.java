
public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("Testando Condiconais 2");

		int idade = 18;
		int qntPessoas = 3;
		boolean acompanhado = qntPessoas >= 2;

		System.out.println("O Valor de acompanhado é " + acompanhado);
		// if(idade >= 18 || qntPessoas >= 2) {
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem-vindo");
		} else {
			System.out.println("Infelizmente você não pode entrar.");
		}
	}
}
