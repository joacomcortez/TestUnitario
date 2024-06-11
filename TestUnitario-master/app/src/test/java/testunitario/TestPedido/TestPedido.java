package testunitario.TestPedido;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import testunitario.Pedido.Pedido;

public class TestPedido {
     @Test
    public void validarClasePedido(){
        Pedido pedido = new Pedido();
        assertNotNull(pedido, "La instancia de pedido debe estar creada");
    }
    
    @Test
    public void testNumeroPedido(){
    Pedido pedido = new Pedido();
        assertNotNull(pedido.getNumeroPedido(), "El numero de pedido no debe ser null");
    }

    @Test
    public void testValidezFecha(){
        Pedido pedido = new Pedido();

        assertNotNull(pedido.getFecha()," la fecha no debe ser null ");
        LocalDateTime now = LocalDateTime.now();
        assertFalse(pedido.getFecha().isAfter(now), "la fecha no puede estar en el futuro");
    }
}
