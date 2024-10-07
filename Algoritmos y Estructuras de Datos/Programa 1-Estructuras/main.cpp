#include <iostream>

using namespace std;

struct Alumno{
    int claveCarrera;
    int ueasAprobadas;
};

int generarClaveCarrera();
int generarUeasAprobadas();
void asignarDatosAlumno(Alumno[]);
int promedioUeasAprobadasGeneral(Alumno[]);
int promedioUeasAprobadasPorIngenieria(Alumno[],int);
int alumnosConTodasAprobadas(Alumno[],int);
int alumnosConNingunaAprobada(Alumno[],int);

int main(){
    Alumno alumnos[500];

    //clave 1 Ambiental
    //clave 2 Civil
    //clave 3 Electrica
    //clave 4 Electronica
    //clave 5 Fisica
    //clave 6 Indistrial
    //clave 7 Mecanica
    //clave 8 Metalurgica
    //clave 9 Quimica
     //clave 10/122 Computacion 

    asignarDatosAlumno(alumnos);
    int promedioGeneral;
    int promedioPorIngenieria[10];
    int todasAprobadas[10];
    int ningunaAprobada[10];

    //Promedio General de uea aprobada de todos los alumnos
   promedioGeneral=promedioUeasAprobadasGeneral(alumnos);
    cout<<"Promedio de UEA aprobadas de todos los alumnos en su primer trimestre: ";
   cout<<promedioGeneral<<endl;
   
   //Promedio de uea aprobada de cada una de las ingenierias
   for(int i=0;i<10;i++){
        promedioPorIngenieria[i]=promedioUeasAprobadasPorIngenieria(alumnos,i+1);
    }
    
    cout<<"Promedio de uea aprobada de cada una de las ingenierias: "<<endl;
   for(int i=0; i<10; i++){
        cout<<"Clave "<<i+1<<": ";
        cout<<promedioPorIngenieria[i]<<endl;
   }

    //¿Cuántos alumnos de una determinada carrera aprobaron las 6 uea?
    for(int i=0;i<10;i++){
        todasAprobadas[i]=alumnosConTodasAprobadas(alumnos,i+1);
    }

    cout<<"Alumnos con todas las ueas aprobadas por carrera: "<<endl;
    for(int i=0;i<10;i++){
        cout<<"Clave "<<i+1<<": ";
        cout<<todasAprobadas[i]<<endl;
    }
    
    
    //¿Cuántos alumnos de una determinada carrera no aprobaron uea alguna?
    for(int i=0;i<10;i++){
        ningunaAprobada[i]=alumnosConNingunaAprobada(alumnos,i+1);
    }

    cout<<"Alumnos con ninguna uea aprobada por carrera: "<<endl;
    for(int i=0;i<10;i++){
        cout<<"Clave "<<i+1<<": ";
        cout<<ningunaAprobada[i]<<endl;
    }

    return 0;
}

int generarClaveCarrera(){
    int num;
    num=(rand()%10)+1;
    if(num==10){
        num=122;
    }
    return num;
}

int generarUeasAprobadas(){
    int num;
    num=(rand()%7);
    return num;
}

void asignarDatosAlumno(Alumno alumnos[]){
    for(int i=0; i<500; i++){
        alumnos[i].claveCarrera=generarClaveCarrera();
        alumnos[i].ueasAprobadas=generarUeasAprobadas();
    }
}

int promedioUeasAprobadasGeneral(Alumno alumnos[]){
    int suma=0, promedio=0;

    for (int i = 0; i < 500; i++){
        suma+=alumnos[i].ueasAprobadas;
    }
    promedio=suma/500;

    return promedio;
}

int promedioUeasAprobadasPorIngenieria(Alumno alumnos[], int clave){
    int suma=0, promedio=0, cont=0;
    if(clave==10){
        clave=122;
    }
    for(int i =0; i<500; i++){
        if(alumnos[i].claveCarrera==clave){
            suma+=alumnos[i].ueasAprobadas;
            cont++;
        }
    }
    promedio=suma/cont;

    return promedio;
}

int alumnosConTodasAprobadas(Alumno alumnos[],int clave){
    int cont=0;
    if(clave==10){
        clave=122;
    }
    for(int i =0; i<500; i++){
        if(alumnos[i].claveCarrera==clave){
            if(alumnos[i].ueasAprobadas==6){
                cont++;
            }
        }
    }
    return cont;
}

int alumnosConNingunaAprobada(Alumno alumnos[],int clave){
    int cont=0;
    if(clave==10){
        clave=122;
    }
    for(int i =0; i<500; i++){
        if(alumnos[i].claveCarrera==clave){
            if(alumnos[i].ueasAprobadas==0){
                cont++;
            }
        }
    }
    return cont;
}
