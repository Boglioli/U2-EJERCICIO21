public class Main {
    public static void main(String[] args) {
        DispositivoAlmacenamiento[] dispositivos ={ new DiscoDuro(20), new MemoriaUSB(20)};
        for (DispositivoAlmacenamiento dispositivo : dispositivos) {
            dispositivo.escribirDatos("hola mundoo");
            System.out.println("datos leidos " + dispositivo.leerDatos());
            System.out.println();
        }
    }
}
