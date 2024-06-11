package testunitario.TestEstadoPedido;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import testunitario.EstadoPedido.EstadoPedido;


public class TestEstadoPedido {
    @Test
    public void validarClaseEstadoPedido(){
        EstadoPedido estadoPedido1 = new EstadoPedido("Pagado");
        assertNotNull(estadoPedido1, "La instancia de envio debe estar creada");
    }
    @Test
    public void verificarExistenciaEstado(){
        EstadoPedido estadoPedido2 = new EstadoPedido("Pendiente de pago");
        String resultado = estadoPedido2.getNombreEstadoPedido();
        assertEquals(resultado, "Pendiente de pago");
    }
}
