#include <iostream>
using namespace std;

int suma(int n1, int n2) {
    return (n1+n2);
}

int resta(int n1, int n2) {
    return (n1-n2);
}

int multi(int a, int b) {
    return (a*b);
}

int main() {
    int (*operacion[])(int,int) = {suma,resta,multi};
    
    int resultado = operacion[2](10,5);
    
    cout<<resultado<<endl;
    
    return 0;
}

