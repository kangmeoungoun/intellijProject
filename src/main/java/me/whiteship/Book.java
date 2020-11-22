package me.whiteship;

/**
 * Created by jojoldu@gmail.com on 2020-11-01
 * Blog : http://jojoldu.tistory.com
 * Github : http://github.com/jojoldu
 */
public class Book {
    public static String A = "A";
    private String B = "B";

    public Book(String b) {
        B=b;
    }

    private void c(){
        System.out.println("C");
    }
    public int sum(int left,int right){
        return left+right;
    }

}

