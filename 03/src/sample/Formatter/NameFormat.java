package sample.Formatter;

import sample.VocabModel.Vocabulary;

public class NameFormat implements Formatter {
    @Override
    public String format(Object obj) {
        if (obj instanceof Vocabulary){
            return ((Vocabulary) obj).getName();
        }
        return null;
    }
}
