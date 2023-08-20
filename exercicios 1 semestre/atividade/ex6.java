import java.util.Scanner;
public class ex6 {
    public static void main(String[] args){

        Scanner tecla = new Scanner(System.in);
        int sexo, peso, count = 0, count2 = 0;

        for(int i = 1; i <= 10; i++){

            System.out.println("Selecione o seu sexo:");
            System.out.println("1. Feminino");
            System.out.println("2. Masculino");
            sexo = tecla.nextInt();

            while(sexo != 1 && sexo != 2){
                System.out.println("Informe um valor válido!");
                sexo = tecla.nextInt();
            }
            if(sexo == 1){
                System.out.print("Informe seu peso: ");
                peso = tecla.nextInt();
                if(peso >= 50 && peso <= 70){
                    count++;
                }
            }
            else if(sexo == 2){
                System.out.print("Informe seu peso: ");
                peso = tecla.nextInt();
                if(peso >= 60 && peso <= 80){
                    count2++;
                }
            }
        }
        System.out.println(count + " mulheres possuem peso entre 50 e 70.");
        System.out.println(count2 + " homens possuem peso entre 60 e 80.");

    }
}