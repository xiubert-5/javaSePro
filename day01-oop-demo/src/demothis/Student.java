package demothis;

public class Student {
    private String name;
    private String schoolName;

    /**
     * 如果学生不填写学校，默认这个对象的学校是新余学院
     */
    public Student(String name) {
        this(name, "新余学院");
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Student(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }
}
