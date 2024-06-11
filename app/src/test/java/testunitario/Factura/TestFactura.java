package testunitario.Factura;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import testunitario.Pedido.Pedido;

public class TestFactura {
    @Test
    public void validarClaseFactura(){
        Pedido p = new Pedido();
        Factura factura = new Factura(p);
        assertNotNull(factura, "La instancia de Factura debe estar creada");
    }
    
    @Test
    public void testNumeroFactura(){
        Pedido p = new Pedido();
        Factura factura = new Factura(p);
        assertNotNull(factura.getNumFactura(), "El numero de Factura no debe ser null");
    }

    @Test
    public void testDatesFactura(){
        Pedido p = new Pedido();
        Factura factura = new Factura(p);
        assertNotNull(factura.getFechaHoraFactura(), "la fecha no debe ser null");
        LocalDateTime now = LocalDateTime.now();
        assertFalse(factura.getFechaHoraFactura().isAfter(now),"la fecha no puede estar en el futuro");
    }
    
    @Test
    public void testFacturaHasPedido(){
        Pedido p = new Pedido();
        Factura factura = new Factura(p);
        assertNotNull(factura.getPedido(), "una factura debe estar asociada a un pedido");
    }
}
