package com.javalec.studentex;

import java.util.ArrayList;

public class StudentManager {

    ArrayList<Student> students = new ArrayList<Student>();
    StudentExpel studentExpel = new StudentExpel();

    public static void main(String[] args) {

        StudentManager manager = new StudentManager();

        manager.addStudent("홍길동", 22, 20123487, "연극영화");
        manager.addStudent("홍길순", 24, 20106428, "수학과");
        manager.addStudent("이은경", 21, 20135788, "국문과");
        manager.addStudent("김철수", 22, 20115282, "체육과");
        manager.addStudent("김순희", 26, 20092356, "무용과");

        System.out.println();

        System.out.println(manager.students.get(0).getName());
        System.out.println(manager.students.get(0).getAge());
        System.out.println(manager.students.get(0).getStudentNum());
        System.out.println(manager.students.get(0).getMajor());

        System.out.println();

        manager.students.get(0).updateInfo(1, "테스터");
        System.out.println(manager.students.get(0).getName());
        manager.students.get(0).updateInfo(2, "32");
        System.out.println(manager.students.get(0).getAge());
    }

    private void addStudent(String name, int age, int studentNum, String major) {
        students.add(new Student(name, age, studentNum, major));
        System.out.println(name + " 학생 정보 입력 성공");
    }

    private void expelStudent() {

    }
}
