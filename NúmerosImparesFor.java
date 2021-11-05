import java.util.Scanner;
public class NúmerosImparesFor {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double maior=0, menor=0, altura;
		for(int i=1;i<4;i++){
			System.out.println("Entre com a altura da "+i+" pessoa:");
			altura = in.nextInt();
			
			if (altura>maior) {
				maior = altura;
			}else if (altura<maior){
				menor = altura;
			}else {
				altura = altura*1;
			}
		}
		System.out.println("O integrante com maior altura possui "+maior+" m");
		System.out.println("O integrante com menor altura possui "+menor+" m");

	}

}
