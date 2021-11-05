import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
public class Triangulo {
	public static void main(String args[]) {
		try {
			Scanner in = new Scanner(new FileReader(new File("triangulo.in")));
			FileWriter fw = new FileWriter(new File("triangulo.out"));
			int i = 1, l1, l2, l3;

			do {
				System.out.print(" ");
				l1 = in.nextInt();
				if (l1 == 0) {
					break;
				}
				System.out.print(" ");
				l2 = in.nextInt();
				if (l2 == 0) {
					break;
				}
				System.out.print(" ");
				l3 = in.nextInt();
				if (l3 == 0) {
					break;
				}

				if (l1 > l2 + l3 || l2 > l1 + l3 || l3 > l1 + l2) {
					fw.append("Os lados informados não formam um triângulo!\n");

				} else if (l1 == l2 && l2 == l3) {
					fw.append("Triângulo equilátero!\n");

				} else if (l1 != l2 && l2 != l3 && l1 != l3) {

					fw.append("Triângulo escaleno!\n");
				} else {
					fw.append("Triângulo isósceles!\n");
				}
				i++;
			} while (in.hasNext());

			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
