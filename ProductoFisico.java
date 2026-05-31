package modelo;

public class ProductoFisico extends Producto {
    private double costeEnvio;

    public ProductoFisico(String nombre, double precio, double costeEnvio) {
        super(nombre, precio);
        this.costeEnvio = costeEnvio;
    }

    public double getCosteEnvio() {
        return costeEnvio;
    }

    public void setCosteEnvio(double costeEnvio) {
        this.costeEnvio = costeEnvio;
    }

    @Override
    public double calcularPrecioFinal() {
        // IVA 21% + coste de envío
        return getPrecio() * 1.21 + costeEnvio;
    }

    @Override
    public String toString() {
        return super.toString() + " (Físico) - Coste envío: " + costeEnvio + "€ - Precio final: " + calcularPrecioFinal() + "€";
    }
}
