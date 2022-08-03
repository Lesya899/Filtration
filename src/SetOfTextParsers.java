
/*метод checkLabels, который будет возвращать метку для комментария по набору анализаторов текста.
CheckLabels должен возвращать первую не-OK метку в порядке данного набора анализаторов, и OK, если все анализаторы вернули OK */

public class SetOfTextParsers {
    public  Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (int i = 0; i < analyzers.length; i++) {
            if (analyzers[i].processText(text) != Label.OK) {
                return analyzers[i].processText(text);
            }}
            return Label.OK;
        }
    }



