    public class Student {
        public String name;
        public int grade;

        public Student(String studentName) {
            System.out.println("Un nuovo studente è stato creato");
            this.name = studentName;
        }

        public void getStudentDetails() {
            System.out.println("this student " + this.name + " has a " + this.grade + " grade");
        }
    }

