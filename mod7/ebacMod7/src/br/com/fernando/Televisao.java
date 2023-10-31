package br.com.fernando;

/**
 * @author fernando.pereira
 * @version 1.0
 */
public class Televisao {

    private int canal = 0;
    private boolean power = false;

    public int getCanal() {
        return canal;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    /**
     * Método para ligar e desligar a televisao
     */
    public void power() {

        if (!isPower()) {
            System.out.println("Televisão Ligada");
            setPower(true);
        } else {
            System.out.println("Televisão Desligada");
            setPower(false);
        }

    }

    /**
     * Método para escolher o canal
     */
    public void canal(int canal) {
        if (isPower()) {
            setCanal(canal);
            if (canal>100) {
                System.out.println("Você só tem 100 canais");

            } else {
                System.out.println("Canal "+canal);
            }
        } else {
            System.out.println("Televisão está desligada");
        }
    }

    /**
     * Método para ir para o próximo canal
     */
    public void proximoCanal() {

        if (isPower()) {
            getCanal();
            setCanal(getCanal()+1);
            if (getCanal()>100) {
                setCanal(0);
                System.out.println("Proximo Canal "+getCanal());
            } else {
                System.out.println("Proximo Canal "+getCanal());
            }

        } else {
            System.out.println("Televisão está desligada");
        }
    }

    /**
     * Método para ir ao canal anterior
     */
    public void canalAnterior() {
        if (isPower()) {
            setCanal(getCanal()-1);
            if (getCanal()<1) {
                setCanal(100);
            }
            System.out.println("Canal Anterior "+getCanal());
        } else {
            System.out.println("Televisão está desligada");
        }
    }


}
