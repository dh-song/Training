package ex9.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Program {
    
    public static void main(String[] args) throws IOException {

        ExamRepository repository = new ExamRepository();
        // List<Exam> list = repository.getList(1);
        // list.forEach(System.out::println);

        // Exam exam = repository.get(3);
        // System.out.println(exam);


        OptionalInt sum = repository.getKorSum();
        System.out.println("sum "+ sum);


        // System.out.println(list);
        //Int, Double, LongStream <-> STream
        // 컬렉션, 배열, 파일

        // int[] ages = {10,23,34,42,12,24};
        // IntStream stream1 = IntStream.of(ages);
        // stream1
        // .boxed() //int를 integer로
        // .toList()
        // .forEach(System.out::println);

        // int[] ages = {10,23,34,42,12,24};
        // IntStream stream1 = IntStream.of(ages);
        // stream1.average(); //기본 자료형이라 나옴
        

        // List<Integer> ages2 = new ArrayList<>();
        // Stream<Integer> stream2 = ages2.stream(); //average는 없음
        // Optional<Integer> firstNum =  stream2.findFirst(); //optional - 데이터가 있거나 없으면 처리하는 리턴
        // // firstNum.empty();
        // long count = stream2.count();

        // Files
        // .lines(Path.of("JavaPrj/res/examData.csv")) //옛날같으면 스캐너 넥스트 ㅇㅈㄹ
        // .forEach(System.out::println);
        // .forEach(line->{System.out.println(line);
        // }); //중간 처리
        // .toList(); //마지막 출력

    }
}
