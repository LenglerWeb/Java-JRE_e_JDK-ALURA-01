
public class ImpostoDeRendaComIfs {
	public static void main(String[] args) {
		System.out.println("Programa sobre Imposto de Renda (IR)");
		
		// De 1900.0 até 2800.0 o IR é de 7.5% e pode deduzir R$ 142
        // De 2800.01 até 3751.0 o IR é de 15% e pode deduzir R$ 350
        // De 3751.01 até 4664.00 o IR é de 22.5% e pode deduzir R$ 636
		
		double salario = 4664.01;
		
		if(salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("A sua aliquota de IR é de 7.5%");
			salario = salario - 142.0;
			System.out.println("Salário de R$" + salario);
		} if( salario >= 2800.01 && salario <= 3751.0) {
			System.out.println("A sua aliquota de IR é de 15%");
			salario = salario - 350;
			System.out.println("Salário de R$" + salario);
		} else {
			if(salario >= 3751.01 && salario <= 4664.00) {
				System.out.println("A sua aliquota de IR é de 22.5%");
				salario = salario - 636;
				System.out.println("Salário de R$" + salario);
			}
		}
	}
}
