
import java.util.Arrays;

public class Course {

    private String nameCourse;
    private String listNameStudent[] = new String[0];

    Course(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public int getNumberOfStudents() {
        return listNameStudent.length;
    }

    public void addStudent(String nameStudent) {

        listNameStudent = Arrays.copyOf(listNameStudent, listNameStudent.length + 1);
        listNameStudent[listNameStudent.length - 1] = nameStudent;
    }

    public void displayListStudent() {
        System.out.println("\nList Students");
        System.out.println("Course : " + nameCourse);
        System.out.print("member : ");
        if (listNameStudent.length>0) {
            for (int i = 0; i < listNameStudent.length; i++) {
                System.out.print(listNameStudent[i]);
                if (i < listNameStudent.length - 1) {
                    System.out.print(", ");
                }
            }
        }else{
            System.out.print("no student in this Course");
        }
        System.out.print("\n\n");
    }

    public void dropStudent(String nameStudent) {
        // System.out.println(Arrays.binarySearch(listNameStudent, nameStudent));
        int index = Arrays.binarySearch(listNameStudent, nameStudent);

        if (index != -1) {
            String updateListNameStudent[] = new String[listNameStudent.length - 1];
            for (int i = 0; i < index; i++) {
                updateListNameStudent[i] = listNameStudent[i];
            }
            for (int i = index; i < updateListNameStudent.length; i++) {
                updateListNameStudent[i] = listNameStudent[i + 1];
            }
            Arrays.copyOf(listNameStudent, updateListNameStudent.length);
            listNameStudent = updateListNameStudent;
        } else {
            System.out.println("name : " + nameStudent + " is not member in the Course : " + nameCourse);
            // if (listNameStudent.length>0) {
            //     System.out.println("name : " + nameStudent + " is not member in Course : " + nameCourse);
            // } else {
            //     System.out.println("no student in this Course");
            // }
        }
        
    }

    public void clear() {
        String updateListNameStudent[] = new String[0];
        listNameStudent = updateListNameStudent;

        // listNameStudent = Arrays.copyOf(listNameStudent, listNameStudent.length + 1);
        System.out.println("Course " + nameCourse + " is removes all students");
    }

}
