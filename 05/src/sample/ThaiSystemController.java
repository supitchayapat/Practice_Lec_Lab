package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ThaiSystemController implements Observer{
    @FXML
    Label slungLabel, bahtLabel, tamlungLabel, haabLabel, changLabel;
    private ThaiSystem thaiSystem;

    public void initialize(){
        thaiSystem = new ThaiSystem();
    }

    @Override
    public void update(String unit, double value) {
        System.out.println("DEBUG: ThaiSystem.update()");

        if (unit.equals("kg")){
            thaiSystem.setFromKg(value);
        }else if (unit.equals("lb")){
            thaiSystem.setFromEnglish(value);
        }else if (unit.equals("tamlung")){
            thaiSystem.setFromThai(value);
        }

        slungLabel.setText(thaiSystem.getSlung()+"");
        bahtLabel.setText(thaiSystem.toBaht()+"");
        tamlungLabel.setText(thaiSystem.toTamlung()+"");
        haabLabel.setText(thaiSystem.toHaab()+"");
        changLabel.setText(thaiSystem.toChang()+"");

    }
}
