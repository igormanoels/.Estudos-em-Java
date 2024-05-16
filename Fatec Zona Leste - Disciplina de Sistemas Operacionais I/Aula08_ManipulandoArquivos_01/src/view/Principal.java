// No pacote view

package view;

import controller.FifaController;

import java.io.IOException;

public class Principal {
    public static void main(String[] args) {
        FifaController controller = new FifaController();
        try {
            System.out.println("---- Brasileiros com Overall acima de 80 ----");
            controller.desempilhaBonsBrasileiros("C:\\TEMP\\data.csv", "nome");
            System.out.println("\n---- Bons jovens (Overall > 80 e idade <= 20) ----");
            controller.listaRevelacoes("C:\\TEMP\\data.csv", "nome");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
