public class Vehiculo {
    private String patente;
    private String marca;
    private int año;
    private double capacidadCargaKg;

    //constructor
    public Vehiculo(String patente, String marca, int año, double capacidadCargaKg) {
        this.patente = patente;
        this.marca = marca;
        this.año = año;
        this.capacidadCargaKg = capacidadCargaKg;
    }

    // getters and setters
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getCapacidadCargaKg() {
        return capacidadCargaKg;
    }

    public void setCapacidadCargaKg(double capacidadCargaKg) {
        this.capacidadCargaKg = capacidadCargaKg;
    }

    // metodos
    public void mostrarInformacion() {
        System.out.println("Vehículo:");
        System.out.println("  Patente: " + patente);
        System.out.println("  Marca: " + marca);
        System.out.println("  Año: " + año);
        System.out.println("  Capacidad de carga: " + capacidadCargaKg + " kg");
        System.out.println();
    }
}