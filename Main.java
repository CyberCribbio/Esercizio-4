public class Main{
            public Main() {
            }

            public static void main(String[] args) {
                Student student1 = new Student("Filippo");
                Student student2 = new Student("Gigi");
                Teacher teacher = new Teacher();
                teacher.teacherName = "Virginia";
                teacher.assignGrade(student1, 7);
                teacher.assignGrade(student2, 9);
                student1.getStudentDetails();
                student2.getStudentDetails();
                teacher.getTeacherDetails();
            }
        }
