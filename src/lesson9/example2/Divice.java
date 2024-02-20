package lesson9.example2;

public class Divice {
    int ddrVolume;

    App[] apps = new App[1000];
    int count = 0;
    int counts = 0;

    public int getCounts() {
        return counts;
    }

    public void setCounts(int counts) {
        this.counts = counts;
    }

    public Divice(int ddrVolume) {
        this.ddrVolume = ddrVolume;
    }


    public int getDdrVolume() {
        return ddrVolume;
    }

    public void setDdrVolume(int ddrVolume) {
        this.ddrVolume = ddrVolume;
    }

    public boolean install(App app) {

        if (count > 0) {
            for (int i = 0; i < count; i++) {
                if (apps[i].getAppName() == app.getAppName()) {
                    return false;
                } else {
                    apps[count++] = app;
                    setDdrVolume(getDdrVolume() - app.getAppVolume());
                    return true;
                }
            }
        }
        apps[count++] = app;
        setDdrVolume(getDdrVolume() - app.getAppVolume());
        return true;
    }


    public void showApps() {
        if (count > 0) {
            for (int i = 0; i < count; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print(i + 1);
                }
                System.out.println();
                System.out.println("Apps Name  => " + apps[i].getAppName());
                System.out.println("Apps Volume  => " + apps[i].getAppVolume());
                System.out.println("----------------");
            }
        } else {
            System.out.println("Applications are loaded");
        }
    }

    public boolean uninstall(String appNames) {
        if (count > 0) {
            for (int i = 0; i < count; i++) {
                if (apps[i].getAppName() == appNames) {
                    setDdrVolume(getDdrVolume() + apps[i].getAppVolume());
                    for (int j = i; j < count - 1; j++) {
                        apps[j] = apps[j + 1];
                    }
                    count--;
                    System.out.println(count);
                    return true;
                }
            }
        }
        return false;
    }

    public void run(String appNames) {
        if (count > 0) {
            for (int i = 0; i < count; i++) {
                if (apps[i].getAppName() == appNames) {
                    System.out.println("Apps Name  => " + apps[i].getAppName());
                    System.out.println("Apps Volume  => " + apps[i].getAppVolume());
                    setCounts(++counts);
                }
            }
        } else {
            System.out.println("ERROR  There is no such App");
            System.out.println("ERROR  There is no such App");
        }

    }




}
