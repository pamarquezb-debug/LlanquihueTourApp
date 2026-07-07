# 🏞️ LlanquihueTourApp

Sistema desarrollado en **Java** utilizando **IntelliJ IDEA** como parte de las evaluaciones de la asignatura **Programación Orientada a Objetos** de **Duoc UC**.

El proyecto ha evolucionado de forma incremental, incorporando en cada evaluación nuevos conceptos de Programación Orientada a Objetos, como encapsulamiento, manejo de archivos, colecciones, herencia, interfaces, polimorfismo y desarrollo de interfaces gráficas.

---

# 👤 Autor

**Nombre:** Pablo Márquez Barría

**Carrera:** Analista Programador

**Institución:** Duoc UC

---

# 🎯 Objetivo del proyecto

Desarrollar una aplicación Java que implemente los principios fundamentales de la Programación Orientada a Objetos mediante una arquitectura modular, organizada por paquetes y basada en reutilización de código, herencia, interfaces y polimorfismo.

---

# 📂 Estructura del proyecto

```text
LlanquihueTourApp
│
├── src
│
├── model
│   ├── Registrable.java
│   ├── Persona.java
│   ├── ServicioTuristico.java
│   ├── RutaGastronomica.java
│   ├── PaseoLacustre.java
│   ├── ExcursionCultural.java
│   ├── GuiaTuristico.java
│   ├── Vehiculo.java
│   └── ColaboradorExterno.java
│
├── data
│   ├── GestorServicios.java
│   └── GestorEntidades.java
│
├── service
│   └── (clases desarrolladas en evaluaciones anteriores)
│
├── util
│   └── (clases auxiliares)
│
├── ui
│   └── Main.java
│
└── resources
    └── tours.txt
```

---

# 📦 Descripción de los paquetes

## 📁 model

Contiene las clases que representan las entidades del sistema.

### Interfaces

* **Registrable**

Define el contrato común mediante el método:

* `mostrarResumen()`

### Jerarquía de Servicios Turísticos

**Superclase**

* ServicioTuristico

**Subclases**

* RutaGastronomica
* PaseoLacustre
* ExcursionCultural

### Jerarquía de Personas

**Clase base**

* Persona

**Subclases**

* GuiaTuristico
* ColaboradorExterno

Además, la clase:

* Vehiculo

implementa la interfaz **Registrable**.

---

## 📁 data

Contiene las clases encargadas de administrar las colecciones del sistema.

### GestorServicios

Gestiona los servicios turísticos.

### GestorEntidades

Administra una colección de tipo:

```java
ArrayList<Registrable>
```

Permite:

* Agregar entidades.
* Recorrer la colección.
* Aplicar polimorfismo.
* Identificar el tipo de objeto mediante `instanceof`.

---

## 📁 ui

Contiene la clase **Main**, responsable de iniciar la aplicación y mostrar una interfaz gráfica desarrollada con **JOptionPane**.

---

## 📁 service

Contiene la lógica de negocio desarrollada en evaluaciones anteriores.

---

## 📁 util

Incluye clases auxiliares reutilizables.

---

## 📁 resources

Contiene archivos de datos utilizados en etapas anteriores del proyecto.

---

# 🛠 Tecnologías utilizadas

* Java
* IntelliJ IDEA
* Swing (JOptionPane)
* Git
* GitHub

---

# 🚀 Funcionalidades implementadas

* Organización del proyecto mediante paquetes.
* Encapsulamiento.
* Constructores.
* Getters y Setters.
* Método `toString()`.
* Lectura de archivos.
* Manejo de excepciones.
* Uso de colecciones (`ArrayList` y `List`).
* Herencia.
* Polimorfismo.
* Interfaces.
* Sobrescritura de métodos (`@Override`).
* Uso del operador `instanceof`.
* Interfaz gráfica utilizando `JOptionPane`.
* Registro de entidades mediante formularios.
* Visualización de información desde la interfaz gráfica.

---

# 📚 Conceptos aplicados

* Programación Orientada a Objetos
* Clases y Objetos
* Encapsulamiento
* Constructores
* Getters y Setters
* Interfaces
* Herencia
* Polimorfismo
* Sobrescritura de métodos (`@Override`)
* Uso de `super()`
* `instanceof`
* Colecciones (`ArrayList` y `List`)
* Recorrido con `for-each`
* Swing (`JOptionPane`)
* Organización por paquetes

---

# ▶️ Cómo ejecutar el proyecto

1. Clonar el repositorio:

```bash
git clone https://github.com/pamarquezb-debug/LlanquihueTourApp.git
```

2. Abrir el proyecto en **IntelliJ IDEA**.

3. Ejecutar la clase:

```text
ui/Main.java
```

4. Utilizar la interfaz gráfica para registrar entidades y visualizar la información almacenada.

---

# 📈 Evolución del proyecto

| Evaluación       | Contenido desarrollado                                                                                              |
| ---------------- | ------------------------------------------------------------------------------------------------------------------- |
| Evaluación 1     | Organización del proyecto y creación de clases.                                                                     |
| Evaluación 2     | Encapsulamiento, constructores y métodos.                                                                           |
| Evaluación 3     | Lectura de archivos y uso de colecciones.                                                                           |
| Evaluación 4     | Manejo de excepciones y validaciones.                                                                               |
| Evaluación 5     | Herencia y jerarquía de clases.                                                                                     |
| Evaluación 6     | Polimorfismo y colección `List<ServicioTuristico>`.                                                                 |
| **Evaluación 7** | **Interfaces (`Registrable`), `ArrayList<Registrable>`, uso de `instanceof` e interfaz gráfica con `JOptionPane`.** |

---

# 🚀 Repositorio GitHub

**Repositorio:**

```text
https://github.com/pamarquezb-debug/LlanquihueTourApp
```

---

# 📄 Licencia

Proyecto desarrollado con fines académicos para la asignatura **Programación Orientada a Objetos** de **Duoc UC**.
