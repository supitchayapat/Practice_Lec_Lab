package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ThaiSystemController implements Observer {

        @FXML
        Label sLabel, tLabel, bLabel;
        private ThaiSystem thaiSystem;
        public void initialize(){
        thaiSystem = new ThaiSystem();

    }

    @Override
    public void update(String unit, double value) {
        if (unit.equals("kg")){
            thaiSystem.setFromMetricSystem(value);

        }else if (unit.equals("lb")){
            thaiSystem.setFromEnglishSystem(value);
        }
        else if (unit.equals("tl")){
            thaiSystem.setTamleung(value);
        }
        sLabel.setText(thaiSystem.toSaleung()+"");
        bLabel.setText(thaiSystem.toBaht()+"");
        tLabel.setText(thaiSystem.getTl()+"");
    }
}


