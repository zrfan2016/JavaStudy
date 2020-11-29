package com.java.study.stream;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author: zrfan
 * @Date: 2020/11/28 11:48
 * @Description: steam
 */
public class StreamStudy {

    public static void main(String[] args) {
        List<String> strs = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strs.add(String.valueOf(i));
        }
        strs.stream().forEach(System.out::println);
        List<String> newStrs = strs.stream().filter(i -> Integer.parseInt(i) > 4).collect(Collectors.toList());
        newStrs.forEach(System.out::println);
        Random random = new Random();
        strs.stream().max(Comparator.comparing(String::length));
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            students.add(createStu(i, random.nextInt(150)));
        }

        students.forEach(System.out::println);
        Optional<Student> maxScoreStu = students.stream().max((o1, o2) -> {
            if (o1.getScore() > o2.getScore()) {
                return 1;
            } else if (o1.getScore() == o2.getScore()) {
                return 0;
            } else {
                return -1;
            }
        });
        printObject(maxScoreStu);
        double allScore = students.stream().collect(Collectors.summingDouble(Student::getScore));
        System.out.println(allScore);

        double avgScore = students.stream().collect(Collectors.averagingDouble(Student::getScore));
        System.out.println(avgScore);

        Map<String, Double> stuMap = students.stream().collect(Collectors.toMap(Student::getName, Student::getScore));
        System.out.println(stuMap);

        List<Student> sortedStus = students.stream().sorted(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getScore() > o2.getScore()) {
                    return -1;
                } else if (o1.getScore() == o2.getScore()) {
                    return 0;
                } else {
                    return 1;
                }
            }
        }).collect(Collectors.toList());
        sortedStus.forEach(System.out::println);
        Optional op = students.stream().map(Student::getScore).reduce((d1, d2) -> d1 + d2);
        printObject(op);
        double sum = students.stream().map(Student::getScore).reduce(0.0, (d1, d2) -> d1 + d2);
        System.out.println(sum);

        Map<Boolean, List<Student>> maps = students.stream().collect(Collectors.partitioningBy(s -> s.getScore() > 60));
        System.out.println(maps);

        Map<Character, Map<String, List<Student>>> stuMaps = students.stream()
            .collect(Collectors.groupingBy(Student::getType, Collectors.groupingBy(Student::getGrade)));

        System.out.println("stuMaps" + stuMaps);

        Map<Character, Map<String, Double>> groupby = students.stream().collect(Collectors.groupingBy(Student::getType,
            Collectors.groupingBy(Student::getGrade, Collectors.averagingDouble(Student::getScore))));
        System.out.println("groupby:" + groupby);

    }

    private static void printObject(Optional op) {
        if (op.isPresent()) {
            System.out.println("optional:" + op.get());
        } else {
            System.out.println("optional: null");
        }
    }

    private static Student createStu(int no, double score) {
        return new Student("Code_" + no, "Name_" + no, "Grade_" + no % 5, no % 2 == 0 ? 'A' : 'S', score);
    }

}

class Student {
    private String code;
    private String name;
    private String grade;
    private char type;
    private double score;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("code='").append(code).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", grade='").append(grade).append('\'');
        sb.append(", type=").append(type);
        sb.append(", score=").append(score);
        sb.append('}');
        return sb.toString();
    }

    public Student(String code, String name, String grade, char type, double score) {
        this.code = code;
        this.name = name;
        this.grade = grade;
        this.type = type;
        this.score = score;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
