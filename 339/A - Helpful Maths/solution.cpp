#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
using namespace std;
 
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
 
    string s;
    cin >> s;
 
    vector<char> digits;
    for (int i = 0; i < s.length(); i += 2) {
        digits.push_back(s[i]);
    }
 
    sort(digits.begin(), digits.end());
 
    for (int i = 0; i < digits.size(); i++) {
        cout << digits[i];
        if (i != digits.size() - 1) {
            cout << "+";
        }
    }
    cout << "
";
 
    return 0;
}