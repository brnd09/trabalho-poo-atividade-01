package org.example;

import java.util.ArrayList;
import java.util.List;

class Municipio {
    private List<Imovel> imoveis;

    public Municipio() {
        this.imoveis = new ArrayList<>();
    }

    public void adicionarImovel(Imovel imovel) {
        imoveis.add(imovel);
    }

    public double calcularMulta(Imovel imovel) {
        int meses = imovel.getMesesAtraso();
        double imposto = imovel.getImposto();
        double percentual = 0;

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

        return imposto * percentual;
    }

    public void listarMultas() {
        System.out.println("Listagem de Multas:");
        for (Imovel imovel : imoveis) {
            double multa = calcularMulta(imovel);
            String detalhes = String.format("Proprietário: %s, Imposto: %.2f, Meses de Atraso: %d, Multa: %.2f",
                    imovel.getNomeProprietario(),
                    imovel.getImposto(),
                    imovel.getMesesAtraso(),
                    multa);

            // Exibe a informação no terminal
            System.out.println(detalhes);

            // Exibe a informação em uma janela de diálogo
            InOut.MsgDeInformacao("Detalhes da Multa", detalhes);
        }
    }
}
