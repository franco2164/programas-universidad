#include <iostream>
#include <fstream> // Biblioteca para el manejo de archivos
#include <sstream>// Biblioteca para el uso de stream
#include <string>
#include "monticulo.hpp"

using namespace std;

int main(){

    Monticulo monticulo[30];
    Estudiante estudiante;
    string matricula, clave, promedio, lineaLeida;

    ifstream archivoEntrada("promedios.txt"); //Se declara el tipo archivo de entrada
    
    if(archivoEntrada.is_open()){
        while(getline(archivoEntrada, lineaLeida)){
            /*Separando los elementos de la cadena*/
            stringstream stream(lineaLeida); // Se pasa la cadena a un tipo stream

            //Se va obteniendo cada dato por separado, recordar que el
            //archivo est� separado por coma ','


            getline(stream, matricula, ','); //getline solo maneja string
            getline(stream, clave, ',');
            getline(stream, promedio, ',');

            estudiante. matricula=matricula;
            estudiante.clave=clave;
            estudiante.promedio = stof(promedio); //convirtiendo string a float

            //Se manda a insertar el estudiante al monticulo
            insertar(monticulo, estudiante);
        }
    }else{
        cout << "El archivo no se pudo abrir"<<endl;
    }

    //Se imprime el monticulo
    cout<<"Monticulo"<<endl;
    imprimir(monticulo);

    //Se extraen 10 de los alumnos de mayor a menor promedio para la prueba
    cout<<"Alumnos extraidos para la prueba"<<endl;
    for(int i=0; i<10; i++){
        extraer(monticulo);
    }

    archivoEntrada.close(); //Se cierra el archivo
    
    return 0;

}
