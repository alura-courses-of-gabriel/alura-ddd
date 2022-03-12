package br.com.alura.escola.academico.dominio.aluno;

import br.com.alura.escola.shared.dominio.evento.Evento;
import br.com.alura.escola.shared.dominio.evento.Ouvinte;

public class LogAlunoMatriculado extends Ouvinte {

    @Override
    protected void reaageAo(Evento evento) {
        AlunoMatriculado alunoMatriculado = (AlunoMatriculado) evento;
        System.out.println("Aluno: " + alunoMatriculado.getCpf());
        System.out.println("Matriculado em: " + alunoMatriculado.momento());
    }

    @Override
    protected boolean deveProcessar(Evento evento) {
        return evento instanceof AlunoMatriculado;
    }
}
