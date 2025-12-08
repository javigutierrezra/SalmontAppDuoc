# SalmonttApp - Semana 7
Actividad: Aplicando polimorfismo y colecciones genéricas

## Descripción

En esta semana se extendió la jerarquía de clases de las unidades operativas de la empresa
Salmontt, aplicando:

- **Polimorfismo** a través de la superclase `UnidadOperativa` y las subclases
  `CentroCultivo` y `PlantaProceso`.
- Uso de una **colección genérica** `List<UnidadOperativa>` en la clase `GestorUnidades`.
- **Sobrescritura de métodos** mediante `mostrarInformacion()` en cada subclase, invocado
  desde referencias del tipo `UnidadOperativa`.

## Estructura de paquetes

- `model/`
    - `UnidadOperativa.java`
    - `CentroCultivo.java`
    - `PlantaProceso.java`
- `data/`
    - `GestorUnidades.java`
- `ui/`
    - `Main.java` (opcional para pruebas)

## Cómo compilar y ejecutar (IntelliJ IDEA)

1. Abrir el proyecto `SalmonttApp` en IntelliJ IDEA.
2. Verificar que el SDK de Java esté configurado (por ejemplo, Java 17).
3. Asegurar que la clase `Main` esté en el paquete `ui` y tenga el método:

   ```java
   public static void main(String[] args) { ... }
---

## 👩‍💻 Autora

Proyecto desarrollado por **Javiera Gutiérrez**, estudiante de Desarrollo de Aplicaciones.