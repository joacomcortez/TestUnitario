package testunitario.TestCliente;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import testunitario.Cliente.Cliente;

public class TestCliente {
    @Test
    public void validarClaseCliente(){
        Cliente cliente = new Cliente("nombre","apellido",5500);
        assertNotNull(cliente, "La instancia de cliente debe estar creada");
    }
    
    @Test
    public void testGettersCliente(){
    Cliente cliente = new Cliente("nombreTest","apellidoTest", 5500);

        assertNotNull(cliente.getNombre(), "El nombre no debe ser null");
        assertFalse(cliente.getNombre().isEmpty(), "El nombre no debe estar vacio");
        assertEquals("nombreTest", cliente.getNombre(), "El nombre debe ser 'nombreTest' ");

        assertNotNull(cliente.getApellido(), "El apellido no debe ser null");
        assertFalse(cliente.getApellido().isEmpty(), "El apellido no debe estar vacío");
        assertEquals("apellidoTest", cliente.getApellido(), "El apellido debe ser 'apellidoTest' ");

        assertEquals(5500, cliente.getCodPostal(), "El código postal debe ser 5500");
    }
}
