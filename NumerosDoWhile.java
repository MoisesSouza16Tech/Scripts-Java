import java.util.Scanner;
 
public class NumerosDoWhile {
public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int numero, quantLidos = 0, soma = 0;
    int quantPositivos = 0, quantNegativos = 0;
       
      System.out.print("Informe um número inteiro (0 para sair): ");
      numero = Integer.parseInt(entrada.nextLine());
 
      if(numero > 0){ // o número é positivo?
        quantPositivos++;
      } else if(numero < 0){ // o número é negativo?
        quantNegativos++;
      }
 
      soma += numero;

      if(numero != 0){ 
        quantLidos++;
      }
    }
    while(numero != 0); 
 
    if(quantLidos == 0){
      System.out.println("Você não informou nenhum número.");
    } else{
      System.out.println("Quantidade de números positivos: " + quantPositivos);
      System.out.println("Quantidade de números negativos: " + quantNegativos);
      System.out.println("A soma dos números lidos é: " + soma);
      System.out.println("A média aritmética é: " + ((soma * 1.0) / quantLidos));
    }
    in.close();  
  }
}