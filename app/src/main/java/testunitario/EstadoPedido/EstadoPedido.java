package testunitario.EstadoPedido;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class EstadoPedido {
    private int codEstadoPedido;
    private static final Set<Integer> generatedNumbers = new HashSet<>();
    private String nombreEstadoPedido;

    public EstadoPedido(String nombreEstadoPedido) {
        this.nombreEstadoPedido = nombreEstadoPedido;
        this.codEstadoPedido = generateRandomNumeroEnvio();
    }
    
    private int generateRandomNumeroEnvio() {
        int randomNum;
        do {
            randomNum = ThreadLocalRandom.current().nextInt(100000, 1000000);
        } while (!generatedNumbers.add(randomNum)); // add() devuelve falso si esta repetido
        return randomNum;
    }

    public String getNombreEstadoPedido() {
        return nombreEstadoPedido;
    }

    public void setNombreEstadoPedido(String nombreEstadoPedido) {
        this.nombreEstadoPedido = nombreEstadoPedido;
    }

    
}
