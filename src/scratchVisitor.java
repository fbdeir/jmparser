// Generated from C:/Users/MSE/.IdeaIC2017.2/config/scratches\scratch.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link scratchParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface scratchVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link scratchParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(scratchParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#cbOpen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCbOpen(scratchParser.CbOpenContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#cbClose}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCbClose(scratchParser.CbCloseContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#progStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgStart(scratchParser.ProgStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#constDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDecl(scratchParser.ConstDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#equals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquals(scratchParser.EqualsContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#semi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemi(scratchParser.SemiContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(scratchParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#chara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChara(scratchParser.CharaContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#fin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFin(scratchParser.FinContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#classDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDecl(scratchParser.ClassDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#cl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCl(scratchParser.ClContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#methodDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDecl(scratchParser.MethodDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#methodHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodHeader(scratchParser.MethodHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#methodType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodType(scratchParser.MethodTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#vd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVd(scratchParser.VdContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#formPars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormPars(scratchParser.FormParsContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#pOpen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPOpen(scratchParser.POpenContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#pClose}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPClose(scratchParser.PCloseContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#comma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma(scratchParser.CommaContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(scratchParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#terminated}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminated(scratchParser.TerminatedContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter(scratchParser.CharacterContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(scratchParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#unterminated}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnterminated(scratchParser.UnterminatedContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(scratchParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#variableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableType(scratchParser.VariableTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#bracketOpen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketOpen(scratchParser.BracketOpenContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#bracketClose}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketClose(scratchParser.BracketCloseContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(scratchParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(scratchParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#ifKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfKey(scratchParser.IfKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#el}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEl(scratchParser.ElContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#whileKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileKey(scratchParser.WhileKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#returnKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnKey(scratchParser.ReturnKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#readKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadKey(scratchParser.ReadKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#printKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintKey(scratchParser.PrintKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#digit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigit(scratchParser.DigitContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#actPars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActPars(scratchParser.ActParsContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(scratchParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(scratchParser.RelopContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#equalsEquals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualsEquals(scratchParser.EqualsEqualsContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#notEquals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEquals(scratchParser.NotEqualsContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#greaterThan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThan(scratchParser.GreaterThanContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#greaterThanOrEq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanOrEq(scratchParser.GreaterThanOrEqContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#lessThan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThan(scratchParser.LessThanContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#lessThanOrEq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanOrEq(scratchParser.LessThanOrEqContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(scratchParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#minus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(scratchParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#addop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddop(scratchParser.AddopContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(scratchParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#mulop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulop(scratchParser.MulopContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(scratchParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#newKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewKey(scratchParser.NewKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#designator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignator(scratchParser.DesignatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#dot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDot(scratchParser.DotContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(scratchParser.IdentContext ctx);
}