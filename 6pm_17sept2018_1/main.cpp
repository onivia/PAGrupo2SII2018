#include <iostream>
#include <cstring>
using namespace std;

struct Maleta {
    int cod;
    double precio;
    char descripcion[32];    
};

int main() {
    Maleta *maletas = (Maleta *)malloc(2*sizeof(Maleta));
    
    maletas[0].cod = 200;
    maletas[0].precio = 550.0;
    strcpy(maletas[0].descripcion,"maleta peppa pig");
    
    maletas[1].cod = 300;
    maletas[1].precio = 600.0;
    strcpy(maletas[1].descripcion,"maleta negra");
    
    for(int i=0;i<2;i++) {
        cout<<maletas[i].cod<<endl;
        cout<<maletas[i].precio<<endl;
        cout<<maletas[i].descripcion<<endl;
    }
    
    free(maletas);
    maletas = NULL;
        
    return 0;
}
