
public class NegativeTextAnalyzer extends KeywordAnalyzer {

    public NegativeTextAnalyzer() {
    }

    //метод, который который будет возвращать массив со смайликами
    @Override
    protected String[] getKeywords() {
        return new String[]{":\\(", "=\\(", ":\\|"};
    }

    //метод, который будет возвращать метку "негативное содержание"
    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}


