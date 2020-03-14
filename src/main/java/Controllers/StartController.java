package Controllers;

import javafx.scene.control.TextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Models.GlobalUser;
import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class StartController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text enterButton;

    @FXML
    private ImageView item2;

    @FXML
    private ImageView item1;

    @FXML
    private TextField userNameField;

    @FXML
    void enterUser(MouseEvent event) {
        GlobalUser.user.setName(userNameField.getText());
        enterButton.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(StartController.class.getResource("/Front/Type.fxml"));
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
        RotateTransition rt = new RotateTransition(Duration.seconds(5), item1);
        rt.setInterpolator(Interpolator.LINEAR);
        rt.setFromAngle(360);
        rt.setToAngle(0);
        rt.setCycleCount(Animation.INDEFINITE);
        rt.play();

        RotateTransition rt1 = new RotateTransition(Duration.seconds(5), item2);
        rt1.setInterpolator(Interpolator.LINEAR);
        rt1.setFromAngle(0);
        rt1.setToAngle(360);
        rt1.setCycleCount(Animation.INDEFINITE);
        rt1.play();
    }
}
