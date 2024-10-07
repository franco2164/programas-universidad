# Programa de Ordenamiento de Unidades de Educación Aprobadas (UEA)

Este proyecto tiene como objetivo crear un programa en C++ que ordene las Unidades de Educación Aprobadas (UEA) de diferentes departamentos en la DCBI. A partir de los archivos correspondientes a cada departamento, el programa permitirá al usuario seleccionar dos departamentos, cargar la información y ordenar las UEA por nombre utilizando los algoritmos de Quicksort y Mergesort.

## Archivos de Entrada

Los datos de las UEA se almacenan en los siguientes archivos de texto:

1. **Ciencias Básicas**: `cb.txt`
2. **Electrónica**: `ele.txt`
3. **Energía**: `ene.txt`
4. **Materiales**: `mat.txt`
5. **Sistemas**: `sis.txt`

## Funcionalidad

El programa realizará las siguientes acciones:

1. **Selección de Departamentos**: Solicitará al usuario que elija dos departamentos (números del 1 al 5).
2. **Carga de Datos**: Cargará la información de las UEA de los departamentos seleccionados en arreglos.
3. **Ordenamiento**: 
   - Utilizará el algoritmo de **Quicksort** para ordenar las UEA del primer departamento por nombre.
   - Utilizará el algoritmo de **Quicksort** para ordenar las UEA del segundo departamento por nombre.
   - Combinará ambos arreglos y ordenará el resultado usando **Mergesort**.
4. **Salida de Resultados**: Mostrará la información de las UEA (Nombre - Clave) ordenadas por nombre para:
   - El primer departamento seleccionado.
   - El segundo departamento seleccionado.
   - El arreglo combinado y ordenado de ambos departamentos.

## Consideraciones

- Se deben implementar los algoritmos de ordenamiento solicitados (Quicksort y Mergesort).
- No se permite el uso de funciones de ordenamiento de bibliotecas, aunque se puede utilizar la biblioteca `vector`.

## Estructura del Proyecto

- **main.cpp**: Contiene el código fuente del programa que realiza la carga y el ordenamiento de las UEA.
- **cb.txt**: Contiene uea de Ciencias Básicas.
- **ele.txt**: Contiene uea de Electrónica.
- **ene.txt**: Contiene uea de Energía.
- **mat.txt**: Contiene uea de Materiales.
- **sis.txt**: Contiene uea de Sistemas.
- **README.md**: Este archivo, que proporciona información general sobre el proyecto.

## Contribuciones
Las contribuciones son bienvenidas. Si tienes sugerencias o mejoras, no dudes en abrir un issue o enviar un pull request. Apreciaré cualquier aporte que ayude a mejorar la calidad del contenido en este repositorio.

## 🌐 Connect with me:
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/cris7cf/)
