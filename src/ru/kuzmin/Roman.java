package ru.kuzmin;

import java.util.HashMap;
import java.util.Map;

//----------Класс для работы с римсими числами

public class Roman implements Arithmetic{

    private static int a = 0, b = 0;
    private HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

    public void myRome(String c){

        String s1 = "", s2 = "";
        char[] chars = c.toCharArray();

        hashMap.put("I", 1);
        hashMap.put("II", 2);
        hashMap.put("III", 3);
        hashMap.put("IV", 4);
        hashMap.put("V", 5);
        hashMap.put("VI", 6);
        hashMap.put("VII", 7);
        hashMap.put("VIII", 8);
        hashMap.put("IX", 9);
        hashMap.put("X", 10);

        for (int i = 0; i < c.length(); i++){
            if (Character.isLetter(chars[i])){
                s1+= chars[i];
            }else {
                for (int j = i+1; j <c.length(); j++){
                    s2 += chars[j];
                }
                break;
            }
        }

        for (Map.Entry<String, Integer> entry:
                hashMap.entrySet()) {
            if (s1.equals(entry.getKey())){
                a = entry.getValue();
            }if (s2.equals(entry.getKey())){
                b = entry.getValue();
            }
        }

        if ((a > 10 || a < 1) || (b > 10 || b < 1)){            //Проверка на вхождение в границы диапазон
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
                System.exit(1);
            }
        }
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public void mySum() {
        int sum = getA()+getB();
        System.out.println(IntegerConvert.intToRoman(sum));
    }

    @Override
    public void mySubtraction() {
        int sub = getA()-getB();
        System.out.println(IntegerConvert.intToRoman(sub));
    }

    @Override
    public void myMultiply() {
        int multi = getA()*getB();
        System.out.println(IntegerConvert.intToRoman(multi));
    }

    @Override
    public void myDivide() {
        int divide = getA()/getB();
        System.out.println(IntegerConvert.intToRoman(divide));
    }

}
