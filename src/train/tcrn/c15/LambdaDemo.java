package train.tcrn.c15;

public class LambdaDemo {
  public static void main(String[] args) {
    MyNumber myNum;
    myNum = () -> 123.45;
    System.out.println("A fixed value: " + myNum.getValue());

    myNum = () -> Math.random() * 100;
    System.out.println("A random value: " + myNum.getValue());
    System.out.println("Another random value: " + myNum.getValue());

    // myNum = () -> "123.45";
  }
}

interface MyNumber {
  double getValue();
}