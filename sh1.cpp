#include<iostream>
int sumSquares(int a,int b){
  int c=0;
  for (;a<=b;a++){
    c+=a*a;
  }
  return c;
}
int main(){
  std::cout <<sumSquares(1,5);
  return 0;
}