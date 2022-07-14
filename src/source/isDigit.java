package source;

public class isDigit {
    public boolean IsDigit(String num) throws NumberFormatException{
        try{
            Integer.parseInt(num);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
}
