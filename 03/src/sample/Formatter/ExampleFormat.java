package sample.Formatter;

import sample.VocabModel.Vocabulary;

public class ExampleFormat implements Formatter {
    @Override
    public String format(Object obj) {
        if (obj instanceof Vocabulary){
            return ((Vocabulary) obj).getExample();
        }
        return null;
    }
}
