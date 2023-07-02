package prototype;

public class Client {

    public static void fillRegistry(StudentRegistry registry) {
        Student july22Prototype = new Student();
        july22Prototype.setBatch("July22");
        july22Prototype.setAverageBatchPsp(80.0);

        //July22Intelligent
        IntellijgentStudent july22Int = new IntellijgentStudent();
        july22Int.setBatch("July22");
        july22Int.setAverageBatchPsp(99.0);

        registry.register("July22", july22Prototype);
        registry.register("July22Int", july22Int);
    }
    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();
        fillRegistry(registry);

        Student utsav = registry.get("July22").clone();
        utsav.setName("Utsav");
        utsav.setAge(25);
        utsav.setPsp(89.0);

        Student prakash = registry.get("July22Int").clone();
        prakash.setName("Prakash");
        prakash.setPsp(99.1);
        prakash.setAge(25);

        System.out.println("DEBUG");
    }
}
