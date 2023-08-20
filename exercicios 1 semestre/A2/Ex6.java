import java.util.*;
public class Ex6 {
    public static void main(String[] args){
        Scanner tecla = new Scanner(System.in);
        
        double fahrenheit, celsius;

        System.out.println("Bem vindo(a) ao conversor de temperatura!");
        System.out.println("Escolha a opção deseja:\n1 - Celsius para Fahrenheit\n2 - Fahrenheit para Celsius");
        int option = tecla.nextInt();

        while(option != 1 && option != 2){
            System.out.println("Informe um valor válido!");
            option = tecla.nextInt();
        }

        if(option == 1){
            System.out.print("Digite a temperatura em Celsius a ser convertida para Fahrenheit: ");
            celsius = tecla.nextDouble();
            fahrenheit = (celsius * 9/5) + 32;
            System.out.print("Temperatura em Fahrenheit: " + fahrenheit);
        }
        else{
            System.out.print("Digite a temperatura em Fahrenheit a ser convertida para Celsius: ");
            fahrenheit = tecla.nextDouble();
            celsius = (fahrenheit - 32) * 5/9;
            System.out.print("Temperatura em Celsius: " + celsius);
        }
    }
}
