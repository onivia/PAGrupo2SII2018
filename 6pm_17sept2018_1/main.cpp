#include <iostream>
using namespace std;

void f1(int a) {
    cout<<"paso x f1: "<<a<<endl;
}

void f2(int b) {
    cout<<"paso x f2: "<<b<<endl;
}

void wrapper(void (*f)(int),int i) {
    f(i);    
}

int main() {
    void(*p1[])(int) = {f1,f2};
    
    wrapper(p1[0],200);
    
    return 0;
}
