public class Student extends Person{
    private Section[] section = new Section[10];
    private int grade;
    private int sectionCount;

    public Student(int grade, String name, int id){
        super(name, id);
        this.grade = grade;
        this.sectionCount = 0;
    }

    public int getGrade(){
        return this.grade;
    }

    public void setGrade(int g){
        this.grade = g;
    }

    public Section[] getSections(){
        return this.section;
    }

    public void addSection(Section s){
        this.section[sectionCount] = s;
        sectionCount++;
    }
}
