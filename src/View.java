import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class View extends Pane {
    private TextField[] f;
    private TextField[] w;
    private Label gradePCT;
    private Label weight;
    private Button calculate;
    private TextField finalGrade;
    private Label finalGradeText;
    private Button clear;


    public View(){
        gradePCT = new Label("Grade (%):");
        gradePCT.relocate(20,30);

        weight = new Label("Weight:");
        weight.relocate(200,30);

        finalGradeText = new Label("Final Grade (%):");
        finalGradeText.relocate(100,130);

        calculate = new Button("Calculate");
        calculate.setPrefSize(100,100);
        calculate.relocate(90,300);

        finalGrade = new TextField();
        finalGrade.setEditable(false);
        finalGrade.setPrefSize(100,15);
        finalGrade.relocate(90,150);

        clear = new Button("Clear Fields");
        clear.setPrefSize(100,100);
        clear.relocate(90,10);

        getChildren().addAll(gradePCT,weight,calculate, finalGrade,finalGradeText,clear);



        f = new TextField[5];
        w = new TextField[5];
        for(int i = 0; i<f.length; i++){
            f[i] = new TextField("0");
            f[i].setPrefSize(50,15);
            f[i].relocate(30,50+i*50);

            w[i] = new TextField("0");
            w[i].setPrefSize(50,15);
            w[i].relocate(200,50+i*50);

            getChildren().addAll(f[i],w[i]);

        }
    }
    public Button getCalculate(){
        return calculate;
    }

    public TextField[] getF(){
        return f;
    }
    public TextField[] getW(){
        return w;
    }
    public TextField getFinalGrade(){
        return finalGrade;
    }
    public Button getClear(){
        return clear;
    }


}
