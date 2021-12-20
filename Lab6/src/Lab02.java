
public class Lab02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Course listCourse[] = new Course[10];

        listCourse[0] = new Course("english one zero one");
        listCourse[0].addStudent("kitty");
        listCourse[0].addStudent("farry");
        listCourse[0].addStudent("bobby");

        System.out.println();

        listCourse[0].displayListStudent();
        listCourse[0].dropStudent("far ry");
        listCourse[0].dropStudent("farry");
        listCourse[0].displayListStudent();

        listCourse[0].clear();
        listCourse[0].displayListStudent();
    }
    
}
