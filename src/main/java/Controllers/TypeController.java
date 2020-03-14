package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Computers.Tablet;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class TypeController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView Desktops;

    @FXML
    private ImageView Tablets;

    @FXML
    private ImageView Laptops;

    @FXML
    void desktopType(MouseEvent event) {
        Desktops.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(StartController.class.getResource("/Front/Desktops.fxml"));
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
    void laptopType(MouseEvent event) {
        Laptops.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(StartController.class.getResource("/Front/Laptops.fxml"));
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
    void tabletType(MouseEvent event) {
        Tablets.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(StartController.class.getResource("/Front/Tablets.fxml"));
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

    }
}
