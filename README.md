# 🏞️ LlanquihueTourApp

Sistema desarrollado en **Java** utilizando **IntelliJ IDEA** como parte de las evaluaciones de la asignatura **Programación Orientada a Objetos** de **Duoc UC**.

El proyecto ha evolucionado de forma incremental, incorporando en cada evaluación nuevos conceptos de Programación Orientada a Objetos, tales como encapsulamiento, manejo de archivos, colecciones, herencia, polimorfismo y reutilización de código.

---

# 👤 Autor

**Nombre:** Pablo Márquez Barría

**Carrera:** Analista Programador

**Institución:** Duoc UC

---

# 🎯 Objetivo del proyecto

Desarrollar una aplicación Java que implemente los principios fundamentales de la Programación Orientada a Objetos mediante una arquitectura modular, organizada por paquetes y basada en reutilización de código, herencia y polimorfismo.

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
│   └── ExcursionCultural.java
│
├── data
│   └── GestorServicios.java
│
├── ui
│   └── Main.java
│
├── service
│   └── (clases desarrolladas en evaluaciones anteriores)
│
├── util
│   └── (clases auxiliares)
│
└── resources
    └── tours.txt
```

---

# 📦 Descripción de los paquetes

## 📁 model

Contiene la jerarquía de clases que representa los distintos servicios turísticos.

### Superclase

* **ServicioTuristico**

Atributos comunes:

* nombre
* duracionHoras

Métodos principales:

* mostrarInformacion()
* toString()

### Subclases

* RutaGastronomica
* PaseoLacustre
* ExcursionCultural

Cada subclase:

* Hereda de **ServicioTuristico**.
* Utiliza el constructor mediante `super(...)`.
* Sobrescribe los métodos `mostrarInformacion()` y `toString()` utilizando `@Override`.

---

## 📁 data

Contiene la clase **GestorServicios**, responsable de:

* Crear objetos de las distintas subclases.
* Administrar una colección `List<ServicioTuristico>`.
* Recorrer la colección aplicando polimorfismo.

---

## 📁 ui

Contiene la clase **Main**, encargada de iniciar la ejecución del programa.

---

## 📁 service

Incluye las clases desarrolladas en evaluaciones anteriores relacionadas con la lógica de negocio.

---

## 📁 util

Contiene clases reutilizables de apoyo, como lectura de archivos y métodos auxiliares.

---

## 📁 resources

Contiene archivos utilizados por el proyecto en evaluaciones anteriores, como datos de prueba.

---

# 🛠 Tecnologías utilizadas

* Java
* IntelliJ IDEA
* Git
* GitHub

---

# 🚀 Funcionalidades implementadas

* Organización del proyecto mediante paquetes.
* Encapsulamiento utilizando atributos privados.
* Constructores.
* Métodos Getters y Setters.
* Método `toString()`.
* Lectura de archivos.
* Manejo de excepciones mediante `try-catch`.
* Uso de colecciones (`ArrayList` y `List`).
* Implementación de herencia.
* Sobrescritura de métodos mediante `@Override`.
* Implementación de polimorfismo.
* Recorrido de colecciones utilizando `for-each`.
* Reutilización de código mediante superclases.

---

# 📚 Conceptos de Programación Orientada a Objetos aplicados

* Clases y Objetos
* Encapsulamiento
* Constructores
* Getters y Setters
* Organización por paquetes
* Método `toString()`
* Lectura de archivos
* Manejo de excepciones
* Colecciones (`ArrayList` y `List`)
* Herencia
* Polimorfismo
* Sobrescritura de métodos (`@Override`)
* Uso de `super()`
* Recorrido de colecciones con `for-each`

---

# ▶️ Cómo ejecutar el proyecto

1. Clonar el repositorio.

```bash
git clone https://github.com/pamarquezb-debug/Llanquihue-Tour-2.git
```

2. Abrir el proyecto en **IntelliJ IDEA**.

3. Ejecutar la clase:

```text
ui/Main.java
```

4. El programa mostrará en consola la información de los distintos servicios turísticos utilizando una colección polimórfica.

---

# 📈 Evolución del proyecto

| Evaluación       | Contenido desarrollado                                                                 |
| ---------------- | -------------------------------------------------------------------------------------- |
| Evaluación 1     | Organización del proyecto y creación de clases.                                        |
| Evaluación 2     | Encapsulamiento, constructores y métodos.                                              |
| Evaluación 3     | Lectura de archivos y uso de colecciones.                                              |
| Evaluación 4     | Manejo de excepciones y validaciones.                                                  |
| Evaluación 5     | Herencia y jerarquía de clases.                                                        |
| **Evaluación 6** | **Polimorfismo, colección `List<ServicioTuristico>` y recorrido mediante `for-each`.** |

---

# 🚀 Repositorio GitHub

**Repositorio:**

```text
https://github.com/pamarquezb-debug/Llanquihue-Tour-2
```

---

# 📄 Licencia

Proyecto desarrollado con fines académicos para la asignatura **Programación Orientada a Objetos** de **Duoc UC**.
