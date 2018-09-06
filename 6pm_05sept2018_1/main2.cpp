#include <iostream>
#include <fstream>
#include <cstring>
#include <stdlib.h>
using namespace std;

void escribeArchivo() {
    fstream archivo;
    
    archivo.open("C:\\crl\\salida.txt", ios::out | ios::app);    
    archivo<<"hola companeros 1\r\n";
    archivo<<"hola companeros 2\r\n";
    archivo.close();
}

int obtienePosiChar(string cadena, string caracter) {
    return (cadena.find(caracter));    
}

void leerArchivo() {
    fstream archivo;
    archivo.open("C:\\crl\\numeros.txt",ios::in);
    string linea;
    int posi1 = 0;
    string numero;
    int i = 0;
    
    if(archivo.is_open()) {
        getline(archivo,linea);
        
        posi1 = linea.size();
        while(linea.size() > 0) {
            if(obtienePosiChar(linea,",") > linea.size()) {
                numero = linea.substr(i,posi1);
                linea = "";
            }
            else {
                posi1 = obtienePosiChar(linea,",");
                numero = linea.substr(i,posi1);
                linea = linea.substr(posi1 + 1);
            }
            cout<<numero<<endl;
        }
        
        archivo.close();
    }
}

void f1(int a) {
    a = a + 1;    
}

void f2(int a[]) {
    a[0] = a[0] + 1;
}


int main() {
    //escribeArchivo();
    //leerArchivo();
    int a1[1] = {10};
    int a = 20;
    
    f1(a);
    cout<<"a: "<<a<<endl; //21
    
    f2(a1);
    cout<<"a[0]"<<a1[0]<<endl; //11

    return 0;
}
