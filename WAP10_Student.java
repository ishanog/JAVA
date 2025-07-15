
class WAP10_Student {
    int id, marks;

    WAP10_Student() {
        id = 1;
        marks = 50;
    }

    WAP10_Student(int id, int marks) {
        this.id = id;
        this.marks = marks;
    }

    WAP10_Student(WAP10_Student s) {
        this.id = s.id;
        this.marks = s.marks;
    }
    public static void main(String[] args) {

        WAP10_Student s1 = new WAP10_Student(); 

        System.out.println("Student: ID=" + s1.id + ", Marks=" + s1.marks);
    }
}

