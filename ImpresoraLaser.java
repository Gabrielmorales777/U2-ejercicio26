
public class ImpresoraLaser extends Impresor {

    private int nivelToner;


    public ImpresoraLaser(String modelo, int resolucion, int nivelToner) {
        super(modelo, resolucion);
        this.nivelToner = nivelToner;
    }


    @Override
    public void imprimirDocumento(String documento) {

        System.out.println("\n--- IMPRESORA LASER ---");

        if (nivelToner > 0) {
            System.out.println("Imprimiendo: " + documento);

            nivelToner -= 10;

            if (nivelToner < 0) {
                nivelToner = 0;
            }

            System.out.println("Impresion realizada correctamente.");
        } else {
            System.out.println("Error: El toner esta agotado.");
        }
    }


    @Override
    public void mostrarEstado() {
        super.mostrarEstado();
        System.out.println("Nivel de toner: " + nivelToner + "%");
    }
}