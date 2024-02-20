package lesson9.example2;

public class MainClass {
    public static void main(String[] args) {
        App app = new App("Telegram", 100);
        App app1 = new App("Telegra", 100);
        App app2 = new App("Telegr", 100);
        App app3 = new App("Telegam", 100);
        App app4 = new App("Teleram", 100);
        App app5 = new App("Telgram", 100);
        App app6 = new App("Teegram", 100);
        Divice divice = new Divice(2000);

        System.out.println(1);
        System.out.println(divice.install(app));
        System.out.println(2);
        System.out.println(divice.install(app1));
        System.out.println(3);
        System.out.println(divice.install(app2));
        System.out.println(4);
        System.out.println(divice.install(app3));
        System.out.println(5);
        System.out.println(divice.install(app4));
        System.out.println(6);
        System.out.println(divice.install(app5));
        System.out.println(7);
        System.out.println(divice.install(app6));

        divice.showApps();

        System.out.println(divice.uninstall("Teegram"));
        divice.run("Telegram");
        System.out.println(divice.getDdrVolume());

        divice.showApps();
    }
}
