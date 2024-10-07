# Práctica 2

## Descripción

En esta parte de la práctica, se desarrollará un sistema en Java que permita gestionar las notas de venta de una papelería. Cada nota de venta incluirá un folio de identificación, fecha y hora de emisión, los datos del cliente y una lista de productos adquiridos.

### Clases principales:

- **Nota**: Contiene los atributos `folio`, `fecha`, `hora`, `cliente` y una lista de `productos`. Las propiedades `fecha` y `hora` se obtienen automáticamente del sistema al crear una nueva instancia.
- **Cliente**: Posee los atributos `nombre`, `teléfono` y `dirección`.
- **Producto**: Incluye los atributos `cantidad`, `descripción` y `precio`.

## Funcionalidades

1. **Generar fecha y hora automáticamente**: Las instancias de la clase `Nota` asignarán los valores de `fecha` y `hora` en el momento de su creación, utilizando la hora del sistema.
2. **Método de total a pagar**: La clase `Nota` debe incluir un método que calcule el total a pagar desglosando el IVA (16%).
3. **Promoción**: Las compras realizadas a partir de las 12:00 hrs recibirán un descuento automático del 10%.

## Requisitos

- **Diagrama UML**: Diseñar el diagrama de clases incluyendo todos los atributos, constructores y métodos de acceso.
- **Codificación en Java**: Implementar las clases descritas en Java.
- **Método principal**: Crear una clase `Principal` que permita generar una instancia de `Nota` y mostrar el desglose de la compra con IVA y descuentos.

## Ejemplo de Salida

La salida del programa incluirá:

- Detalle de la nota (folio, fecha, hora).
- Información del cliente (nombre, teléfono, dirección).
- Lista de productos adquiridos con cantidad, descripción y precio.
- Total a pagar con IVA y descuento, si aplica.

## Contribuciones
Las contribuciones son bienvenidas. Si tienes sugerencias o mejoras, no dudes en abrir un issue o enviar un pull request. Apreciaré cualquier aporte que ayude a mejorar la calidad del contenido en este repositorio.

## 🌐 Connect with me:
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/cris7cf/)

