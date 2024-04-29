package org.example;

import java.util.ArrayList;
import java.util.List;

class Municipio {
    private final List<Imovel> imoveis; // Lista de imóveis no município

    public Municipio() {
        this.imoveis = new ArrayList<>();
    }

    // Adiciona um imóvel ao município
    public void adicionarImovel(Imovel imovel) {
        imoveis.add(imovel);
    }

    // Calcula a multa de acordo com a tabela
    public double calcularMulta(Imovel imovel) {
        int meses = imovel.getMesesAtraso();
        double imposto = imovel.getImposto();
        double percentual = 0;

        // Determine a classe de multa com base no número de meses de atraso
        if (meses == 0) {
            percentual = 0.05;
        } else if (meses <= 6) {
            percentual = 0.08;
        } else if (meses <= 9) {
            percentual = 0.10;
        } else if (meses <= 11) {
            percentual = 0.12;
        } else {
            percentual = 0.10; // Para mais de 12 meses, uma taxa fixa de 10%
        }

        // Calcula o valor da multa
        return imposto * percentual;
    }

    public void listarMultas() {
        System.out.println("Listagem de multas:");
        for (Imovel imovel : imoveis) {
            double multa = calcularMulta(imovel);
            System.out.printf("Proprietário: %s | Imposto: %.2f | Meses de Atraso: %d | Multa a ser paga: %.2f\n",
                    imovel.getNomeProprietario(), imovel.getImposto(), imovel.getMesesAtraso(), multa);
        }
    }
}
