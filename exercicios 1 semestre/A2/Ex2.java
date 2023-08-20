import java.util.*;
public class Ex2{
    public static void main(String[] args){
        Scanner tecla = new Scanner(System.in);

        System.out.print("Digite a altura da parede: ");
        double hp = tecla.nextDouble();

        System.out.print("Digite a largura da parede: ");
        double lp = tecla.nextDouble();

        System.out.print("Digite a altura do azulejo: ");
        double ha = tecla.nextDouble();

        System.out.print("Digite a largura do azulejo: ");
        double la = tecla.nextDouble();

        double areaParede = hp * lp;
        double areaAzulejo = ha * la;

        double quantidadeAzulejos = areaParede / areaAzulejo;

        System.out.println("Quantidade de azulejos necessários: " + quantidadeAzulejos);
        
    }
}