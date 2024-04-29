package org.example;

public class Main {
    public static void main(String[] args) {
        Municipio municipio = new Municipio();

        // Adicionando alguns imóveis
        municipio.adicionarImovel(new Imovel("João Silva", 1500, 0));
        municipio.adicionarImovel(new Imovel("Maria Souza", 2000, 7));
        municipio.adicionarImovel(new Imovel("Carlos Pereira", 1000, 10));
        municipio.adicionarImovel(new Imovel("Ana Santos", 2500, 13));

        // Listar as multas para os imóveis no município
        municipio.listarMultas();
    }
}
