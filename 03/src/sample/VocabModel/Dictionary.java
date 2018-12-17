package sample.VocabModel;

import sample.Formatter.Formatter;

import java.util.ArrayList;
import java.util.Collection;

public class Dictionary {
    Collection<Vocabulary> dictionary;

    public Dictionary() {
        dictionary = new ArrayList<>();
    }

    public void addVocab(Vocabulary v){
        dictionary.add(v);
    }

    public void showVocab(){
        for (Vocabulary i:dictionary) {
            System.out.println("name: "+i.getName()+", meaning: "+i.getMean()+", PartOfSpeech: "+i.getType()+", Example: "+i.getExample());
        }
    }

    public int sizeOfDictionary(){
        return dictionary.size();
    }

    public String format(Formatter format){
        return null;
    }
}
