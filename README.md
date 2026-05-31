# Sistema de Gestión de Pedidos 1 

## Descripción
Aplicación Java para gestionar pedidos con productos físicos y digitales.

## Estructura del proyecto
gestionpedidos1/
│
├── src/
│   ├── modelo/
│   │   ├── Producto.java
│   │   ├── ProductoFisico.java
│   │   ├── ProductoDigital.java
│   │   ├── Cliente.java
│   │   └── Pedido.java
│   └── app/
│       └── Main.java
│
├── diagrams/
│   ├── diagrama-inicial.puml
│   ├── diagrama-inicial.png
│   ├── diagrama-final.puml
│   └── diagrama-final.png
│
├── README.md
│
└── Gestion_Pedidos_1.pdf
## Ejecución
bash
javac -d . src/modelo/*.java src/app/*.java
java app.Main
