import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;

public final class SymbolTable {
    public  static HashMap<String, String> symbols=new HashMap<String, String>();

    public static HashMap<String, String> SymbolTable() throws FileNotFoundException {
        return symbols;
    }


    public static void insert(String s){
        if(s.equals("new") ||s.equals("void") || s.equals("read") || s.equals("else") ||s.equals("final") || s.equals("program") ||s.equals("while") || s.equals("class") || s.equals("if")){
            String token="TOK_"+s.toUpperCase();
            symbols.put(s, token);
        }else{
            String token="TOK_IDENTIFIER";
            symbols.put(s,token);
        }

    }
    public static void print(){
        ArrayList<String> array=new ArrayList<String>();
        if(symbols.isEmpty()){
            System.out.println("Table is empty");
        }
        for (String s: symbols.keySet()
             ) {
            if(s.equals("new") ||s.equals("void") || s.equals("read") || s.equals("else") ||s.equals("final") || s.equals("program") ||s.equals("while") || s.equals("class") || s.equals("if")){
                System.out.println(s+"-->"+symbols.get(s));

            }else array.add(s);
        }
        for (String s: array
             ) {
            System.out.println(s+"-->"+symbols.get(s));
        }
    }

}
