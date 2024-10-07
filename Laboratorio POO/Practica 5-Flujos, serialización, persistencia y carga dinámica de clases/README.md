# Práctica 5

## Descripción
Esta práctica tiene como objetivo desarrollar una aplicación en **Java** que implemente un mini Bot de consultas sobre la UAM, utilizando los conceptos de **flujos y serialización de objetos**. El mini Bot recibirá consultas de texto y devolverá respuestas automáticas dependiendo del contenido del mensaje, siguiendo ciertas reglas de limpieza de texto y búsqueda de palabras clave.

## Funcionalidades del Mini Bot
El mini Bot tiene las siguientes funcionalidades:

1. **Eliminar signos de puntuación**: Remueve signos como `,`, `.`, `¡`, `!`, `¿`, `?`, `(`, `)`.
2. **Contar signos de puntuación**: Devuelve el número de signos de puntuación en el texto.
3. **Eliminar palabras vacías**: Palabras comunes como artículos, preposiciones, y conjunciones son eliminadas. Las palabras vacías consideradas son:
   - "la", "de", "el", "del", "para", "este", "los", "a", "cuando", "son", "con", "al", "como", "cual", "que", "y".
4. **Contar palabras vacías eliminadas**: Devuelve el número de palabras vacías que fueron eliminadas del texto.
5. **Contar palabras clave**: Calcula cuántas palabras clave quedaron en el texto después de la limpieza.
6. **Respuestas automáticas**: Dependiendo de las palabras clave en el texto, el mini Bot devolverá respuestas predefinidas sobre la UAM, su Unidad Azcapotzalco, el servicio médico, servicios escolares, o temas relacionados con COVID.

   Ejemplos de respuestas:
   - Si el texto contiene "uam": 
     - “Fundada en 1974 y con más de 200 mil personas egresadas, la UAM es una institución pública que ofrece en sus cinco unidades académicas. Visita: https://www.uam.mx/”
   - Si el texto contiene "uam" y "azcapotzalco":
     - “La Universidad Autónoma Metropolitana Unidad Azcapotzalco actualmente cuenta con 17 licenciaturas, divididas en 3 áreas de estudio. Visita: https://www.azc.uam.mx/”
   - Si el mensaje limpio no tiene ninguna de las palabras anteriores, pero posee por lo menos 3 palabras clave la respuesta del mini Bot será:
     - “No tengo información acerca de esa consulta”.
   - Si no contiene al menos 3 palabras clave:
     - "No entiendo tu consulta :("

7. **Preparar la respuesta**: El bot genera una respuesta que incluye:
   - Número de palabras vacías eliminadas.
   - Número de palabras clave encontradas.
   - Número de signos de puntuación.
   - La respuesta seleccionada.
   - El tiempo que tardó en generar la respuesta.

## Arquitectura Cliente-Servidor
El proyecto utiliza una arquitectura de **cliente-servidor** basada en **sockets**:

1. **Cliente**: Envía un objeto de tipo `Consulta` (que incluye el mensaje de texto y la hora de la consulta) al servidor, utilizando **serialización**.
2. **Servidor**: Recibe el objeto `Consulta`, procesa el mensaje con el mini Bot y devuelve la respuesta adecuada al cliente, utilizando **deserialización**.

## Contribuciones
Las contribuciones son bienvenidas. Si tienes sugerencias o mejoras, no dudes en abrir un issue o enviar un pull request. Apreciaré cualquier aporte que ayude a mejorar la calidad del contenido en este repositorio.

## 🌐 Connect with me:
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/cris7cf/)

