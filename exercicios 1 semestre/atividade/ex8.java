import java.util.Scanner;
public class ex8{
    public static void main(String[] args){

        Scanner tecla = new Scanner(System.in);
        int idade, i, peso, soma = 0, countp = 0;
        float  media = 0;

        
        for(i = 0; i <= 6; i++){
            System.out.printf("Digite a idade da pessoa %d: ", i+1);
            idade = tecla.nextInt();

            while(idade < 0){
                System.out.println("Insira uma idade válida!");
                System.out.printf("Digite a idade da pessoa %d: ", i+1);
                idade = tecla.nextInt();
            }
            soma += idade;
            media = soma/(i+1);

            System.out.print("Agora o peso: ");
            peso = tecla.nextInt();

            while(peso <= 0){
                System.out.println("Insira um valor válido!");
                System.out.printf("Agora o peso: ");
                peso = tecla.nextInt();
            }

            if(peso > 90){
                countp++;
            }
        }

        System.out.println("A quantidade de pessoas com mais de 90 kg é " + countp);
        System.out.println("A média das idades das pessoas é " + media);
        
    }
}