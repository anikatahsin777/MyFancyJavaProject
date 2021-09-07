public class HelloWorld {
    private static HelloWorld instance = new HelloWorld();
    private HelloWorld(){}

    public static HelloWorld getInstance(){
      return instance;
    }

    public void showText(){
      System.out.println("Hello, World!");
    }
}