package org.example;

public class Velocista extends Atleta {

    public String verificarTestesFísicos() {
        if (this.calcularMedia() >= 6.0f && this.getTesteVelocidade() >= 7.0f) {
            return "Passou no teste físico";
        }
        else {
            return "Reprovou no teste físico";
        }
    }

    @Override
    public String getTipo() {
        return "Velocista";
    }
}