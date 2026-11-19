
public class ImpresoraTinta extends Impresor {

    private int nivelCartucho;


    public ImpresoraTinta(String modelo, int resolucion, int nivelCartucho) {
        super(modelo, resolucion);
        this.nivelCartucho = nivelCartucho;
    }


    @Override
    public void imprimirDocumento(String documento) {

        System.out.println("\n--- IMPRESORA DE TINTA ---");

        if (nivelCartucho > 0) {
            System.out.println("Imprimiendo: " + documento);

            nivelCartucho -= 15;

            if (nivelCartucho < 0) {
                nivelCartucho = 0;
            }

            System.out.println("Impresion realizada correctamente.");
        } else {
            System.out.println("Error: El cartucho esta agotado.");
        }
    }

    @Override
    public void mostrarEstado() {
        super.mostrarEstado();
        System.out.println("Nivel de cartucho: " + nivelCartucho + "%");
    }
}