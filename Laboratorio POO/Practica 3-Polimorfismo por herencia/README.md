# Práctica 3

## Descripción

Esta práctica consiste en desarrollar una aplicación en Java para gestionar los recibos de pago de los empleados de una empresa de desarrollo de software. Se aplicará el concepto de **polimorfismo** y **herencia** para calcular el sueldo neto de diferentes tipos de empleados: **Consultor**, **Personal de Soporte**, **Programador** y **Administrativo**.

### Clases Principales:

- **Empleado** (Clase base): Contiene los atributos comunes a todos los empleados como `nombre`, `número de empleado`, `sexo` y `RFC`.
- **Consultor**: Se encarga de un proyecto específico y su pago se basa en horas trabajadas.
- **Personal de Soporte**: Tiene un número de teléfono asignado y su pago también se basa en horas trabajadas.
- **Programador**: Tiene una lista de lenguajes de programación de su interés y es un empleado de base.
- **Administrativo**: Tiene una ubicación asignada y es un empleado de base.

### Interfaz:
- **IRecibo**: Define constantes como `BONO=2000`, `VALE=500`, `IMSS=0.11`, y los límites de edad para jubilación dependiendo del sexo. También incluye un método para imprimir el recibo de pago del empleado.

## Funcionalidades

1. **Cálculo de sueldo neto**:
   - Los empleados de **base** (Programadores y Administrativos) reciben un pago basado en días trabajados, con bonificaciones y descuentos por impuestos.
   - Los empleados **temporales** (Consultores y Personal de Soporte) reciben un pago por horas trabajadas, con descuentos por impuestos.
   
2. **Descuento del ISR**: 
   Se aplica un porcentaje de descuento de acuerdo a las tablas especificadas, dependiendo del tipo de empleado y su rango de percepciones.

3. **Jubilación**: 
   Implementar un método que determine si un empleado es candidato para jubilarse, basándose en su sexo y edad (usando la fecha actual del sistema).

4. **Recibo de pago**:
   Cada tipo de empleado debe tener un recibo que incluya los detalles de su pago, bonificaciones, descuentos y salario neto.

## Metodología

1. **Análisis**: Evaluar los requisitos y características de cada tipo de empleado.
2. **Diseño UML**: Crear un diagrama UML que represente la herencia entre las clases y los métodos comunes.
3. **Implementación en Java**:
   - Aplicar herencia para los atributos comunes de los empleados.
   - Utilizar polimorfismo para calcular el sueldo neto dependiendo del tipo de empleado.
4. **Interfaz IRecibo**: Implementar la interfaz con las constantes y el método para imprimir el recibo.

## Consideraciones

- Los datos de prueba pueden ser ingresados de manera estática (hard-coded).
- Mantener los métodos lo más concisos posible, dividiendo funcionalidades si es necesario.
- La clase `Principal` solo debe manejar la entrada y salida de datos, sin realizar cálculos u operaciones.

## Entregables

- Código del proyecto completo en Java.
- Diagrama UML con las clases, atributos y métodos.
- Documentación generada con Javadoc.

## Contribuciones
Las contribuciones son bienvenidas. Si tienes sugerencias o mejoras, no dudes en abrir un issue o enviar un pull request. Apreciaré cualquier aporte que ayude a mejorar la calidad del contenido en este repositorio.

## 🌐 Connect with me:
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/cris7cf/)


