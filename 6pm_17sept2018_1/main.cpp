#include <iostream>
using namespace std;

void f1(int n) {
    cout<<"el valor de n es: "<<n<<endl;
}

int main() {
    void (*p)(int) = f1;
    
    p(10);

    return 0;
}

