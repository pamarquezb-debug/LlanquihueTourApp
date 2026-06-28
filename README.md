# 🏞️ LlanquihueTourApp

Sistema desarrollado en **Java** utilizando **IntelliJ IDEA** como parte de las evaluaciones de la asignatura de **Programación Orientada a Objetos**.

El proyecto permite administrar información de servicios turísticos aplicando progresivamente conceptos fundamentales de la Programación Orientada a Objetos, como encapsulamiento, manejo de archivos, colecciones, organización por paquetes y, en esta etapa, herencia y reutilización de código.

---

# 👤 Autor

**Nombre:** Pablo Márquez Barría

**Carrera:** Analista Programador

**Institución:** Duoc UC

---

# 🎯 Objetivo del proyecto

Desarrollar una aplicación Java que implemente los conceptos fundamentales de la Programación Orientada a Objetos, organizando correctamente el código en paquetes y aplicando buenas prácticas de desarrollo, permitiendo la reutilización de código mediante herencia.

---

# 📂 Estructura del proyecto

```text
LlanquihueTourApp
│
├── src
│
├── model
│   ├── ServicioTuristico.java
│   ├── RutaGastronomica.java
│   ├── PaseoLacustre.java
│   ├── ExcursionCultural.java
│   └── Tour.java
│
├── data
│   └── GestorServicios.java
│
├── service
│   └── TourService.java
│
├── util
│   └── ArchivoUtil.java
│
├── ui
│   └── Main.java
│
└── resources
    └── tours.txt
```

---

# 📦 Descripción de los paquetes

## 📁 ui

Contiene la clase **Main**, encargada de iniciar la ejecución del programa.

---

## 📁 model

Contiene las clases que representan las entidades del sistema.

### Clases implementadas

* ServicioTuristico (superclase)
* RutaGastronomica
* PaseoLacustre
* ExcursionCultural
* Tour

Las subclases heredan los atributos comunes desde **ServicioTuristico**, utilizan el constructor mediante **super(...)** y sobrescriben el método **toString()** para mostrar la información completa de cada servicio.

---

## 📁 data

Contiene la clase **GestorServicios**, encargada de crear los objetos de prueba utilizados para demostrar el funcionamiento de la jerarquía de clases.

---

## 📁 service

Contiene la lógica de negocio del proyecto.

Responsabilidades:

* Leer información desde archivos.
* Gestionar objetos del sistema.
* Procesar datos.
* Aplicar validaciones.

---

## 📁 util

Contiene clases reutilizables de apoyo.

Ejemplos:

* Lectura de archivos.
* Manejo de excepciones.
* Métodos auxiliares.

---

## 📁 resources

Contiene los archivos utilizados por la aplicación.

Ejemplo:

```
tours.txt
```

---

# 🛠 Tecnologías utilizadas

* Java
* IntelliJ IDEA
* Programación Orientada a Objetos
* Herencia
* Polimorfismo
* ArrayList
* Manejo de Archivos
* Try-Catch
* Encapsulamiento
* Git
* GitHub

---

# ▶️ Cómo ejecutar el proyecto

1. Clonar el repositorio.

```bash
git clone https://github.com/pamarquezb-debug/Llanquihue-Tour-2.git
```

2. Abrir el proyecto en IntelliJ IDEA.

3. Verificar que la carpeta **resources** contenga el archivo **tours.txt** (si corresponde a la evaluación).

4. Ejecutar la clase:

```
Main.java
```

---

# 💻 Funcionalidades

* Lectura de datos desde archivos.
* Creación de objetos del sistema.
* Almacenamiento mediante ArrayList.
* Validación de errores utilizando try-catch.
* Organización mediante paquetes.
* Implementación de una jerarquía de clases.
* Reutilización de código mediante herencia.
* Sobrescritura del método `toString()`.
* Creación de distintos tipos de servicios turísticos.

---

# 📚 Conceptos aplicados

* Programación Orientada a Objetos
* Encapsulamiento
* Constructores
* Getters y Setters
* Método `toString()`
* Colecciones (`ArrayList`)
* Lectura de archivos
* Manejo de excepciones
* Organización por paquetes
* Herencia
* Polimorfismo
* Sobrescritura de métodos (`@Override`)
* Uso de `super()`

---

# 🚀 Repositorio GitHub

https://github.com/pamarquezb-debug/Llanquihue-Tour-2

---

# 📈 Evolución del proyecto

Este proyecto ha sido desarrollado de forma incremental durante las distintas evaluaciones de la asignatura, incorporando nuevos conceptos de Programación Orientada a Objetos en cada etapa, con el objetivo de construir una aplicación modular, reutilizable y escalable.

---

# 📄 Licencia

Proyecto desarrollado con fines académicos para la asignatura de **Programación Orientada a Objetos**.
