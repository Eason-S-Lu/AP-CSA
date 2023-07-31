import java.util.ArrayList;

public class sh2{
  public static void main(String[] args) {
    ArrayList<Double> theList = new ArrayList<Double>();
    theList.add(1.5);
    theList.add(2.0);
    theList.add(3.2);
    theList.add(4.8);
    System.out.println(sumList(theList));
  }
  static double sumList(ArrayList<Double> list){
    double sum = 0.00;
    for (int i = 0; i < list.size(); i++) {
          sum += list.get(i);
        }
    return sum;
  }
}
