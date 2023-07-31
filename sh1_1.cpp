#include<iostream>
int sumSquares(int a,int b){
  int c=0;
  while(a<=b){
    c+=a*a;
    a++;
  }
  return c;
}
int main(){
  std::cout <<sumSquares(1,5);
  return 0;
}