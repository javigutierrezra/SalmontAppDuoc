# SalmonttApp - Semana 6 
## Creando jerarquías de clases con herencia simple

Este proyecto forma parte del proceso de digitalización de la empresa ficticia **Salmontt**, una salmonera ubicada en la Región de los Lagos.
En esra sexta semana, se implementó una **jerarquía de clases orientada a objetos**, utilizando **herencia simple**, sobreescritura de métodos y organización modular mediante paquetes.

---

## Objetivo de esta semana
El objetivo principal es modelar las **unidades operativas** de la empresa mediante una estructura jerárquica que permita:
- Reutilizar atributos comunes entre distintos tipos de unidades.
- Especializar comportamientos según cada tipo de instalación.
- Mantener un diseño escalable, extensible y fácil de mantener.
- Aplicar conceptos de **POO**, como:
   - herencia
   - composición
   - superclases y subclases
   - uso de ´super(...)´
   - sobrescritura (@Override´)
   - organización por paquetes

Estructura del proyecto
estructura final del proyecto en IntelliJ quedó organizada en tres paquetes principales:

src/
├── model/
│     ├── UnidadOperativa.java
│     ├── CentroCultivo.java
│     └── PlantaProceso.java
│
├── data/
│     └── GestorUnidades.java
│
└── ui/
└── Main.java

---

## 📚 Clases implementadas

### 🔹 **model/**
Contiene la jerarquía principal:

### **UnidadOperativa (superclase)**
- Atributos: `nombre`, `comuna`
- Contiene constructor base y método `toString()`
- Es la clase general que representa cualquier unidad de la empresa.

### **CentroCultivo (subclase)**
- Hereda de `UnidadOperativa`
- Atributo adicional: `toneladasProduccion`
- Sobrescribe `toString()` para mostrar toda su información.

### **PlantaProceso (subclase)**
- Hereda de `UnidadOperativa`
- Atributo adicional: `capacidadProceso`
- Sobrescribe `toString()` para incluir su información específica.

---

### 🔹 **data/GestorUnidades**
Clase encargada de:

- Crear instancias de prueba de ambas subclases.
- Mostrar su información por consola.
- Centralizar la generación de datos del sistema.

---

### 🔹 **ui/Main**
Clase principal del programa.  
Ejecuta:

1. Un mensaje inicial informativo
2. Llamado a `GestorUnidades`
3. Muestra las unidades creadas mediante `toString()`

---

## ▶️ **Cómo ejecutar el programa**

1. Abrir el proyecto en IntelliJ IDEA
2. Navegar a: src/ui/Main.java 
3. Hacer clic en el botón **Run ▶️**
4. La consola mostrará:

=== Unidades Operativas Salmontt ===
   Unidad Operativa: Centro Hornopirén | Comuna: Hualaihué | Toneladas de Producción: 1200.5
   Unidad Operativa: Centro Pichicolo | Comuna: Calbuco | Toneladas de Producción: 900.2
   Unidad Operativa: Planta Puerta Sur | Comuna: Puerto Montt | Capacidad de Proceso: 500 toneladas/día
   Unidad Operativa: Planta Maillen | Comuna: Maillen | Capacidad de Proceso: 700 toneladas/día

---

## ✔️ Estado de la actividad

- Estructura de paquetes implementada
- Jerarquía de clases creada correctamente
- Herencia funcionando
- Sobrescritura aplicada
- Programa ejecutable y probado
- Proyecto listo para subir a GitHub y entregar en AVA

---

## 👩‍💻 Autora

Proyecto desarrollado por **Javiera Gutiérrez**, estudiante de Desarrollo de Aplicaciones, como parte del módulo de Programación Orientada a Objetos.