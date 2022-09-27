package corejava.collection.assignment.part3.question1.solution;
import corejava.collection.assignment.part3.question1.model.Student;
import java.util.ArrayList;
import java.util.List;

public class ListUtil {
//    Create a List of Students.
    public static List<Student> getListOfStudent(final String[] data) throws RuntimeException {
        List<Student> studentList = new ArrayList<>();
        try {
            for (String str : data) {
                String[] arrData = str.split(", ");
                Integer studId = Integer.parseInt(arrData[0]);
                String studName = arrData[1];
                Student student = new Student(studId, studName);
                studentList.add(student);
            }
        } catch (NumberFormatException numberFormatException) {
            throw new RuntimeException(numberFormatException);
        }
        return studentList;
    }
    public static List<Student> getFilterTheListOfStudent(List<Student> studentList){
        List<Student> filterList = new ArrayList<>();
        for (Student student:studentList) {
            if(student.getStudentId() > 23){
                filterList.add(student);
            }
        }

        return filterList;
    }
    public static List<Student> getListOfStudentByStudentNameLength(List<Student> students, Integer length){
        List<Student> studentList = new ArrayList<>();
        for (Student student:students) {
            if(student.getStudentName().length() > length){
                studentList.add(student);
            }
        }
        return  studentList;
    }
   public static void printResult(List<Student> studentList) {
        if(studentList != null ) {
            for (Student student : studentList)
                System.out.println(student.toString());
            System.out.println();
        }
    }
}
