package sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Dictionary {

    Map<String, Vocabulary> dictionary = new HashMap<String, Vocabulary>();

    public void addVocabulary(String word, Vocabulary vocabulary) {

        dictionary.put(word, vocabulary);

    }

    public Vocabulary getVocab(String word) {

        return dictionary.get(word);

    }

    public Set<String> wordlist() {

        return dictionary.keySet();

    }

    public Integer deleteWord(String word) {
        if (dictionary.containsKey(word)) {
            dictionary.remove(word);
            return 1;
        } else {
            return 0;
        }
    }


    @Override
    public String toString() {
        return this.dictionary + "";
    }

    public String format(MyFormatter format) {
        return format.format(dictionary);
    }
}
