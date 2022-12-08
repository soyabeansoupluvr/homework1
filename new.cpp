


#include <iostream>
#include <string>
using namespace std;

int main(void) {
    bool fun = true;
    string message = " YES! ";
    if (fun) {
        for (int i = 0; i < 3; i++) {
            cout << message + "\n";
        }
        fun = false;
    }
    return 0;
}