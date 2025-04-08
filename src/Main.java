import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Vehiculo("JCU264", "Dodge", 2011, 2200.5));
        vehiculos.add(new Auto("KHF153", "Ford", 2022, 1500.0, 4));
        vehiculos.add(new Camion("KDN988", "BMW", 2018, 8000.0, true));

        System.out.println("Listado de vehículos:");
        for (Vehiculo v : vehiculos) {
            VehiculoPrinter.imprimir(v);
        }

        //Búsqueda por patente
        String patenteBuscada = "KHF153";
        Vehiculo resultado = buscarPorPatente(vehiculos, patenteBuscada);
        if (resultado != null) {
            System.out.println("Vehículo encontrado:");
            VehiculoPrinter.imprimir(resultado);
        } else {
            System.out.println("Vehículo con patente " + patenteBuscada + " no encontrado.");
        }
    }

    public static Vehiculo buscarPorPatente(List<Vehiculo> lista, String patente) {
        for (Vehiculo v : lista) {
            if (v.getPatente().equalsIgnoreCase(patente)) {
                return v;
            }
        }
        return null;
    }
}
