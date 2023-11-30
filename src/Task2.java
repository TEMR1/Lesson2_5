import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ElectronicDevice television = new Television();
        ElectronicDevice computer = new Computer();

        ArrayList<ElectronicDevice> electronicDevices = new ArrayList<>();
        electronicDevices.add(television);
        electronicDevices.add(computer);

        for (ElectronicDevice electronicDevice : electronicDevices) {
            if (electronicDevice instanceof Television){
                Television tv = (Television) electronicDevice;
                tv.turnOn();
                tv.turnOff();
            }

            else if (electronicDevice instanceof Computer){
                Computer myComputer = (Computer) electronicDevice;
                myComputer.turnOn();
                myComputer.turnOff();
            }
            System.out.println("--------------------------------------------");
        }
    }
}

interface ElectronicDevice{
    void turnOn();
    void turnOff();
}

class Television implements ElectronicDevice{

    @Override
    public void turnOn() {
        System.out.println("Телевізор включено");
    }

    @Override
    public void turnOff() {
        System.out.println("Телевізор вимкнуто");
    }
}

class Computer implements ElectronicDevice{

    @Override
    public void turnOn() {
        System.out.println("Комп'ютер включено");
    }

    @Override
    public void turnOff() {
        System.out.println("Комп'ютер виключено");
    }
}
