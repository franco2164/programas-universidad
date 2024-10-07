#include <iostream>
#include <fstream>
#include <sstream>
#include <ctime>
#include <cstdlib>
#include <vector>

using namespace std;

//Estructura para una UEA
struct Uea{
    string clave;
    string nombre;
};

//Declaracion de las funciones
vector<Uea> llenarEstructuras(string);
string seleccionarNombreArchivo(int);
int preguntarDepartamento();
void intercambiar(Uea&, Uea&);
int particionar(vector<Uea>&, int, int);
void quicksort(vector<Uea>&, int, int);
vector<Uea> merge(const vector<Uea>&, const vector<Uea>&);
void mostrarUEA(const vector<Uea>&);

//Main
int main(){

    //Declaramos nuestras variables
    int dep1, dep2;
    string nombreArch1, nombreArch2;
    vector<Uea> ueaDep1;
    vector<Uea> ueaDep2;

    //Pregunta numero del departamento, busca el nombre del archivo
    cout<<"Ingrese un numero 1-5: \n1.Ciencia Basicas \n2.Electronica \n3.Energia \n4.Materiales \n5.Sistemas \n"<<endl;

    dep1=preguntarDepartamento();
    nombreArch1=seleccionarNombreArchivo(dep1);

    dep2=preguntarDepartamento();
    nombreArch2=seleccionarNombreArchivo(dep2);

    //Llena los datos del departamento seleccionado
    ueaDep1=llenarEstructuras(nombreArch1);
    ueaDep2=llenarEstructuras(nombreArch2);

    // Ordenar por nombre usando Quicksort
    quicksort(ueaDep1, 0, ueaDep1.size() - 1);
    quicksort(ueaDep2, 0, ueaDep2.size() - 1);

    // Mostrar resultados ordenados de cada departamento
    cout << "\nUEA del primer departamento ordenadas por nombre:\n";
    mostrarUEA(ueaDep1);

    cout << "\nUEA del segundo departamento ordenadas por nombre:\n";
    mostrarUEA(ueaDep2);

    // Combinar los dos arreglos usando Mergesort
    vector<Uea> ueaCombinadas = merge(ueaDep1, ueaDep2);

    // Mostrar resultado combinado
    cout << "\nUEA combinadas y ordenadas de ambos departamentos:\n";
    mostrarUEA(ueaCombinadas);



    return 0;
}

int preguntarDepartamento(){
    int dep=0;
    cout<<"Ingrese el departamento: "<<endl;
    cin>>dep;
    return dep;
}

string seleccionarNombreArchivo(int dep){
    string nombreArchivo="";

    switch (dep){
    case 1:
        nombreArchivo="cb.txt";
        break;
    case 2:
        nombreArchivo="ele.txt";
        break;
    case 3:
        nombreArchivo="ene.txt";
        break;
    case 4:
        nombreArchivo="mat.txt";
        break;
    case 5:
        nombreArchivo="sis.txt";
        break;
    default:
        cout<<"Numero no valido"<<endl;
        break;
    }

    return nombreArchivo;
}

vector<Uea> llenarEstructuras(string nombreArchivo){

    ifstream archivoEntrada;
    string lineaLeida;
    Uea uea;
    vector<Uea> ueas;
    archivoEntrada.open(nombreArchivo);

    if(archivoEntrada){
        while(!archivoEntrada.eof()){
             getline(archivoEntrada,lineaLeida);

             if (lineaLeida.length() > 0){
              stringstream stream(lineaLeida); // Se pasa la cadena a un tipo stream

            //Se va obteniendo cada dato por separado, recordar que el
            //archivo está separado por coma ','
            getline(stream, uea.clave, ',');
            getline(stream, uea.nombre, ',');

            //Se inserta el elemento en el vector de elementos
            ueas.push_back(uea);

            }
        }
        archivoEntrada.close(); //Se cierra el archivo
    }
    return ueas;
}

// Función para intercambiar dos elementos
void intercambiar(Uea& a, Uea& b) {
    Uea temp = a;
    a = b;
    b = temp;
}

// Implementación del Quicksort para ordenar por nombre
int particionar(vector<Uea>& uea, int bajo, int alto) {
    string pivote = uea[alto].nombre;
    int i = bajo - 1;

    for (int j = bajo; j < alto; j++) {
        if (uea[j].nombre < pivote) {
            i++;
            intercambiar(uea[i], uea[j]);
        }
    }
    intercambiar(uea[i + 1], uea[alto]);
    return i + 1;
}

void quicksort(vector<Uea>& uea, int bajo, int alto) {
    if (bajo < alto) {
        int pi = particionar(uea, bajo, alto);
        quicksort(uea, bajo, pi - 1);
        quicksort(uea, pi + 1, alto);
    }
}

// Función para combinar dos vectores en uno ordenado (Mergesort)
vector<Uea> merge(const vector<Uea>& izquierda, const vector<Uea>& derecha) {
    vector<Uea> resultado;
    int i = 0, j = 0;

    while (i < izquierda.size() && j < derecha.size()) {
        if (izquierda[i].nombre < derecha[j].nombre) {
            resultado.push_back(izquierda[i]);
            i++;
        } else {
            resultado.push_back(derecha[j]);
            j++;
        }
    }

    // Copiar los elementos restantes
    while (i < izquierda.size()) {
        resultado.push_back(izquierda[i]);
        i++;
    }
    while (j < derecha.size()) {
        resultado.push_back(derecha[j]);
        j++;
    }

    return resultado;
}

// Función para mostrar la información de las UEA
void mostrarUEA(const vector<Uea>& uea) {
    for (const auto& u : uea) {
        cout << u.clave << " - " << u.nombre << endl;
    }
}
