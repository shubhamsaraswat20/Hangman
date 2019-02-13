public class CanteenCustomer {

    public static void main(String[] args) {

        // primitive data types are:-
        // int, float, double, char, long,
        // short, byte, boolean

        float[] arr = new float[10];
        System.out.println(arr[0]);

        String[] str = new String[10];
        System.out.println(str[0]);

        Object[] obj = new Object[10];
        System.out.println(obj[0]);

        Student student = new Student();

        // getters and setters concept for private
        student.setA(1);
        student.setB("Shubh");
        System.out.println(student);
        // getters and setters concept for private

        student.name = "Shubh";
        student.rollNo = 42;

        Student[] students = new Student[47];

        for (int i = 0; i < students.length; i++) {

            students[i] = new Student();
            students[i].rollNo = i+1;
            students[i].name = "Shubh" + i;

        }

        for (Student student1 : students) {

            System.out.println(student1);

        }

    }

}

class Student {

    int rollNo;
    String name;

    private int a;
    private String b;

    // getters and setters concept for private
    public int getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(String b) {
        this.b = b;
    }
    // getters and setters concept for private

    @Override
    public String toString() {
        return (rollNo + "," + name);
    }

}
