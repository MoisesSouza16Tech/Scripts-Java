import java.util.Scanner;

public class NúmerosImpares {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, x = 3, res = 0;
		for (i = 1; i < 501; i++) {
			if (i % x == 0) {
				res += i;
			}
		}
		System.out.println("A soma dos números multiplos de três é: " + res);
	}
}