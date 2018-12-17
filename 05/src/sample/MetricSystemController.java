package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MetricSystemController implements Observer{
    @FXML
    Label mgLabel, gLabel, kgLabel;
    private MetricSystem metricSystem;

    public void initialize(){
        metricSystem = new MetricSystem();
    }

    @Override
    public void update(String unit, double value) {
        System.out.println("DEBUG: MetricSystem.update()");

        if (unit.equals("kg")){
            metricSystem.setFromKg(value);
        }else if (unit.equals("lb")){
            metricSystem.setFromEnglishSystem(value);
        }else if (unit.equals("tamlung")){
            metricSystem.setFromThaiSystem(value);
        }

        mgLabel.setText(metricSystem.getMg()+"");
        gLabel.setText(metricSystem.toGram()+"");
        kgLabel.setText(metricSystem.toKilogram()+"");
    }
}
