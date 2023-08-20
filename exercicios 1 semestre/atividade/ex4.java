import java.util.Scanner;
public class ex4 {
    public static void main(String[] args){

        Scanner tecla = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int a = tecla.nextInt(), i;

        for(i = 1; i <= a; i++){
            if(i % 2 == 1){
                System.out.print(i + ". ");
            }
        }

    }
}