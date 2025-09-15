#include <iostream>

using namespace std;

string GetString(string prompt) {
    string str_res;
    cout << prompt;
    getline(cin, str_res); 
    return str_res;
}

int getInt(string prompt) {
    int int_res;
    cout << prompt;
    cin >> int_res;
    return int_res;
}
