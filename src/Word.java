public class Word {
    private String word_target;
    private String pronunciation;
    private String word_explain;
    public Word(String word_target, String pronunciation, String word_explain) {
        this.word_target = word_target;
        this.word_explain = word_explain;
        this.pronunciation = pronunciation;
    }
    public String getWord_target() {
        return word_target;
    }
    public String getWord_explain() {
        return word_explain;
    }

    public String getPronunciation() {
        return pronunciation;
    }
}