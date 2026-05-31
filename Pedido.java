package modelo;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Producto> productos;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularPrecioFinal();
        }
        return total;
    }

    public void mostrarResumen() {
        System.out.println("===== RESUMEN DEL PEDIDO =====");
        System.out.println(cliente);
        System.out.println("\nProductos:");
        for (Producto p : productos) {
            System.out.println("  - " + p);
        }
        System.out.printf("\nTOTAL DEL PEDIDO: %.2f€\n", calcularTotal());
        System.out.println("===============================");
    }
}