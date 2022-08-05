package br.com.lginfo.desafio.dominio;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Mentoria extends Conteudo{

    private LocalDate data;

    public  Mentoria(){

    }

    public Mentoria(String titulo, String descricao, LocalDate data) {
        super();
        this.setTitulo(titulo);
        this.setDescricao(descricao);
        this.data = data;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20;
    }
<<<<<<< HEAD
    public LocalDate getData() {
=======
       public LocalDate getData() {
>>>>>>> 7ecfc201d79f7091a784370d98892c97bf4a0414
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }


<<<<<<< HEAD
}
=======
}
>>>>>>> 7ecfc201d79f7091a784370d98892c97bf4a0414
