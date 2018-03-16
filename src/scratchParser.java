// Generated from C:/Users/MSE/.IdeaIC2017.2/config/scratches\scratch.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class scratchParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WhiteSpace=1, Unknown=2, Number=3, VariableType=4, Addop=5, Mulop=6, EqualsEquals=7, 
		Minus=8, Plus=9, Times=10, Divide=11, Mod=12, NotEquals=13, GreaterThan=14, 
		LessThan=15, GreaterThanOrEq=16, LessThanOrEq=17, Comma=18, Dot=19, BracketOpen=20, 
		BracketClose=21, POpen=22, PClose=23, Semi=24, Equals=25, CbOpen=26, CbClose=27, 
		SingleQuote=28, Quote=29, NewLine=30, Tab=31, BackR=32, Space=33, Comment=34, 
		P=35, Class=36, If=37, While=38, Return=39, Else=40, Void=41, Read=42, 
		Print=43, Final=44, New=45, Letter=46, Character=47, InvalidCharacter=48, 
		String=49, InvalidString=50, Identifier=51, Invalidident=52, Chara=53, 
		Digit=54;
	public static final int
		RULE_program = 0, RULE_cbOpen = 1, RULE_cbClose = 2, RULE_progStart = 3, 
		RULE_constDecl = 4, RULE_equals = 5, RULE_semi = 6, RULE_number = 7, RULE_chara = 8, 
		RULE_fin = 9, RULE_classDecl = 10, RULE_cl = 11, RULE_methodDecl = 12, 
		RULE_methodHeader = 13, RULE_methodType = 14, RULE_vd = 15, RULE_formPars = 16, 
		RULE_pOpen = 17, RULE_pClose = 18, RULE_comma = 19, RULE_varDecl = 20, 
		RULE_terminated = 21, RULE_character = 22, RULE_string = 23, RULE_unterminated = 24, 
		RULE_type = 25, RULE_variableType = 26, RULE_bracketOpen = 27, RULE_bracketClose = 28, 
		RULE_block = 29, RULE_statement = 30, RULE_ifKey = 31, RULE_el = 32, RULE_whileKey = 33, 
		RULE_returnKey = 34, RULE_readKey = 35, RULE_printKey = 36, RULE_digit = 37, 
		RULE_actPars = 38, RULE_condition = 39, RULE_relop = 40, RULE_equalsEquals = 41, 
		RULE_notEquals = 42, RULE_greaterThan = 43, RULE_greaterThanOrEq = 44, 
		RULE_lessThan = 45, RULE_lessThanOrEq = 46, RULE_expr = 47, RULE_minus = 48, 
		RULE_addop = 49, RULE_term = 50, RULE_mulop = 51, RULE_factor = 52, RULE_newKey = 53, 
		RULE_designator = 54, RULE_dot = 55, RULE_ident = 56;
	public static final String[] ruleNames = {
		"program", "cbOpen", "cbClose", "progStart", "constDecl", "equals", "semi", 
		"number", "chara", "fin", "classDecl", "cl", "methodDecl", "methodHeader", 
		"methodType", "vd", "formPars", "pOpen", "pClose", "comma", "varDecl", 
		"terminated", "character", "string", "unterminated", "type", "variableType", 
		"bracketOpen", "bracketClose", "block", "statement", "ifKey", "el", "whileKey", 
		"returnKey", "readKey", "printKey", "digit", "actPars", "condition", "relop", 
		"equalsEquals", "notEquals", "greaterThan", "greaterThanOrEq", "lessThan", 
		"lessThanOrEq", "expr", "minus", "addop", "term", "mulop", "factor", "newKey", 
		"designator", "dot", "ident"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, "'=='", "'-'", "'+'", "'*'", 
		"'/'", "'%'", "'!='", "'>'", "'<'", "'>='", "'<='", "','", "'.'", "'['", 
		"']'", "'('", "')'", "';'", "'='", "'{'", "'}'", "'''", "'\"'", "'\n'", 
		"'\t'", "'\r'", "' '", null, "'program'", "'class'", "'if'", "'while'", 
		"'return'", "'else'", "'void'", "'read'", "'print'", "'final'", "'new'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WhiteSpace", "Unknown", "Number", "VariableType", "Addop", "Mulop", 
		"EqualsEquals", "Minus", "Plus", "Times", "Divide", "Mod", "NotEquals", 
		"GreaterThan", "LessThan", "GreaterThanOrEq", "LessThanOrEq", "Comma", 
		"Dot", "BracketOpen", "BracketClose", "POpen", "PClose", "Semi", "Equals", 
		"CbOpen", "CbClose", "SingleQuote", "Quote", "NewLine", "Tab", "BackR", 
		"Space", "Comment", "P", "Class", "If", "While", "Return", "Else", "Void", 
		"Read", "Print", "Final", "New", "Letter", "Character", "InvalidCharacter", 
		"String", "InvalidString", "Identifier", "Invalidident", "Chara", "Digit"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "scratch.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	static int count=0;
	public int line=0;
	scratchLexer lexer;
	public String curr="";
	public void setLexer(scratchLexer lexer){
			this.lexer=lexer;
		}

	@Override
		public void enterRule(ParserRuleContext localctx, int state, int ruleIndex) {
			super.enterRule(localctx, state, ruleIndex);
			count++;
			for (int i = 0; i < count; i++) {
				System.out.print("\t");
			}

			curr=lexer.getText();
			System.out.println(ruleNames[ruleIndex]+"->");
		}
	@Override
	public void exitRule(){
		super.exitRule();
		for (int i = 0; i < count+1; i++) {
	    	System.out.print("\t");
	    }
	    System.out.print("  ");
	    count--;
		System.out.println(curr+" line("+lexer.getLine()+")");
	    }

	public scratchParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ProgStartContext progStart() {
			return getRuleContext(ProgStartContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public CbOpenContext cbOpen() {
			return getRuleContext(CbOpenContext.class,0);
		}
		public CbCloseContext cbClose() {
			return getRuleContext(CbCloseContext.class,0);
		}
		public List<ConstDeclContext> constDecl() {
			return getRuleContexts(ConstDeclContext.class);
		}
		public ConstDeclContext constDecl(int i) {
			return getRuleContext(ConstDeclContext.class,i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<ClassDeclContext> classDecl() {
			return getRuleContexts(ClassDeclContext.class);
		}
		public ClassDeclContext classDecl(int i) {
			return getRuleContext(ClassDeclContext.class,i);
		}
		public List<MethodDeclContext> methodDecl() {
			return getRuleContexts(MethodDeclContext.class);
		}
		public MethodDeclContext methodDecl(int i) {
			return getRuleContext(MethodDeclContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			progStart();
			setState(115);
			ident();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VariableType) | (1L << Class) | (1L << Final))) != 0)) {
				{
				setState(119);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Final:
					{
					setState(116);
					constDecl();
					}
					break;
				case VariableType:
					{
					setState(117);
					varDecl();
					}
					break;
				case Class:
					{
					setState(118);
					classDecl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			cbOpen();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VariableType || _la==Void) {
				{
				{
				setState(125);
				methodDecl();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			cbClose();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CbOpenContext extends ParserRuleContext {
		public TerminalNode CbOpen() { return getToken(scratchParser.CbOpen, 0); }
		public CbOpenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cbOpen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterCbOpen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitCbOpen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitCbOpen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CbOpenContext cbOpen() throws RecognitionException {
		CbOpenContext _localctx = new CbOpenContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_cbOpen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(CbOpen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CbCloseContext extends ParserRuleContext {
		public TerminalNode CbClose() { return getToken(scratchParser.CbClose, 0); }
		public CbCloseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cbClose; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterCbClose(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitCbClose(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitCbClose(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CbCloseContext cbClose() throws RecognitionException {
		CbCloseContext _localctx = new CbCloseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cbClose);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(CbClose);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgStartContext extends ParserRuleContext {
		public TerminalNode P() { return getToken(scratchParser.P, 0); }
		public ProgStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_progStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterProgStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitProgStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitProgStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgStartContext progStart() throws RecognitionException {
		ProgStartContext _localctx = new ProgStartContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_progStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstDeclContext extends ParserRuleContext {
		public FinContext fin() {
			return getRuleContext(FinContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public EqualsContext equals() {
			return getRuleContext(EqualsContext.class,0);
		}
		public SemiContext semi() {
			return getRuleContext(SemiContext.class,0);
		}
		public TerminatedContext terminated() {
			return getRuleContext(TerminatedContext.class,0);
		}
		public UnterminatedContext unterminated() {
			return getRuleContext(UnterminatedContext.class,0);
		}
		public ConstDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterConstDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitConstDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitConstDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclContext constDecl() throws RecognitionException {
		ConstDeclContext _localctx = new ConstDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_constDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			fin();
			setState(140);
			type();
			setState(141);
			ident();
			setState(142);
			equals();
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Number:
			case Character:
			case String:
				{
				setState(143);
				terminated();
				}
				break;
			case InvalidCharacter:
			case InvalidString:
				{
				setState(144);
				unterminated();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(147);
			semi();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualsContext extends ParserRuleContext {
		public TerminalNode Equals() { return getToken(scratchParser.Equals, 0); }
		public EqualsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitEquals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualsContext equals() throws RecognitionException {
		EqualsContext _localctx = new EqualsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_equals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(Equals);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SemiContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(scratchParser.Semi, 0); }
		public SemiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterSemi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitSemi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitSemi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SemiContext semi() throws RecognitionException {
		SemiContext _localctx = new SemiContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_semi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(scratchParser.Number, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(Number);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharaContext extends ParserRuleContext {
		public TerminalNode Chara() { return getToken(scratchParser.Chara, 0); }
		public CharaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterChara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitChara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitChara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharaContext chara() throws RecognitionException {
		CharaContext _localctx = new CharaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_chara);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(Chara);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinContext extends ParserRuleContext {
		public TerminalNode Final() { return getToken(scratchParser.Final, 0); }
		public FinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterFin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitFin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitFin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinContext fin() throws RecognitionException {
		FinContext _localctx = new FinContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(Final);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclContext extends ParserRuleContext {
		public ClContext cl() {
			return getRuleContext(ClContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public CbOpenContext cbOpen() {
			return getRuleContext(CbOpenContext.class,0);
		}
		public CbCloseContext cbClose() {
			return getRuleContext(CbCloseContext.class,0);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public ClassDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterClassDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitClassDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitClassDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclContext classDecl() throws RecognitionException {
		ClassDeclContext _localctx = new ClassDeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			cl();
			setState(160);
			ident();
			setState(161);
			cbOpen();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VariableType) {
				{
				{
				setState(162);
				varDecl();
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
			cbClose();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(scratchParser.Class, 0); }
		public ClContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterCl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitCl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitCl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClContext cl() throws RecognitionException {
		ClContext _localctx = new ClContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(Class);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclContext extends ParserRuleContext {
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitMethodDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitMethodDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_methodDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			methodHeader();
			setState(173);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodHeaderContext extends ParserRuleContext {
		public MethodTypeContext methodType() {
			return getRuleContext(MethodTypeContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public FormParsContext formPars() {
			return getRuleContext(FormParsContext.class,0);
		}
		public MethodHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterMethodHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitMethodHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitMethodHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodHeaderContext methodHeader() throws RecognitionException {
		MethodHeaderContext _localctx = new MethodHeaderContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_methodHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			methodType();
			setState(176);
			ident();
			setState(177);
			formPars();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VdContext vd() {
			return getRuleContext(VdContext.class,0);
		}
		public MethodTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterMethodType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitMethodType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitMethodType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodTypeContext methodType() throws RecognitionException {
		MethodTypeContext _localctx = new MethodTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_methodType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VariableType:
				{
				setState(179);
				type();
				}
				break;
			case Void:
				{
				setState(180);
				vd();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VdContext extends ParserRuleContext {
		public TerminalNode Void() { return getToken(scratchParser.Void, 0); }
		public VdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterVd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitVd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitVd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VdContext vd() throws RecognitionException {
		VdContext _localctx = new VdContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_vd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(Void);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormParsContext extends ParserRuleContext {
		public POpenContext pOpen() {
			return getRuleContext(POpenContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public PCloseContext pClose() {
			return getRuleContext(PCloseContext.class,0);
		}
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public FormParsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formPars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterFormPars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitFormPars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitFormPars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormParsContext formPars() throws RecognitionException {
		FormParsContext _localctx = new FormParsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_formPars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			pOpen();
			setState(186);
			type();
			setState(187);
			ident();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(188);
				comma();
				setState(189);
				type();
				setState(190);
				ident();
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(197);
			pClose();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class POpenContext extends ParserRuleContext {
		public TerminalNode POpen() { return getToken(scratchParser.POpen, 0); }
		public POpenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pOpen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterPOpen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitPOpen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitPOpen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final POpenContext pOpen() throws RecognitionException {
		POpenContext _localctx = new POpenContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_pOpen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(POpen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PCloseContext extends ParserRuleContext {
		public TerminalNode PClose() { return getToken(scratchParser.PClose, 0); }
		public PCloseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pClose; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterPClose(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitPClose(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitPClose(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PCloseContext pClose() throws RecognitionException {
		PCloseContext _localctx = new PCloseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_pClose);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(PClose);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommaContext extends ParserRuleContext {
		public TerminalNode Comma() { return getToken(scratchParser.Comma, 0); }
		public CommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitComma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommaContext comma() throws RecognitionException {
		CommaContext _localctx = new CommaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_comma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(Comma);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public SemiContext semi() {
			return getRuleContext(SemiContext.class,0);
		}
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			type();
			setState(206);
			ident();
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(207);
				comma();
				setState(208);
				ident();
				}
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(215);
			semi();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TerminatedContext extends ParserRuleContext {
		public SemiContext semi() {
			return getRuleContext(SemiContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public CharacterContext character() {
			return getRuleContext(CharacterContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterTerminated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitTerminated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitTerminated(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminatedContext terminated() throws RecognitionException {
		TerminatedContext _localctx = new TerminatedContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_terminated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Number:
				{
				setState(217);
				number();
				}
				break;
			case Character:
				{
				setState(218);
				character();
				}
				break;
			case String:
				{
				setState(219);
				string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(222);
			semi();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharacterContext extends ParserRuleContext {
		public TerminalNode Character() { return getToken(scratchParser.Character, 0); }
		public CharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitCharacter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitCharacter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterContext character() throws RecognitionException {
		CharacterContext _localctx = new CharacterContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_character);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(Character);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(scratchParser.String, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(String);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnterminatedContext extends ParserRuleContext {
		public TerminalNode InvalidCharacter() { return getToken(scratchParser.InvalidCharacter, 0); }
		public TerminalNode InvalidString() { return getToken(scratchParser.InvalidString, 0); }
		public UnterminatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unterminated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterUnterminated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitUnterminated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitUnterminated(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnterminatedContext unterminated() throws RecognitionException {
		UnterminatedContext _localctx = new UnterminatedContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_unterminated);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_la = _input.LA(1);
			if ( !(_la==InvalidCharacter || _la==InvalidString) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public List<BracketOpenContext> bracketOpen() {
			return getRuleContexts(BracketOpenContext.class);
		}
		public BracketOpenContext bracketOpen(int i) {
			return getRuleContext(BracketOpenContext.class,i);
		}
		public List<BracketCloseContext> bracketClose() {
			return getRuleContexts(BracketCloseContext.class);
		}
		public BracketCloseContext bracketClose(int i) {
			return getRuleContext(BracketCloseContext.class,i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			variableType();
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BracketOpen) {
				{
				{
				setState(231);
				bracketOpen();
				setState(232);
				bracketClose();
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableTypeContext extends ParserRuleContext {
		public TerminalNode VariableType() { return getToken(scratchParser.VariableType, 0); }
		public VariableTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterVariableType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitVariableType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitVariableType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableTypeContext variableType() throws RecognitionException {
		VariableTypeContext _localctx = new VariableTypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_variableType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(VariableType);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BracketOpenContext extends ParserRuleContext {
		public TerminalNode BracketOpen() { return getToken(scratchParser.BracketOpen, 0); }
		public BracketOpenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracketOpen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterBracketOpen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitBracketOpen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitBracketOpen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BracketOpenContext bracketOpen() throws RecognitionException {
		BracketOpenContext _localctx = new BracketOpenContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_bracketOpen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(BracketOpen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BracketCloseContext extends ParserRuleContext {
		public TerminalNode BracketClose() { return getToken(scratchParser.BracketClose, 0); }
		public BracketCloseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracketClose; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterBracketClose(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitBracketClose(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitBracketClose(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BracketCloseContext bracketClose() throws RecognitionException {
		BracketCloseContext _localctx = new BracketCloseContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_bracketClose);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(BracketClose);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public CbOpenContext cbOpen() {
			return getRuleContext(CbOpenContext.class,0);
		}
		public CbCloseContext cbClose() {
			return getRuleContext(CbCloseContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			cbOpen();
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Semi) | (1L << CbOpen) | (1L << If) | (1L << While) | (1L << Return) | (1L << Read) | (1L << Print) | (1L << Identifier) | (1L << Invalidident))) != 0)) {
				{
				{
				setState(246);
				statement();
				}
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(252);
			cbClose();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public SemiContext semi() {
			return getRuleContext(SemiContext.class,0);
		}
		public EqualsContext equals() {
			return getRuleContext(EqualsContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ActParsContext actPars() {
			return getRuleContext(ActParsContext.class,0);
		}
		public IfKeyContext ifKey() {
			return getRuleContext(IfKeyContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public POpenContext pOpen() {
			return getRuleContext(POpenContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ElContext> el() {
			return getRuleContexts(ElContext.class);
		}
		public ElContext el(int i) {
			return getRuleContext(ElContext.class,i);
		}
		public WhileKeyContext whileKey() {
			return getRuleContext(WhileKeyContext.class,0);
		}
		public PCloseContext pClose() {
			return getRuleContext(PCloseContext.class,0);
		}
		public ReturnKeyContext returnKey() {
			return getRuleContext(ReturnKeyContext.class,0);
		}
		public ReadKeyContext readKey() {
			return getRuleContext(ReadKeyContext.class,0);
		}
		public PrintKeyContext printKey() {
			return getRuleContext(PrintKeyContext.class,0);
		}
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(309);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
			case Invalidident:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				designator();
				setState(259);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Equals:
					{
					setState(255);
					equals();
					setState(256);
					expr();
					}
					break;
				case POpen:
					{
					setState(258);
					actPars();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(261);
				semi();
				}
				break;
			case If:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				ifKey();
				setState(264);
				condition();
				setState(265);
				pOpen();
				setState(266);
				statement();
				setState(270); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(267);
						el();
						setState(268);
						statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(272); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case While:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
				whileKey();
				setState(275);
				pOpen();
				setState(276);
				condition();
				setState(277);
				pClose();
				setState(278);
				statement();
				}
				break;
			case Return:
				enterOuterAlt(_localctx, 4);
				{
				setState(280);
				returnKey();
				setState(282); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(281);
					expr();
					}
					}
					setState(284); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Minus );
				setState(286);
				semi();
				}
				break;
			case Read:
				enterOuterAlt(_localctx, 5);
				{
				setState(288);
				readKey();
				setState(289);
				pOpen();
				setState(290);
				designator();
				setState(291);
				pClose();
				setState(292);
				semi();
				}
				break;
			case Print:
				enterOuterAlt(_localctx, 6);
				{
				setState(294);
				printKey();
				setState(295);
				pOpen();
				setState(296);
				expr();
				setState(300); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(297);
					comma();
					setState(298);
					digit();
					}
					}
					setState(302); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Comma );
				setState(304);
				pClose();
				setState(305);
				semi();
				}
				break;
			case CbOpen:
				enterOuterAlt(_localctx, 7);
				{
				setState(307);
				block();
				}
				break;
			case Semi:
				enterOuterAlt(_localctx, 8);
				{
				setState(308);
				semi();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfKeyContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(scratchParser.If, 0); }
		public IfKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterIfKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitIfKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitIfKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfKeyContext ifKey() throws RecognitionException {
		IfKeyContext _localctx = new IfKeyContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ifKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(If);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(scratchParser.Else, 0); }
		public ElContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_el; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterEl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitEl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitEl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElContext el() throws RecognitionException {
		ElContext _localctx = new ElContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_el);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(Else);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileKeyContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(scratchParser.While, 0); }
		public WhileKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterWhileKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitWhileKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitWhileKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileKeyContext whileKey() throws RecognitionException {
		WhileKeyContext _localctx = new WhileKeyContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_whileKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(While);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnKeyContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(scratchParser.Return, 0); }
		public ReturnKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterReturnKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitReturnKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitReturnKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnKeyContext returnKey() throws RecognitionException {
		ReturnKeyContext _localctx = new ReturnKeyContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_returnKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(Return);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadKeyContext extends ParserRuleContext {
		public TerminalNode Read() { return getToken(scratchParser.Read, 0); }
		public ReadKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterReadKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitReadKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitReadKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadKeyContext readKey() throws RecognitionException {
		ReadKeyContext _localctx = new ReadKeyContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_readKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(Read);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintKeyContext extends ParserRuleContext {
		public TerminalNode Print() { return getToken(scratchParser.Print, 0); }
		public PrintKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterPrintKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitPrintKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitPrintKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintKeyContext printKey() throws RecognitionException {
		PrintKeyContext _localctx = new PrintKeyContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_printKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(Print);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DigitContext extends ParserRuleContext {
		public TerminalNode Digit() { return getToken(scratchParser.Digit, 0); }
		public DigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterDigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitDigit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitDigit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DigitContext digit() throws RecognitionException {
		DigitContext _localctx = new DigitContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_digit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(Digit);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActParsContext extends ParserRuleContext {
		public POpenContext pOpen() {
			return getRuleContext(POpenContext.class,0);
		}
		public PCloseContext pClose() {
			return getRuleContext(PCloseContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public ActParsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actPars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterActPars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitActPars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitActPars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActParsContext actPars() throws RecognitionException {
		ActParsContext _localctx = new ActParsContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_actPars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			pOpen();
			setState(335); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(326);
				expr();
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(327);
					comma();
					setState(328);
					expr();
					}
					}
					setState(334);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(337); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Minus );
			setState(339);
			pClose();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			expr();
			setState(342);
			relop();
			setState(343);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelopContext extends ParserRuleContext {
		public EqualsEqualsContext equalsEquals() {
			return getRuleContext(EqualsEqualsContext.class,0);
		}
		public NotEqualsContext notEquals() {
			return getRuleContext(NotEqualsContext.class,0);
		}
		public GreaterThanContext greaterThan() {
			return getRuleContext(GreaterThanContext.class,0);
		}
		public GreaterThanOrEqContext greaterThanOrEq() {
			return getRuleContext(GreaterThanOrEqContext.class,0);
		}
		public LessThanContext lessThan() {
			return getRuleContext(LessThanContext.class,0);
		}
		public LessThanOrEqContext lessThanOrEq() {
			return getRuleContext(LessThanOrEqContext.class,0);
		}
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterRelop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitRelop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitRelop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_relop);
		try {
			setState(351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EqualsEquals:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				equalsEquals();
				}
				break;
			case NotEquals:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				notEquals();
				}
				break;
			case GreaterThan:
				enterOuterAlt(_localctx, 3);
				{
				setState(347);
				greaterThan();
				}
				break;
			case GreaterThanOrEq:
				enterOuterAlt(_localctx, 4);
				{
				setState(348);
				greaterThanOrEq();
				}
				break;
			case LessThan:
				enterOuterAlt(_localctx, 5);
				{
				setState(349);
				lessThan();
				}
				break;
			case LessThanOrEq:
				enterOuterAlt(_localctx, 6);
				{
				setState(350);
				lessThanOrEq();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualsEqualsContext extends ParserRuleContext {
		public TerminalNode EqualsEquals() { return getToken(scratchParser.EqualsEquals, 0); }
		public EqualsEqualsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalsEquals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterEqualsEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitEqualsEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitEqualsEquals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualsEqualsContext equalsEquals() throws RecognitionException {
		EqualsEqualsContext _localctx = new EqualsEqualsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_equalsEquals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(EqualsEquals);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotEqualsContext extends ParserRuleContext {
		public TerminalNode NotEquals() { return getToken(scratchParser.NotEquals, 0); }
		public NotEqualsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notEquals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterNotEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitNotEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitNotEquals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotEqualsContext notEquals() throws RecognitionException {
		NotEqualsContext _localctx = new NotEqualsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_notEquals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(NotEquals);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GreaterThanContext extends ParserRuleContext {
		public TerminalNode GreaterThan() { return getToken(scratchParser.GreaterThan, 0); }
		public GreaterThanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greaterThan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterGreaterThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitGreaterThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitGreaterThan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreaterThanContext greaterThan() throws RecognitionException {
		GreaterThanContext _localctx = new GreaterThanContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_greaterThan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(GreaterThan);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GreaterThanOrEqContext extends ParserRuleContext {
		public TerminalNode GreaterThanOrEq() { return getToken(scratchParser.GreaterThanOrEq, 0); }
		public GreaterThanOrEqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greaterThanOrEq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterGreaterThanOrEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitGreaterThanOrEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitGreaterThanOrEq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreaterThanOrEqContext greaterThanOrEq() throws RecognitionException {
		GreaterThanOrEqContext _localctx = new GreaterThanOrEqContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_greaterThanOrEq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(GreaterThanOrEq);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LessThanContext extends ParserRuleContext {
		public TerminalNode LessThan() { return getToken(scratchParser.LessThan, 0); }
		public LessThanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessThan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitLessThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitLessThan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LessThanContext lessThan() throws RecognitionException {
		LessThanContext _localctx = new LessThanContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_lessThan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(LessThan);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LessThanOrEqContext extends ParserRuleContext {
		public TerminalNode LessThanOrEq() { return getToken(scratchParser.LessThanOrEq, 0); }
		public LessThanOrEqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessThanOrEq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterLessThanOrEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitLessThanOrEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitLessThanOrEq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LessThanOrEqContext lessThanOrEq() throws RecognitionException {
		LessThanOrEqContext _localctx = new LessThanOrEqContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_lessThanOrEq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(LessThanOrEq);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<MinusContext> minus() {
			return getRuleContexts(MinusContext.class);
		}
		public MinusContext minus(int i) {
			return getRuleContext(MinusContext.class,i);
		}
		public List<AddopContext> addop() {
			return getRuleContexts(AddopContext.class);
		}
		public AddopContext addop(int i) {
			return getRuleContext(AddopContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(365);
				minus();
				}
				}
				setState(368); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Minus );
			setState(370);
			term();
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Addop) {
				{
				{
				setState(371);
				addop();
				setState(372);
				term();
				}
				}
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MinusContext extends ParserRuleContext {
		public TerminalNode Minus() { return getToken(scratchParser.Minus, 0); }
		public MinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinusContext minus() throws RecognitionException {
		MinusContext _localctx = new MinusContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_minus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(Minus);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddopContext extends ParserRuleContext {
		public TerminalNode Addop() { return getToken(scratchParser.Addop, 0); }
		public AddopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterAddop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitAddop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitAddop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddopContext addop() throws RecognitionException {
		AddopContext _localctx = new AddopContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_addop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(Addop);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<MulopContext> mulop() {
			return getRuleContexts(MulopContext.class);
		}
		public MulopContext mulop(int i) {
			return getRuleContext(MulopContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			factor();
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Mulop) {
				{
				{
				setState(384);
				mulop();
				setState(385);
				factor();
				}
				}
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MulopContext extends ParserRuleContext {
		public TerminalNode Mulop() { return getToken(scratchParser.Mulop, 0); }
		public MulopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterMulop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitMulop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitMulop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulopContext mulop() throws RecognitionException {
		MulopContext _localctx = new MulopContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_mulop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(Mulop);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public List<ActParsContext> actPars() {
			return getRuleContexts(ActParsContext.class);
		}
		public ActParsContext actPars(int i) {
			return getRuleContext(ActParsContext.class,i);
		}
		public DigitContext digit() {
			return getRuleContext(DigitContext.class,0);
		}
		public CharaContext chara() {
			return getRuleContext(CharaContext.class,0);
		}
		public NewKeyContext newKey() {
			return getRuleContext(NewKeyContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public List<BracketOpenContext> bracketOpen() {
			return getRuleContexts(BracketOpenContext.class);
		}
		public BracketOpenContext bracketOpen(int i) {
			return getRuleContext(BracketOpenContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<BracketCloseContext> bracketClose() {
			return getRuleContexts(BracketCloseContext.class);
		}
		public BracketCloseContext bracketClose(int i) {
			return getRuleContext(BracketCloseContext.class,i);
		}
		public POpenContext pOpen() {
			return getRuleContext(POpenContext.class,0);
		}
		public PCloseContext pClose() {
			return getRuleContext(PCloseContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_factor);
		int _la;
		try {
			int _alt;
			setState(416);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
			case Invalidident:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				designator();
				setState(396); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(395);
						actPars();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(398); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case Digit:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				digit();
				}
				break;
			case Chara:
				enterOuterAlt(_localctx, 3);
				{
				setState(401);
				chara();
				}
				break;
			case New:
				enterOuterAlt(_localctx, 4);
				{
				setState(402);
				newKey();
				setState(403);
				ident();
				setState(408); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(404);
					bracketOpen();
					setState(405);
					expr();
					setState(406);
					bracketClose();
					}
					}
					setState(410); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==BracketOpen );
				}
				break;
			case POpen:
				enterOuterAlt(_localctx, 5);
				{
				setState(412);
				pOpen();
				setState(413);
				expr();
				setState(414);
				pClose();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewKeyContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(scratchParser.New, 0); }
		public NewKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterNewKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitNewKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitNewKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewKeyContext newKey() throws RecognitionException {
		NewKeyContext _localctx = new NewKeyContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_newKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(New);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DesignatorContext extends ParserRuleContext {
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<DotContext> dot() {
			return getRuleContexts(DotContext.class);
		}
		public DotContext dot(int i) {
			return getRuleContext(DotContext.class,i);
		}
		public List<BracketOpenContext> bracketOpen() {
			return getRuleContexts(BracketOpenContext.class);
		}
		public BracketOpenContext bracketOpen(int i) {
			return getRuleContext(BracketOpenContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<BracketCloseContext> bracketClose() {
			return getRuleContexts(BracketCloseContext.class);
		}
		public BracketCloseContext bracketClose(int i) {
			return getRuleContext(BracketCloseContext.class,i);
		}
		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterDesignator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitDesignator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitDesignator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignatorContext designator() throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_designator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			ident();
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Dot || _la==BracketOpen) {
				{
				setState(428);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Dot:
					{
					setState(421);
					dot();
					setState(422);
					ident();
					}
					break;
				case BracketOpen:
					{
					setState(424);
					bracketOpen();
					setState(425);
					expr();
					setState(426);
					bracketClose();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DotContext extends ParserRuleContext {
		public TerminalNode Dot() { return getToken(scratchParser.Dot, 0); }
		public DotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitDot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitDot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DotContext dot() throws RecognitionException {
		DotContext _localctx = new DotContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_dot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(Dot);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(scratchParser.Identifier, 0); }
		public TerminalNode Invalidident() { return getToken(scratchParser.Invalidident, 0); }
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			_la = _input.LA(1);
			if ( !(_la==Identifier || _la==Invalidident) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u01b8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\2\3\2\3"+
		"\2\7\2z\n\2\f\2\16\2}\13\2\3\2\3\2\7\2\u0081\n\2\f\2\16\2\u0084\13\2\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0094\n\6\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u00a6"+
		"\n\f\f\f\16\f\u00a9\13\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\5\20\u00b8\n\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\7\22\u00c3\n\22\f\22\16\22\u00c6\13\22\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\7\26\u00d5\n\26\f\26\16\26\u00d8"+
		"\13\26\3\26\3\26\3\27\3\27\3\27\5\27\u00df\n\27\3\27\3\27\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u00ed\n\33\f\33\16\33\u00f0"+
		"\13\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\7\37\u00fa\n\37\f\37\16"+
		"\37\u00fd\13\37\3\37\3\37\3 \3 \3 \3 \3 \5 \u0106\n \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \6 \u0111\n \r \16 \u0112\3 \3 \3 \3 \3 \3 \3 \3 \6 \u011d\n"+
		" \r \16 \u011e\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \6 \u012f\n \r"+
		" \16 \u0130\3 \3 \3 \3 \3 \5 \u0138\n \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3"+
		"%\3&\3&\3\'\3\'\3(\3(\3(\3(\3(\7(\u014d\n(\f(\16(\u0150\13(\6(\u0152\n"+
		"(\r(\16(\u0153\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\5*\u0162\n*\3+\3+\3"+
		",\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\6\61\u0171\n\61\r\61\16\61\u0172"+
		"\3\61\3\61\3\61\3\61\7\61\u0179\n\61\f\61\16\61\u017c\13\61\3\62\3\62"+
		"\3\63\3\63\3\64\3\64\3\64\3\64\7\64\u0186\n\64\f\64\16\64\u0189\13\64"+
		"\3\65\3\65\3\66\3\66\6\66\u018f\n\66\r\66\16\66\u0190\3\66\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\6\66\u019b\n\66\r\66\16\66\u019c\3\66\3\66\3\66"+
		"\3\66\5\66\u01a3\n\66\3\67\3\67\38\38\38\38\38\38\38\38\78\u01af\n8\f"+
		"8\168\u01b2\138\39\39\3:\3:\3:\2\2;\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnpr\2\4\4\2\62\62"+
		"\64\64\3\2\65\66\2\u01a8\2t\3\2\2\2\4\u0087\3\2\2\2\6\u0089\3\2\2\2\b"+
		"\u008b\3\2\2\2\n\u008d\3\2\2\2\f\u0097\3\2\2\2\16\u0099\3\2\2\2\20\u009b"+
		"\3\2\2\2\22\u009d\3\2\2\2\24\u009f\3\2\2\2\26\u00a1\3\2\2\2\30\u00ac\3"+
		"\2\2\2\32\u00ae\3\2\2\2\34\u00b1\3\2\2\2\36\u00b7\3\2\2\2 \u00b9\3\2\2"+
		"\2\"\u00bb\3\2\2\2$\u00c9\3\2\2\2&\u00cb\3\2\2\2(\u00cd\3\2\2\2*\u00cf"+
		"\3\2\2\2,\u00de\3\2\2\2.\u00e2\3\2\2\2\60\u00e4\3\2\2\2\62\u00e6\3\2\2"+
		"\2\64\u00e8\3\2\2\2\66\u00f1\3\2\2\28\u00f3\3\2\2\2:\u00f5\3\2\2\2<\u00f7"+
		"\3\2\2\2>\u0137\3\2\2\2@\u0139\3\2\2\2B\u013b\3\2\2\2D\u013d\3\2\2\2F"+
		"\u013f\3\2\2\2H\u0141\3\2\2\2J\u0143\3\2\2\2L\u0145\3\2\2\2N\u0147\3\2"+
		"\2\2P\u0157\3\2\2\2R\u0161\3\2\2\2T\u0163\3\2\2\2V\u0165\3\2\2\2X\u0167"+
		"\3\2\2\2Z\u0169\3\2\2\2\\\u016b\3\2\2\2^\u016d\3\2\2\2`\u0170\3\2\2\2"+
		"b\u017d\3\2\2\2d\u017f\3\2\2\2f\u0181\3\2\2\2h\u018a\3\2\2\2j\u01a2\3"+
		"\2\2\2l\u01a4\3\2\2\2n\u01a6\3\2\2\2p\u01b3\3\2\2\2r\u01b5\3\2\2\2tu\5"+
		"\b\5\2u{\5r:\2vz\5\n\6\2wz\5*\26\2xz\5\26\f\2yv\3\2\2\2yw\3\2\2\2yx\3"+
		"\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\u0082\5\4\3"+
		"\2\177\u0081\5\32\16\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085"+
		"\u0086\5\6\4\2\u0086\3\3\2\2\2\u0087\u0088\7\34\2\2\u0088\5\3\2\2\2\u0089"+
		"\u008a\7\35\2\2\u008a\7\3\2\2\2\u008b\u008c\7%\2\2\u008c\t\3\2\2\2\u008d"+
		"\u008e\5\24\13\2\u008e\u008f\5\64\33\2\u008f\u0090\5r:\2\u0090\u0093\5"+
		"\f\7\2\u0091\u0094\5,\27\2\u0092\u0094\5\62\32\2\u0093\u0091\3\2\2\2\u0093"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\5\16\b\2\u0096\13\3\2\2"+
		"\2\u0097\u0098\7\33\2\2\u0098\r\3\2\2\2\u0099\u009a\7\32\2\2\u009a\17"+
		"\3\2\2\2\u009b\u009c\7\5\2\2\u009c\21\3\2\2\2\u009d\u009e\7\67\2\2\u009e"+
		"\23\3\2\2\2\u009f\u00a0\7.\2\2\u00a0\25\3\2\2\2\u00a1\u00a2\5\30\r\2\u00a2"+
		"\u00a3\5r:\2\u00a3\u00a7\5\4\3\2\u00a4\u00a6\5*\26\2\u00a5\u00a4\3\2\2"+
		"\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa"+
		"\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\5\6\4\2\u00ab\27\3\2\2\2\u00ac"+
		"\u00ad\7&\2\2\u00ad\31\3\2\2\2\u00ae\u00af\5\34\17\2\u00af\u00b0\5<\37"+
		"\2\u00b0\33\3\2\2\2\u00b1\u00b2\5\36\20\2\u00b2\u00b3\5r:\2\u00b3\u00b4"+
		"\5\"\22\2\u00b4\35\3\2\2\2\u00b5\u00b8\5\64\33\2\u00b6\u00b8\5 \21\2\u00b7"+
		"\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\37\3\2\2\2\u00b9\u00ba\7+\2\2"+
		"\u00ba!\3\2\2\2\u00bb\u00bc\5$\23\2\u00bc\u00bd\5\64\33\2\u00bd\u00c4"+
		"\5r:\2\u00be\u00bf\5(\25\2\u00bf\u00c0\5\64\33\2\u00c0\u00c1\5r:\2\u00c1"+
		"\u00c3\3\2\2\2\u00c2\u00be\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2"+
		"\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7"+
		"\u00c8\5&\24\2\u00c8#\3\2\2\2\u00c9\u00ca\7\30\2\2\u00ca%\3\2\2\2\u00cb"+
		"\u00cc\7\31\2\2\u00cc\'\3\2\2\2\u00cd\u00ce\7\24\2\2\u00ce)\3\2\2\2\u00cf"+
		"\u00d0\5\64\33\2\u00d0\u00d6\5r:\2\u00d1\u00d2\5(\25\2\u00d2\u00d3\5r"+
		":\2\u00d3\u00d5\3\2\2\2\u00d4\u00d1\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d6\3\2"+
		"\2\2\u00d9\u00da\5\16\b\2\u00da+\3\2\2\2\u00db\u00df\5\20\t\2\u00dc\u00df"+
		"\5.\30\2\u00dd\u00df\5\60\31\2\u00de\u00db\3\2\2\2\u00de\u00dc\3\2\2\2"+
		"\u00de\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\5\16\b\2\u00e1-\3"+
		"\2\2\2\u00e2\u00e3\7\61\2\2\u00e3/\3\2\2\2\u00e4\u00e5\7\63\2\2\u00e5"+
		"\61\3\2\2\2\u00e6\u00e7\t\2\2\2\u00e7\63\3\2\2\2\u00e8\u00ee\5\66\34\2"+
		"\u00e9\u00ea\58\35\2\u00ea\u00eb\5:\36\2\u00eb\u00ed\3\2\2\2\u00ec\u00e9"+
		"\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\65\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\7\6\2\2\u00f2\67\3\2\2\2\u00f3"+
		"\u00f4\7\26\2\2\u00f49\3\2\2\2\u00f5\u00f6\7\27\2\2\u00f6;\3\2\2\2\u00f7"+
		"\u00fb\5\4\3\2\u00f8\u00fa\5> \2\u00f9\u00f8\3\2\2\2\u00fa\u00fd\3\2\2"+
		"\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00fb"+
		"\3\2\2\2\u00fe\u00ff\5\6\4\2\u00ff=\3\2\2\2\u0100\u0105\5n8\2\u0101\u0102"+
		"\5\f\7\2\u0102\u0103\5`\61\2\u0103\u0106\3\2\2\2\u0104\u0106\5N(\2\u0105"+
		"\u0101\3\2\2\2\u0105\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\5\16"+
		"\b\2\u0108\u0138\3\2\2\2\u0109\u010a\5@!\2\u010a\u010b\5P)\2\u010b\u010c"+
		"\5$\23\2\u010c\u0110\5> \2\u010d\u010e\5B\"\2\u010e\u010f\5> \2\u010f"+
		"\u0111\3\2\2\2\u0110\u010d\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0110\3\2"+
		"\2\2\u0112\u0113\3\2\2\2\u0113\u0138\3\2\2\2\u0114\u0115\5D#\2\u0115\u0116"+
		"\5$\23\2\u0116\u0117\5P)\2\u0117\u0118\5&\24\2\u0118\u0119\5> \2\u0119"+
		"\u0138\3\2\2\2\u011a\u011c\5F$\2\u011b\u011d\5`\61\2\u011c\u011b\3\2\2"+
		"\2\u011d\u011e\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120"+
		"\3\2\2\2\u0120\u0121\5\16\b\2\u0121\u0138\3\2\2\2\u0122\u0123\5H%\2\u0123"+
		"\u0124\5$\23\2\u0124\u0125\5n8\2\u0125\u0126\5&\24\2\u0126\u0127\5\16"+
		"\b\2\u0127\u0138\3\2\2\2\u0128\u0129\5J&\2\u0129\u012a\5$\23\2\u012a\u012e"+
		"\5`\61\2\u012b\u012c\5(\25\2\u012c\u012d\5L\'\2\u012d\u012f\3\2\2\2\u012e"+
		"\u012b\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2"+
		"\2\2\u0131\u0132\3\2\2\2\u0132\u0133\5&\24\2\u0133\u0134\5\16\b\2\u0134"+
		"\u0138\3\2\2\2\u0135\u0138\5<\37\2\u0136\u0138\5\16\b\2\u0137\u0100\3"+
		"\2\2\2\u0137\u0109\3\2\2\2\u0137\u0114\3\2\2\2\u0137\u011a\3\2\2\2\u0137"+
		"\u0122\3\2\2\2\u0137\u0128\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0136\3\2"+
		"\2\2\u0138?\3\2\2\2\u0139\u013a\7\'\2\2\u013aA\3\2\2\2\u013b\u013c\7*"+
		"\2\2\u013cC\3\2\2\2\u013d\u013e\7(\2\2\u013eE\3\2\2\2\u013f\u0140\7)\2"+
		"\2\u0140G\3\2\2\2\u0141\u0142\7,\2\2\u0142I\3\2\2\2\u0143\u0144\7-\2\2"+
		"\u0144K\3\2\2\2\u0145\u0146\78\2\2\u0146M\3\2\2\2\u0147\u0151\5$\23\2"+
		"\u0148\u014e\5`\61\2\u0149\u014a\5(\25\2\u014a\u014b\5`\61\2\u014b\u014d"+
		"\3\2\2\2\u014c\u0149\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0148\3\2"+
		"\2\2\u0152\u0153\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155\u0156\5&\24\2\u0156O\3\2\2\2\u0157\u0158\5`\61\2"+
		"\u0158\u0159\5R*\2\u0159\u015a\5`\61\2\u015aQ\3\2\2\2\u015b\u0162\5T+"+
		"\2\u015c\u0162\5V,\2\u015d\u0162\5X-\2\u015e\u0162\5Z.\2\u015f\u0162\5"+
		"\\/\2\u0160\u0162\5^\60\2\u0161\u015b\3\2\2\2\u0161\u015c\3\2\2\2\u0161"+
		"\u015d\3\2\2\2\u0161\u015e\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0160\3\2"+
		"\2\2\u0162S\3\2\2\2\u0163\u0164\7\t\2\2\u0164U\3\2\2\2\u0165\u0166\7\17"+
		"\2\2\u0166W\3\2\2\2\u0167\u0168\7\20\2\2\u0168Y\3\2\2\2\u0169\u016a\7"+
		"\22\2\2\u016a[\3\2\2\2\u016b\u016c\7\21\2\2\u016c]\3\2\2\2\u016d\u016e"+
		"\7\23\2\2\u016e_\3\2\2\2\u016f\u0171\5b\62\2\u0170\u016f\3\2\2\2\u0171"+
		"\u0172\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174\3\2"+
		"\2\2\u0174\u017a\5f\64\2\u0175\u0176\5d\63\2\u0176\u0177\5f\64\2\u0177"+
		"\u0179\3\2\2\2\u0178\u0175\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2"+
		"\2\2\u017a\u017b\3\2\2\2\u017ba\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u017e"+
		"\7\n\2\2\u017ec\3\2\2\2\u017f\u0180\7\7\2\2\u0180e\3\2\2\2\u0181\u0187"+
		"\5j\66\2\u0182\u0183\5h\65\2\u0183\u0184\5j\66\2\u0184\u0186\3\2\2\2\u0185"+
		"\u0182\3\2\2\2\u0186\u0189\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2"+
		"\2\2\u0188g\3\2\2\2\u0189\u0187\3\2\2\2\u018a\u018b\7\b\2\2\u018bi\3\2"+
		"\2\2\u018c\u018e\5n8\2\u018d\u018f\5N(\2\u018e\u018d\3\2\2\2\u018f\u0190"+
		"\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u01a3\3\2\2\2\u0192"+
		"\u01a3\5L\'\2\u0193\u01a3\5\22\n\2\u0194\u0195\5l\67\2\u0195\u019a\5r"+
		":\2\u0196\u0197\58\35\2\u0197\u0198\5`\61\2\u0198\u0199\5:\36\2\u0199"+
		"\u019b\3\2\2\2\u019a\u0196\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019a\3\2"+
		"\2\2\u019c\u019d\3\2\2\2\u019d\u01a3\3\2\2\2\u019e\u019f\5$\23\2\u019f"+
		"\u01a0\5`\61\2\u01a0\u01a1\5&\24\2\u01a1\u01a3\3\2\2\2\u01a2\u018c\3\2"+
		"\2\2\u01a2\u0192\3\2\2\2\u01a2\u0193\3\2\2\2\u01a2\u0194\3\2\2\2\u01a2"+
		"\u019e\3\2\2\2\u01a3k\3\2\2\2\u01a4\u01a5\7/\2\2\u01a5m\3\2\2\2\u01a6"+
		"\u01b0\5r:\2\u01a7\u01a8\5p9\2\u01a8\u01a9\5r:\2\u01a9\u01af\3\2\2\2\u01aa"+
		"\u01ab\58\35\2\u01ab\u01ac\5`\61\2\u01ac\u01ad\5:\36\2\u01ad\u01af\3\2"+
		"\2\2\u01ae\u01a7\3\2\2\2\u01ae\u01aa\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0"+
		"\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1o\3\2\2\2\u01b2\u01b0\3\2\2\2"+
		"\u01b3\u01b4\7\25\2\2\u01b4q\3\2\2\2\u01b5\u01b6\t\3\2\2\u01b6s\3\2\2"+
		"\2\35y{\u0082\u0093\u00a7\u00b7\u00c4\u00d6\u00de\u00ee\u00fb\u0105\u0112"+
		"\u011e\u0130\u0137\u014e\u0153\u0161\u0172\u017a\u0187\u0190\u019c\u01a2"+
		"\u01ae\u01b0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}