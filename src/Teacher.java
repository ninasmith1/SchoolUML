public class Teacher extends Person{
    private Section [] section = new Section[10];
    private String subject;
    private int sectionCount;

    public Teacher(String name, int id, String subject){
        super(name, id);
        this.subject = subject;
    }

    public String getSubject(){
        return this.subject;
    }

    public void setSubject(String n){
        this.subject = n;
    }

    public Section[] getSections(){
        return this.section;
    }

    public void addSection(Section s){
        this.section[sectionCount] = s;
        sectionCount++;
    }
}
