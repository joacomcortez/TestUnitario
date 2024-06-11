package testunitario.Cliente;

public class Cliente {
    private String nombre;
    private String apellido;
    private int codPostal;

    public Cliente(String nombre, String apellido, int codPostal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codPostal = codPostal;
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getCodPostal() {
        return codPostal;
    }
}
