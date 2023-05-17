package exSort;

import java.util.Arrays;

public class Program { // 자바 8(컬렉션 컨트롤)

    public static void main(String[] args) {
        Integer[] ages = { 10, 30, 3, 34, 53, 23, 40 };

        // Arrays.sort(ages);
        Arrays.sort(ages, (a, b) -> a - b); // 컨트롤 쉽게 하기 위해 람다식 추가 됨
        System.out.println(Arrays.toString(ages));

        String[] stringArray = { "Barbara", "James", "Mary", "John", "Patricia", "Robert", "Michael", "Linda" };

        // Arrays.sort(stringArray,(a,b)->a.compareTo(b));
        Arrays.sort(stringArray, String::compareTo); // (어느 클래스의 함수인지만 지정하고 함수만 써준다) 메소드레퍼런스
        System.out.println(Arrays.toString(stringArray));


        // 인터페이스 정의의 람다 표현식 2가지
        // (1가지만 구현 인터페이스에 @FunctionalInterface 로 정의)
        // 함수만 전달하기 쉽다.
        Comparable<Integer> comp1 = (Integer o) -> {
            return 0;
        };
        Comparable<Integer> comp2 = o -> 0;

    }
}
