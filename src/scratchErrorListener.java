import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class scratchErrorListener extends BaseErrorListener {
    public static final scratchErrorListener INSTANCE = new scratchErrorListener();

    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e){
        System.out.println("ERROR at"+line+":"+charPositionInLine+": "+ msg);
    }
}
