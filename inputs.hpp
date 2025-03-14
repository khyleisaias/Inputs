#include <iostream>

using namespace std;
string GetString(string prompt) {
    string str_res;

    cout << prompt;
    cin >> str_res;

    return str_res;
}
