package ru.kuzmin;


//----------Класс для работы с арабскими числами

public class Arabic implements Arithmetic{

    private static int a = 0, b = 0;

    public void myArabian(String c){
        char[] chars = c.toCharArray();
        String s1 = "", s2 = "";

        for (int i = 0; i < c.length(); i++){
            if (Character.isDigit(chars[i])){
                s1+= String.valueOf(chars[i]);
                a = Integer.parseInt(s1);
            }else {
                for (int j = i+1; j <c.length(); j++){
                    s2 += String.valueOf(chars[j]);
                    b = Integer.parseInt(s2);
                }
                break;
            }
        }
        if ((a > 10 || a < 1) || (b > 10 || b < 1)){        //Проверка на вхождение в границы диапазон
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
                System.exit(0);
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
        System.out.println(getA()+getB());
    }

    @Override
    public void mySubtraction() {
        System.out.println(getA()-getB());
    }

    @Override
    public void myMultiply() {
        System.out.println(getA()*getB());
    }

    @Override
    public void myDivide() {
        System.out.println(getA()/getB());
    }

}
