import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.application.Application;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Ellipse;
import javafx.scene.paint.Color;

public class B_Ellipse extends Application
{
    public void start(Stage stage)
    {
        final double PANE_WIDTH  = 500;
        final double PANE_HEIGHT = 300;

        Pane    pane     = new Pane();
       Ellipse orbit = new Ellipse( PANE_WIDTH /2, PANE_HEIGHT /2, PANE_WIDTH /2, PANE_HEIGHT /2);

        
        
        
        orbit.setStrokeWidth(50);
        orbit.setStroke     (Color.MAGENTA);
        orbit.setFill       (Color.LIME);
		orbit.setRotate(-5);

        pane.getChildren().addAll(orbit);
        Scene scene = new Scene(pane, PANE_WIDTH, PANE_HEIGHT);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args)
    {
        launch();
    }
}