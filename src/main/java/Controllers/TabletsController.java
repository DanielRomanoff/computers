package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

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

public class TabletsController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView AppleiPadPro;

    @FXML
    private ImageView SamsungGalaxyTab;

    @FXML
    private ImageView SamsungGalaxyS5E;

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
        AppleiPadPro.setOnMouseClicked(event -> {
            GlobalUser.user.addComputer(new Tablet("128 199", "Apple iPad Pro", "grey", "12.9", "2.9 GHz", "iOS"));
            GlobalUser.user.getComputer().setPoster(AppleiPadPro.getImage());
            nextScene(AppleiPadPro);
        });
        SamsungGalaxyTab.setOnMouseClicked(event -> {
            GlobalUser.user.addComputer(new Tablet("59 999", "Samsung Galaxy Tab S6", "black", "10.5", "2.84 GHz", "Android 9.x+"));
            GlobalUser.user.getComputer().setPoster(SamsungGalaxyTab.getImage());
            nextScene(SamsungGalaxyTab);
        });
        SamsungGalaxyS5E.setOnMouseClicked(event -> {
            GlobalUser.user.addComputer(new Tablet("34 999", " Samsung Galaxy Tab S5e", "black", "10.5", "1.7 GHz", "Android 9.x+"));
            GlobalUser.user.getComputer().setPoster(SamsungGalaxyS5E.getImage());
            nextScene(SamsungGalaxyS5E);
        });


    }
}
