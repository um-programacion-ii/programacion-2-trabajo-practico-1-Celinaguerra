public class Camion extends Vehiculo {
    private boolean tieneAcoplado;

    //constructor
    public Camion(String patente, String marca, int anio, double capacidadCargaKg, boolean tieneAcoplado) {
        super(patente, marca, anio, capacidadCargaKg);
        this.tieneAcoplado = tieneAcoplado;
    }

    public boolean tieneAcoplado() {
        return tieneAcoplado;
    }

    @Override
    public String getTipo() {
        return "Camion";
    }
}
