package br.com.alura.escola.academico.dominio.aluno;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlunoTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void naoDeveCadatrarMaisDe2Telefones(){
        Aluno aluno = new FabricaDeAluno().comNomeCPFEmail("João", "000.000.000-00", "email@email.com").criar();

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            aluno.adicionarTelefone("00", "000000000");
            aluno.adicionarTelefone("00", "000000000");
            aluno.adicionarTelefone("00", "000000000");
        });

    }

}