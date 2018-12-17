package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class EnglishSystemController implements Observer{
    @FXML
    Label ozLabel, lbLabel, stoneLabel;
    private EnglishSystem englishSystem;
    public void initialize(){
        englishSystem = new EnglishSystem();
    }


    @Override
    public void update(String unit, double value) {
        System.out.println("DEBUG: EnglishSystemController.update()");

        if (unit.equals("kg")){
            englishSystem.setFromMetricSystem(value);
        }else if (unit.equals("lb")){
            englishSystem.setPound(value);
        }else if (unit.equals("tamlung")){
            englishSystem.setFromThaiSystem(value);
        }

        ozLabel.setText(englishSystem.getOz()+"");
        lbLabel.setText(englishSystem.toPound()+"");
        stoneLabel.setText(englishSystem.toStone()+"");
    }
}
