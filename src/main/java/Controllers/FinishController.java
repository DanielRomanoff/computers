package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Computers.Desktop;
import Computers.Laptop;
import Computers.Tablet;
import Models.GlobalUser;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FinishController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView selectPoster;

    @FXML
    private Text nameText;

    @FXML
    private Text text, text1, text2, text3, text4, text5, text6, text7, text8, text9, text10, text11, text12;

    @FXML
    private Text backButton;

    @FXML
    private Text selectButton;

    @FXML
    void backToPrevScene(MouseEvent event) {
        backButton.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(DesktopsController.class.getResource("/Front/Type.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage = new Stage();
        Parent root = loader.getRoot();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    void success(MouseEvent event) {
        GlobalUser.userService.saveUser(GlobalUser.user);
        selectButton.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(DesktopsController.class.getResource("/Front/Success.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage = new Stage();
        Parent root = loader.getRoot();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    void initialize() {
        nameText.setText(GlobalUser.user.getComputer().getModel());
        selectPoster.setImage(GlobalUser.user.getComputer().getPoster());
        text.setText(GlobalUser.user.getComputer().getType());
        if(GlobalUser.user.getComputer().getClass().equals(Laptop.class)){
            text1.setText("Expansion: " + ((Laptop) GlobalUser.user.getComputer()).getExpansion());
            text2.setText("Processor: " + ((Laptop) GlobalUser.user.getComputer()).getProcessor());
            text3.setText("GHz: " + ((Laptop) GlobalUser.user.getComputer()).getGHz());
            text4.setText("RAM: " + ((Laptop) GlobalUser.user.getComputer()).getRAM());
            text5.setText("HDD: " + (((Laptop) GlobalUser.user.getComputer()).getHDD()));
            text6.setText("SDD: " + (((Laptop) GlobalUser.user.getComputer()).getSSD()));
            text7.setText("Video Card: " + (((Laptop) GlobalUser.user.getComputer()).getVideoCard()));
            text8.setText("OS: " + (((Laptop) GlobalUser.user.getComputer()).getOS()));
            text9.setText(String.format("Price: %s", GlobalUser.user.getComputer().getPrice()));
            text10.setText("Color: " + (GlobalUser.user.getComputer().getColor()));
        }

        if(GlobalUser.user.getComputer().getClass().equals(Desktop.class)){
            text1.setText("Processor: " + ((Desktop) GlobalUser.user.getComputer()).getProcessor());
            text2.setText("MHz: " + ((Desktop) GlobalUser.user.getComputer()).getMHz());
            text3.setText("HDD: " + (((Desktop) GlobalUser.user.getComputer()).getHDD()));
            text4.setText("SDD: " + (((Desktop) GlobalUser.user.getComputer()).getSDD()));
            text5.setText("DDR: " + (((Desktop) GlobalUser.user.getComputer()).getDDR()));
            text6.setText("Video Card: " + (((Desktop) GlobalUser.user.getComputer()).getVideoCard()));
            text7.setText("OS: " + (((Desktop) GlobalUser.user.getComputer()).getOS()));
            text8.setText(String.format("Price: %s", GlobalUser.user.getComputer().getPrice()));
            text9.setText("Color: " + (GlobalUser.user.getComputer().getColor()));
        }

        if(GlobalUser.user.getComputer().getClass().equals(Tablet.class)){
            text1.setText("Expansion: " + ((Tablet) GlobalUser.user.getComputer()).getExpansion());
            text2.setText("GHz: " + ((Tablet) GlobalUser.user.getComputer()).getGHz());
            text3.setText("OS: " + (((Tablet) GlobalUser.user.getComputer()).getOS()));
            text4.setText(String.format("Price: %s", GlobalUser.user.getComputer().getPrice()));
            text5.setText("Color: " + (GlobalUser.user.getComputer().getColor()));
        }
    }
}
