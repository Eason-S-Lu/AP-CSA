import java.lang.Math;
public class sh1 {
  public static void main(String[] args) {
    System.out.println(sumSquares(1, 5));
  }
  static int sumSquares(int a,int b){
    int total=0;
    while (a<=b){
      total+=Math.pow(a, 2);
      a++;
    }
    return total;
  }
}