#include <iostream>
using namespace std;
 
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
 
    long long n, m, a;
    cin >> n >> m >> a;
 
    long long count_n = (n + a - 1) / a;
    long long count_m = (m + a - 1) / a;
 
    long long total = count_n * count_m;
 
    cout << total << "
";
    return 0;
}