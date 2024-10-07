# Datos de las UEA

Este proyecto tiene como objetivo gestionar y consultar información sobre las Unidades de Educación Aprobadas (UEA) de la universidad. A partir de un archivo proporcionado, se obtiene información relevante sobre cada UEA, incluyendo su clave, nombre, y horas teóricas y prácticas.

## Información Recopilada

La información almacenada incluye:

- **Clave de la UEA**: Identificador único de cada UEA.
- **Nombre de la UEA**: Nombre descriptivo de la UEA.
- **Cantidad de horas teóricas**: Horas dedicadas a la teoría.
- **Cantidad de horas prácticas**: Horas dedicadas a la práctica.

### Cálculo de Créditos

El total de créditos de una UEA se calcula como:
\[ \text{total de créditos} = \text{horas teóricas} \times 2 + \text{horas prácticas} \]
Por ejemplo, una UEA con 4.5 horas teóricas y 1 hora práctica tendrá 10 créditos.

## Consultas Requeridas

La universidad solicita poder realizar las siguientes consultas:

1. **Consultar UEA por clave**: Al proporcionar una clave, se mostrarán todos los datos de la UEA, incluyendo los créditos. Si se introduce una clave que no existe, se debe imprimir “Uea no válida”.
   
2. **Consultar UEA por departamento**: Proporcionar el número que representa al departamento (entre 1 y 5) para conocer el nombre y clave de las UEA que pertenecen a ese departamento. El tercer dígito de la clave de la UEA indica a qué departamento pertenece.

3. **Clasificación de UEA según horas**: Con base en un valor ingresado (0, 1 o 2), se podrá conocer:
   - **0**: UEA con solo horas teóricas.
   - **1**: UEA con solo horas prácticas.
   - **2**: UEA con tanto horas prácticas como teóricas.

## Consideraciones

- Se debe contar con una estructura que represente la UEA.
- La información se cargará desde un archivo en una lista ligada (la elección de insertar al inicio o al final será libre).
- Es opcional crear todo el programa en un solo archivo `.cpp` o usar varios y sus encabezados.

## Estructura del Proyecto

- **main.cpp**: Contiene el código fuente del programa que gestiona las UEA y realiza las consultas.
- **lista.hpp**: Contiene la estructra de una Lista y la firma de las funciones de una lista.
- **lista.cpp**: Contiene la implementación de las funciones de una lista.
- **nodo.hpp**: Contiene la estructura de un nodo.
- **uea.hpp**: Contiene la esructura de una uea.
- **datos_uea.txt**: Contiene los datos de las uea que se van a gestionar.
- **README.md**: Este archivo, que proporciona información general sobre el proyecto.

## Contribuciones
Las contribuciones son bienvenidas. Si tienes sugerencias o mejoras, no dudes en abrir un issue o enviar un pull request. Apreciaré cualquier aporte que ayude a mejorar la calidad del contenido en este repositorio.

## 🌐 Connect with me:
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/cris7cf/)
