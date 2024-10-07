#include <iostream>
#include "monticulo.hpp"
using namespace std;

int nElementos = 0;

/**Función que realiza el proceso
 * de flotado en la inserción**/
void flotar(int pos,Monticulo monticulo[]){

    Estudiante aux;
    int posPadre;

    posPadre = (pos-1)/2;

    /*Se crea un montículo de máximos, el más grande
    queda como raíz.
    Si se quiere un montículo de mínimo, se
    cambia el < por un >*/
    while(monticulo[posPadre].estudiante.promedio < monticulo[pos].estudiante.promedio){

        /*Se intercambia el padre con el hijo*/
        aux = monticulo[posPadre].estudiante;
        monticulo[posPadre].estudiante = monticulo[pos].estudiante;
        monticulo[pos].estudiante = aux;

        /*Se actualiza la posición*/
        pos = posPadre;
        posPadre = (pos-1)/2;
    }

}

/**Función que realiza el proceso de
 * hundimiento en la eliminación**/
void hundir(int pos,Monticulo monticulo[]){
	int maxIndex = pos;
	Estudiante aux;
	int izq = (2 * pos) + 1;
	int der = (2 * pos) + 2;

	//Se compara con el hijo izquierdo
	if (izq < nElementos && monticulo[izq].estudiante.promedio > monticulo[maxIndex].estudiante.promedio) {
		maxIndex = izq;
	}

	//Se compara con el hijo derecho
	if (der < nElementos && monticulo[der].estudiante.promedio > monticulo[maxIndex].estudiante.promedio) {
		maxIndex = der;
	}

	//Si no es el mayor, se continúa preguntando
	if (maxIndex != pos) {
		aux = monticulo[pos].estudiante;
		monticulo[pos].estudiante = monticulo[maxIndex].estudiante;
		monticulo[maxIndex].estudiante = aux;
		hundir(maxIndex, monticulo);
	}
}

/**Inserta el elemento como último y
 * posteriormente ajusta con la flotación**/
void insertar(Monticulo monticulo[], Estudiante estudiante){

	if(nElementos == 0){
		 monticulo[0].estudiante = estudiante;
	}else{
		monticulo[nElementos].estudiante = estudiante;
		flotar(nElementos, monticulo);
	}
	 nElementos = nElementos + 1;
}

/**Función que extrae y muestra
 * el elemento en la raíz y posteriormente
 * invoca el proceso de hundimiento**/
void extraer(Monticulo monticulo[]){

	Estudiante extraido;
	if(nElementos==0){
		cout << "El monticulo esta vacio" << endl;
	}else{
		extraido = monticulo[0].estudiante;
		cout << "Se extrajo:" << extraido.matricula << ", " << extraido.clave << ", " << extraido.promedio << endl;
		monticulo[0].estudiante = monticulo[nElementos-1].estudiante;
		nElementos = nElementos - 1;
		hundir(0, monticulo);
	}

}

/**Imprimir los elementos**/
void imprimir(Monticulo monticulo[]){

    for(int i=0;i<nElementos;i++){
        cout << monticulo[i].estudiante.matricula << ", " << monticulo[i].estudiante.clave << ", " << monticulo[i].estudiante.promedio <<endl;
    }
    cout << endl;
}
