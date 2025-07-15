
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
}
