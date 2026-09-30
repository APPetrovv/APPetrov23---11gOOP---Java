class Main {
    public static void main(String[] args) {
        studentC student1 = new studentC("Aleksey");
        studentC student2 = new studentC("Daniel");
        student1.display();
        student2.display();
        System.out.println("The student count is : " +  studentC.count);
    }
}
