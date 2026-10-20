public class MemoriaUSB extends DispositivoAlmacenamiento {
    private int capacidadMaxima;
    private String datos;
    public MemoriaUSB(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        datos = "";
    }
    public void escribirDatos(String datos) {
        if(datos.length() <= capacidadMaxima) {
            this.datos = datos;
            System.out.println("datos escritos en la memoria USB");
        } else {
            System.out.println("capacidad excedida");
        }
    }
    public String leerDatos() {
        return datos;
    }
}

