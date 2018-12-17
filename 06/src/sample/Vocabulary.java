package sample;

public class Vocabulary {
    private String partOfSpeech;
    private String meaning;
    private String example;

    public Vocabulary(String partOfSpeech, String meaning, String example) {
        this.partOfSpeech = partOfSpeech;
        this.meaning = meaning;
        this.example = example;
    }




    public String getPartOfSpeech() {
        return partOfSpeech;
    }

    public void setPartOfSpeech(String partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }


    @Override
    public String toString() {
        return "<PartOfSpeech>" + partOfSpeech + "<Meaning>" + meaning + "<Example>" + example;
    }
}

