public class Main {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("JCU264", "Dodge", 2011, 2200.5);
        Vehiculo v2 = new Vehiculo("KHF153", "Ford", 2022, 1500.0);
        Vehiculo v3 = new Vehiculo("KDN988", "BMW", 2018, 2000.0);

        v1.mostrarInformacion();
        v2.mostrarInformacion();
        v3.mostrarInformacion();
    }
}