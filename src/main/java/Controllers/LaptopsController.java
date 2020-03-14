package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Computers.Laptop;
import Models.GlobalUser;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LaptopsController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView MSIGT75;

    @FXML
    private ImageView ASUSROGZephyrus;

    @FXML
    private ImageView AppleMacBookPro;

    @FXML
    private Text backButton;

    private void nextScene(ImageView imageView) {
        imageView.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(DesktopsController.class.getResource("/Front/Finish.fxml"));
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
    void initialize() {
        MSIGT75.setOnMouseClicked(event -> {
            GlobalUser.user.addComputer(new Laptop("349 999", "MSI GT75 9SG-417RU", "black",
                    "1TB", "Windows 10", "Intel Core i9 9980HK",
                    "GeForce RTX 2080 8 Гб", "3840x2160", "8 х 2.4 GHz", "64GB", "1024GB"));
            GlobalUser.user.getComputer().setPoster(MSIGT75.getImage());
            nextScene(MSIGT75);
        });
        ASUSROGZephyrus.setOnMouseClicked(event -> {
            GlobalUser.user.addComputer(new Laptop("285 499", "ASUS ROG Zephyrus S GX701GXR-EV036T", "black",
                    "None", "Windows 10", "Intel Core i7 9750H",
                    "GeForce RTX 2080 MaxQ 8 Гб", "1920x1080", "6 х 2.6 GHz", "32GB", "1024GB"));
            GlobalUser.user.getComputer().setPoster(ASUSROGZephyrus.getImage());
                    nextScene(ASUSROGZephyrus);
        });
        AppleMacBookPro.setOnMouseClicked(event -> {
            GlobalUser.user.addComputer(new Laptop("232 999", "Apple MacBook Pro Retina TB", "grey",
                    "1TB", "macOS", "Intel Core i9 9980H",
                    "Radeon Pro 5500M 4 Гб", "3072x1920", " 8 х 2.3 ГГц", "16GB", "1024GB"));GlobalUser.user.getComputer().setPoster(AppleMacBookPro.getImage());
                    nextScene(AppleMacBookPro);
        });
    }
}
