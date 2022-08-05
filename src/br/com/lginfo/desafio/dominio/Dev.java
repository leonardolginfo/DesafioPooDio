package br.com.lginfo.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootCamp(BootCamp bootCamp){
<<<<<<< HEAD
        this.conteudosInscritos.addAll(bootCamp.getConteudos());
        bootCamp.getDevsInscritos().add(this);
=======
            this.conteudosInscritos.addAll(bootCamp.getConteudos());
            bootCamp.getDevsInscritos().add(this);
>>>>>>> 7ecfc201d79f7091a784370d98892c97bf4a0414
    }
    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()){
<<<<<<< HEAD
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
=======
                this.conteudosConcluidos.add(conteudo.get());
                this.conteudosInscritos.remove(conteudo.get());
>>>>>>> 7ecfc201d79f7091a784370d98892c97bf4a0414
        }else{
            System.err.println("Você não está matriculado em nenhum Bootcamp");
        }
    }

    public double calcularTotalXp(){
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
    }

    public String getNome() {
        return nome;
    }

<<<<<<< HEAD

=======
>>>>>>> 7ecfc201d79f7091a784370d98892c97bf4a0414
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

<<<<<<< HEAD
}
=======
}
>>>>>>> 7ecfc201d79f7091a784370d98892c97bf4a0414
