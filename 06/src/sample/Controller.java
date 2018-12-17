package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controller {
    Dictionary dictionary = new Dictionary();

    private int k = 5;
    private String XML = "";
    private String JSON = "";

    @FXML
    protected TextArea format;
    @FXML
    protected TextField deleteWord;
    @FXML
    protected TextField word;
    @FXML
    protected TextField partOfSpeech;
    @FXML
    protected TextField meaning;
    @FXML
    protected TextField example;
    @FXML
    protected Button BtnXML;
    @FXML
    protected Button BtnJSON;
    @FXML
    protected Button BtnAdd;
    @FXML
    protected Button BtnRemoves;



    @FXML
    TableColumn vocabularyColumn;
    @FXML
    TableColumn partOfSpeechColumn;
    @FXML
    TableColumn meaningColumn;
    @FXML
    TableColumn exampleColumn;

    @FXML
    TableView<TableRecord> tableDictionary;
    public ObservableList<TableRecord> dataOfDictionary = FXCollections.observableArrayList();


    @FXML
    public void initialize() {
        dictionary.addVocabulary("cat", new Vocabulary("N.", "แมว", "This is a cat."));
        dictionary.addVocabulary("dog", new Vocabulary("N.", "สุนัข", "This is a dog."));
        dictionary.addVocabulary("jump", new Vocabulary("V.", "กระโดด", "I can jump."));
        dictionary.addVocabulary("cute", new Vocabulary("Adj.", "น่ารัก", "She is beautiful"));
        dictionary.addVocabulary("run", new Vocabulary("V.", "วิ่ง", "I can run."));
        showTable();
        vocabularyColumn.setCellValueFactory(new PropertyValueFactory<TableRecord, String>("vocab"));
        partOfSpeechColumn.setCellValueFactory(new PropertyValueFactory<TableRecord, String>("partOfSpeech"));
        meaningColumn.setCellValueFactory(new PropertyValueFactory<TableRecord, String>("meaning"));
        exampleColumn.setCellValueFactory(new PropertyValueFactory<TableRecord, String>("example"));
        tableDictionary.setItems(dataOfDictionary);
    }

    private void showTable() {
        dataOfDictionary.clear();
        for (String word : dictionary.wordlist()) {
            Vocabulary vocab = dictionary.getVocab(word);
            dataOfDictionary.add(new TableRecord(word, vocab.getPartOfSpeech(), vocab.getMeaning(), vocab.getExample()));
        }
    }

    public static class TableRecord {
        private SimpleStringProperty vocab;
        private SimpleStringProperty partOfSpecch;
        private SimpleStringProperty meaning;
        private SimpleStringProperty example;


        public TableRecord(String vocab, String partOfSpecch, String meaning, String example) {
            this.vocab = new SimpleStringProperty(vocab);
            this.partOfSpecch = new SimpleStringProperty(partOfSpecch);
            this.meaning = new SimpleStringProperty(meaning);
            this.example = new SimpleStringProperty(example);
        }


        public String getVocab() {
            return vocab.get();
        }

        public SimpleStringProperty vocabProperty() {
            return vocab;
        }

        public void setVocab(String vocab) {
            this.vocab.set(vocab);
        }

        public String getPartOfSpeech() {
            return partOfSpecch.get();
        }

        public SimpleStringProperty partOfSpeechProperty() {
            return partOfSpecch;
        }

        public void setPartOfSpeech(String partOfSpeech) {
            this.partOfSpecch.set(partOfSpeech);
        }

        public String getMeaning() {
            return meaning.get();
        }

        public SimpleStringProperty meaningProperty() {
            return meaning;
        }

        public void setMeaning(String meaning) {
            this.meaning.set(meaning);
        }

        public String getExample() {
            return example.get();
        }

        public SimpleStringProperty exampleProperty() {
            return example;
        }

        public void setExample(String example) {
            this.example.set(example);
        }
    }

    public void XML() {
        String valXML = dictionary.format(new MyFormatter() {
            @Override
            public String format(Object obj) {
                XML += "<Dictionary>\n";
                for (int i = 0; i <= k - 1; i++) {
                    XML += "\t<Vocab word=" + " \"" + vocabularyColumn.getCellData(i) + "\"" + ">\n"
                            + "\t\t<PartOfSpeech>" + partOfSpeechColumn.getCellData(i) + "</PartOfSpeech>\n" +
                            "\t\t<Meaning>" + meaningColumn.getCellData(i) + "</Meaning>\n" +
                            "\t\t<Example>" + exampleColumn.getCellData(i) + "</Example>\n" +
                            "\t<Vocab>\n";

                }
                XML += "</Dictionary>";
                return XML;
            }

        });

        format.setText(valXML.toString());
    }

    public void JSON() {
        String valJson = dictionary.format(new MyFormatter() {
            @Override
            public String format(Object obj) {
                JSON += "[\n";
                for (int i = 0; i <= k - 1; i++) {
                    if (i < k - 1) {
                        JSON +=
                                "  " + "{" + "\n"
                                        + "      " + "vocab: " + "\"" + vocabularyColumn.getCellData(i) + "\"" + "," + "\n"
                                        + "      " + "partOfSpeech: " + "\"" + partOfSpeechColumn.getCellData(i) + "\"" + "," + "\n"
                                        + "      " + "meaning: " + "\"" + meaningColumn.getCellData(i) + "\"" + "," + "\n"
                                        + "      " + "example: " + "\"" + exampleColumn.getCellData(i) + "\"" + "," + "\n"
                                        + "  " + "}" + "," + "\n";
                    } else if (i == k - 1) {
                        JSON +=
                                "  " + "{" + "\n"
                                        + "      " + "vocab: " + "\"" + vocabularyColumn.getCellData(i) + "\"" + "," + "\n"
                                        + "      " + "partOfSpeech: " + "\"" + partOfSpeechColumn.getCellData(i) + "\"" + "," + "\n"
                                        + "      " + "meaning: " + "\"" + meaningColumn.getCellData(i) + "\"" + "," + "\n"
                                        + "      " + "example: " + "\"" + exampleColumn.getCellData(i) + "\"" + "," + "\n"
                                        + "  " + "}" + "\n";
                    }
                }

                JSON += "]";
                return JSON;
            }
        });
        format.setText(valJson.toString());
    }

    @FXML
    public void XML(ActionEvent e) {
        format.setText("");
        XML = "";
        XML();

    }

    @FXML
    public void JSON(ActionEvent e) {
        format.setText("");
        JSON = "";
        JSON();
    }

    @FXML
    public void add(ActionEvent e) {
        if (word.getText().equals("") || partOfSpeech.getText().equals("") || meaning.getText().equals("") ||
                example.getText().equals("")) {

        } else {
            dictionary.addVocabulary(word.getText(), new Vocabulary(partOfSpeech.getText(), meaning.getText(), example.getText()));
            showTable();
            word.clear();
            partOfSpeech.clear();
            meaning.clear();
            example.clear();
            k += 1;
        }

    }


    @FXML
    public void removeWord(ActionEvent e) {
        k = k - dictionary.deleteWord(deleteWord.getText());
        dictionary.deleteWord(deleteWord.getText());
        showTable();
        deleteWord.clear();
    }

}

