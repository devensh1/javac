#include <bits/stdc++.h>
using namespace std;
#define ll long long
#define For(i,j,n,in) for (int i = j; i<n;i+=in)
#define loop(i,n) For(i,0,n,1)
const ll mod = 1e9 +7;


int main(){
  int t; cin>>t;
  ll ans = -1; bool okx = true ; int ant = 1e6,pro = 1e8 ; bool ok = true;
  while(t--){
    int x,y; cin>>x>>y;
    if ( okx and x==ant and y!=pro){
      ant =x;
      pro =y;
      okx = false ;
      ok = true;
      ans++;
    }
    else if ( ok and y == pro and x!=ant){
      ant = x; pro = y;
      ok = false;
      okx = true;
      ans++;
    }
    else if ( y!= pro and x!=ant) {
      ant =x; pro = y; 
      okx = true; ok = true;
      ans++;

    }
    else{
          ant =x; pro = y; 

    }
  }
  cout<<(ans+1);
}
