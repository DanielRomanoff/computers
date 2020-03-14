package Computers;

public class Laptop extends Computer {
    private String expansion; //расширение экрана
    private String processor;
    private String GHz;
    private String RAM;
    private String HDD;
    private String SSD;
    private String videoCard;
    private String OS;

    public Laptop(String price, String model, String color, String HDD, String OS, String processor, String videoCard, String expansion, String GHz, String RAM, String SSD) {
        super(price, model, color);
        setHDD(HDD);
        setOS(OS);
        setProcessor(processor);
        setVideoCard(videoCard);
        setExpansion(expansion);
        setGHz(GHz);
        setRAM(RAM);
        setSSD(SSD);
        setType("Laptop");
    }

    public String getExpansion() {
        return expansion;
    }

    public void setExpansion(String expansion) {
        this.expansion = expansion;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getGHz() {
        return GHz;
    }

    public void setGHz(String GHz) {
        this.GHz = GHz;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getHDD() {
        return HDD;
    }

    public void setHDD(String HDD) {
        this.HDD = HDD;
    }

    public String getSSD() {
        return SSD;
    }

    public void setSSD(String SSD) {
        this.SSD = SSD;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }
}
