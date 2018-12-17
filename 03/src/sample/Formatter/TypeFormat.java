package sample.Formatter;

import sample.VocabModel.PartOfSpeech;

public class TypeFormat implements Formatter {
    @Override
    public String format(Object obj) {
        if (obj instanceof PartOfSpeech){
            return ((PartOfSpeech) obj).getType();
        }
        return null;
    }
}
