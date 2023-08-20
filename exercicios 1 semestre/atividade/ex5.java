import java.util.Scanner;
public class ex5 {
    public static void main(String[] args){

        Scanner tecla = new Scanner(System.in);
        int i;
        float a, media, soma = 0;

        for(i = 1; i <= 10; i++){
            System.out.print("A temperatura do dia " + i + " de janeiro de 2021 é: ");
            a = tecla.nextFloat();
            soma += a;
        }
        System.out.println("A média das temperaturas é: " + (media = soma /(i-1)));

    }
}