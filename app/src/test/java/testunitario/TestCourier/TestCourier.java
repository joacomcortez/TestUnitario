package testunitario.TestCourier;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;
import testunitario.Courier.Courier;


public class TestCourier {

    @Test
    public void validarClaseCourier(){
        Courier courier = new Courier("andesmar");
        assertNotNull(courier, "La instancia de Courier debe estar creada");
    }
    
    @Test
    public void testNumeroCourier(){
        Courier courier = new Courier("andesmar");
        assertNotNull(courier.getNumCourier(), "El numero de Courier no debe ser null");
    }

    @Test
    public void testDatesCourier(){
        Courier courier = new Courier("andesmar");
        assertNotNull(courier.getFechaAltaCourier(), "la fecha no debe ser null");
        assertNull(courier.getFechaBajaCourier(),"la fecha baja debe ser null");
        LocalDateTime now = LocalDateTime.now();
        assertFalse(courier.getFechaAltaCourier().isAfter(now),"la fecha no puede estar en el futuro");
    }
}
