public class studentC {
    String name;
    static String school = "IB School";
    static int count = 0;

    studentC(String name){
        this.name=name;
        count++;
    }

    void display(){
        System.out.println("The student's name is " + name + " and he studies in " + school);
    }
}
