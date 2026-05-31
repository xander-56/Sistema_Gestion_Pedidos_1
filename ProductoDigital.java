package modelo;

public class ProductoDigital extends Producto {
    private String licencia;

    public ProductoDigital(String nombre, double precio, String licencia) {
        super(nombre, precio);
        this.licencia = licencia;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    @Override
    public double calcularPrecioFinal() {
        // IVA reducido 10% para productos digitales
        return getPrecio() * 1.10;
    }

    @Override
    public String toString() {
        return super.toString() + " (Digital) - Licencia: " + licencia + " - Precio final: " + calcularPrecioFinal() + "€";
    }
}