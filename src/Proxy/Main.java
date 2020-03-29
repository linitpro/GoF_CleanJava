package Proxy;

public class Main {
   public static void main(String[] args) {
       IGraphic graphic = new ImageProxy();

       graphic.draw();
       graphic.drawWithAccess(true);
       graphic.drawWithAccess(false);

       System.out.println("hello, world!");
    }
}
