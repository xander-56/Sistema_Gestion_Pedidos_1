# Sistema de Gestión de Pedidos 1 

## Descripción
Aplicación Java para gestionar pedidos con productos físicos y digitales.

## Estructura del proyecto
src/
├── modelo/
│ ├── Producto.java
│ ├── ProductoFisico.java
│ ├── ProductoDigital.java
│ ├── Cliente.java
│ └── Pedido.java
└── app/
└── Main.java

## Ejecución
bash
javac -d . src/modelo/*.java src/app/*.java
java app.Main
