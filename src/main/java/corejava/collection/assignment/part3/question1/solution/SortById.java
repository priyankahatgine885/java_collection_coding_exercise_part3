package corejava.collection.assignment.part3.question1.solution;

import corejava.collection.assignment.part3.question1.model.Student;

import java.util.Comparator;

public class SortById implements Comparator<Student>{
    @Override
    public int compare(Student student1, Student student2) {
        return student2.getStudentId() - student1.getStudentId();
    }
}
