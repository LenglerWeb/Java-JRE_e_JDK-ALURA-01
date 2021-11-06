
public class exercicioOperacoesEntreNumeros {
	public static void main(String[] args) {
		int dia = 4;
		int outroDia = 4 + dia;
		System.out.println(outroDia);
		
		int brindes = 15;
		int pessoas = 2;
		System.out.println(brindes / pessoas); //Esse é a resposta ERRADA! (Este código é o errado. Pois quando fazemos operações entre inteiros o resultado sempre será inteiro e não de ponto flutuante. O resultado na verdade seria 7.)
		
		double peso = 4.0;
		int quantidade = 10;
		System.out.println(peso * quantidade);
		
		double preco = 5.5;
		int ingressos = 4;
		System.out.println(preco * ingressos);
		
		double idade = 30.0;
		System.out.println("A idade de Marcos é " + (int)idade);
		
		String saudacao = "Olá, meu nome é ";
		String nome = "Rômulo ";
		String continuacao = "e minha idade é ";
		int idade2 = 100;
		System.out.println(saudacao+nome+continuacao+idade2);
		
	}

}
