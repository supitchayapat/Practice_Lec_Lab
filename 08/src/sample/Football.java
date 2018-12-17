package sample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Football {
    File file = new File("src/sample/team.csv");
    HashMap<String, Football> team = new HashMap<>();
    ArrayList<String> gK = new ArrayList<>();
    ArrayList<String> dF = new ArrayList<>();
    ArrayList<String> mF = new ArrayList<>();
    ArrayList<String> fW = new ArrayList<>();

    private String shirt;
    private String position;

    public Football(String shirt, String position) {
        this.shirt = shirt;
        this.position = position;
    }
    public Football() {
    }
    public String getShirt() {
        return shirt;
    }

    public String getPosition() {
        return position;
    }

    public void readFile() throws IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        String line;

        while ((line = reader.readLine()) != null) {
            String[] list = line.split("_");
            if (list[0].equals("NAME") && list[1].equals("SHIRT") && list[2].equals("POSITION")) {
                continue;
            } else {
                team.put(list[0], new Football(list[1], list[2]));
            }
        }
        reader.close();
    }

    public String setFormation(FormTeam formation) throws IOException {
        return formation.format();
    }

    public void addPosition() {
        for (Map.Entry<String, Football> entry : team.entrySet()) {
            String a = entry.getKey();
            String b = entry.getValue().getShirt();
            String c = entry.getValue().getPosition();
            if (c.equals("GK")) {
                gK.add(a);
            }
            if (c.equals("DF") || c.equals("DF/FW") || c.equals("DF/MF")) {
                dF.add(a);
            }
            if (c.equals("MF") || c.equals("MF/FW")) {
                mF.add(a);
            }
            if (c.equals("FW")) {
                fW.add(a);
            }
        }
        Collections.shuffle(fW);
        Collections.shuffle(dF);
        Collections.shuffle(mF);
        Collections.shuffle(gK);
    }
}



