class Main{
    public static void main(String[] args) {
        Student student = new Student("Aleksey");
        Student student2 = new Student("Bob");
        Student student3 = new Student("Carlos");

        System.out.println("The number of students is: " + Student.count);
    }
}
