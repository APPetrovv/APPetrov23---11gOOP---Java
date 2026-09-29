class Dog{
    String name;
    int age;

    Dog(String name,int age){
        this.name=name;
        this.age=age;
    }

    void showInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

    public static void main(String[] args)
    {
        Dog dog1 = new Dog("Ceaser", 4);
        Dog dog2 = new Dog("Python", 7);
        Dog dog3 = new Dog("Doh", 17);

        dog1.showInfo();
        dog2.showInfo();
        dog3.showInfo();
    }


}