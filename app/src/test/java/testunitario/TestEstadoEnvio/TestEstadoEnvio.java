package testunitario.TestEstadoEnvio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import testunitario.EstadoEnvio.EstadoEnvio;

public class TestEstadoEnvio {
    @Test
    public void validarClaseEstadoEnvio(){
        EstadoEnvio estadoEnvio1 = new EstadoEnvio("Creado");
        assertNotNull(estadoEnvio1," la instancia de estadoEnvio no es null");
    }

    @Test
    public void validarGetterEstadoEnvio(){
        EstadoEnvio estadoEnvio2 = new EstadoEnvio("En camino");
        assertEquals(estadoEnvio2.getNombreEstadoEnvio(), "En camino");
    }
}
