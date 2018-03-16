import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.Parser.TraceListener;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.prefs.NodeChangeListener;

public class main  {
    public static void main (String args[]) throws java.io.IOException {
        scratchLexer lexer = new scratchLexer( CharStreams.fromFileName("C:\\Users\\MSE\\IdeaProjects\\jmparser\\src\\sample"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        scratchParser parser = new scratchParser(tokens);
        parser.setLexer(lexer);
        scratchErrorListener errorListener=new scratchErrorListener();
        parser.addErrorListener(errorListener);
        //scratchBaseListener l=new scratchBaseListener();
        parser.program();
       /* parser.setTrace(true);
        ParseTreeWalker walker=new ParseTreeWalker();
        walker.walk(new scratchBaseListener(), new ParserRuleContext());*/
    }
}
