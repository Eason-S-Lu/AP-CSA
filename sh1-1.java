public class sh1-1 {
  public static void main(String[] args) {
    System.out.println(sumSquares(1, 5));
  }
  static int sumSquares(int a,int b){
    int total=0;
    for (;a<=b;a++){
      total+=Math.pow(a, 2);
    }
    return total;
  }
}
