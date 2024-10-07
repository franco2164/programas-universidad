# Práctica 6 

## Descripción
Esta práctica tiene como objetivo desarrollar una aplicación en **Java** que se conecte a una base de datos para realizar operaciones básicas de manejo de cuentas bancarias como recuperación, inserción, eliminación y modificación de información. La base de datos contiene cuentas de tres sucursales bancarias: **Azcapotzalco (AZC)**, **Cuajimalpa (CUA)** y **Xochimilco (XOC)**.

## Funcionalidades
La aplicación realizará las siguientes acciones sobre las cuentas bancarias:

1. **Balance de las sucursales**:
   - Calcular el saldo promedio de todas las cuentas por sucursal.
   - Determinar la sucursal con mayor número de cuentas abiertas.
   - Determinar la sucursal con el menor saldo total.
   - Encontrar la cuenta con el mayor y menor saldo de todas las sucursales (nombre, apellido, sucursal).

2. **Promociones**:
   - Aplicar un incremento al saldo para ciertas cuentas de acuerdo a las promociones:
     - 20% para cuentas de Azcapotzalco con saldo mayor a $1500.
     - 10% para cuentas de Cuajimalpa con saldo mayor a $1000.
     - 5% para cuentas de Xochimilco con saldo mayor a $2000.
   - Mostrar las cuentas ganadoras y el saldo actualizado.

3. **Manejo de la base de datos**:
   - Insertar una nueva cuenta en la base de datos.
   - Consultar las cuentas en la base de datos.
   - Eliminar una cuenta a partir de su número de cuenta.
   - Actualizar la sucursal de una cuenta existente.

## Clases
### 1. **ControladorBD**
   - Permite conectarse y desconectarse de la base de datos.
   - Gestiona la recuperación, inserción, eliminación y actualización de registros de la base de datos.

### 2. **Cuenta**
   - Clase que encapsula los datos de cada cuenta: número de cuenta, nombre, apellido, saldo y sucursal de apertura.

### 3. **Banco**
   - Contiene los métodos necesarios para obtener el balance requerido (promedios, cuenta con mayor/menor saldo, etc.).
   - Aplica las promociones y actualiza el saldo de los clientes que califican.

## Contribuciones
Las contribuciones son bienvenidas. Si tienes sugerencias o mejoras, no dudes en abrir un issue o enviar un pull request. Apreciaré cualquier aporte que ayude a mejorar la calidad del contenido en este repositorio.

## 🌐 Connect with me:
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/cris7cf/)
