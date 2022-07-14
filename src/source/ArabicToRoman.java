package source;

import java.util.HashMap;

public class ArabicToRoman {
    public String reverse(int ArabicNum) {
        String res = "";
        HashMap<Integer, String> map = new HashMap<>();
        {
            map.put(1, "I");
            map.put(4, "IV");
            map.put(5, "V");
            map.put(9, "IX");
            map.put(10, "X");
            map.put(40, "XL");
            map.put(50, "L");
            map.put(90, "XC");
            map.put(100, "C");
        }
        while(ArabicNum != 0){
            if(ArabicNum == 100){
                res += map.get(100);
                ArabicNum -= 100;
            }
            if(ArabicNum >= 90 && ArabicNum < 100){
                res += map.get(90);
                ArabicNum -= 90;
            }
            if(ArabicNum >= 50 && ArabicNum < 90){
                res += map.get(50);
                ArabicNum -= 50;
            }
            if(ArabicNum >= 40 && ArabicNum < 50){
                res += map.get(40);
                ArabicNum -= 40;
            }
            if(ArabicNum >= 10 && ArabicNum < 40){
                res += map.get(10);
                ArabicNum -= 10;
            }
            if(ArabicNum >= 9 && ArabicNum < 10){
                res += map.get(9);
                ArabicNum -= 9;
            }
            if(ArabicNum >= 5 && ArabicNum < 9){
                res += map.get(5);
                ArabicNum -= 5;
            }
            if(ArabicNum >= 4 && ArabicNum < 5){
                res += map.get(4);
                ArabicNum -= 4;
            }
            if(ArabicNum >= 1 && ArabicNum < 4){
                res += map.get(1);
                ArabicNum -= 1;
            }
        }
        return res;
    }
}
