package sample.VocabModel;

public class Vocabulary {
    private String name;
    private String mean;
    private PartOfSpeech type;
    private String example;

    public Vocabulary(String name,String mean, PartOfSpeech type, String example) {
        this.name = name;
        this.mean = mean;
        this.type = type;
        this.example = example;
    }

    public Vocabulary(String name,String mean) {
        this.name = name;
        this.mean = mean;
        this.type = new Noun();
    }

    public String getName() {
        return name;
    }

    public String getMean() {
        return mean;
    }

    public String getType() {
        return type.getType();
    }

    public String getExample() {
        return example;
    }
}
