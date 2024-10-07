#ifndef MONTICULO_HPP
#define MONTICULO_HPP
#include "estudiante.hpp"
//using namespace std;

struct Monticulo{
    Estudiante estudiante;
};

void flotar(int,Monticulo[]);
void hundir(int,Monticulo[]);
void insertar(Monticulo[], Estudiante);
void extraer(Monticulo[]);
void imprimir(Monticulo[]);

#endif // MONTICULO_HPP
