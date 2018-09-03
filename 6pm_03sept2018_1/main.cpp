#include <iostream>
#include <cstring>
using namespace std;

/*
 * 
 */
int main() {
    int ivar1 = 0;
    int ivar2[3] = {10,20,30};
    int ivar3[2][3] = {
        {10,20,30},
        {40,50,60}        
    };
    char cadena1[16] = "";
    char cadena2[16] = "";
    char cadena3[5] = "hola";
    
    cout<<"Entre numero: ";
    cin>>ivar1;
    cout<<"\nEntre cadena: ";
    cin.ignore();
    cin.getline(cadena1,16);
    
    strcpy(cadena2,"hola companeros");
    
    cout<<"el numero fue: "<<ivar1<<endl;
    cout<<"La cadena1 fue: "<<cadena1<<endl;
    cout<<"La cadena2 fue: "<<cadena2<<endl;
    
    cout<<"La longitud cadena1: "<<strlen(cadena1)<<endl; //hola mundo
    cout<<"La longitud ivar2: "<<sizeof(ivar2)/sizeof(ivar2[0])<<endl;
    cout<<"La posicion de 50 en el arreglo multidimensional es: "<<ivar3[1][1]<<endl;
    cout<<"Valor en cadena3: "<<cadena3[2]<<endl;

    return EXIT_SUCCESS;
}
