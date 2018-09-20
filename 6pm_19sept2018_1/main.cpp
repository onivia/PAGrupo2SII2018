#include <iostream>
#include <cstring>
#include <cstdlib>
#include <istream>
using namespace std;

struct Estudiante {
    int cod;
    char nombre[32];
};

struct Carrera {
    int codcarrera;
    char nomcarrera[16];
    Estudiante *estudiantes;
    int cantestudiantes;
};

int main() {
    Carrera *carreras = NULL;
    Estudiante *estudiantes = NULL;
    int cantcarreras = 0;
    int cantestudiantes = 0;
    
    cout<<"Entre cantidad de Carreras: ";
    cin>>cantcarreras;
    
    carreras =(Carrera *)calloc(cantcarreras,sizeof(Carrera)); //keyword: new
    for(int i=0;i<cantcarreras;i++) {
        cout<<"\nEntre el codigo de la carrera ("<<i+1<<"): ";
        cin>>carreras[i].codcarrera;
        cout<<"\nEntre el nombre de la carrera ("<<i+1<<"): ";
        cin.ignore();
        cin.getline(carreras[i].nomcarrera,16);
        cout<<"\nEntre cantidad de Estudiantes para la carrera (: "<<i+1<<"): ";
        cin>>cantestudiantes;
        estudiantes =(Estudiante *)malloc(cantestudiantes*sizeof(Estudiante));
        carreras[i].cantestudiantes = cantestudiantes;
        for(int j=0;j<cantestudiantes;j++) {
            cout<<"\nEntre codigo del estudiante ("<<j+1<<") de la carrera ("<<i+1<<"): ";
            cin>>estudiantes[j].cod;
            cout<<"\nEntre nombre del estudiante ("<<j+1<<") de la carrera ("<<i+1<<"): ";
            cin.ignore();
            cin.getline(estudiantes[j].nombre,32);
        }
        carreras[i].estudiantes = estudiantes;
    }
    
    for(int i=0;i<cantcarreras;i++) {
        cout<<"\n\ncodigo de la carrera ("<<i+1<<") es:"<<carreras[i].codcarrera;
        cout<<"\n\nnombre de la carrera ("<<i+1<<") es:"<<carreras[i].nomcarrera;
        cout<<"\n\nLa carrera ("<<i+1<<") tiene:"<<carreras[i].cantestudiantes<<" estudiantes...";
        for(int j=0;j<carreras[i].cantestudiantes;j++) {
            cout<<"\n\tel codigo del estudiante ("<<j+1<<") es:"<<carreras[i].estudiantes[j].cod;
            cout<<"\n\tel nombre del estudiante ("<<j+1<<") es:"<<carreras[i].estudiantes[j].nombre;
        }
        free(carreras[i].estudiantes);
        carreras[i].estudiantes = NULL;
    }
    estudiantes = NULL;
    free(carreras);
    carreras = NULL;
    
    return 0;
}
