#include<iostream>
#include<iomanip>
#include<cmath>
using namespace std;
int main()
{
    int a,b;
    cin>>a;
    cin>>b;
    cout<<fixed<<setprecision(3)<<((b / 12.0) * a)<<endl;
    return 0;
}
