package org.example;

public class Ginasta extends Atleta {

    public String verificarTestesFísicos() {
        if (this.calcularMedia() >= 6.0f && this.getTesteResistencia() >= 7.0f) {
            return "Passou no teste físico";
        }
        else {
            return "Reprovou no teste físico";
        }
    }

    @Override
    public String getTipo() {
        return "Ginasta";
    }

}