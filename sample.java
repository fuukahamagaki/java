public class sample {
  public static void main(String []args) {
    System.out.println("RPG:スッキリ魔王征伐");
    System.out.println("Ver.0.1 by 湊");
    System.out.println("<ただいま鋭意学習・制作中>");
    System.out.println("プログラムを終了します");
    int sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);

    System.out.format("The sum of %s and %s is %s.\n",
      args[0], args[1], Integer.toString(sum));
  }
}