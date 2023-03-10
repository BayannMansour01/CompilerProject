// Generated from C:/Users/Bayan/Desktop/CompilerProjectlast/src/antlr\dartParser.g4 by ANTLR 4.10.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link dartParser}.
 */
public interface dartParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link dartParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(dartParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(dartParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(dartParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(dartParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassDecl(dartParser.ClassDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassDecl(dartParser.ClassDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(dartParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(dartParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#classConstructor}.
	 * @param ctx the parse tree
	 */
	void enterClassConstructor(dartParser.ClassConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#classConstructor}.
	 * @param ctx the parse tree
	 */
	void exitClassConstructor(dartParser.ClassConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#normalConstructor}.
	 * @param ctx the parse tree
	 */
	void enterNormalConstructor(dartParser.NormalConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#normalConstructor}.
	 * @param ctx the parse tree
	 */
	void exitNormalConstructor(dartParser.NormalConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#factoryConstructor}.
	 * @param ctx the parse tree
	 */
	void enterFactoryConstructor(dartParser.FactoryConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#factoryConstructor}.
	 * @param ctx the parse tree
	 */
	void exitFactoryConstructor(dartParser.FactoryConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(dartParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(dartParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#factoryConstructorBody}.
	 * @param ctx the parse tree
	 */
	void enterFactoryConstructorBody(dartParser.FactoryConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#factoryConstructorBody}.
	 * @param ctx the parse tree
	 */
	void exitFactoryConstructorBody(dartParser.FactoryConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#optionalParameters}.
	 * @param ctx the parse tree
	 */
	void enterOptionalParameters(dartParser.OptionalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#optionalParameters}.
	 * @param ctx the parse tree
	 */
	void exitOptionalParameters(dartParser.OptionalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#parametersConstructor}.
	 * @param ctx the parse tree
	 */
	void enterParametersConstructor(dartParser.ParametersConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#parametersConstructor}.
	 * @param ctx the parse tree
	 */
	void exitParametersConstructor(dartParser.ParametersConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#constructorName}.
	 * @param ctx the parse tree
	 */
	void enterConstructorName(dartParser.ConstructorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#constructorName}.
	 * @param ctx the parse tree
	 */
	void exitConstructorName(dartParser.ConstructorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#functionMain}.
	 * @param ctx the parse tree
	 */
	void enterFunctionMain(dartParser.FunctionMainContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#functionMain}.
	 * @param ctx the parse tree
	 */
	void exitFunctionMain(dartParser.FunctionMainContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#statment}.
	 * @param ctx the parse tree
	 */
	void enterStatment(dartParser.StatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#statment}.
	 * @param ctx the parse tree
	 */
	void exitStatment(dartParser.StatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(dartParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(dartParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#elseifblock}.
	 * @param ctx the parse tree
	 */
	void enterElseifblock(dartParser.ElseifblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#elseifblock}.
	 * @param ctx the parse tree
	 */
	void exitElseifblock(dartParser.ElseifblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void enterWhileBlock(dartParser.WhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void exitWhileBlock(dartParser.WhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void enterForBlock(dartParser.ForBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void exitForBlock(dartParser.ForBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(dartParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(dartParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#datatypes}.
	 * @param ctx the parse tree
	 */
	void enterDatatypes(dartParser.DatatypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#datatypes}.
	 * @param ctx the parse tree
	 */
	void exitDatatypes(dartParser.DatatypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(dartParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(dartParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#varplusplus}.
	 * @param ctx the parse tree
	 */
	void enterVarplusplus(dartParser.VarplusplusContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#varplusplus}.
	 * @param ctx the parse tree
	 */
	void exitVarplusplus(dartParser.VarplusplusContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#varminusminus}.
	 * @param ctx the parse tree
	 */
	void enterVarminusminus(dartParser.VarminusminusContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#varminusminus}.
	 * @param ctx the parse tree
	 */
	void exitVarminusminus(dartParser.VarminusminusContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#declINT}.
	 * @param ctx the parse tree
	 */
	void enterDeclINT(dartParser.DeclINTContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#declINT}.
	 * @param ctx the parse tree
	 */
	void exitDeclINT(dartParser.DeclINTContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#decldouble}.
	 * @param ctx the parse tree
	 */
	void enterDecldouble(dartParser.DecldoubleContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#decldouble}.
	 * @param ctx the parse tree
	 */
	void exitDecldouble(dartParser.DecldoubleContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#declSTRING}.
	 * @param ctx the parse tree
	 */
	void enterDeclSTRING(dartParser.DeclSTRINGContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#declSTRING}.
	 * @param ctx the parse tree
	 */
	void exitDeclSTRING(dartParser.DeclSTRINGContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#declFLOAT}.
	 * @param ctx the parse tree
	 */
	void enterDeclFLOAT(dartParser.DeclFLOATContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#declFLOAT}.
	 * @param ctx the parse tree
	 */
	void exitDeclFLOAT(dartParser.DeclFLOATContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#declbool}.
	 * @param ctx the parse tree
	 */
	void enterDeclbool(dartParser.DeclboolContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#declbool}.
	 * @param ctx the parse tree
	 */
	void exitDeclbool(dartParser.DeclboolContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#declVar}.
	 * @param ctx the parse tree
	 */
	void enterDeclVar(dartParser.DeclVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#declVar}.
	 * @param ctx the parse tree
	 */
	void exitDeclVar(dartParser.DeclVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#parametersFUNCTION}.
	 * @param ctx the parse tree
	 */
	void enterParametersFUNCTION(dartParser.ParametersFUNCTIONContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#parametersFUNCTION}.
	 * @param ctx the parse tree
	 */
	void exitParametersFUNCTION(dartParser.ParametersFUNCTIONContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(dartParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(dartParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#functionVoid}.
	 * @param ctx the parse tree
	 */
	void enterFunctionVoid(dartParser.FunctionVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#functionVoid}.
	 * @param ctx the parse tree
	 */
	void exitFunctionVoid(dartParser.FunctionVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(dartParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(dartParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(dartParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(dartParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#boolOPERATIONS}.
	 * @param ctx the parse tree
	 */
	void enterBoolOPERATIONS(dartParser.BoolOPERATIONSContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#boolOPERATIONS}.
	 * @param ctx the parse tree
	 */
	void exitBoolOPERATIONS(dartParser.BoolOPERATIONSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExprition}
	 * labeled alternative in {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 */
	void enterNotExprition(dartParser.NotExpritionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExprition}
	 * labeled alternative in {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 */
	void exitNotExprition(dartParser.NotExpritionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprplusexpr}
	 * labeled alternative in {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 */
	void enterExprplusexpr(dartParser.ExprplusexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprplusexpr}
	 * labeled alternative in {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 */
	void exitExprplusexpr(dartParser.ExprplusexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(dartParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(dartParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprminusexpr}
	 * labeled alternative in {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 */
	void enterExprminusexpr(dartParser.ExprminusexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprminusexpr}
	 * labeled alternative in {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 */
	void exitExprminusexpr(dartParser.ExprminusexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprboolexpr}
	 * labeled alternative in {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 */
	void enterExprboolexpr(dartParser.ExprboolexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprboolexpr}
	 * labeled alternative in {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 */
	void exitExprboolexpr(dartParser.ExprboolexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constatntt}
	 * labeled alternative in {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 */
	void enterConstatntt(dartParser.ConstatnttContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constatntt}
	 * labeled alternative in {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 */
	void exitConstatntt(dartParser.ConstatnttContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcCall}
	 * labeled alternative in {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(dartParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcCall}
	 * labeled alternative in {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(dartParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expmulexpr}
	 * labeled alternative in {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 */
	void enterExpmulexpr(dartParser.ExpmulexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expmulexpr}
	 * labeled alternative in {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 */
	void exitExpmulexpr(dartParser.ExpmulexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprOPCP}
	 * labeled alternative in {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 */
	void enterExprOPCP(dartParser.ExprOPCPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprOPCP}
	 * labeled alternative in {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 */
	void exitExprOPCP(dartParser.ExprOPCPContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(dartParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(dartParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberCosnt}
	 * labeled alternative in {@link dartParser#constatnt}.
	 * @param ctx the parse tree
	 */
	void enterNumberCosnt(dartParser.NumberCosntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberCosnt}
	 * labeled alternative in {@link dartParser#constatnt}.
	 * @param ctx the parse tree
	 */
	void exitNumberCosnt(dartParser.NumberCosntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolConst}
	 * labeled alternative in {@link dartParser#constatnt}.
	 * @param ctx the parse tree
	 */
	void enterBoolConst(dartParser.BoolConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolConst}
	 * labeled alternative in {@link dartParser#constatnt}.
	 * @param ctx the parse tree
	 */
	void exitBoolConst(dartParser.BoolConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringConst}
	 * labeled alternative in {@link dartParser#constatnt}.
	 * @param ctx the parse tree
	 */
	void enterStringConst(dartParser.StringConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringConst}
	 * labeled alternative in {@link dartParser#constatnt}.
	 * @param ctx the parse tree
	 */
	void exitStringConst(dartParser.StringConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intConst}
	 * labeled alternative in {@link dartParser#constatnt}.
	 * @param ctx the parse tree
	 */
	void enterIntConst(dartParser.IntConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intConst}
	 * labeled alternative in {@link dartParser#constatnt}.
	 * @param ctx the parse tree
	 */
	void exitIntConst(dartParser.IntConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayInteger}
	 * labeled alternative in {@link dartParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArrayInteger(dartParser.ArrayIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayInteger}
	 * labeled alternative in {@link dartParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArrayInteger(dartParser.ArrayIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayDouble}
	 * labeled alternative in {@link dartParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArrayDouble(dartParser.ArrayDoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayDouble}
	 * labeled alternative in {@link dartParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArrayDouble(dartParser.ArrayDoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayString}
	 * labeled alternative in {@link dartParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArrayString(dartParser.ArrayStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayString}
	 * labeled alternative in {@link dartParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArrayString(dartParser.ArrayStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayBool}
	 * labeled alternative in {@link dartParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArrayBool(dartParser.ArrayBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayBool}
	 * labeled alternative in {@link dartParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArrayBool(dartParser.ArrayBoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(dartParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(dartParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#addlist_queue_stack}.
	 * @param ctx the parse tree
	 */
	void enterAddlist_queue_stack(dartParser.Addlist_queue_stackContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#addlist_queue_stack}.
	 * @param ctx the parse tree
	 */
	void exitAddlist_queue_stack(dartParser.Addlist_queue_stackContext ctx);
	/**
	 * Enter a parse tree produced by the {@code textFieldl}
	 * labeled alternative in {@link dartParser#widgets}.
	 * @param ctx the parse tree
	 */
	void enterTextFieldl(dartParser.TextFieldlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code textFieldl}
	 * labeled alternative in {@link dartParser#widgets}.
	 * @param ctx the parse tree
	 */
	void exitTextFieldl(dartParser.TextFieldlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code imagel}
	 * labeled alternative in {@link dartParser#widgets}.
	 * @param ctx the parse tree
	 */
	void enterImagel(dartParser.ImagelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code imagel}
	 * labeled alternative in {@link dartParser#widgets}.
	 * @param ctx the parse tree
	 */
	void exitImagel(dartParser.ImagelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowl}
	 * labeled alternative in {@link dartParser#widgets}.
	 * @param ctx the parse tree
	 */
	void enterRowl(dartParser.RowlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowl}
	 * labeled alternative in {@link dartParser#widgets}.
	 * @param ctx the parse tree
	 */
	void exitRowl(dartParser.RowlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnl}
	 * labeled alternative in {@link dartParser#widgets}.
	 * @param ctx the parse tree
	 */
	void enterColumnl(dartParser.ColumnlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnl}
	 * labeled alternative in {@link dartParser#widgets}.
	 * @param ctx the parse tree
	 */
	void exitColumnl(dartParser.ColumnlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code containerl}
	 * labeled alternative in {@link dartParser#widgets}.
	 * @param ctx the parse tree
	 */
	void enterContainerl(dartParser.ContainerlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code containerl}
	 * labeled alternative in {@link dartParser#widgets}.
	 * @param ctx the parse tree
	 */
	void exitContainerl(dartParser.ContainerlContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#textField}.
	 * @param ctx the parse tree
	 */
	void enterTextField(dartParser.TextFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#textField}.
	 * @param ctx the parse tree
	 */
	void exitTextField(dartParser.TextFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code textFieldTextPropertyl}
	 * labeled alternative in {@link dartParser#textFieldProperties}.
	 * @param ctx the parse tree
	 */
	void enterTextFieldTextPropertyl(dartParser.TextFieldTextPropertylContext ctx);
	/**
	 * Exit a parse tree produced by the {@code textFieldTextPropertyl}
	 * labeled alternative in {@link dartParser#textFieldProperties}.
	 * @param ctx the parse tree
	 */
	void exitTextFieldTextPropertyl(dartParser.TextFieldTextPropertylContext ctx);
	/**
	 * Enter a parse tree produced by the {@code textFieldControllerPropertyl}
	 * labeled alternative in {@link dartParser#textFieldProperties}.
	 * @param ctx the parse tree
	 */
	void enterTextFieldControllerPropertyl(dartParser.TextFieldControllerPropertylContext ctx);
	/**
	 * Exit a parse tree produced by the {@code textFieldControllerPropertyl}
	 * labeled alternative in {@link dartParser#textFieldProperties}.
	 * @param ctx the parse tree
	 */
	void exitTextFieldControllerPropertyl(dartParser.TextFieldControllerPropertylContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#textFieldTextProperty}.
	 * @param ctx the parse tree
	 */
	void enterTextFieldTextProperty(dartParser.TextFieldTextPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#textFieldTextProperty}.
	 * @param ctx the parse tree
	 */
	void exitTextFieldTextProperty(dartParser.TextFieldTextPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#textFieldControllerProperty}.
	 * @param ctx the parse tree
	 */
	void enterTextFieldControllerProperty(dartParser.TextFieldControllerPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#textFieldControllerProperty}.
	 * @param ctx the parse tree
	 */
	void exitTextFieldControllerProperty(dartParser.TextFieldControllerPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#image}.
	 * @param ctx the parse tree
	 */
	void enterImage(dartParser.ImageContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#image}.
	 * @param ctx the parse tree
	 */
	void exitImage(dartParser.ImageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code imagepropertyl}
	 * labeled alternative in {@link dartParser#imageProperties}.
	 * @param ctx the parse tree
	 */
	void enterImagepropertyl(dartParser.ImagepropertylContext ctx);
	/**
	 * Exit a parse tree produced by the {@code imagepropertyl}
	 * labeled alternative in {@link dartParser#imageProperties}.
	 * @param ctx the parse tree
	 */
	void exitImagepropertyl(dartParser.ImagepropertylContext ctx);
	/**
	 * Enter a parse tree produced by the {@code heightl}
	 * labeled alternative in {@link dartParser#imageProperties}.
	 * @param ctx the parse tree
	 */
	void enterHeightl(dartParser.HeightlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code heightl}
	 * labeled alternative in {@link dartParser#imageProperties}.
	 * @param ctx the parse tree
	 */
	void exitHeightl(dartParser.HeightlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code widthl}
	 * labeled alternative in {@link dartParser#imageProperties}.
	 * @param ctx the parse tree
	 */
	void enterWidthl(dartParser.WidthlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code widthl}
	 * labeled alternative in {@link dartParser#imageProperties}.
	 * @param ctx the parse tree
	 */
	void exitWidthl(dartParser.WidthlContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#imageproperty}.
	 * @param ctx the parse tree
	 */
	void enterImageproperty(dartParser.ImagepropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#imageproperty}.
	 * @param ctx the parse tree
	 */
	void exitImageproperty(dartParser.ImagepropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#height}.
	 * @param ctx the parse tree
	 */
	void enterHeight(dartParser.HeightContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#height}.
	 * @param ctx the parse tree
	 */
	void exitHeight(dartParser.HeightContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#width}.
	 * @param ctx the parse tree
	 */
	void enterWidth(dartParser.WidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#width}.
	 * @param ctx the parse tree
	 */
	void exitWidth(dartParser.WidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#container}.
	 * @param ctx the parse tree
	 */
	void enterContainer(dartParser.ContainerContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#container}.
	 * @param ctx the parse tree
	 */
	void exitContainer(dartParser.ContainerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code colorl}
	 * labeled alternative in {@link dartParser#containerproperties}.
	 * @param ctx the parse tree
	 */
	void enterColorl(dartParser.ColorlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code colorl}
	 * labeled alternative in {@link dartParser#containerproperties}.
	 * @param ctx the parse tree
	 */
	void exitColorl(dartParser.ColorlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code heightcontainerl}
	 * labeled alternative in {@link dartParser#containerproperties}.
	 * @param ctx the parse tree
	 */
	void enterHeightcontainerl(dartParser.HeightcontainerlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code heightcontainerl}
	 * labeled alternative in {@link dartParser#containerproperties}.
	 * @param ctx the parse tree
	 */
	void exitHeightcontainerl(dartParser.HeightcontainerlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code widthcontainerl}
	 * labeled alternative in {@link dartParser#containerproperties}.
	 * @param ctx the parse tree
	 */
	void enterWidthcontainerl(dartParser.WidthcontainerlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code widthcontainerl}
	 * labeled alternative in {@link dartParser#containerproperties}.
	 * @param ctx the parse tree
	 */
	void exitWidthcontainerl(dartParser.WidthcontainerlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code childl}
	 * labeled alternative in {@link dartParser#child}.
	 * @param ctx the parse tree
	 */
	void enterChildl(dartParser.ChildlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code childl}
	 * labeled alternative in {@link dartParser#child}.
	 * @param ctx the parse tree
	 */
	void exitChildl(dartParser.ChildlContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(dartParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(dartParser.ColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#heightcontainer}.
	 * @param ctx the parse tree
	 */
	void enterHeightcontainer(dartParser.HeightcontainerContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#heightcontainer}.
	 * @param ctx the parse tree
	 */
	void exitHeightcontainer(dartParser.HeightcontainerContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#widthcontainer}.
	 * @param ctx the parse tree
	 */
	void enterWidthcontainer(dartParser.WidthcontainerContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#widthcontainer}.
	 * @param ctx the parse tree
	 */
	void exitWidthcontainer(dartParser.WidthcontainerContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(dartParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(dartParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#rowProperties}.
	 * @param ctx the parse tree
	 */
	void enterRowProperties(dartParser.RowPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#rowProperties}.
	 * @param ctx the parse tree
	 */
	void exitRowProperties(dartParser.RowPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mainaxisrow}
	 * labeled alternative in {@link dartParser#rowproperty}.
	 * @param ctx the parse tree
	 */
	void enterMainaxisrow(dartParser.MainaxisrowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mainaxisrow}
	 * labeled alternative in {@link dartParser#rowproperty}.
	 * @param ctx the parse tree
	 */
	void exitMainaxisrow(dartParser.MainaxisrowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code crossaxisrow}
	 * labeled alternative in {@link dartParser#rowproperty}.
	 * @param ctx the parse tree
	 */
	void enterCrossaxisrow(dartParser.CrossaxisrowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code crossaxisrow}
	 * labeled alternative in {@link dartParser#rowproperty}.
	 * @param ctx the parse tree
	 */
	void exitCrossaxisrow(dartParser.CrossaxisrowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code childrenl}
	 * labeled alternative in {@link dartParser#children}.
	 * @param ctx the parse tree
	 */
	void enterChildrenl(dartParser.ChildrenlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code childrenl}
	 * labeled alternative in {@link dartParser#children}.
	 * @param ctx the parse tree
	 */
	void exitChildrenl(dartParser.ChildrenlContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(dartParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(dartParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#columnProperties}.
	 * @param ctx the parse tree
	 */
	void enterColumnProperties(dartParser.ColumnPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#columnProperties}.
	 * @param ctx the parse tree
	 */
	void exitColumnProperties(dartParser.ColumnPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mainaxiscolumn}
	 * labeled alternative in {@link dartParser#columnproperty}.
	 * @param ctx the parse tree
	 */
	void enterMainaxiscolumn(dartParser.MainaxiscolumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mainaxiscolumn}
	 * labeled alternative in {@link dartParser#columnproperty}.
	 * @param ctx the parse tree
	 */
	void exitMainaxiscolumn(dartParser.MainaxiscolumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code crossaxiscolumn}
	 * labeled alternative in {@link dartParser#columnproperty}.
	 * @param ctx the parse tree
	 */
	void enterCrossaxiscolumn(dartParser.CrossaxiscolumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code crossaxiscolumn}
	 * labeled alternative in {@link dartParser#columnproperty}.
	 * @param ctx the parse tree
	 */
	void exitCrossaxiscolumn(dartParser.CrossaxiscolumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code childrencolumnl}
	 * labeled alternative in {@link dartParser#childrenc}.
	 * @param ctx the parse tree
	 */
	void enterChildrencolumnl(dartParser.ChildrencolumnlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code childrencolumnl}
	 * labeled alternative in {@link dartParser#childrenc}.
	 * @param ctx the parse tree
	 */
	void exitChildrencolumnl(dartParser.ChildrencolumnlContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#listView}.
	 * @param ctx the parse tree
	 */
	void enterListView(dartParser.ListViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#listView}.
	 * @param ctx the parse tree
	 */
	void exitListView(dartParser.ListViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#listViewProperties}.
	 * @param ctx the parse tree
	 */
	void enterListViewProperties(dartParser.ListViewPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#listViewProperties}.
	 * @param ctx the parse tree
	 */
	void exitListViewProperties(dartParser.ListViewPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#scrollDirection}.
	 * @param ctx the parse tree
	 */
	void enterScrollDirection(dartParser.ScrollDirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#scrollDirection}.
	 * @param ctx the parse tree
	 */
	void exitScrollDirection(dartParser.ScrollDirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#listViewBuilder}.
	 * @param ctx the parse tree
	 */
	void enterListViewBuilder(dartParser.ListViewBuilderContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#listViewBuilder}.
	 * @param ctx the parse tree
	 */
	void exitListViewBuilder(dartParser.ListViewBuilderContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#itemCount}.
	 * @param ctx the parse tree
	 */
	void enterItemCount(dartParser.ItemCountContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#itemCount}.
	 * @param ctx the parse tree
	 */
	void exitItemCount(dartParser.ItemCountContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#itemBuilder}.
	 * @param ctx the parse tree
	 */
	void enterItemBuilder(dartParser.ItemBuilderContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#itemBuilder}.
	 * @param ctx the parse tree
	 */
	void exitItemBuilder(dartParser.ItemBuilderContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#scaffold}.
	 * @param ctx the parse tree
	 */
	void enterScaffold(dartParser.ScaffoldContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#scaffold}.
	 * @param ctx the parse tree
	 */
	void exitScaffold(dartParser.ScaffoldContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(dartParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(dartParser.BodyContext ctx);
}