interface Perintah {
    void turnOn();
    void turnOff();
    void volumeUp();
    void volumeDown();
}

abstract class alatElektronik implements Perintah {
    String brand;
    String model;

    alatElektronik(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    abstract void displayInfo();
}

class Televisi extends alatElektronik {
    Televisi(String brand, String model) {
        super(brand, model);
    }

    @Override
    void displayInfo() {
        System.out.println("Televisi - Brand: " + brand + ", Model: " + model);
    }

    @Override
    public void turnOn() {
        System.out.println("TV hidup");
    }

    @Override
    public void turnOff() {
        System.out.println("TV mati");
    }

    @Override
    public void volumeUp() {
        System.out.println("Volume dinaikkan");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume diturunkan");
    }
}

class Radio extends alatElektronik {
    Radio(String brand, String model) {
        super(brand, model);
    }

    @Override
    void displayInfo() {
        System.out.println("Radio - Brand: " + brand + ", Model: " + model);
    }

    @Override
    public void turnOn() {
        System.out.println("Radio hidup");
    }

    @Override
    public void turnOff() {
        System.out.println("Radio mati");
    }

    @Override
    public void volumeUp() {
        System.out.println("Volume dinaikkan");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume diturunkan");
    }
}

class Hp extends alatElektronik {
    Hp(String brand, String model) {
        super(brand, model);
    }

    @Override
    void displayInfo() {
        System.out.println("Hp - Brand: " + brand + ", Model: " + model);
    }

    @Override
    public void turnOn() {
        System.out.println("Hp hidup");
    }

    @Override
    public void turnOff() {
        System.out.println("Hp mati");
    }

    @Override
    public void volumeUp() {
        System.out.println("Volume dinaikkan");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume diturunkan");
    }
}

public class Tugas1 {
    public static void main(String[] args) {
        Televisi tv = new Televisi("LG", "Smart TV"); // Brand Televisi diubah ke LG
        Radio radio = new Radio("Sony", "FM/AM Radio");
        Hp hp = new Hp("Xiaomi", "iPhone 12"); // Brand Hp diubah ke Xiaomi

        tv.displayInfo();
        tv.turnOn();
        tv.volumeUp();
        tv.volumeDown();
        tv.turnOff();

        radio.displayInfo();
        radio.turnOn();
        radio.volumeUp();
        radio.volumeDown();
        radio.turnOff();

        hp.displayInfo();
        hp.turnOn();
        hp.volumeUp();
        hp.volumeDown();
        hp.turnOff();
    }
}
