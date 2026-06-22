# 🏞️ LlanquihueTourApp

Sistema desarrollado en **Java** utilizando **IntelliJ IDEA** como parte de la evaluación de la asignatura de Programación Orientada a Objetos.

El proyecto permite administrar información de tours turísticos mediante la lectura de archivos de texto, utilizando colecciones, encapsulamiento, manejo de excepciones y una estructura organizada por paquetes.

---

## 👤 Autor

**Nombre:** Pablo Márquez Barría  
**Carrera:** Analista Programador  
**Institución:** Duoc UC

---

## 🎯 Objetivo del proyecto

Desarrollar una aplicación Java que implemente los conceptos fundamentales de la Programación Orientada a Objetos, organizando correctamente el código en paquetes y aplicando buenas prácticas de desarrollo.

---

# 📂 Estructura del proyecto

```
LlanquihueTourApp
│
├── src
│   ├── app
│   │     └── Main.java
│   │
│   ├── model
│   │     └── Tour.java
│   │
│   ├── service
│   │     └── TourService.java
│   │
│   └── util
│         └── ArchivoUtil.java
│
└── resources
      └── tours.txt
```

---

## 📦 Descripción de los paquetes

### 📁 app

Contiene la clase **Main**, encargada de iniciar la ejecución del programa.

---

### 📁 model

Contiene las clases que representan las entidades del sistema.

En este proyecto:

- Tour

Implementa:

- Atributos privados
- Constructores
- Getters y Setters
- Método `toString()`

---

### 📁 service

Contiene la lógica de negocio.

Responsabilidades:

- Leer la información del archivo.
- Almacenar los datos en un `ArrayList`.
- Gestionar los objetos Tour.
- Aplicar validaciones.

---

### 📁 util

Contiene clases de apoyo reutilizables.

Ejemplos:

- Lectura de archivos.
- Manejo de excepciones.
- Métodos auxiliares.

---

### 📁 resources

Contiene los archivos utilizados por la aplicación.

Ejemplo:

```
tours.txt
```

---

# 🛠 Tecnologías utilizadas

- Java
- IntelliJ IDEA
- Programación Orientada a Objetos
- ArrayList
- Manejo de Archivos
- Try-Catch
- Encapsulamiento
- Git
- GitHub

---

# ▶️ Cómo ejecutar el proyecto

1. Clonar el repositorio

```bash
git clone https://github.com/pamarquezb-debug/Llanquihue-Tour-2.git
```

2. Abrir el proyecto en IntelliJ IDEA.

3. Verificar que la carpeta **resources** contenga el archivo:

```
tours.txt
```

4. Ejecutar la clase:

```
Main.java
```

---

# 💻 Funcionalidades

- Lectura de datos desde archivo.
- Creación de objetos Tour.
- Almacenamiento mediante ArrayList.
- Validación de errores con try-catch.
- Visualización de la información.
- Organización mediante paquetes.

---

# 📚 Conceptos aplicados

- Programación Orientada a Objetos
- Encapsulamiento
- Constructores
- Getters y Setters
- Método toString()
- Colecciones (ArrayList)
- Lectura de archivos
- Manejo de excepciones
- Organización por paquetes

---

# 🚀 Repositorio GitHub

https://github.com/pamarquezb-debug/Llanquihue-Tour-2

---

## 📄 Licencia

Proyecto desarrollado con fines académicos para la asignatura de Programación Orientada a Objetos.
