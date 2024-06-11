package testunitario.Factura;

import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;

import testunitario.Pedido.Pedido;

import java.util.HashSet;
import java.util.Set;

public class Factura {
    private int numFactura;
    private LocalDateTime fechaHoraFactura;
    @SuppressWarnings("unused")
    private String controladorFiscalAuth;
    private Pedido pedido;
    private static final Set<Integer> generatedNumbers = new HashSet<>();

    
    public Factura(Pedido p) {
        numFactura = generateRandomNumeroFactura();
        fechaHoraFactura = LocalDateTime.now();
        pedido = p;
    }

    public Pedido getPedido(){
        return pedido;
    }
    public int getNumFactura() {
        return numFactura;
    }
    public LocalDateTime getFechaHoraFactura() {
        return fechaHoraFactura;
    }
    private int generateRandomNumeroFactura() {
        int randomNum;
        do {
            randomNum = ThreadLocalRandom.current().nextInt(100000, 1000000);
        } while (!generatedNumbers.add(randomNum)); // add() devuelve falso si esta repetido
        return randomNum;
    }
}
