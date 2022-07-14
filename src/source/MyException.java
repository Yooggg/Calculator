package source;

public class MyException extends Exception{
    public MyException(String expression){
        System.out.println(expression);
    }
}
