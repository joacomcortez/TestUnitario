package testunitario.TestEnvio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


import org.junit.jupiter.api.Test;

import testunitario.Envio.Envio;
import testunitario.Pedido.Pedido;

public class TestEnvio {
    @Test
    public void validarClaseEnvio(){
        Envio envio = new Envio();
        assertNotNull(envio, "La instancia de envio debe estar creada");
    }
    
    @Test
    public void testNumeroPedido(){
    Envio envio = new Envio();
        assertNotNull(envio.getNumeroEnvio(), "El numero de envio no debe ser null");
    }

    @Test
    public void testArrayPedidos(){
        Envio envio = new Envio();
        Pedido p1 = new Pedido();
        Pedido p2 = new Pedido();
        envio.addPedido(p1);
        envio.addPedido(p2);
        assertNotNull(envio.getPedidos(), "La lista de pedidos no debe ser null");
        assertEquals(2, envio.getPedidos().size(), "La lista de pedidos debe contener 2 elementos");
        assertEquals(p1, envio.getPedidos().get(0), "El primer pedido debe coincidir con p1");
        assertEquals(p2, envio.getPedidos().get(1), "El segundo pedido debe coincidir con p2");
    }
}
