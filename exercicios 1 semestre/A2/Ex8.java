import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args){

        Scanner tecla = new Scanner(System.in);
        System.out.println("Digite uma sequência de números inteiros e positivos, irei contar os pares e ímpares.");
        System.out.println("(A sequência será interrompida quando o número digitado for menos ou igual a 0.)");
        int nmrpar = 0, nmrimpar = 0, entrada;

        while(true){
            entrada = tecla.nextInt();

            if(entrada <= 0){
                break;
            }
            else if(entrada % 2 == 0){
                nmrpar++;
            }
            else if(entrada % 2 == 1){
                nmrimpar++;
            }
        }

        System.out.println("A quantidade de números pares digitados é " + nmrpar + " números.");
        System.out.println("A quantidade de números ímpares digitados é " + nmrimpar + " números.");
    }    
}
