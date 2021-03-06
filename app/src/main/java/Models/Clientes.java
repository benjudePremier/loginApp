package Models;

public class Clientes {
    // Declaraciones de las variables
    private  String id;
    private  String nombre;
    private  String destino;
    private  String promocion;

    // Cosntuctor
    public Clientes()
    {}

    // Getter y setter

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getPromocion() {
        return promocion;
    }

    public void setPromocion(String promocion) {
        this.promocion = promocion;
    }
}







