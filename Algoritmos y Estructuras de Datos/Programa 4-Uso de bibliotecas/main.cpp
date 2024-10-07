#include <iostream>
#include <fstream>
#include <sstream>
#include <ctime>
#include <cstdlib>
#include <vector>
#include <map>


/**

Este programa deberá¡ preguntar al usuario el símbolo de
* 10 elementos de la tabla periódica. Para cada elemento,
* se mostrará¡ si el símbolo introducido  es correcto (Correcto) o no (Error) y al
* finalizar, mostrará¡ el número de aciertos que se tuvieron.
**/

using namespace std;

struct Elemento{
    string nombre;
    string simbolo;
};

//Funciones declaradas
void llenarEstructuras();
Elemento obtenerElementoPregunta();
int calificarRespuesta(string, map <string, string>, Elemento);

//El vector de nombres de elementos
vector<Elemento> nombres;

//El map de los elementos
map <string, string> elementos;


int main(){

    Elemento pregunta;
    string simboloRespuesta;
    int correctas=0;

    //Llenado a partir del archivo
    llenarEstructuras();

    for(int i=0;i<10;i++){
            //Pregunta el símbolo a partir del nombre
            pregunta = obtenerElementoPregunta();
            cout << "Dame el simbolo del elemento " << pregunta.nombre <<": ";
            cin >> simboloRespuesta;

            correctas+= calificarRespuesta(simboloRespuesta, elementos, pregunta);

       }

    cout<<"Respuestas correctas: "<< correctas <<endl;


}

/**
 * Esta función recorre el archivo y llena el vector de nombres
 *
 * **/
void llenarEstructuras(){

    ifstream archivoEntrada;
    string lineaLeida;
    Elemento elemento;
    archivoEntrada.open("elementos.txt");

    if(archivoEntrada){
        while(!archivoEntrada.eof()){
             getline(archivoEntrada,lineaLeida);

             if (lineaLeida.length() > 0){
              stringstream stream(lineaLeida); // Se pasa la cadena a un tipo stream

            //Se va obteniendo cada dato por separado, recordar que el
            //archivo estÃ¡ separado por coma ','
            getline(stream, elemento.nombre, ',');
            getline(stream, elemento.simbolo, ',');

            //Se inserta el elemento en el vector de elementos
            nombres.push_back(elemento);

            //Se inserta en el map
            elementos.insert(make_pair(elemento.simbolo,elemento.nombre));
            }
        }

        archivoEntrada.close(); //Se cierra el archivo

    }

}


/**
 * Esta función regresa un
 * elemento que es del que se va a preguntar
 * el símbolo
 *
 * */
Elemento obtenerElementoPregunta (){

	Elemento elemento;
    srand((unsigned)time(NULL));
    int n;
    //Genera un aleatorio entre 0 y 117
    n=rand()%118;

    elemento = nombres[n];

    return elemento;

}

/**
Debe calificar, de alguna manera, si el símbolo
que escribe³ el usuario (simboloRespuesta) es el del elemento buscado
**/
int calificarRespuesta(string simboloRespuesta, map <string, string> elementos, Elemento elemento){
    map <string, string>::iterator iterador;
	iterador=elementos.find(simboloRespuesta);

   if(iterador!=elementos.end()&& iterador->first==elemento.simbolo){
        cout<< "Correcto"<<endl;
        return 1;
    }else{
        cout<<"Error"<<endl;
        return 0;
    }
}
