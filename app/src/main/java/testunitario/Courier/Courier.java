package testunitario.Courier;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class Courier {
    private int numCourier;
    private String nombre;
    private LocalDateTime fechaAltaCourier;
    private LocalDateTime fechaBajaCourier;
    
    private static final Set<Integer> generatedNumbers = new HashSet<>();

    
    public Courier(String nombre) {
        this.numCourier = generateRandomNumeroEnvio();
        this.nombre = nombre;
        this.fechaAltaCourier = LocalDateTime.now();
        this.fechaBajaCourier = null;
    }
    public int getNumCourier() {
        return numCourier;
    }
    public String getNombre() {
        return nombre;
    }
    public LocalDateTime getFechaAltaCourier() {
        return fechaAltaCourier;
    }
    public LocalDateTime getFechaBajaCourier() {
        return fechaBajaCourier;
    }

    private int generateRandomNumeroEnvio() {
        int randomNum;
        do {
            randomNum = ThreadLocalRandom.current().nextInt(100000, 1000000);
        } while (!generatedNumbers.add(randomNum)); // add() devuelve falso si esta repetido
        return randomNum;
    }
    
}
