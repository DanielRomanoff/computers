package Computers;

import Models.User;
import javafx.scene.image.Image;

import javax.persistence.*;

@Entity
@Table(name = "Computers")
public abstract class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private String type;
    @Column
    private String price;
    @Column
    private String model;
    @Column
    private String color;
    @OneToOne
    private User user;
    @Transient
    private Image poster;

    public Computer(String price, String model, String color) {
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public Image getPoster() {
        return poster;
    }

    public void setPoster(Image poster) {
        this.poster = poster;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
