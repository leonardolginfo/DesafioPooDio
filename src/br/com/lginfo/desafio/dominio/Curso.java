package br.com.lginfo.desafio.dominio;

import java.util.Objects;

public class Curso extends Conteudo{

    private int cargaHoraria;

    public Curso(){
    }

    public Curso(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    @Override
    public double calcularXp() {
        return 0;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

}
