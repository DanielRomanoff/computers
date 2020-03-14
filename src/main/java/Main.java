import Models.GlobalUser;
import Models.User;
import Services.UserService;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/Front/Start.fxml"));
        primaryStage.setTitle("Computer Store");
        primaryStage.setScene(new Scene(root, 600 , 400));
        primaryStage.setResizable(false);
        primaryStage.show();
        GlobalUser.user = new User("Username");
        GlobalUser.userService = new UserService();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
