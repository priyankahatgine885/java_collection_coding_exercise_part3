package corejava.collection.assignment.part3.question1.main;
import corejava.collection.assignment.part3.question1.model.Student;
import corejava.collection.assignment.part3.question1.solution.ListUtil;
import corejava.collection.assignment.part3.question1.solution.SortById;
import corejava.collection.assignment.part3.question1.solution.SortByName;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] studentsInformation = {
                "22, Rajesh",
                "23, Dinesh",
                "22, Aboli",
                "26, Mayuresh",
                "25, Sarika",
                "24, Ketaki"
        };

        List<Student> studentList = ListUtil.getListOfStudent(studentsInformation);
        System.out.println("Unsorted List : ");
        ListUtil.printResult(studentList);

        System.out.println("filter the list of students for studentId > 23 : ");
        System.out.println();
        List<Student> students = ListUtil.getFilterTheListOfStudent(studentList);
        ListUtil.printResult(students);

        System.out.println("List Of Student By Student Name Length : ");
       List<Student> listOfStudentByStudentNameLength =  ListUtil.getListOfStudentByStudentNameLength(studentList, 5);
        ListUtil.printResult(listOfStudentByStudentNameLength);

        System.out.println("Sorted List By Name : ");
        System.out.println();
        Comparator<Student> comparator = new SortByName();
        Collections.sort(studentList,comparator);
        ListUtil.printResult(studentList);

        comparator = new SortById();
        Collections.sort(studentList, comparator);
        System.out.println("Sorted List By Id In Descending order : ");
        System.out.println();
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
