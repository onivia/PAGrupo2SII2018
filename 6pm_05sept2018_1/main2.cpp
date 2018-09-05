#include <iostream>
#include <fstream>
using namespace std;

void escribeArchivo() {
    fstream archivo;
    
    archivo.open("C:\\crl\\salida.txt", ios::out | ios::app);    
    archivo<<"hola companeros 1\r\n";
    archivo<<"hola companeros 2\r\n";
    archivo.close();
}

void leerArchivo() {
    fstream archivo;
    archivo.open("C:\\crl\\salida.txt",ios::in);
    string linea;
    
    if(archivo.is_open()) {
        while(getline(archivo,linea)) {
            cout<<linea<<endl;
        }        
        archivo.close();
    }
}

int main() {
    //escribeArchivo();
    leerArchivo();

    return 0;
}
