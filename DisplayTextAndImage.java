import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DisplayTextAndImage extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Step 3: Set the stage title
        primaryStage.setTitle("Text and Image Display");

        // Step 4: Create the label
        Label label = new Label("Hello, JavaFX!");

        // Step 5: Load the image from a file path
        // Replace imagePath.jpg with the actual path to your image,
        // e.g. "file:C:/Users/you/Pictures/photo.jpg" or "file:/home/you/photo.jpg"
        Image image = new Image("file:imagePath.jpg");
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(400);
        imageView.setFitHeight(300);
        imageView.setPreserveRatio(true);

        // Step 6: VBox layout with 10 pixels spacing
        VBox vbox = new VBox(10);
        vbox.setAlignment(Pos.CENTER);
        vbox.getChildren().addAll(label, imageView);

        // Step 7: Scene of size 600x400
        Scene scene = new Scene(vbox, 600, 400);

        // Step 8: Set the scene and show the stage
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Step 9: main method launches the application
    public static void main(String[] args) {
        launch(args);
    }
}
