package source;

class RomanToArabic {
    public String translation(String RomanNum) throws MyException {
        switch (RomanNum){
            case "O":
                throw new MyException("Не корректный ввод числа");
            case "I":
                return "1";
            case "II":
                return "2";
            case "III":
                return "3";
            case "IV":
                return "4";
            case "V":
                return "5";
            case "VI":
                return "6";
            case "VII":
                return "7";
            case "VIII":
                return "8";
            case "IX":
                return "9";
            case "X":
                return "10";
            default:
                return "More than 10";

        }
    }
}
