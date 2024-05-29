/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;

/**
 *
 * @author ADMIN
 */
public class bai_I_2 {
    public static Double calc (String expression) {
        try {
            int pos =0;
            char ch=' ';
            for (pos = 0;  pos < expression.length(); pos++) {
                ch=expression.charAt(pos);
                if (ch=='+'||ch=='-'||ch=='*'||ch=='/') {
                    break;
                }
            }
            double num1=Double.valueOf(expression.substring(0, pos));
            double num2=Double.valueOf(expression.substring( pos+1));
            if(ch=='+') return num1+num2;
            if(ch=='-') return num1-num2;
            if(ch=='*') return num1*num2;
            if(ch=='/') return num1/num2;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) {
        System.out.println(calc("123.5+567.5"));
    }
}
