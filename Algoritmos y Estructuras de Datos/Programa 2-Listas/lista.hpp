#ifndef LISTA_HPP
#define LISTA_HPP
#include "nodo.hpp"

struct Lista{

    Nodo *cabeza;
    int longitud;

};

void inicializacion(Lista *);
bool esVacia(Lista *);
void insertarInicio(Lista *, Uea);
void buscarElemento(Lista *, string);
void buscarElementoPorDepartamento(Lista *, string);
void buscarUEAporHoras(Lista *, int);

#endif //LISTA_HPP
