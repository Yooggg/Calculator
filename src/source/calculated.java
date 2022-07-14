package source;

class calculated{
    public int result(String[] expression){
        switch (expression[1]){
            case "+":
                return Integer.parseInt(expression[0]) + Integer.parseInt(expression[2]);
            case "-":
                return Integer.parseInt(expression[0]) - Integer.parseInt(expression[2]);
            case "*":
                return Integer.parseInt(expression[0]) * Integer.parseInt(expression[2]);
            case "/":
                return (Integer.parseInt(expression[0]) / Integer.parseInt(expression[2]));
            default:
                return 0;
        }
    }
}
