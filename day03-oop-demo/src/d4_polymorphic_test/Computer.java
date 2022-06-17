package d4_polymorphic_test;

public class Computer {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Computer() {
    }

    public Computer(String name) {
        this.name = name;
    }

    public void installUSB(USB usb) {
        usb.connect();
        if (usb instanceof KeyBoard) {
            KeyBoard k = (KeyBoard) usb;
            k.keyDown();
        } else if (usb instanceof Mouse) {
            Mouse m = (Mouse) usb;
            m.dbClick();
        }
    }

    public void start() {
        System.out.println(name + "开机了");
    }
}
