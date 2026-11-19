
public class Main {

    public static void main(String[] args) {


        ImpresoraLaser laser = new ImpresoraLaser(
                "HP LaserJet Pro", 1200, 20
        );

        ImpresoraTinta tinta = new ImpresoraTinta(
                "Epson EcoTank", 600, 30
        );

        laser.imprimirDocumento("Informe empresarial.pdf");
        tinta.imprimirDocumento("Factura comercial.pdf");


        laser.imprimirDocumento("Contrato laboral.pdf");
        tinta.imprimirDocumento("Presupuesto.pdf");


        laser.imprimirDocumento("Reporte mensual.pdf");
        tinta.imprimirDocumento("Presentacion.pdf");


        System.out.println("\n===== ESTADO DE LOS DISPOSITIVOS =====");

        System.out.println("\nImpresora Laser:");
        laser.mostrarEstado();

        System.out.println("\nImpresora de Tinta:");
        tinta.mostrarEstado();
    }
}