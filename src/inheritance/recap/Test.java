package inheritance.recap;

public class Test {
    public static void main(String[] args) {

        System.out.println("\nCOMPUTER OBJECT");
        Computer computer = new Computer("12.2.1", "45TG-56YH", "Intel", "Asus", 512.0);
        computer.hasScreen = false;
        computer.hasKeyboard = true;

            Computer.runProgram("Slack");
            Computer.runProgram("Zoom");
            Computer.shutDown();

            System.out.println("\nMAC OBJECT");
            Mac mac = new Mac("12.2.1", "C02FD11507DW", "2.3 GHz Dual-Core Intel Core i5",
                    "macOS Motherboard", 250.69);
            mac.hasGarbageMagicMouse = true;

            System.out.println(mac);
            System.out.println("Key of the mac is = " + mac.getKey());
            System.out.println("Has icloud = " + Mac.hasIcloud);
            System.out.println("Has itunes = " + Mac.hasItunes);
            Mac.boot();
            Mac.runProgram("Safari");
            Mac.getsSlowerWithEveryUpdate();
            Mac.getsSlowerWithEveryUpdate();
            Mac.getsSlowerWithEveryUpdate();
            Mac.getsSlowerWithEveryUpdate();
            Mac.shutDown();

            System.out.println("\nWINDOWS OBJECT");

            Windows abesComputer = new Windows("Windows 10", "12kv2-123kd", "Intel i7",
                    "Lenovo", 2000.00, true, true, true, false);

            System.out.println(abesComputer);
            System.out.println("Key of the pc is = " + abesComputer.getKey());
            System.out.println("Has task manager = " + Windows.hasTaskManager);
            System.out.println("Has start = " + Windows.hasStart);
            Windows.boot();
            Windows.runProgram("Chrome");
            abesComputer.cleanViruses();
            Windows.shutDown();


        }
    }








