import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class GradeCalculator extends Application {
    @Override
    public void start(Stage primaryStage){
        Pane aPane = new Pane();
        View view = new View();
        aPane.getChildren().add(view);


        view.getCalculate().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                TextField[] f = view.getF();
                TextField[] w = view.getW();
                double total =0;
                double x = 0;
                boolean error = false;
                for(int i = 0; i<f.length; i++) {
                    try {
                         x = ((Double.parseDouble(f[i].getText())) / 100) * Double.parseDouble(w[i].getText());
                    } catch (Exception e){
                        error = true;
                    }
                    total += x;
                }
                if(error == false) {
                    view.getFinalGrade().setText("" + total);
                } else{
                    view.getFinalGrade().setText("Error!");
                }
            }
        });

        view.getClear().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                TextField[] f = view.getF();
                TextField[] w = view.getW();
                for(int i = 0; i<f.length; i++) {
                    w[i].setText("0");
                    f[i].setText("0");
                    view.getFinalGrade().setText("0");
                }
            }
        });



        primaryStage.setTitle("Final Grade Calculator");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(aPane, 295,425));
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
