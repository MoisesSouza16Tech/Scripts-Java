import java.util.Scanner;

public class ComparaNumeros {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = 1, z = 1, maior = 0, n, num;

		do {
			System.out.println("Entre com a quantidade de números");
			n = in.nextInt();
			while (z <= n) {
				System.out.println("Entre com os números a serem comparados");
				num = in.nextInt();
				if (num > maior) {
					maior = num;
				} else {
					maior = maior * 1;
				}
				
				z++;
			}
			if (n > 0) {
				System.out.println("O maior número foi o "+maior);
				i++;
				z = 1;
				maior = 0;
			} else {
				maior = 0;
			}
				
		} while (n > 0);
		System.out.println("sabonete");

	}

}

