
 public class Teacher {

     private final String name;
     public String teacherName;

        public Teacher() {
            System.out.println("Una nuova insegnante è stata creata");
            this.name = teacherName;

        }

        public void assignGrade(Student alum, int finalGrade) {
            alum.grade = finalGrade;
        }

     public void getTeacherDetails(){
         System.out.println("questa insegnante si chiama " + teacherName);
     }
 }

