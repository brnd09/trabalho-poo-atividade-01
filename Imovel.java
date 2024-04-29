package org.example;

class Imovel {
    private String nomeProprietario;
    private double imposto;
    private int mesesAtraso;

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

