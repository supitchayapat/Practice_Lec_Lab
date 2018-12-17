package sample.Formatter;

import sample.VocabModel.Vocabulary;

public class MeanFormat implements Formatter {
    @Override
    public String format(Object obj) {
        if (obj instanceof Vocabulary) {
            return ((Vocabulary) obj).getMean();
        }
        return null;
    }
}
