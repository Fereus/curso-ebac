import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String names = "Fernando m,Maria f,Nina f,Rafael m,Marcus m,Renata f,";


        List<String> namesSplit = new ArrayList<>(Arrays.asList(names.split(",")));

        Collections.sort(namesSplit);

        Map<String, List<String>> nomesPorGenero = new HashMap<>();
        List<String> nomesMasculinos = new ArrayList<>();
        List<String> nomesFemininos = new ArrayList<>();
        for (String nome : namesSplit) {

            if (nome.contains(" m") ) {
                nomesMasculinos.add(nome.substring(0, nome.length() - 2));
            } else {
                nomesFemininos.add(nome.substring(0, nome.length() - 2));
            }

        }
        nomesPorGenero.put("masculino", nomesMasculinos);
        nomesPorGenero.put("feminino", nomesFemininos);

        System.out.println("Nomes masculinos: " + nomesPorGenero.get("masculino"));
        System.out.println("Nomes femininos: " + nomesPorGenero.get("feminino"));
    }
}