package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Computers.Desktop;
import Models.GlobalUser;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DesktopsController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView acerPredatorOrion;

    @FXML
    private ImageView DellAlienwareAurora;

    @FXML
    private ImageView DEXPJupiter;

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
        acerPredatorOrion.setOnMouseClicked(event -> {
            GlobalUser.user.addComputer(new Desktop("696 999", "Acer Predator Orion 9000 PO9-900", "black", "3TB", "512GB", "Intel Core i9 9980XE", "4400", "2x GeForce RTX 2080Ti", "128GB", "Windows 10"));
            GlobalUser.user.getComputer().setPoster(acerPredatorOrion.getImage());
            nextScene(acerPredatorOrion);
        });
        DellAlienwareAurora.setOnMouseClicked(event -> {
            GlobalUser.user.addComputer(new Desktop("199 999", "Dell Alienware Aurora R9", "black", "None", "1000GB", "Intel Core i7 9700", "4700", "GeForce RTX 2080 SUPER", "32 GB", "Windows 10"));
            GlobalUser.user.getComputer().setPoster(DellAlienwareAurora.getImage());
            nextScene(DellAlienwareAurora);
        });
        DEXPJupiter.setOnMouseClicked(event -> {
            GlobalUser.user.addComputer(new Desktop("89 999", "DEXP Jupiter P233", "black", "2TB", "512GB", "Intel Core i7 9700F", "4700 ", "GeForce RTX 2070", "16GB", "Windows 10"));
            GlobalUser.user.getComputer().setPoster(DEXPJupiter.getImage());
            nextScene(DEXPJupiter);
        });
    }
}
