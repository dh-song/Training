package ex9.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class ExamRepository {

    public Exam get(int id) throws IOException {

        Optional<Exam> result = null;

        result = Files.lines(Path.of("JavaPrj/res/examData.csv"))
                .skip(1)
                .map(Exam::fromCSV)
                .filter(exam -> exam.getId() == id)
                .findFirst();

        return null;

    }

    public OptionalInt getKorSum() throws IOException {
        OptionalInt result = null;
        result = Files.lines(Path.of("JavaPrj/res/examData.csv"))
                .skip(1)
                .map(Exam::fromCSV)
                .mapToInt(exam->exam.getKor())
                .reduce((a,b)-> a+b);
                // .mapToInt(exam->exam.getKor()) //받을 때 바로 int로
                // .map(exam -> exam.getKor()) //integer 에서
                // .mapToInt(kor->kor.intValue())
                // .mapToInt(Integer::intValue) // int로
                // .sum();
                // .average()
                // .toList();

        return result;
    }

    public List<Exam> getList(int page) throws IOException {
        int size = 5;
        int offset = (page - 1) * size;
        List<Exam> list = null;
        list = Files
                .lines(Path.of("JavaPrj/res/examData.csv"))
                .skip(1)
                // .map(line->Exam.fromCSV(line))
                .map(Exam::fromCSV)
                .filter(exam -> exam.getKor() == 90)
                .skip(offset)
                .limit(size)
                .toList();
        // .map(line->{
        // String[] tokens = line.split(",");
        // int kor = Integer.parseInt(tokens[0]);
        // int eng = Integer.parseInt(tokens[1]);
        // int math = Integer.parseInt(tokens[2]);

        // Exam exam = new Exam();
        // return exam;
        // })

        // .forEach(System.out::println);
        return list;
    }

}
