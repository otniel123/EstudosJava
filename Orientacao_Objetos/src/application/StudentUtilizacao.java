package application;

import entities.Student;

public class StudentUtilizacao {
    public static void main(String[] args) {
        Student student = new Student();

        student.nota1 = 30;
        student.nota2 = 15;
        student.nota3 = 15;

        student.showInformations();
    }
}
