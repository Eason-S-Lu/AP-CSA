public class sh3 {
  public static void main(String[] args) {
      int[][] arr = new int[20][10];
      initArray(arr);
      System.out.println(arr[3][5]);
      System.out.println(arr[17][4]);
  }
  static void initArray(int[][] arr){
    int row = arr.length;
    int col = arr[0].length;
    for (int i=0;i<row;i++) {
        for (int j=0;j<col;j++) {
            arr[i][j] = i*j;
        }
    }
  }
}
