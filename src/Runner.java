public class Runner {
    public static void main(String[] args){
        School bhs = new School("Berkeley High");

        Teacher a = new Teacher("Albinson", 1, "Computer Science");
        Teacher n = new Teacher("Nathan", 2, "Math");
        Teacher m = new Teacher("Moreno", 3, "English");

        Student me = new Student(11, "Nina", 1);
        Student e = new Student(11, "Eva", 2);
        Student ab = new Student(11, "Abby", 3);
        Student f = new Student(12, "Freddy", 4);
        Student h = new Student(9, "Harold", 5);
        Student s = new Student(10, "Sybil", 6);

        Section compsci = new Section("Computer Science", 30);
        compsci.setTeacher(a);

        compsci.addStudent(me);
        compsci.addStudent(ab);
        compsci.addStudent(e);
        compsci.addStudent(f);

        System.out.println(compsci.toString());

        Section math = new Section("Math", 30);
        math.setTeacher(n);

        math.addStudent(h);
        math.addStudent(me);
        math.addStudent(s);
        math.addStudent(e);

        System.out.println(math.toString());

        Section english = new Section("English", 30);
        english.setTeacher(m);

        english.addStudent(h);
        english.addStudent(f);
        english.addStudent(s);
        english.addStudent(ab);

        System.out.println(english.toString());



    }
}
