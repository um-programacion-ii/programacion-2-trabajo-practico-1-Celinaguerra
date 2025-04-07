public class VehiculoPrinter {

    public static void imprimir(Vehiculo v) {
        System.out.println("Tipo: " + v.getTipo());
        System.out.println("Patente: " + v.getPatente());
        System.out.println("Marca: " + v.getMarca());
        System.out.println("Año: " + v.getAño());
        System.out.println("Capacidad de carga (kg): " + v.getCapacidadCargaKg());

        if (v instanceof Camion) {
            Camion c = (Camion) v;
            System.out.println("Tiene acoplado: " + (c.tieneAcoplado() ? "Sí" : "No"));
        }

        System.out.println("-----");
    }
}
