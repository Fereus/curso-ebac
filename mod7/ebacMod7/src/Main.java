import br.com.fernando.Televisao;

/**
 * @author fernando.pereira
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {

        Televisao televisao = new Televisao();

        televisao.power();
        televisao.canal(100);
        televisao.proximoCanal();
        televisao.canalAnterior();
        televisao.power();
        televisao.canal(20);
      //  System.out.printf("Hello and welcome!");


    }
}