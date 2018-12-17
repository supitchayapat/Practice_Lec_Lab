package sample;

import java.io.IOException;

public class Form_343 implements FormTeam {

    @Override
    public String format() throws IOException {
        Football football=new Football();
        football.readFile();
        football.addPosition();
        return           "\n"+"    "+football.fW.get(0)+"--"+football.fW.get(1)+"--"+football.fW.get(2)+"\n"+"  "+football.mF.get(1)+"--"+football.mF.get(2)+"--"+football.mF.get(3)+"--"
                +football.mF.get(4)+"\n"+"    "+football.dF.get(1)+"--"+football.dF.get(2)+"--"+football.dF.get(3)+"\n"+
                "        "+football.gK.get(0);

    }
}
