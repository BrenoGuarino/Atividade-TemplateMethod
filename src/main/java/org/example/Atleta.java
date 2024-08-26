package org.example;

public abstract class Atleta {

    private int inscricao;
    protected String nome;
    private float testeResistencia;
    private float testeVelocidade;

    public int getInscricao() {
        return inscricao;
    }

    public void setInscricao(int inscricao) {
        this.inscricao = inscricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getTesteResistencia() {
        return testeResistencia;
    }

    public void setTesteResistencia(float testeResistencia) {
        this.testeResistencia = testeResistencia;
    }

    public float getTesteVelocidade() {
        return testeVelocidade;
    }

    public void setTesteVelocidade(float testeVelocidade) {
        this.testeVelocidade = testeVelocidade;
    }

    public float calcularMedia() {
        return (this.testeResistencia + this.testeVelocidade) / 2;
    }

    public abstract String verificarTestesFísicos();

    public String getTipo() {
        return "Atleta";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "Número de Inscrição=" + this.inscricao +
                ", nome='" + this.nome + '\'' +
                ", resultado=" + this.verificarTestesFísicos() +
                '}';
    }
}