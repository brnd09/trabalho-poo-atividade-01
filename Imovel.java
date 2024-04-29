package org.example;

class Imovel {
    private final String nomeProprietario;
    private final double imposto;
    private final int mesesAtraso;

    // Construtor
    public Imovel(String nomeProprietario, double imposto, int mesesAtraso) {
        this.nomeProprietario = nomeProprietario;
        this.imposto = imposto;
        this.mesesAtraso = mesesAtraso;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public double getImposto() {
        return imposto;
    }

    public int getMesesAtraso() {
        return mesesAtraso;
    }
}

