
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String adjetivo1;
        String adjetivo2;
        String sujeito1;
        String sujeito2;
        String verbo1;
        String verbo2;

        System.out.print("Escreva um adjetivo (descrição de lugar): ");
        adjetivo1 = scan.nextLine();
        System.out.print("Escreva um sujeito (nome de pessoa): ");
        sujeito1 = scan.nextLine();
        System.out.print("Escreva um verbo terminado -ndo (ação): ");
        verbo1 = scan.nextLine();
        System.out.print("Escreva um adjetivo (descrição de um animal): ");
        adjetivo2 = scan.nextLine();
        System.out.print("Escreva um sujeito (animal): ");
        sujeito2 = scan.nextLine();
        System.out.print("Escreva um verbo terminado -ndo (ação): ");
        verbo2 = scan.nextLine();

        System.out.printf("Eu fui em um parque %s. Lá eu encontei %s, ele estava %s. Então, eu fui até meu %s %s e disse pra ele que eu queria estar %s. E foi isso.", adjetivo1, sujeito1, verbo1, sujeito2, adjetivo2, verbo2);
    }
}
