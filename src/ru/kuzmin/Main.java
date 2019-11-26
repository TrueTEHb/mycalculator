package ru.kuzmin;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String c = null;
        Arabic arabic = new Arabic();
        Roman roman = new Roman();
        try {
            c = reader.readLine();
            char[] chars = c.toCharArray();

            if (c.length() < 3 || c.isEmpty()){         //Если длина введённой строки меньше 3, выбросить исключение
                throw new Exception();
            }

//----------Если введённая строка начинается не с числа, вызвать метод для работы с римскими числами, иначе - с арабскими

            if (!Character.isDigit(chars[0])){
                roman.myRome(c);
                if (c.contains("+")){
                    roman.mySum();
                }else if (c.contains("/")){
                    roman.myDivide();
                }else if (c.contains("*")){
                    roman.myMultiply();
                }else if (c.contains("-")){
                    roman.mySubtraction();
                }else {
                    try {
                        throw new Exception();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }else {
                arabic.myArabian(c);
                if (c.contains("+")){
                    arabic.mySum();
                }else if (c.contains("/")){
                    arabic.myDivide();
                }else if (c.contains("*")){
                    arabic.myMultiply();
                }else if (c.contains("-")){
                    arabic.mySubtraction();
                }else {
                    try {
                        throw new Exception();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

}
