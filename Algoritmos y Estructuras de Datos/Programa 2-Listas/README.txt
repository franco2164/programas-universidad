Datos de las UEA
La Universidad quiere conocer información sobre sus uea, y sabiendo que eres muy
bueno programando estructuras de datos, te ha pedido ayuda, para esto, te ha
proporcionado un archivo que tiene la siguiente información:
 Clave de la uea
 Nombre de la uea
 Cantidad de horas teóricas
 Cantidad de horas prácticas
Lo que la Universidad quiere consultar es lo siguiente:
1. Al proporcionar una clave, escribir todos los datos de la uea, incluyendo los créditos, sin embargo, por un detalle, esta información no se ha proporcionado, sin embargo, es
sencilla de calcular. total de créditos = horas teóricas *2 + horas prácticas
Por ejemplo, una uea que tiene 4.5 horas teóricas y tiene 1 hora práctica tendrá 10
créditos. Considerar que si se introduce una clave que no existe, se deberá imprimir “Uea no válida”. 2. Quiere conocer el nombre y clave de las uea que forman parte de un cierto
Departamento, pero también hubo un detalle con este dato, no se incluyó el
identificador del Departamento, pero no hay problema, el tercer dígito de la clave de la
carrera indica el departamento al que pertenece la uea, por ejemplo la uea con clave
1151038 pertenece al Departamento 5, mientras que la uea 1112042 pertenece al
Departamento 1. La entrada de esta pregunta será el número que representa al
Departamento (entre 1 y 5), solo se introducirán números de Departamento válidos. 3. A partir de un valor, quiere conocer qué uea tienen: solo horas prácticas, que uea
tienen solo horas teóricas y cuáles tienen tanto horas prácticas como teóricas, para esto, se ingresará un 0 cuando se quieran conocer todos los datos de las uea que tienen solo
horas teóricas, un 1, cuando sean las que tienen solo horas prácticas y un 2 cuando se
quiera conocer las que tienen tanto horas teóricas como prácticas. Consideraciones:
 Se deberá contar con una estructura que represente la uea
 Se deberá cargar la información del archivo en una lista ligada (la elección de
insertar al inicio o al final, será libre)
 Es libre la elección de crear todo el programa en un solo archivo .cpp o usar varios y
sus encabezados.