package source;

class Main {
    public String calc(String input) throws MyException{
        String[] spl;
        boolean check;
        int count = 0;

        isDigit digit = new isDigit();
        RomanToArabic translation = new RomanToArabic();
        calculated res = new calculated();
        More10 more = new More10();
        ArabicToRoman rome = new ArabicToRoman();

        spl = input.split("\\s+");

        if(spl.length < 3){
            throw new MyException("Строка не является математическим выражением");
        }

        if(spl.length > 3){
            throw new MyException("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }

        for(int i = 0; i < spl.length; i += 2){
            check = digit.IsDigit(spl[i]);
            if(check){
                count++;
            }
        }

        if(count == 1){
            throw new MyException("Используются одновременно разные системы счисления");
        }

        if(count == 2){
            if(more.more(spl[0]) || more.more(spl[2])){
                throw new MyException("Не подходящее число");
            }
        }

        if(count == 0){
            for (int i = 0; i < spl.length; i += 2){
                spl[i] = translation.translation(spl[i]);
                if(spl[i].equals("More than 10")){
                    throw new MyException("Не подходящее число");
                }
            }
        }

        int result = res.result(spl);

        if(count == 0 && result < 0){
            throw new MyException("В римской системе нет отрицательных чисел");
        }
        else if (result == 0){
            throw new MyException("Ответ должен быть больше нуля");
        }

        if(count == 0){
            return rome.reverse(result);
        }
        else{
            return Integer.toString(result);
        }
    }
}
