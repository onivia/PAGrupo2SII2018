#include <iostream>
using namespace std;

int ivar1 = 20;
const int ivar2 = 20;

void f1(){
    static int ivar4 = 100;
    
    cout<<ivar4<<endl;
    
    ivar4++;
}

int main() {
    int ivar3[] = {10,20};
    int a = 100;
    
    cout<<&a<<endl;

    return 0;
}

