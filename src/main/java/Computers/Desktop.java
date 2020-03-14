package Computers;

public class Desktop extends Computer{
    private String HDD;
    private String SDD;
    private String processor;
    private String MHz;
    private String videoCard;
    private String DDR;
    private String OS;

    public Desktop(String price, String model, String color, String HDD, String SDD, String processor, String MHz, String videoCard, String DDR, String OS) {
        super(price, model, color);
        setSDD(SDD);
        setDDR(DDR);
        setHDD(HDD);
        setOS(OS);
        setMHz(MHz);
        setProcessor(processor);
        setVideoCard(videoCard);
        setType("Desktop");
    }

    public String getHDD() {
        return HDD;
    }

    public void setHDD(String HDD) {
        this.HDD = HDD;
    }

    public String getSDD() {
        return SDD;
    }

    public void setSDD(String SDD) {
        this.SDD = SDD;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getMHz() {
        return MHz;
    }

    public void setMHz(String MHz) {
        this.MHz = MHz;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public String getDDR() {
        return DDR;
    }

    public void setDDR(String DDR) {
        this.DDR = DDR;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }
}
