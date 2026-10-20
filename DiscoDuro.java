public class DiscoDuro extends DispositivoAlmacenamiento {
    private int capacidadMaxima;
    private String datos;
    public DiscoDuro(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.datos = "";
    }
    public void escribirDatos(String datos) {
        if(datos.length() <= capacidadMaxima) {
            this.datos = datos;
            System.out.println("datos escritos en el disco duro");
        } else {
            System.out.println("capacidad excedida");
        }
    }
    public String leerDatos() {
        return datos;
    }
}
