public class Main {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("JCU264", "Dodge", 2011, 2200.5);
        Vehiculo v2 = new Vehiculo("KHF153", "Ford", 2022, 1500.0);
        Camion c1 = new Camion("KDN988", "BMW", 2018, 8000.0, true);

        VehiculoPrinter.imprimir(v1);
        VehiculoPrinter.imprimir(v2);
        VehiculoPrinter.imprimir(c1);
    }
}
