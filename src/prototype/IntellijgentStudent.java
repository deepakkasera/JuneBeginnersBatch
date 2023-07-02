package prototype;

public class IntellijgentStudent extends Student {

    public IntellijgentStudent clone() {
        IntellijgentStudent intellijgentStudent = new IntellijgentStudent();
        intellijgentStudent.setAverageBatchPsp(this.getAverageBatchPsp());
        intellijgentStudent.setBatch(this.getBatch());
        return intellijgentStudent;
    }
}
