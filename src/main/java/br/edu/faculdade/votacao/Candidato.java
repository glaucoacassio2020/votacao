package br.edu.faculdade.votacao;

public record Candidato(
        String nome,
        String partido,
        int numero,
        int votos
) {
}
