# Sistema de Gestión Salmontt 🐟

## 📌 Descripción General
Este proyecto corresponde a un prototipo de sistema modular desarrollado en Java para la empresa salmonera **Salmontt**, ubicada en Puerto Montt.  
El objetivo del sistema es organizar y gestionar información relacionada con personas, productos y órdenes de compra, aplicando los principios fundamentales de la Programación Orientada a Objetos (POO).

El sistema no reemplaza un ERP, sino que actúa como una base técnica escalable para futuras versiones.

---

## 🧱 Arquitectura del Proyecto

El proyecto está organizado en paquetes según su responsabilidad:

scr/
-ui/ -> Punto de entrada del sistema (Main)
-model/ -> Clases del dominio (Personas, Productos, Ordenes)
-interfaces/ -> Utilidades (lectura de archivos)
-data/ -> Archivos.txt con datos de prueba

---

## 🧠 Principios de POO Aplicados

✔ Encapsulamiento (atributos privados y getters)  
✔ Herencia (`Persona` → `Empleado`, `Cliente`)  
✔ Polimorfismo (listas de tipo `Registrable`)  
✔ Interfaces (`Registrable`)  
✔ Composición (`OrdenDeCompra` contiene productos y cliente)  
✔ Colecciones (`ArrayList`)  
✔ Manejo de excepciones (validación de RUT)  
✔ Lectura de archivos `.txt`

---

## 📦 Clases Principales

### 🔹 Persona (abstract)
Clase base que representa a una persona del sistema.  
Implementa la interfaz `Registrable`.

Atributos:
- nombre
- rut
- direccion

---

### 🔹 Empleado
Hereda de `Persona`.  
Representa a los trabajadores de la empresa.

Atributos:
- cargo

---

### 🔹 Cliente
Hereda de `Persona`.  
Representa a los clientes que realizan órdenes de compra.

---

### 🔹 Producto
Representa los productos comercializados por la empresa.

Atributos:
- nombre
- precio

---

### 🔹 OrdenDeCompra
Representa una orden asociada a un cliente y una lista de productos.

Funcionalidades:
- Agregar productos
- Mostrar orden completa

---

## 📄 Uso de Archivos

El sistema carga empleados desde un archivo externo:

📁 `data/empleados.txt`

Formato:
Nombre;Cargo

Ejemplo:
Ana Soto;Ventas

Pedro Perez;Logística

Maria Lopez;Administración

La lectura del archivo se realiza mediante la clase utilitaria `ArchivoUtil`.

---

## ▶️ Ejecución del Proyecto

1. Clonar el repositorio: git clone https://github.com/javigutierrezra/SalmonttAppDuoc-poo.git
2. Abrir el proyecto en IntelliJ IDEA.
3. Ejecutar la clase: ui.Main
---

## 🎥 Video de Presentación
El proyecto incluye un video demostrativo donde se muestra:
- Ejecución del sistema
- Explicación de las clases y paquetes
- Uso de herencia, interfaces y polimorfismo
- Lectura desde archivos `.txt`

---

## 👩‍💻 Autor
Proyecto desarrollado por **Javiera Gutiérrez**  
Asignatura: Desarrollo Orientado a Objetos I  
Año: 2025
