public class VehiculoPrinter {

    public static void imprimir(Vehiculo v) {
        System.out.println("Vehículo:");
        System.out.println("Patente: " + v.getPatente());
        System.out.println("Marca: " + v.getMarca());
        System.out.println("Año: " + v.getAño());
        System.out.println("Capacidad de carga (kg): " + v.getCapacidadCargaKg());
        System.out.println("-----");
    }
}
