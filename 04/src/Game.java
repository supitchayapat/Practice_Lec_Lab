import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Game {
    private ArrayList<Player> GK;
    private ArrayList<Player> DF;
    private ArrayList<Player> MF;

    public ArrayList<Player> getGK() {
        return GK;
    }

    public ArrayList<Player> getDF() {
        return DF;
    }

    public ArrayList<Player> getMF() {
        return MF;
    }

    public ArrayList<Player> getFW() {
        return FW;
    }

    private ArrayList<Player> FW;
    public void run(){
        String line;
        String cvsSplitBy = ",";
        String csvFile = "team.csv";
        GK = new ArrayList<>();
        DF = new ArrayList<>();
        MF = new ArrayList<>();
        FW = new ArrayList<>();
         try {
            int record = 0;
            BufferedReader bf = new BufferedReader(new FileReader(csvFile));
            while ((line = bf.readLine()) != null){
                Player newPlayer;
                String[] csvText = line.split(cvsSplitBy);
                if (record > 0){
                    int shirt = Integer.parseInt(csvText[1]);
                    newPlayer = new Player(csvText[0],shirt,csvText[2]);
                    String[] role = csvText[2].split("/");
                    if (role[0].equals("GK")){
                        GK.add(newPlayer);
                    }else if (role[0].equals("DF")) {
                        DF.add(newPlayer);
                        if (role.length > 1){
                            if (role[1].equals("FW")) {
                                FW.add(newPlayer);
                            }else if (role[1].equals("MF")){
                                MF.add(newPlayer);
                            }
                        }
                    }else if (role[0].equals("MF")){
                        MF.add(newPlayer);
                        if (role.length > 1){
                            if (role[1].equals("FW")) {
                                FW.add(newPlayer);
                            }else if (role[1].equals("MF")){
                                MF.add(newPlayer);
                            }
                        }
                    }else if (role[0].equals("FW")){
                        FW.add(newPlayer);
                        if (role.length > 1){
                            if (role[1].equals("FW")) {
                                FW.add(newPlayer);
                            }else if (role[1].equals("MF")){
                                MF.add(newPlayer);
                            }
                        }
                    }
                }
                record++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setPlan(Plan plan){
        plan.format();
    }
}
