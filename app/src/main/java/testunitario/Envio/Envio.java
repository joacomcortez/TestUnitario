package testunitario.Envio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

import testunitario.Pedido.Pedido;

public class Envio {

    private static final Set<Integer> generatedNumbers = new HashSet<>();
    private int numeroEnvio;
    private List<Pedido> pedidos;
 
    public Envio() {
        this.numeroEnvio = generateRandomNumeroEnvio();
        this.pedidos = new ArrayList<>();
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }
 
    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void addPedido (Pedido e){
        pedidos.add(e);
    }
   

    public int getNumeroEnvio() {
        return numeroEnvio;
    }

    private int generateRandomNumeroEnvio() {
        int randomNum;
        do {
            randomNum = ThreadLocalRandom.current().nextInt(100000, 1000000);
        } while (!generatedNumbers.add(randomNum)); // add() devuelve falso si esta repetido
        return randomNum;
    }
}
