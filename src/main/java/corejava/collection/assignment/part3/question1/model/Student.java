package corejava.collection.assignment.part3.question1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private Integer studentId;
    private String studentName;

    @Override
    public String toString() {
        return java.text.MessageFormat.format("Id: {0}\t StudentName: {1}\t\n", studentId, studentName);
    }

}
