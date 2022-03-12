package br.com.alura.escola.gamificacao.infra.selo;

import br.com.alura.escola.shared.dominio.CPF;
import br.com.alura.escola.gamificacao.dominio.selo.RepositorioDeSelos;
import br.com.alura.escola.gamificacao.dominio.selo.Selo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RepositorioDeSelosEmMemoria implements RepositorioDeSelos {

    private List<Selo> selos;

    public RepositorioDeSelosEmMemoria() {
        this.selos = new ArrayList<>();
    }

    @Override
    public void adicionar(Selo selo) {
        this.selos.add(selo);
    }

    @Override
    public List<Selo> buscarSelosPorCPF(CPF cpf) {
        return this.selos
                .stream()
                .filter(selo -> cpf.equals(selo.getCpfDoAluno())).collect(Collectors.toList());
    }

    @Override
    public List<Selo> buscarTodosSelos() {
        return null;
    }
}
