package Aula_13;

public class TrabalhandoComFor_02 {

	public static void main(String[] args) {
			
		for (int i = 0; i < 24; i++) {
//Inicializa o contador i, e segue para o j
			for (int j = 0; j < 60; j++) {
//Inicializa o contador j, e segue para o contador k
				for (int k = 0; k < 60; k++) {
					System.out.println("H: "+i+" M: "+j+" S: " + k);
/* O lopping do k executa em um laço até o limite, depois saii do laço e volta para o I
e repete o procecimento até chegar ao limite do looping i*/				}
			}
		}
		
		try {
			Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}

}
