// Generated from C:/Users/MSE/.IdeaIC2017.2/config/scratches\scratch.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link scratchParser}.
 */
public interface scratchListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link scratchParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(scratchParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(scratchParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#cbOpen}.
	 * @param ctx the parse tree
	 */
	void enterCbOpen(scratchParser.CbOpenContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#cbOpen}.
	 * @param ctx the parse tree
	 */
	void exitCbOpen(scratchParser.CbOpenContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#cbClose}.
	 * @param ctx the parse tree
	 */
	void enterCbClose(scratchParser.CbCloseContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#cbClose}.
	 * @param ctx the parse tree
	 */
	void exitCbClose(scratchParser.CbCloseContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#progStart}.
	 * @param ctx the parse tree
	 */
	void enterProgStart(scratchParser.ProgStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#progStart}.
	 * @param ctx the parse tree
	 */
	void exitProgStart(scratchParser.ProgStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstDecl(scratchParser.ConstDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstDecl(scratchParser.ConstDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#equals}.
	 * @param ctx the parse tree
	 */
	void enterEquals(scratchParser.EqualsContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#equals}.
	 * @param ctx the parse tree
	 */
	void exitEquals(scratchParser.EqualsContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#semi}.
	 * @param ctx the parse tree
	 */
	void enterSemi(scratchParser.SemiContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#semi}.
	 * @param ctx the parse tree
	 */
	void exitSemi(scratchParser.SemiContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(scratchParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(scratchParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#chara}.
	 * @param ctx the parse tree
	 */
	void enterChara(scratchParser.CharaContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#chara}.
	 * @param ctx the parse tree
	 */
	void exitChara(scratchParser.CharaContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#fin}.
	 * @param ctx the parse tree
	 */
	void enterFin(scratchParser.FinContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#fin}.
	 * @param ctx the parse tree
	 */
	void exitFin(scratchParser.FinContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassDecl(scratchParser.ClassDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassDecl(scratchParser.ClassDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#cl}.
	 * @param ctx the parse tree
	 */
	void enterCl(scratchParser.ClContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#cl}.
	 * @param ctx the parse tree
	 */
	void exitCl(scratchParser.ClContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethodDecl(scratchParser.MethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethodDecl(scratchParser.MethodDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(scratchParser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(scratchParser.MethodHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#methodType}.
	 * @param ctx the parse tree
	 */
	void enterMethodType(scratchParser.MethodTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#methodType}.
	 * @param ctx the parse tree
	 */
	void exitMethodType(scratchParser.MethodTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#vd}.
	 * @param ctx the parse tree
	 */
	void enterVd(scratchParser.VdContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#vd}.
	 * @param ctx the parse tree
	 */
	void exitVd(scratchParser.VdContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#formPars}.
	 * @param ctx the parse tree
	 */
	void enterFormPars(scratchParser.FormParsContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#formPars}.
	 * @param ctx the parse tree
	 */
	void exitFormPars(scratchParser.FormParsContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#pOpen}.
	 * @param ctx the parse tree
	 */
	void enterPOpen(scratchParser.POpenContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#pOpen}.
	 * @param ctx the parse tree
	 */
	void exitPOpen(scratchParser.POpenContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#pClose}.
	 * @param ctx the parse tree
	 */
	void enterPClose(scratchParser.PCloseContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#pClose}.
	 * @param ctx the parse tree
	 */
	void exitPClose(scratchParser.PCloseContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#comma}.
	 * @param ctx the parse tree
	 */
	void enterComma(scratchParser.CommaContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#comma}.
	 * @param ctx the parse tree
	 */
	void exitComma(scratchParser.CommaContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(scratchParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(scratchParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#terminated}.
	 * @param ctx the parse tree
	 */
	void enterTerminated(scratchParser.TerminatedContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#terminated}.
	 * @param ctx the parse tree
	 */
	void exitTerminated(scratchParser.TerminatedContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharacter(scratchParser.CharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharacter(scratchParser.CharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(scratchParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(scratchParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#unterminated}.
	 * @param ctx the parse tree
	 */
	void enterUnterminated(scratchParser.UnterminatedContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#unterminated}.
	 * @param ctx the parse tree
	 */
	void exitUnterminated(scratchParser.UnterminatedContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(scratchParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(scratchParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#variableType}.
	 * @param ctx the parse tree
	 */
	void enterVariableType(scratchParser.VariableTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#variableType}.
	 * @param ctx the parse tree
	 */
	void exitVariableType(scratchParser.VariableTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#bracketOpen}.
	 * @param ctx the parse tree
	 */
	void enterBracketOpen(scratchParser.BracketOpenContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#bracketOpen}.
	 * @param ctx the parse tree
	 */
	void exitBracketOpen(scratchParser.BracketOpenContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#bracketClose}.
	 * @param ctx the parse tree
	 */
	void enterBracketClose(scratchParser.BracketCloseContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#bracketClose}.
	 * @param ctx the parse tree
	 */
	void exitBracketClose(scratchParser.BracketCloseContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(scratchParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(scratchParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(scratchParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(scratchParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#ifKey}.
	 * @param ctx the parse tree
	 */
	void enterIfKey(scratchParser.IfKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#ifKey}.
	 * @param ctx the parse tree
	 */
	void exitIfKey(scratchParser.IfKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#el}.
	 * @param ctx the parse tree
	 */
	void enterEl(scratchParser.ElContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#el}.
	 * @param ctx the parse tree
	 */
	void exitEl(scratchParser.ElContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#whileKey}.
	 * @param ctx the parse tree
	 */
	void enterWhileKey(scratchParser.WhileKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#whileKey}.
	 * @param ctx the parse tree
	 */
	void exitWhileKey(scratchParser.WhileKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#returnKey}.
	 * @param ctx the parse tree
	 */
	void enterReturnKey(scratchParser.ReturnKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#returnKey}.
	 * @param ctx the parse tree
	 */
	void exitReturnKey(scratchParser.ReturnKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#readKey}.
	 * @param ctx the parse tree
	 */
	void enterReadKey(scratchParser.ReadKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#readKey}.
	 * @param ctx the parse tree
	 */
	void exitReadKey(scratchParser.ReadKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#printKey}.
	 * @param ctx the parse tree
	 */
	void enterPrintKey(scratchParser.PrintKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#printKey}.
	 * @param ctx the parse tree
	 */
	void exitPrintKey(scratchParser.PrintKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#digit}.
	 * @param ctx the parse tree
	 */
	void enterDigit(scratchParser.DigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#digit}.
	 * @param ctx the parse tree
	 */
	void exitDigit(scratchParser.DigitContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#actPars}.
	 * @param ctx the parse tree
	 */
	void enterActPars(scratchParser.ActParsContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#actPars}.
	 * @param ctx the parse tree
	 */
	void exitActPars(scratchParser.ActParsContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(scratchParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(scratchParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(scratchParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(scratchParser.RelopContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#equalsEquals}.
	 * @param ctx the parse tree
	 */
	void enterEqualsEquals(scratchParser.EqualsEqualsContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#equalsEquals}.
	 * @param ctx the parse tree
	 */
	void exitEqualsEquals(scratchParser.EqualsEqualsContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#notEquals}.
	 * @param ctx the parse tree
	 */
	void enterNotEquals(scratchParser.NotEqualsContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#notEquals}.
	 * @param ctx the parse tree
	 */
	void exitNotEquals(scratchParser.NotEqualsContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#greaterThan}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThan(scratchParser.GreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#greaterThan}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThan(scratchParser.GreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#greaterThanOrEq}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanOrEq(scratchParser.GreaterThanOrEqContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#greaterThanOrEq}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanOrEq(scratchParser.GreaterThanOrEqContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#lessThan}.
	 * @param ctx the parse tree
	 */
	void enterLessThan(scratchParser.LessThanContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#lessThan}.
	 * @param ctx the parse tree
	 */
	void exitLessThan(scratchParser.LessThanContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#lessThanOrEq}.
	 * @param ctx the parse tree
	 */
	void enterLessThanOrEq(scratchParser.LessThanOrEqContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#lessThanOrEq}.
	 * @param ctx the parse tree
	 */
	void exitLessThanOrEq(scratchParser.LessThanOrEqContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(scratchParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(scratchParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#minus}.
	 * @param ctx the parse tree
	 */
	void enterMinus(scratchParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#minus}.
	 * @param ctx the parse tree
	 */
	void exitMinus(scratchParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#addop}.
	 * @param ctx the parse tree
	 */
	void enterAddop(scratchParser.AddopContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#addop}.
	 * @param ctx the parse tree
	 */
	void exitAddop(scratchParser.AddopContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(scratchParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(scratchParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#mulop}.
	 * @param ctx the parse tree
	 */
	void enterMulop(scratchParser.MulopContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#mulop}.
	 * @param ctx the parse tree
	 */
	void exitMulop(scratchParser.MulopContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(scratchParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(scratchParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#newKey}.
	 * @param ctx the parse tree
	 */
	void enterNewKey(scratchParser.NewKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#newKey}.
	 * @param ctx the parse tree
	 */
	void exitNewKey(scratchParser.NewKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#designator}.
	 * @param ctx the parse tree
	 */
	void enterDesignator(scratchParser.DesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#designator}.
	 * @param ctx the parse tree
	 */
	void exitDesignator(scratchParser.DesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#dot}.
	 * @param ctx the parse tree
	 */
	void enterDot(scratchParser.DotContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#dot}.
	 * @param ctx the parse tree
	 */
	void exitDot(scratchParser.DotContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(scratchParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(scratchParser.IdentContext ctx);
}