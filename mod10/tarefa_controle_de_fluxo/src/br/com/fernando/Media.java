package br.com.fernando;

public class Media {

    public void calculoMedia(double nota1, double nota2, double nota3, double nota4) {
        double media = (nota1 + nota2 + nota3 + nota4)/4;

        if (media >=7) {
            System.out.println("Sua média é: "+media+"! Está aprovado");
        } else if(media >=5) {
            System.out.println("Sua média é: "+media+"! Está de recuperção");
        } else {
            System.out.println("Sua média é: "+media+"! Está Reprovado");
        }

    }
}