import java.util.Scanner;
 
public class NumerosDoWhile {
public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int numero, quantLidos = 0, soma = 0;
    int quantPositivos = 0, quantNegativos = 0;
       
      System.out.print("Informe um n�mero inteiro (0 para sair): ");
      numero = Integer.parseInt(entrada.nextLine());
 
      if(numero > 0){ // o n�mero � positivo?
        quantPositivos++;
      } else if(numero < 0){ // o n�mero � negativo?
        quantNegativos++;
      }
 
      soma += numero;

      if(numero != 0){ 
        quantLidos++;
      }
    }
    while(numero != 0); 
 
    if(quantLidos == 0){
      System.out.println("Voc� n�o informou nenhum n�mero.");
    } else{
      System.out.println("Quantidade de n�meros positivos: " + quantPositivos);
      System.out.println("Quantidade de n�meros negativos: " + quantNegativos);
      System.out.println("A soma dos n�meros lidos �: " + soma);
      System.out.println("A m�dia aritm�tica �: " + ((soma * 1.0) / quantLidos));
    }
    in.close();  
  }
}