package exSort;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Program { // 자바 8(컬렉션 컨트롤)

    public static void main(String[] args) throws IOException {

        List<Exam> list = Files
        .lines(Path.of("/Users/Song/git/Training/JavaPrj/res/examData.csv"))
        .skip(1) //1줄 건너뜀, 파일 상단에 스트링 스킵
        .map(line->{
            String[] tokens = line.split(",");
            if (tokens.length != 3) {
                throw new RuntimeException("d인자 개수 잘못");
            }
            int kor = Integer.parseInt(tokens[0]);
            int eng = Integer.parseInt(tokens[1]);
            int math = Integer.parseInt(tokens[2]);

            return new Exam(kor, eng, math);
        })
        .toList();
        System.out.println(list);








       
    //    Exam[] list = {
    //         new Exam(1, 2, 3),
    //         new Exam(2, 3, 4),
    //         new Exam(3, 2, 1)
    //    };

    // int[] ages = { 10, 30, 3, 34, 53, 23, 40 }; //스트림 활용
    // int[] result = IntStream
    // .of(ages)
    // .filter(age->age>25)
    // .sorted()
    // .map(age->age/10*10)
    // .toArray();


// System.out.println(Arrays.toString(result));

        
    //    Arrays.sort(list);

    //    System.out.println(Arrays.toString(list));




       
       
        // Integer[] ages = { 10, 30, 3, 34, 53, 23, 40 };

        // // Arrays.sort(ages);
        // Arrays.sort(ages, (a, b) -> a - b); // 컨트롤 쉽게 하기 위해 람다식 추가 됨
        // System.out.println(Arrays.toString(ages));

        // String[] stringArray = { "Barbara", "James", "Mary", "John", "Patricia", "Robert", "Michael", "Linda" };

        // // Arrays.sort(stringArray,(a,b)->a.compareTo(b));
        // Arrays.sort(stringArray, String::compareTo); // (어느 클래스의 함수인지만 지정하고 함수만 써준다) 메소드레퍼런스
        // System.out.println(Arrays.toString(stringArray));


        // // 인터페이스 정의의 람다 표현식 2가지
        // // (1가지만 구현 인터페이스에 @FunctionalInterface 로 정의)
        // // 함수만 전달하기 쉽다.
        // Comparable<Integer> comp1 = (Integer o) -> {
        //     return 0;
        // };
        // Comparable<Integer> comp2 = o -> 0;

    }
}
