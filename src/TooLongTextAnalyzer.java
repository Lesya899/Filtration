
public class TooLongTextAnalyzer implements TextAnalyzer {
    private int maxLength;

    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    //переопределим интерфейс
    @Override
    public Label processText(String text) {
        if (text.length() > maxLength) { //если длина текста больше максимальной длины
            return Label.TOO_LONG; //то возвращаем метку "слишком длинный комментарий"
        }
        return Label.OK; //в противном случае вернет метку "положительное содержание"
    }
}

