package br.edu.faculdade.votacao;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CandidatoController {

    private final List<Candidato> candidatos = List.of(
            new Candidato("Glauco", "Partido do Java", 51, 150),
            new Candidato("Augusto Cury", "Partido Avante", 70, 120),
            new Candidato("Flavio Bolsonaro", "Partido Liberal", 22, 80),
            new Candidato("Lula", "Partido dos Trabalhadores", 13, 80)
    );

    @GetMapping("/boas-vindas")
    public String boasVindas() {
        return "Sistema de votação das eleições 2026!";
    }

    @GetMapping("/destaque")
    public Candidato destaque() {
        return candidatos.get(0);
    }

    @GetMapping("/candidatos")
    public List<Candidato> listarCandidatos() {
        return candidatos;
    }
}

