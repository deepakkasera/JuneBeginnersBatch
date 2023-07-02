package prototype;

public class Student implements Prototype<Student> {
    private int age;
    private String name;
    private double psp;
    private String batch;
    private double averageBatchPsp;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getAverageBatchPsp() {
        return averageBatchPsp;
    }

    public void setAverageBatchPsp(double averageBatchPsp) {
        this.averageBatchPsp = averageBatchPsp;
    }

    @Override
    public Student clone() {
        Student student = new Student();
        student.setAverageBatchPsp(this.getAverageBatchPsp());
        student.setBatch(this.getBatch());
        return student;
    }
}
