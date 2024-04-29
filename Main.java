package org.example;

public class Main {
    public static void main(String[] args) {
        Municipio municipio = new Municipio();

        // Número de imóveis a serem cadastrados
        int numImoveis = InOut.leInt("Quantos imóveis deseja cadastrar?");

        for (int i = 0; i < numImoveis; i++) {
            String nomeProprietario = InOut.leString("Nome do proprietário do imóvel " + (i + 1) + ":");
            double imposto = InOut.leDouble("Valor do imposto do imóvel " + (i + 1) + ":");
            int mesesAtraso = InOut.leInt("Meses de atraso do imóvel " + (i + 1) + ":");

            Imovel imovel = new Imovel(nomeProprietario, imposto, mesesAtraso);
            municipio.adicionarImovel(imovel);
        }

        // Listar as multas para os imóveis cadastrados
        municipio.listarMultas();
    }
}
