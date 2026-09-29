class Engine {
    int horsePower;
    int torque;
    int maxRPM;

    Engine(int horsePower, int torque, int maxRPM) {
        this.horsePower = horsePower;
        this.torque = torque;
        this.maxRPM = maxRPM;
    }

    void showEngineInfo()
    {
        System.out.println("Horsepower : " + horsePower);
        System.out.println("Torque : " + torque);
        System.out.println("Max RPM : " + maxRPM);
    }
}