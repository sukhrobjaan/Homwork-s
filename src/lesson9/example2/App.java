package lesson9.example2;

public class App {
    String appName;
    int appVolume;

    public App(String appName, int appVolume) {
        this.appName = appName;
        this.appVolume = appVolume;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public int getAppVolume() {
        return appVolume;
    }

    public void setAppVolume(int appVolume) {
        this.appVolume = appVolume;
    }
}
