import br.com.fernando.Media;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Media media = new Media();
        double nota1;
        double nota2;
        double nota3;
        double nota4;

        Scanner s = new Scanner(System.in);
        System.out.println("Digite a primeira nota.");
        nota1 = s.nextDouble();

        System.out.println("Digite a Segunda nota.");
        nota2 = s.nextDouble();

        System.out.println("Digite a Terceira nota.");
        nota3 = s.nextDouble();

        System.out.println("Digite a Quarta nota.");
        nota4 = s.nextDouble();

        s.close();
        media.calculoMedia(nota1, nota2, nota3, nota4);
    }
}