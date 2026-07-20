# 🌋 LlanquihueTourApp

## Descripción

**LlanquihueTourApp** es un sistema desarrollado en Java para gestionar los principales procesos de una agencia de turismo ubicada en la Región de Los Lagos.

El proyecto fue desarrollado aplicando los principios de la Programación Orientada a Objetos (POO), permitiendo administrar personas, servicios turísticos y otras entidades mediante una estructura modular y reutilizable.

---

## Autor

**Pablo Márquez Barría**

Ingeniería en Informática  
Duoc UC

---

# Objetivo

Desarrollar un sistema orientado a objetos que permita administrar los servicios turísticos de la agencia Llanquihue Tour, aplicando buenas prácticas de programación, reutilización de código y organización mediante paquetes.

---

# Estructura del proyecto

```text
src
│
├── ui
│   └── Main.java
│
├── model
│   ├── Persona.java
│   ├── Direccion.java
│   ├── Rut.java
│   ├── GuiaTuristico.java
│   ├── Vehiculo.java
│   ├── ColaboradorExterno.java
│   ├── ServicioTuristico.java
│   ├── RutaGastronomica.java
│   ├── PaseoLacustre.java
│   ├── ExcursionCultural.java
│   └── Registrable.java
│
├── data
│   ├── GestorEntidades.java
│   └── GestorServicios.java
│
├── util
│   ├── ArchivoUtil.java
│   └── RutInvalidoException.java
│
└── resources
    └── tours.txt
```

---

# Clases principales

## Persona

Clase base que representa a las personas relacionadas con la agencia.

Contiene:

- Nombre.
- Objeto `Rut`.
- Objeto `Direccion`.

---

## Direccion

Representa la dirección de una persona.

Contiene:

- Calle.
- Ciudad.
- Región.

---

## Rut

Clase encargada de:

- Validar el formato del RUT.
- Validar el dígito verificador mediante módulo 11.
- Formatear el RUT.
- Lanzar una excepción cuando el RUT es inválido.

---

## GuiaTuristico

Hereda de `Persona`.

Representa un guía turístico con su especialidad.

---

## ColaboradorExterno

Hereda de `Persona`.

Representa colaboradores externos asociados a la agencia y el servicio que prestan.

---

## Vehiculo

Representa los vehículos utilizados para transportar turistas.

---

## ServicioTuristico

Clase padre de los distintos servicios turísticos disponibles.

---

## RutaGastronomica

Especialización de `ServicioTuristico`.

---

## PaseoLacustre

Especialización de `ServicioTuristico`.

---

## ExcursionCultural

Especialización de `ServicioTuristico`.

---

## GestorEntidades

Administra las entidades registradas mediante una colección de objetos.

Permite:

- Registrar entidades.
- Recorrer las entidades almacenadas.
- Mostrar todos los registros.

---

## GestorServicios

Gestiona los distintos servicios turísticos disponibles.

---

## ArchivoUtil

Clase auxiliar destinada a la lectura de archivos de texto con datos de prueba.

---

# Conceptos de Programación Orientada a Objetos utilizados

## Encapsulamiento

Los atributos se declaran como privados y se accede a ellos mediante constructores, getters y setters.

---

## Herencia

```text
Persona
├── GuiaTuristico
└── ColaboradorExterno

ServicioTuristico
├── RutaGastronomica
├── PaseoLacustre
└── ExcursionCultural
```

---

## Polimorfismo

Las entidades se almacenan mediante una colección basada en la interfaz `Registrable`.

```java
ArrayList<Registrable>
```

Esto permite guardar distintos tipos de objetos en una misma colección.

---

## Interfaces

Se implementa la interfaz:

```text
Registrable
```

Cada clase implementa su propia versión del método:

```java
mostrarResumen()
```

---

## Sobrescritura

Se utiliza la anotación:

```java
@Override
```

para redefinir métodos heredados o definidos por una interfaz.

---

## Composición

La clase `Persona` contiene objetos de tipo:

```text
Rut
Direccion
```

De esta manera, los datos no se almacenan solamente como cadenas de texto, sino como objetos con responsabilidades propias.

---

## Validación mediante excepciones

Se implementa la excepción personalizada:

```text
RutInvalidoException
```

Esta excepción se utiliza cuando:

- El RUT está vacío.
- El formato del RUT no es válido.
- El dígito verificador es incorrecto.

---

# Funcionalidades

- Registrar guías turísticos.
- Registrar vehículos.
- Mostrar entidades registradas.
- Validar automáticamente el RUT.
- Registrar la dirección de los guías turísticos.
- Gestionar servicios turísticos.
- Mostrar información mediante una interfaz gráfica desarrollada con Swing.
- Utilizar colecciones para almacenar distintos tipos de objetos.
- Manejar errores mediante excepciones personalizadas.

---

# Tecnologías utilizadas

- Java 17.
- IntelliJ IDEA.
- Java Swing.
- Git.
- GitHub.

---

# Cómo ejecutar

1. Clonar el repositorio:

```bash
git clone https://github.com/pamarquezb-debug/LlanquihueTourApp.git
```

2. Abrir el proyecto en IntelliJ IDEA.

3. Esperar a que IntelliJ cargue la configuración del proyecto.

4. Ejecutar la clase:

```text
ui.Main
```

---

# Estado del proyecto

Proyecto desarrollado como trabajo académico para la asignatura de Programación Orientada a Objetos.

Actualmente incorpora:

- Encapsulamiento.
- Herencia.
- Polimorfismo.
- Interfaces.
- Composición.
- Sobrescritura de métodos.
- Excepciones personalizadas.
- Validación de RUT.
- Interfaz gráfica con Swing.
- Colecciones de objetos.
- Organización mediante paquetes.
- Control de versiones con Git y GitHub.

---

# Licencia

Proyecto desarrollado con fines educativos.