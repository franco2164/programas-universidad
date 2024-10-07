#include <iostream>
#include <fstream> // Biblioteca para el manejo de archivos
#include <sstream>// Biblioteca para el uso de stream
#include <string>
#include "lista.hpp"
#include "nodo.hpp"

using namespace std;

int main(){

    Lista lista;
    Uea uea;
    string horasTeoricas;
    string horasPracticas;
    string lineaLeida;

    inicializacion(&lista);

    if(esVacia(&lista)){
        ifstream archivoEntrada; //Se declara el tipo archivo de entrada
        archivoEntrada.open("datos_uea.txt");
        if(archivoEntrada){
           while(!archivoEntrada.eof()){
              getline(archivoEntrada,lineaLeida); // Como la cadena tiene espacios, se usa getline()

              /*Separando los elementos de la cadena*/
              stringstream stream(lineaLeida); // Se pasa la cadena a un tipo stream

              //Se va obteniendo cada dato por separado, recordar que el
              //archivo est� separado por coma ','


              getline(stream, uea.clave, ','); //getline solo maneja string
              getline(stream, uea.nombre, ',');
              getline(stream, horasTeoricas, ',');
              getline(stream, horasPracticas, ',');

              uea.horasTeoricas = stof(horasTeoricas); //convirtiendo string a float
              uea.horasPracticas = stof(horasPracticas); //convirtiendo string a float

              insertarInicio(&lista,uea);


              }
        }
        else{
            cout << "El archivo no se pudo abrir";
        }
        archivoEntrada.close(); //Se cierra el archivo
    }
    else{
        cout << "Esta lista tiene elementos" << endl;
    }
        //Prueba para buscar elementos con la clave
        //clave valida
        buscarElemento(&lista, "1151042");
       //clave no valida
        buscarElemento(&lista, "1112000");

        //Prueba para buscar elementos por departamento
        //Departamento valido
        buscarElementoPorDepartamento(&lista, "5");
       //departamento no valido
        buscarElementoPorDepartamento(&lista, "6");

        //Prueba para buscar uea por horas
        //Prueba para uea con solo horas teoricas
        cout<<"UEA con solo horas teroicas"<<endl;
        buscarUEAporHoras(&lista, 0);
        //Prueba para buscar uea con solo horas practicas
        cout<<"UEA con solo horas practicas"<<endl;
        buscarUEAporHoras(&lista,1);
        //Prueba para buscar uea con horas teoricas y horas practicas
        cout<<"UEA con horas teroicas y horas practicas"<<endl;
        buscarUEAporHoras(&lista,2);

        return 0;
    }
