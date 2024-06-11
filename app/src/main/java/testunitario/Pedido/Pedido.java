package testunitario.Pedido;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

import testunitario.Envio.Envio;
import testunitario.Factura.Factura;

public class Pedido {

    private int numeroPedido;
    private LocalDateTime fecha;
    private static final Set<Integer> generatedNumbers = new HashSet<>();
    private Envio envio;
    private Factura factura;
    
    

    public Envio getEnvio() {
        return envio;
    }

    public Pedido() {
        this.numeroPedido = generateRandomNumeroEnvio();
        this.fecha = LocalDateTime.now();
    }
    
    public Factura getFactura(){
        return factura;
    }
    public int getNumeroPedido() {
        return numeroPedido;
    }
    public  LocalDateTime getFecha() {
        return fecha;
    }
    public void setFactura(Factura f){
        factura = f;
    }
    private int generateRandomNumeroEnvio() {
        int randomNum;
        do {
            randomNum = ThreadLocalRandom.current().nextInt(100000, 1000000);
        } while (!generatedNumbers.add(randomNum)); // add() devuelve falso si esta repetido
        return randomNum;
    }

    public void assignEnvio(Envio e){
        this.envio = e;
    }
}
