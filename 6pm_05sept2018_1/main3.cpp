#include <iostream>
#include <fstream>
#include <cstring>
#include <stdlib.h>
using namespace std;

int obtienePosiChar(string cadena, string caracter) {
    return (cadena.find(caracter));    
}

void ordenaArregloxSeleccion(int arreglo[], int tamanoArreglo) {
    //int tamanoArreglo = sizeof(arreglo)/sizeof(arreglo[0]);
    int aux = 0;
    int posiMenor = 0;
    
    for(int i=0;i<tamanoArreglo-1;i++) {
        posiMenor = i;
        for(int j=(i+1);j<tamanoArreglo;j++) {
            if(arreglo[j]<arreglo[posiMenor]) {
                posiMenor = j;
            }
        }
        //hacemos intercambio
        aux = arreglo[i];
        arreglo[i] = arreglo[posiMenor];
        arreglo[posiMenor] = aux;
    }
    
    for(int i=0;i<tamanoArreglo;i++) {
        cout<<arreglo[i]<<endl;    
    }
}

int main() {
    int nums[7] = {5,10,4,345,23,8,6};
    
    ordenaArregloxSeleccion(nums, 7);
    
    return 0;    
}

int main3() {
    fstream archivo;
    archivo.open("C:\\crl\\numeros.txt",ios::in);
    string linea;
    int posi1 = 0;
    string numero;
    int numeros[10] = {0};
    int i=0;
    
    if(archivo.is_open()) {
        getline(archivo,linea);
        
        posi1 = linea.size();
        while(linea.size() > 0) {
            if(obtienePosiChar(linea,",") > linea.size()) {
                numero = linea.substr(0,posi1);
                linea = "";
            }
            else {
                posi1 = obtienePosiChar(linea,",");
                numero = linea.substr(0,posi1);
                linea = linea.substr(posi1 + 1);
            }
            cout<<numero<<endl;
            numeros[i] = atoi(numero.c_str());
            i++;
        }
        
        archivo.close();
    }
    
    return 0;
}

