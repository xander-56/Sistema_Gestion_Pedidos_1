package app;

import modelo.*;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Ana García", "ana@email.com", "Calle Mayor 123");

        Producto teclado = new ProductoFisico("Teclado mecánico", 50.0, 5.99);
        Producto monitor = new ProductoFisico("Monitor 24 pulgadas", 120.0, 12.50);
        Producto licencia = new ProductoDigital("Licencia Windows", 150.0, "WINDOWS-12345");
        Producto ebook = new ProductoDigital("eBook Java", 29.99, "JAVA-EBOOK-001");

        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(teclado);
        pedido.agregarProducto(monitor);
        pedido.agregarProducto(licencia);
        pedido.agregarProducto(ebook);

        pedido.mostrarResumen();
    }
}