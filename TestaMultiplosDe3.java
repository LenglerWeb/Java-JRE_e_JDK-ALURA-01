
public class TestaMultiplosDe3 {

	public static void main(String[] args) {
		System.out.println("Utilize um laço do tipo for para imprimir todos os múltiplos de 3, entre 1 e 100.");
		
		for(int i = 1; i < 100; i++) {
			if(i % 3 == 0) {
				System.out.println(i);	
			}
			i++;
		}
	}
	
	// for (int i = 1; i < 100; i++ ){
    // if (i % 3 == 0)    {
    //    System.out.println(i);
   // }
	//}
	
	// OU
	
	// for (int i = 3; i < 100; i += 3 ){
   // System.out.println(i);
   //  }

}
