package br.com.jael.cm.modelo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CompoTeste {

    private Campo campo;

    @BeforeEach
    void iniciar() {
        campo = new Campo(3, 3);
    }

    @Test
    public void testeVizinhoReal1() {
        Campo vizinho = new Campo(4, 3);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assertTrue(resultado);
    }

}
