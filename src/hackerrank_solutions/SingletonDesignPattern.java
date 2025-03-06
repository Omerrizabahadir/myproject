package hackerrank_solutions;

public class SingletonDesignPattern {
   private static SingletonDesignPattern instance;

   public String str;

   private SingletonDesignPattern(){
       str = "Hello I am a singleton! Let me say ";
   }
   public static SingletonDesignPattern getSingleInstance(){
       if(instance == null){
           instance = new SingletonDesignPattern();
       }
       return instance;
   }
   public void sayHello(String input){
       System.out.println(str + input + " to you");
   }

    public static void main(String[] args) {

       String input = "hello world";
       SingletonDesignPattern singletonDesignPattern = SingletonDesignPattern.getSingleInstance();
       singletonDesignPattern.sayHello(input);
    }
}
