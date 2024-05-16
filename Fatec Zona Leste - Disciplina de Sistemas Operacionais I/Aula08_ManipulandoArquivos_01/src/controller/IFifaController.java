// No pacote controller

package controller;

import java.io.IOException;

public interface IFifaController {
    void empilhaBrasileiros(String caminho, String nome) throws IOException;
    void desempilhaBonsBrasileiros(String caminho, String nome) throws IOException;
    void listaRevelacoes(String caminho, String nome) throws IOException;
    void buscaListaBonsJovens(String caminho, String nome) throws IOException;
}
