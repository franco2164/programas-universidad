# Práctica 1 - Laboratorio de Programación Orientada a Objetos

## Descripción

Esta práctica tiene como objetivo el desarrollo de una aplicación en Java basada en los principios de diseño de la Programación Orientada a Objetos. El alumno implementará las clases siguiendo el diagrama proporcionado, utilizando herencia y aplicando los métodos y atributos correspondientes.

## Estructura del Proyecto

El proyecto consiste en la implementación de las siguientes clases:

- `Persona`: Clase base que contiene los atributos `nombre`, `apellidoPaterno` y `apellidoMaterno`.
- `Alumno`: Hereda de `Persona`, tiene los atributos `trimestreIngreso`, `unidad`, y el método `generarMatricula()`.
- `Trabajador`: Hereda de `Persona`, con el atributo `numEconomico`.
- `Profesor`: Hereda de `Trabajador`, con el atributo `curp` y los métodos `obtenerSexo()`, `obtenerEdoNacimiento()` y `validarCurp()`.
- `Administrativo`: Hereda de `Trabajador`, con el atributo `fechaNacimiento` y el método `generarRFC()`.

## Funcionalidades

1. **generarMatricula()** (en `Alumno`): Genera el número de matrícula para un alumno.
2. **obtenerSexo()** y **obtenerEdoNacimiento()** (en `Profesor`): Extraen el sexo y el estado de nacimiento a partir de la CURP.
3. **validarCurp()** (en `Profesor`): Valida que la CURP esté compuesta correctamente según las reglas establecidas.
4. **generarRFC()** (en `Administrativo`): Genera un RFC con una homoclave aleatoria.

## Requisitos

- Aplicar el principio de encapsulamiento en todas las clases.
- Crear constructores por defecto y con parámetros (utilizando `super` cuando sea necesario).
- Implementar métodos de acceso (`getters` y `setters`).
- Inicializar los objetos de manera estática (por ejemplo: `unAlumno.setNombre("Luis")`).
- Dividir métodos extensos en otros más pequeños si realizan más de una funcionalidad.

## Notas

- Asegurarse de que los métodos solo realicen una funcionalidad.
- Verificar la validez de la CURP al generar el RFC.

## Contribuciones
Las contribuciones son bienvenidas. Si tienes sugerencias o mejoras, no dudes en abrir un issue o enviar un pull request. Apreciaré cualquier aporte que ayude a mejorar la calidad del contenido en este repositorio.

## 🌐 Connect with me:
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/cris7cf/)
