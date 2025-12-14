# SalmonttApp — Semana 8
**Integrando interfaces, polimorfismo y estructuras dinámicas (GUI básica)**

Proyecto Java desarrollado en IntelliJ IDEA como parte de la actividad sumativa individual (Semana 8), para la empresa ficticia **Salmontt** (caso: empresa salmonera).  
El sistema integra una **interfaz común**, **polimorfismo**, una **colección genérica**, validación de tipos con **instanceof** y una **interfaz gráfica simple** mediante `JOptionPane`.

---

## Objetivo de la actividad
Fortalecer y ampliar un sistema orientado a objetos incorporando:

- Interfaz de comportamiento común (**contrato**).
- Herencia y polimorfismo para manejar distintas entidades desde una misma colección.
- Colección genérica (`ArrayList<Registrable>`) para almacenar objetos heterogéneos.
- Diferenciación por tipo en tiempo de ejecución usando `instanceof`.
- Interfaz visual básica (GUI) para ingresar y visualizar registros.

---

## Funcionalidades implementadas
- ✅ Interfaz `Registrable` con método `mostrarResumen()`.
- ✅ Clases que implementan `Registrable` (por ejemplo: **Proveedor**, **Empleado**).
- ✅ Gestión de entidades con `ArrayList<Registrable>` en `GestorEntidades`.
- ✅ Recorrido polimórfico de la colección y conteo por tipo usando `instanceof`.
- ✅ GUI con `JOptionPane`:
    - Registrar Proveedor
    - Registrar Empleado
    - Visualizar reporte de entidades en pantalla y también por consola

---

## Estructura del proyecto
El proyecto está organizado de forma modular en paquetes:
src/
model/ -> entidades e interfaz (POO)
data/ -> gestor y colección genérica
ui/ -> interfaz gráfica y ejecución

### Paquete `model/`
- `Registrable`: interfaz común con `mostrarResumen()`.
- `Entidad`: clase base abstracta con `id`.
- `Proveedor`: entidad de proveedores.
- `Empleado`: entidad de colaboradores internos.

### Paquete `data/`
- `GestorEntidades`:
    - Mantiene la colección `ArrayList<Registrable>`
    - Agrega entidades
    - Recorre y genera un **reporte**
    - Diferencia tipos con `instanceof`

### Paquete `ui/`
- `MenuUI`: menú interactivo con `JOptionPane`.
- `Main`: punto de entrada del sistema.

---

## Requisitos
- IntelliJ IDEA

---

## Cómo ejecutar
1. Abrir el proyecto en IntelliJ IDEA.
2. Ejecutar la clase `Main`.
3. En la GUI:
    - Elegir opción **1** para registrar un Proveedor.
    - Elegir opción **2** para registrar un Empleado.
    - Elegir opción **3** para ver el reporte.

---

## Ejemplo de uso (GUI)
- Registrar Proveedor:
    - ID: `PROV-001`
    - Empresa: `AquaFeed Ltda`
    - Rubro: `Alimentos`
    - Teléfono: `+56 9 1234 5678`

- Registrar Empleado:
    - ID: `EMP-001`
    - Nombre: `María Pérez`
    - Cargo: `Analista`
    - Área: `Administración`

- Ver Reporte:
    - Muestra el listado usando `mostrarResumen()`
    - Incluye conteo por tipo usando `instanceof`

---

## Conceptos aplicados (Semana 8)
- **Interfaz:** `Registrable`
- **Polimorfismo:** manejo de objetos distintos desde `Registrable`
- **Colecciones genéricas:** `ArrayList<Registrable>`
- **Validación de tipos:** `instanceof`
- **GUI básica:** `JOptionPane`

---

## Video de presentación (Kaltura)
En el video se explica:
- Jerarquía/clases e interfaz utilizada.
- Cómo se recorren objetos desde la colección.
- Diferenciación por tipo usando `instanceof`.
- Ejecución con ingreso de datos por GUI y visualización del reporte.

---


## 👩‍💻 Autora

Proyecto desarrollado por **Javiera Gutiérrez**, estudiante de Desarrollo de Aplicaciones.