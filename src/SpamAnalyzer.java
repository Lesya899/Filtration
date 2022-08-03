public class SpamAnalyzer extends KeywordAnalyzer {
    private String[] keywords;

    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }

    //метод, который который будет возвращать массив ключевых слов
    @Override
    protected String[] getKeywords() {
        return this.keywords;
    }

    //метод, который будет возвращать метку "спам"
    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }
}