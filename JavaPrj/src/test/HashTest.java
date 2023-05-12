package test;

import java.util.HashSet;
import java.util.Set;

public class HashTest {

    public static void main(String[] args) {

        String str1 = "hello";
        // String str2 = "hello";
        String str2 = new String("hello");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        //객체의 값은 equals 의미를 재정의 하자
        Testobj h1 = new Testobj(1, 2, 3);
        Testobj h2 = new Testobj(1, 2, 3);

        System.out.println(h1==h2);
        System.out.println(h1.equals(h2));

        System.out.println(h1.hashCode());
        System.out.println(h2.hashCode());

        Set<Testobj> set = new HashSet<>();
        set.add(h1);
        set.add(h2);
        System.out.println(set.size());

    }

}
