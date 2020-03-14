package Models;

import Computers.Computer;

import javax.persistence.*;

@Entity
@Table (name = "users")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name = "name")
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Computer computer;

    public Computer getComputer() {
        return computer;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User(String name) {
        this.name = name;
    }

    public User(){}

    public void addComputer(Computer computer) {
        computer.setUser(this);
        this.computer = computer;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}