package Computers;

public class Tablet extends Computer{
    private String expansion; //расширение экрана
    private String GHz;
    private String OS;

    public Tablet(String price, String model, String color, String expansion, String GHz, String OS) {
        super(price, model, color);
        setExpansion(expansion);
        setGHz(GHz);
        setOS(OS);
        setType("Tablet");
    }

    public String getExpansion() {
        return expansion;
    }

    public void setExpansion(String expansion) {
        this.expansion = expansion;
    }

    public String getGHz() {
        return GHz;
    }

    public void setGHz(String GHz) {
        this.GHz = GHz;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }
}
