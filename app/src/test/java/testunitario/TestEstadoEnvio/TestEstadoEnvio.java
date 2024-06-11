package testunitario.TestEstadoEnvio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import testunitario.EstadoEnvio.EstadoEnvio;

public class TestEstadoEnvio {
    @Test
    public void validarClaseCreadaEstadoEnvio(){
        EstadoEnvio estadoEnvio1 = new EstadoEnvio("Creado");
        assertNotNull(estadoEnvio1);
    }

    @Test
    public void validarInstanciaCreadaEstadoEnvio(){
        EstadoEnvio estadoEnvio2 = new EstadoEnvio("En camino");
        assertEquals(estadoEnvio2, estadoEnvio2.getNombreEstadoEnvio());
    }
}
