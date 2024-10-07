#include <iostream>
#include "lista.hpp"

using namespace std;

void inicializacion(Lista *lista){
    lista->cabeza=NULL;
    lista->longitud = 0;
}

bool esVacia(Lista *lista){
    if(lista->cabeza==NULL){
        return true;
    }
    else{
        return false;
    }
}

void insertarInicio(Lista *lista, Uea uea){
	Nodo *nuevoNodo = new (Nodo);
	nuevoNodo->valor=uea;
	nuevoNodo->siguiente = NULL;

	nuevoNodo->siguiente = lista->cabeza;
	lista->cabeza = nuevoNodo;
	lista->longitud+=1;
}

void buscarElemento(Lista *lista, string clave){

    Nodo *nodoActual;
    nodoActual = lista->cabeza;
    float totalCreditos = 0.0;
    bool encontrado = false;

    while (nodoActual != NULL){
        if(nodoActual->valor.clave==clave){
            totalCreditos=(nodoActual->valor.horasTeoricas*2) + nodoActual->valor.horasPracticas;
            cout<<"Clave de la uea: "<< nodoActual->valor.clave<<endl;
            cout<<"Nombre de la uea: "<<nodoActual->valor.nombre<<endl;
            cout<<"Horas teoricas de la uea: "<<nodoActual->valor.horasTeoricas<<endl;
            cout<<"Horas practicas de la uea: "<<nodoActual->valor.horasPracticas<<endl;
            cout<<"Total de creditos de la uea: "<<totalCreditos<<endl;
            cout<<endl;
            encontrado=true;
            break;
        }else{
            nodoActual = nodoActual->siguiente;
        }
    }


    if (!encontrado) {
        cout << "UEA no valida" << endl;
        cout<<endl;
    }
}

void buscarElementoPorDepartamento(Lista *lista, string dep){
     Nodo *nodoActual;
    nodoActual = lista->cabeza;
    bool encontrado = false;

    cout<<"Departamento  "<<dep<<endl;
    while (nodoActual != NULL){
        if(nodoActual->valor.clave[2]==dep[0]){
            cout<<"Clave: "<< nodoActual->valor.clave<<", ";
            cout<<"Nombre: "<<nodoActual->valor.nombre<<endl;
            cout<<endl;
            encontrado=true;
        }
            nodoActual = nodoActual->siguiente;
    }

    if (!encontrado) {
        cout << "Departamento no valido" << endl;
        cout<<endl;
    }

}

void buscarUEAporHoras(Lista *lista, int criterio) {
    Nodo *nodoActual = lista->cabeza;
    bool encontrado = false;

    // Recorremos toda la lista
    while (nodoActual != NULL) {
        bool tieneTeoricas = (nodoActual->valor.horasTeoricas > 0);
        bool tienePracticas = (nodoActual->valor.horasPracticas > 0);

        if (criterio == 0 && tieneTeoricas && !tienePracticas) {
            // Solo horas teóricas
            cout << "Clave: " << nodoActual->valor.clave << ", Nombre: " << nodoActual->valor.nombre << endl;
            cout<<endl;
            encontrado = true;
        } else if (criterio == 1 && !tieneTeoricas && tienePracticas) {
            // Solo horas prácticas
            cout << "Clave: " << nodoActual->valor.clave << ", Nombre: " << nodoActual->valor.nombre << endl;
            cout<<endl;
            encontrado = true;
        } else if (criterio == 2 && tieneTeoricas && tienePracticas) {
            // Horas teóricas y prácticas
            cout << "Clave: " << nodoActual->valor.clave << ", Nombre: " << nodoActual->valor.nombre << endl;
            cout<<endl;
            encontrado = true;
        }

        nodoActual = nodoActual->siguiente;
    }
    cout<<endl;

    if (!encontrado) {
        if (criterio == 0) {
            cout << "No se encontraron UEA con solo horas teóricas." << endl;
        } else if (criterio == 1) {
            cout << "No se encontraron UEA con solo horas prácticas." << endl;
        } else if (criterio == 2) {
            cout << "No se encontraron UEA con horas teóricas y prácticas." << endl;
        }
    }
}
