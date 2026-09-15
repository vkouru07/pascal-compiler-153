// Generated from SimpleA3.g4 by ANTLR 4.13.2
package intermediate.antlr4;

    import intermediate.symtab.SymtabEntry;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SimpleA3Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		PROGRAM=18, BEGIN=19, END=20, DIV=21, MOD=22, AND=23, OR=24, NOT=25, CASE=26, 
		OF=27, REPEAT=28, UNTIL=29, WRITE=30, WRITELN=31, FOR=32, TO=33, DOWNTO=34, 
		DO=35, IDENTIFIER=36, INTEGER=37, REAL=38, LETTER=39, DIGIT=40, DIGITS=41, 
		WHITESPACE=42, COMMENT=43, QUOTE=44, CHARACTER=45, STRING=46;
	public static final int
		RULE_program = 0, RULE_programHeader = 1, RULE_block = 2, RULE_declarations = 3, 
		RULE_identifier = 4, RULE_statement = 5, RULE_emptyStatement = 6, RULE_compoundStatement = 7, 
		RULE_statementList = 8, RULE_assignmentStatement = 9, RULE_caseStatement = 10, 
		RULE_caseBranch = 11, RULE_caseConstant = 12, RULE_repeatStatement = 13, 
		RULE_writeStatement = 14, RULE_writelnStatement = 15, RULE_writeArguments = 16, 
		RULE_writeArgument = 17, RULE_format = 18, RULE_width = 19, RULE_precision = 20, 
		RULE_forStatement = 21, RULE_sign = 22, RULE_expression = 23, RULE_simpleExpression = 24, 
		RULE_term = 25, RULE_factor = 26, RULE_relOp = 27, RULE_addOp = 28, RULE_mulOp = 29, 
		RULE_variable = 30, RULE_unsignedConstant = 31, RULE_integerConstant = 32, 
		RULE_realConstant = 33, RULE_characterConstant = 34, RULE_stringConstant = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "programHeader", "block", "declarations", "identifier", "statement", 
			"emptyStatement", "compoundStatement", "statementList", "assignmentStatement", 
			"caseStatement", "caseBranch", "caseConstant", "repeatStatement", "writeStatement", 
			"writelnStatement", "writeArguments", "writeArgument", "format", "width", 
			"precision", "forStatement", "sign", "expression", "simpleExpression", 
			"term", "factor", "relOp", "addOp", "mulOp", "variable", "unsignedConstant", 
			"integerConstant", "realConstant", "characterConstant", "stringConstant"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "';'", "':='", "','", "':'", "'('", "')'", "'-'", "'+'", 
			"'='", "'<>'", "'<'", "'<='", "'>'", "'>='", "'*'", "'/'", null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "PROGRAM", "BEGIN", "END", "DIV", 
			"MOD", "AND", "OR", "NOT", "CASE", "OF", "REPEAT", "UNTIL", "WRITE", 
			"WRITELN", "FOR", "TO", "DOWNTO", "DO", "IDENTIFIER", "INTEGER", "REAL", 
			"LETTER", "DIGIT", "DIGITS", "WHITESPACE", "COMMENT", "QUOTE", "CHARACTER", 
			"STRING"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "SimpleA3.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleA3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public ProgramHeaderContext programHeader() {
			return getRuleContext(ProgramHeaderContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleA3Visitor ) return ((SimpleA3Visitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			programHeader();
			setState(73);
			block();
			setState(74);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramHeaderContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(SimpleA3Parser.PROGRAM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ProgramHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).enterProgramHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).exitProgramHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleA3Visitor ) return ((SimpleA3Visitor<? extends T>)visitor).visitProgramHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramHeaderContext programHeader() throws RecognitionException {
		ProgramHeaderContext _localctx = new ProgramHeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(PROGRAM);
			setState(77);
			identifier();
			setState(78);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleA3Visitor ) return ((SimpleA3Visitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			declarations();
			setState(81);
			compoundStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationsContext extends ParserRuleContext {
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).exitDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleA3Visitor ) return ((SimpleA3Visitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declarations);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public SymtabEntry entry = null;
		public TerminalNode IDENTIFIER() { return getToken(SimpleA3Parser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleA3Visitor ) return ((SimpleA3Visitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public RepeatStatementContext repeatStatement() {
			return getRuleContext(RepeatStatementContext.class,0);
		}
		public CaseStatementContext caseStatement() {
			return getRuleContext(CaseStatementContext.class,0);
		}
		public WriteStatementContext writeStatement() {
			return getRuleContext(WriteStatementContext.class,0);
		}
		public WritelnStatementContext writelnStatement() {
			return getRuleContext(WritelnStatementContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleA3Visitor ) return ((SimpleA3Visitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				compoundStatement();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				assignmentStatement();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				repeatStatement();
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				caseStatement();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 5);
				{
				setState(91);
				writeStatement();
				}
				break;
			case WRITELN:
				enterOuterAlt(_localctx, 6);
				{
				setState(92);
				writelnStatement();
				}
				break;
			case T__1:
			case END:
			case UNTIL:
				enterOuterAlt(_localctx, 7);
				{
				setState(93);
				emptyStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 8);
				{
				setState(94);
				forStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EmptyStatementContext extends ParserRuleContext {
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).exitEmptyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleA3Visitor ) return ((SimpleA3Visitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	@SuppressWarnings("CheckReturnValue")
	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(SimpleA3Parser.BEGIN, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode END() { return getToken(SimpleA3Parser.END, 0); }
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).exitCompoundStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleA3Visitor ) return ((SimpleA3Visitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_compoundStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(BEGIN);
			setState(100);
			statementList();
			setState(101);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).exitStatementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleA3Visitor ) return ((SimpleA3Visitor<? extends T>)visitor).visitStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			statement();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(104);
				match(T__1);
				setState(105);
				statement();
				}
				}
				setState(110);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleA3Visitor ) return ((SimpleA3Visitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			variable();
			setState(112);
			match(T__2);
			setState(113);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CaseStatementContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(SimpleA3Parser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OF() { return getToken(SimpleA3Parser.OF, 0); }
		public List<CaseBranchContext> caseBranch() {
			return getRuleContexts(CaseBranchContext.class);
		}
		public CaseBranchContext caseBranch(int i) {
			return getRuleContext(CaseBranchContext.class,i);
		}
		public TerminalNode END() { return getToken(SimpleA3Parser.END, 0); }
		public CaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).enterCaseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).exitCaseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleA3Visitor ) return ((SimpleA3Visitor<? extends T>)visitor).visitCaseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseStatementContext caseStatement() throws RecognitionException {
		CaseStatementContext _localctx = new CaseStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_caseStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(CASE);
			setState(116);
			expression();
			setState(117);
			match(OF);
			setState(118);
			caseBranch();
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(119);
					match(T__1);
					setState(120);
					caseBranch();
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(126);
				match(T__1);
				}
			}

			setState(129);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CaseBranchContext extends ParserRuleContext {
		public List<CaseConstantContext> caseConstant() {
			return getRuleContexts(CaseConstantContext.class);
		}
		public CaseConstantContext caseConstant(int i) {
			return getRuleContext(CaseConstantContext.class,i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public CaseBranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBranch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).enterCaseBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).exitCaseBranch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleA3Visitor ) return ((SimpleA3Visitor<? extends T>)visitor).visitCaseBranch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseBranchContext caseBranch() throws RecognitionException {
		CaseBranchContext _localctx = new CaseBranchContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_caseBranch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			caseConstant();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(132);
				match(T__3);
				setState(133);
				caseConstant();
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
			match(T__4);
			setState(140);
			statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CaseConstantContext extends ParserRuleContext {
		public UnsignedConstantContext unsignedConstant() {
			return getRuleContext(UnsignedConstantContext.class,0);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public CharacterConstantContext characterConstant() {
			return getRuleContext(CharacterConstantContext.class,0);
		}
		public StringConstantContext stringConstant() {
			return getRuleContext(StringConstantContext.class,0);
		}
		public CaseConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).enterCaseConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).exitCaseConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleA3Visitor ) return ((SimpleA3Visitor<? extends T>)visitor).visitCaseConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseConstantContext caseConstant() throws RecognitionException {
		CaseConstantContext _localctx = new CaseConstantContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_caseConstant);
		int _la;
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
			case INTEGER:
			case REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7 || _la==T__8) {
					{
					setState(142);
					sign();
					}
				}

				setState(145);
				unsignedConstant();
				}
				break;
			case CHARACTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				characterConstant();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				stringConstant();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RepeatStatementContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(SimpleA3Parser.REPEAT, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(SimpleA3Parser.UNTIL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RepeatStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).enterRepeatStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).exitRepeatStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleA3Visitor ) return ((SimpleA3Visitor<? extends T>)visitor).visitRepeatStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatStatementContext repeatStatement() throws RecognitionException {
		RepeatStatementContext _localctx = new RepeatStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_repeatStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(REPEAT);
			setState(151);
			statementList();
			setState(152);
			match(UNTIL);
			setState(153);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WriteStatementContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(SimpleA3Parser.WRITE, 0); }
		public WriteArgumentsContext writeArguments() {
			return getRuleContext(WriteArgumentsContext.class,0);
		}
		public WriteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).enterWriteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).exitWriteStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleA3Visitor ) return ((SimpleA3Visitor<? extends T>)visitor).visitWriteStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteStatementContext writeStatement() throws RecognitionException {
		WriteStatementContext _localctx = new WriteStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_writeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(WRITE);
			setState(156);
			writeArguments();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WritelnStatementContext extends ParserRuleContext {
		public TerminalNode WRITELN() { return getToken(SimpleA3Parser.WRITELN, 0); }
		public WriteArgumentsContext writeArguments() {
			return getRuleContext(WriteArgumentsContext.class,0);
		}
		public WritelnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writelnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).enterWritelnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).exitWritelnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleA3Visitor ) return ((SimpleA3Visitor<? extends T>)visitor).visitWritelnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WritelnStatementContext writelnStatement() throws RecognitionException {
		WritelnStatementContext _localctx = new WritelnStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_writelnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(WRITELN);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(159);
				writeArguments();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class WriteArgumentsContext extends ParserRuleContext {
		public List<WriteArgumentContext> writeArgument() {
			return getRuleContexts(WriteArgumentContext.class);
		}
		public WriteArgumentContext writeArgument(int i) {
			return getRuleContext(WriteArgumentContext.class,i);
		}
		public WriteArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).enterWriteArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).exitWriteArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleA3Visitor ) return ((SimpleA3Visitor<? extends T>)visitor).visitWriteArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteArgumentsContext writeArguments() throws RecognitionException {
		WriteArgumentsContext _localctx = new WriteArgumentsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_writeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(T__5);
			setState(163);
			writeArgument();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(164);
				match(T__3);
				setState(165);
				writeArgument();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WriteArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FormatContext format() {
			return getRuleContext(FormatContext.class,0);
		}
		public WriteArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).enterWriteArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).exitWriteArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleA3Visitor ) return ((SimpleA3Visitor<? extends T>)visitor).visitWriteArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteArgumentContext writeArgument() throws RecognitionException {
		WriteArgumentContext _localctx = new WriteArgumentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_writeArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			expression();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(174);
				match(T__4);
				setState(175);
				format();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class FormatContext extends ParserRuleContext {
		public WidthContext width() {
			return getRuleContext(WidthContext.class,0);
		}
		public PrecisionContext precision() {
			return getRuleContext(PrecisionContext.class,0);
		}
		public FormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_format; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).enterFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).exitFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleA3Visitor ) return ((SimpleA3Visitor<? extends T>)visitor).visitFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormatContext format() throws RecognitionException {
		FormatContext _localctx = new FormatContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_format);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			width();
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(179);
				match(T__4);
				setState(180);
				precision();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class WidthContext extends ParserRuleContext {
		public IntegerConstantContext integerConstant() {
			return getRuleContext(IntegerConstantContext.class,0);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public WidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_width; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).enterWidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).exitWidth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleA3Visitor ) return ((SimpleA3Visitor<? extends T>)visitor).visitWidth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidthContext width() throws RecognitionException {
		WidthContext _localctx = new WidthContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_width);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7 || _la==T__8) {
				{
				setState(183);
				sign();
				}
			}

			setState(186);
			integerConstant();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrecisionContext extends ParserRuleContext {
		public IntegerConstantContext integerConstant() {
			return getRuleContext(IntegerConstantContext.class,0);
		}
		public PrecisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precision; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).enterPrecision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).exitPrecision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleA3Visitor ) return ((SimpleA3Visitor<? extends T>)visitor).visitPrecision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrecisionContext precision() throws RecognitionException {
		PrecisionContext _localctx = new PrecisionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_precision);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			integerConstant();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(SimpleA3Parser.FOR, 0); }
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(SimpleA3Parser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode TO() { return getToken(SimpleA3Parser.TO, 0); }
		public TerminalNode DOWNTO() { return getToken(SimpleA3Parser.DOWNTO, 0); }
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleA3Visitor ) return ((SimpleA3Visitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(FOR);
			setState(191);
			assignmentStatement();
			setState(192);
			_la = _input.LA(1);
			if ( !(_la==TO || _la==DOWNTO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(193);
			expression();
			setState(194);
			match(DO);
			setState(195);
			statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SignContext extends ParserRuleContext {
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).exitSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleA3Visitor ) return ((SimpleA3Visitor<? extends T>)visitor).visitSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__8) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public RelOpContext relOp() {
			return getRuleContext(RelOpContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleA3Visitor ) return ((SimpleA3Visitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			simpleExpression();
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 64512L) != 0)) {
				{
				setState(200);
				relOp();
				setState(201);
				simpleExpression();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public List<AddOpContext> addOp() {
			return getRuleContexts(AddOpContext.class);
		}
		public AddOpContext addOp(int i) {
			return getRuleContext(AddOpContext.class,i);
		}
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).enterSimpleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).exitSimpleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleA3Visitor ) return ((SimpleA3Visitor<? extends T>)visitor).visitSimpleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_simpleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7 || _la==T__8) {
				{
				setState(205);
				sign();
				}
			}

			setState(208);
			term();
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16777984L) != 0)) {
				{
				{
				setState(209);
				addOp();
				setState(210);
				term();
				}
				}
				setState(216);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<MulOpContext> mulOp() {
			return getRuleContexts(MulOpContext.class);
		}
		public MulOpContext mulOp(int i) {
			return getRuleContext(MulOpContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleA3Visitor ) return ((SimpleA3Visitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			factor();
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14876672L) != 0)) {
				{
				{
				setState(218);
				mulOp();
				setState(219);
				factor();
				}
				}
				setState(225);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FactorUnsignedConstantContext extends FactorContext {
		public UnsignedConstantContext unsignedConstant() {
			return getRuleContext(UnsignedConstantContext.class,0);
		}
		public FactorUnsignedConstantContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).enterFactorUnsignedConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).exitFactorUnsignedConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleA3Visitor ) return ((SimpleA3Visitor<? extends T>)visitor).visitFactorUnsignedConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FactorCharacterConstantContext extends FactorContext {
		public CharacterConstantContext characterConstant() {
			return getRuleContext(CharacterConstantContext.class,0);
		}
		public FactorCharacterConstantContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).enterFactorCharacterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).exitFactorCharacterConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleA3Visitor ) return ((SimpleA3Visitor<? extends T>)visitor).visitFactorCharacterConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FactorVariableContext extends FactorContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public FactorVariableContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).enterFactorVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).exitFactorVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleA3Visitor ) return ((SimpleA3Visitor<? extends T>)visitor).visitFactorVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FactorNotContext extends FactorContext {
		public TerminalNode NOT() { return getToken(SimpleA3Parser.NOT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FactorNotContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).enterFactorNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).exitFactorNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleA3Visitor ) return ((SimpleA3Visitor<? extends T>)visitor).visitFactorNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FactorParenthesizedContext extends FactorContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FactorParenthesizedContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).enterFactorParenthesized(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).exitFactorParenthesized(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleA3Visitor ) return ((SimpleA3Visitor<? extends T>)visitor).visitFactorParenthesized(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FactorStringConstantContext extends FactorContext {
		public StringConstantContext stringConstant() {
			return getRuleContext(StringConstantContext.class,0);
		}
		public FactorStringConstantContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).enterFactorStringConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).exitFactorStringConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleA3Visitor ) return ((SimpleA3Visitor<? extends T>)visitor).visitFactorStringConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_factor);
		try {
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new FactorVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				variable();
				}
				break;
			case INTEGER:
			case REAL:
				_localctx = new FactorUnsignedConstantContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				unsignedConstant();
				}
				break;
			case CHARACTER:
				_localctx = new FactorCharacterConstantContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				characterConstant();
				}
				break;
			case STRING:
				_localctx = new FactorStringConstantContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(229);
				stringConstant();
				}
				break;
			case NOT:
				_localctx = new FactorNotContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(230);
				match(NOT);
				setState(231);
				factor();
				}
				break;
			case T__5:
				_localctx = new FactorParenthesizedContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(232);
				match(T__5);
				setState(233);
				expression();
				setState(234);
				match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RelOpContext extends ParserRuleContext {
		public RelOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).enterRelOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).exitRelOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleA3Visitor ) return ((SimpleA3Visitor<? extends T>)visitor).visitRelOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelOpContext relOp() throws RecognitionException {
		RelOpContext _localctx = new RelOpContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_relOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 64512L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class AddOpContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(SimpleA3Parser.OR, 0); }
		public AddOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).enterAddOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).exitAddOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleA3Visitor ) return ((SimpleA3Visitor<? extends T>)visitor).visitAddOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddOpContext addOp() throws RecognitionException {
		AddOpContext _localctx = new AddOpContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_addOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16777984L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class MulOpContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(SimpleA3Parser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SimpleA3Parser.MOD, 0); }
		public TerminalNode AND() { return getToken(SimpleA3Parser.AND, 0); }
		public MulOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).enterMulOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).exitMulOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleA3Visitor ) return ((SimpleA3Visitor<? extends T>)visitor).visitMulOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulOpContext mulOp() throws RecognitionException {
		MulOpContext _localctx = new MulOpContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_mulOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14876672L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public SymtabEntry entry = null;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleA3Visitor ) return ((SimpleA3Visitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			identifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnsignedConstantContext extends ParserRuleContext {
		public Object value = null;
		public UnsignedConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedConstant; }
	 
		public UnsignedConstantContext() { }
		public void copyFrom(UnsignedConstantContext ctx) {
			super.copyFrom(ctx);
			this.value = ctx.value;
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnsignedRealConstantContext extends UnsignedConstantContext {
		public RealConstantContext realConstant() {
			return getRuleContext(RealConstantContext.class,0);
		}
		public UnsignedRealConstantContext(UnsignedConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).enterUnsignedRealConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).exitUnsignedRealConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleA3Visitor ) return ((SimpleA3Visitor<? extends T>)visitor).visitUnsignedRealConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnsignedIntegerConstantContext extends UnsignedConstantContext {
		public IntegerConstantContext integerConstant() {
			return getRuleContext(IntegerConstantContext.class,0);
		}
		public UnsignedIntegerConstantContext(UnsignedConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).enterUnsignedIntegerConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).exitUnsignedIntegerConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleA3Visitor ) return ((SimpleA3Visitor<? extends T>)visitor).visitUnsignedIntegerConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedConstantContext unsignedConstant() throws RecognitionException {
		UnsignedConstantContext _localctx = new UnsignedConstantContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_unsignedConstant);
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				_localctx = new UnsignedIntegerConstantContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				integerConstant();
				}
				break;
			case REAL:
				_localctx = new UnsignedRealConstantContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				realConstant();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IntegerConstantContext extends ParserRuleContext {
		public Object value = null;
		public TerminalNode INTEGER() { return getToken(SimpleA3Parser.INTEGER, 0); }
		public IntegerConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).enterIntegerConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).exitIntegerConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleA3Visitor ) return ((SimpleA3Visitor<? extends T>)visitor).visitIntegerConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerConstantContext integerConstant() throws RecognitionException {
		IntegerConstantContext _localctx = new IntegerConstantContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_integerConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(INTEGER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RealConstantContext extends ParserRuleContext {
		public Object value = null;
		public TerminalNode REAL() { return getToken(SimpleA3Parser.REAL, 0); }
		public RealConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).enterRealConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).exitRealConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleA3Visitor ) return ((SimpleA3Visitor<? extends T>)visitor).visitRealConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealConstantContext realConstant() throws RecognitionException {
		RealConstantContext _localctx = new RealConstantContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_realConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(REAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CharacterConstantContext extends ParserRuleContext {
		public Object value = null;
		public TerminalNode CHARACTER() { return getToken(SimpleA3Parser.CHARACTER, 0); }
		public CharacterConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).enterCharacterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).exitCharacterConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleA3Visitor ) return ((SimpleA3Visitor<? extends T>)visitor).visitCharacterConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterConstantContext characterConstant() throws RecognitionException {
		CharacterConstantContext _localctx = new CharacterConstantContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_characterConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(CHARACTER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StringConstantContext extends ParserRuleContext {
		public Object value = null;
		public TerminalNode STRING() { return getToken(SimpleA3Parser.STRING, 0); }
		public StringConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).enterStringConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleA3Listener ) ((SimpleA3Listener)listener).exitStringConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleA3Visitor ) return ((SimpleA3Visitor<? extends T>)visitor).visitStringConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringConstantContext stringConstant() throws RecognitionException {
		StringConstantContext _localctx = new StringConstantContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_stringConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(STRING);
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
		"\u0004\u0001.\u0103\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005`\b\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0005\bk\b\b\n\b\f\bn\t\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0005\nz\b\n\n\n\f\n}\t\n\u0001\n\u0003\n\u0080\b\n\u0001\n\u0001\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0087\b\u000b\n\u000b"+
		"\f\u000b\u008a\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0003"+
		"\f\u0090\b\f\u0001\f\u0001\f\u0001\f\u0003\f\u0095\b\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u00a1\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u00a7\b\u0010\n\u0010\f\u0010\u00aa\t\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00b1"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00b6\b\u0012"+
		"\u0001\u0013\u0003\u0013\u00b9\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u00cc\b\u0017\u0001\u0018\u0003\u0018"+
		"\u00cf\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018"+
		"\u00d5\b\u0018\n\u0018\f\u0018\u00d8\t\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0005\u0019\u00de\b\u0019\n\u0019\f\u0019\u00e1\t\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u00ed\b\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0003\u001f\u00f9\b\u001f"+
		"\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0000"+
		"\u0000$\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDF\u0000\u0005\u0001\u0000!\"\u0001"+
		"\u0000\b\t\u0001\u0000\n\u000f\u0002\u0000\b\t\u0018\u0018\u0002\u0000"+
		"\u0010\u0011\u0015\u0017\u00fb\u0000H\u0001\u0000\u0000\u0000\u0002L\u0001"+
		"\u0000\u0000\u0000\u0004P\u0001\u0000\u0000\u0000\u0006S\u0001\u0000\u0000"+
		"\u0000\bU\u0001\u0000\u0000\u0000\n_\u0001\u0000\u0000\u0000\fa\u0001"+
		"\u0000\u0000\u0000\u000ec\u0001\u0000\u0000\u0000\u0010g\u0001\u0000\u0000"+
		"\u0000\u0012o\u0001\u0000\u0000\u0000\u0014s\u0001\u0000\u0000\u0000\u0016"+
		"\u0083\u0001\u0000\u0000\u0000\u0018\u0094\u0001\u0000\u0000\u0000\u001a"+
		"\u0096\u0001\u0000\u0000\u0000\u001c\u009b\u0001\u0000\u0000\u0000\u001e"+
		"\u009e\u0001\u0000\u0000\u0000 \u00a2\u0001\u0000\u0000\u0000\"\u00ad"+
		"\u0001\u0000\u0000\u0000$\u00b2\u0001\u0000\u0000\u0000&\u00b8\u0001\u0000"+
		"\u0000\u0000(\u00bc\u0001\u0000\u0000\u0000*\u00be\u0001\u0000\u0000\u0000"+
		",\u00c5\u0001\u0000\u0000\u0000.\u00c7\u0001\u0000\u0000\u00000\u00ce"+
		"\u0001\u0000\u0000\u00002\u00d9\u0001\u0000\u0000\u00004\u00ec\u0001\u0000"+
		"\u0000\u00006\u00ee\u0001\u0000\u0000\u00008\u00f0\u0001\u0000\u0000\u0000"+
		":\u00f2\u0001\u0000\u0000\u0000<\u00f4\u0001\u0000\u0000\u0000>\u00f8"+
		"\u0001\u0000\u0000\u0000@\u00fa\u0001\u0000\u0000\u0000B\u00fc\u0001\u0000"+
		"\u0000\u0000D\u00fe\u0001\u0000\u0000\u0000F\u0100\u0001\u0000\u0000\u0000"+
		"HI\u0003\u0002\u0001\u0000IJ\u0003\u0004\u0002\u0000JK\u0005\u0001\u0000"+
		"\u0000K\u0001\u0001\u0000\u0000\u0000LM\u0005\u0012\u0000\u0000MN\u0003"+
		"\b\u0004\u0000NO\u0005\u0002\u0000\u0000O\u0003\u0001\u0000\u0000\u0000"+
		"PQ\u0003\u0006\u0003\u0000QR\u0003\u000e\u0007\u0000R\u0005\u0001\u0000"+
		"\u0000\u0000ST\u0001\u0000\u0000\u0000T\u0007\u0001\u0000\u0000\u0000"+
		"UV\u0005$\u0000\u0000V\t\u0001\u0000\u0000\u0000W`\u0003\u000e\u0007\u0000"+
		"X`\u0003\u0012\t\u0000Y`\u0003\u001a\r\u0000Z`\u0003\u0014\n\u0000[`\u0003"+
		"\u001c\u000e\u0000\\`\u0003\u001e\u000f\u0000]`\u0003\f\u0006\u0000^`"+
		"\u0003*\u0015\u0000_W\u0001\u0000\u0000\u0000_X\u0001\u0000\u0000\u0000"+
		"_Y\u0001\u0000\u0000\u0000_Z\u0001\u0000\u0000\u0000_[\u0001\u0000\u0000"+
		"\u0000_\\\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_^\u0001\u0000"+
		"\u0000\u0000`\u000b\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000"+
		"b\r\u0001\u0000\u0000\u0000cd\u0005\u0013\u0000\u0000de\u0003\u0010\b"+
		"\u0000ef\u0005\u0014\u0000\u0000f\u000f\u0001\u0000\u0000\u0000gl\u0003"+
		"\n\u0005\u0000hi\u0005\u0002\u0000\u0000ik\u0003\n\u0005\u0000jh\u0001"+
		"\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000"+
		"lm\u0001\u0000\u0000\u0000m\u0011\u0001\u0000\u0000\u0000nl\u0001\u0000"+
		"\u0000\u0000op\u0003<\u001e\u0000pq\u0005\u0003\u0000\u0000qr\u0003.\u0017"+
		"\u0000r\u0013\u0001\u0000\u0000\u0000st\u0005\u001a\u0000\u0000tu\u0003"+
		".\u0017\u0000uv\u0005\u001b\u0000\u0000v{\u0003\u0016\u000b\u0000wx\u0005"+
		"\u0002\u0000\u0000xz\u0003\u0016\u000b\u0000yw\u0001\u0000\u0000\u0000"+
		"z}\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000"+
		"\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000~\u0080"+
		"\u0005\u0002\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u007f\u0080\u0001"+
		"\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082\u0005"+
		"\u0014\u0000\u0000\u0082\u0015\u0001\u0000\u0000\u0000\u0083\u0088\u0003"+
		"\u0018\f\u0000\u0084\u0085\u0005\u0004\u0000\u0000\u0085\u0087\u0003\u0018"+
		"\f\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000"+
		"\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000"+
		"\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0005\u0005\u0000\u0000\u008c\u008d\u0003\n\u0005\u0000"+
		"\u008d\u0017\u0001\u0000\u0000\u0000\u008e\u0090\u0003,\u0016\u0000\u008f"+
		"\u008e\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090"+
		"\u0091\u0001\u0000\u0000\u0000\u0091\u0095\u0003>\u001f\u0000\u0092\u0095"+
		"\u0003D\"\u0000\u0093\u0095\u0003F#\u0000\u0094\u008f\u0001\u0000\u0000"+
		"\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0093\u0001\u0000\u0000"+
		"\u0000\u0095\u0019\u0001\u0000\u0000\u0000\u0096\u0097\u0005\u001c\u0000"+
		"\u0000\u0097\u0098\u0003\u0010\b\u0000\u0098\u0099\u0005\u001d\u0000\u0000"+
		"\u0099\u009a\u0003.\u0017\u0000\u009a\u001b\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0005\u001e\u0000\u0000\u009c\u009d\u0003 \u0010\u0000\u009d\u001d"+
		"\u0001\u0000\u0000\u0000\u009e\u00a0\u0005\u001f\u0000\u0000\u009f\u00a1"+
		"\u0003 \u0010\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a1\u001f\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005"+
		"\u0006\u0000\u0000\u00a3\u00a8\u0003\"\u0011\u0000\u00a4\u00a5\u0005\u0004"+
		"\u0000\u0000\u00a5\u00a7\u0003\"\u0011\u0000\u00a6\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00ab\u0001\u0000\u0000"+
		"\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005\u0007\u0000"+
		"\u0000\u00ac!\u0001\u0000\u0000\u0000\u00ad\u00b0\u0003.\u0017\u0000\u00ae"+
		"\u00af\u0005\u0005\u0000\u0000\u00af\u00b1\u0003$\u0012\u0000\u00b0\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1#\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b5\u0003&\u0013\u0000\u00b3\u00b4\u0005\u0005"+
		"\u0000\u0000\u00b4\u00b6\u0003(\u0014\u0000\u00b5\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6%\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b9\u0003,\u0016\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bb\u0003@ \u0000\u00bb\'\u0001\u0000\u0000\u0000\u00bc\u00bd\u0003"+
		"@ \u0000\u00bd)\u0001\u0000\u0000\u0000\u00be\u00bf\u0005 \u0000\u0000"+
		"\u00bf\u00c0\u0003\u0012\t\u0000\u00c0\u00c1\u0007\u0000\u0000\u0000\u00c1"+
		"\u00c2\u0003.\u0017\u0000\u00c2\u00c3\u0005#\u0000\u0000\u00c3\u00c4\u0003"+
		"\n\u0005\u0000\u00c4+\u0001\u0000\u0000\u0000\u00c5\u00c6\u0007\u0001"+
		"\u0000\u0000\u00c6-\u0001\u0000\u0000\u0000\u00c7\u00cb\u00030\u0018\u0000"+
		"\u00c8\u00c9\u00036\u001b\u0000\u00c9\u00ca\u00030\u0018\u0000\u00ca\u00cc"+
		"\u0001\u0000\u0000\u0000\u00cb\u00c8\u0001\u0000\u0000\u0000\u00cb\u00cc"+
		"\u0001\u0000\u0000\u0000\u00cc/\u0001\u0000\u0000\u0000\u00cd\u00cf\u0003"+
		",\u0016\u0000\u00ce\u00cd\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000"+
		"\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d6\u00032\u0019"+
		"\u0000\u00d1\u00d2\u00038\u001c\u0000\u00d2\u00d3\u00032\u0019\u0000\u00d3"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d4\u00d1\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d8\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d71\u0001\u0000\u0000\u0000\u00d8\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d9\u00df\u00034\u001a\u0000\u00da\u00db\u0003"+
		":\u001d\u0000\u00db\u00dc\u00034\u001a\u0000\u00dc\u00de\u0001\u0000\u0000"+
		"\u0000\u00dd\u00da\u0001\u0000\u0000\u0000\u00de\u00e1\u0001\u0000\u0000"+
		"\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e03\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000"+
		"\u00e2\u00ed\u0003<\u001e\u0000\u00e3\u00ed\u0003>\u001f\u0000\u00e4\u00ed"+
		"\u0003D\"\u0000\u00e5\u00ed\u0003F#\u0000\u00e6\u00e7\u0005\u0019\u0000"+
		"\u0000\u00e7\u00ed\u00034\u001a\u0000\u00e8\u00e9\u0005\u0006\u0000\u0000"+
		"\u00e9\u00ea\u0003.\u0017\u0000\u00ea\u00eb\u0005\u0007\u0000\u0000\u00eb"+
		"\u00ed\u0001\u0000\u0000\u0000\u00ec\u00e2\u0001\u0000\u0000\u0000\u00ec"+
		"\u00e3\u0001\u0000\u0000\u0000\u00ec\u00e4\u0001\u0000\u0000\u0000\u00ec"+
		"\u00e5\u0001\u0000\u0000\u0000\u00ec\u00e6\u0001\u0000\u0000\u0000\u00ec"+
		"\u00e8\u0001\u0000\u0000\u0000\u00ed5\u0001\u0000\u0000\u0000\u00ee\u00ef"+
		"\u0007\u0002\u0000\u0000\u00ef7\u0001\u0000\u0000\u0000\u00f0\u00f1\u0007"+
		"\u0003\u0000\u0000\u00f19\u0001\u0000\u0000\u0000\u00f2\u00f3\u0007\u0004"+
		"\u0000\u0000\u00f3;\u0001\u0000\u0000\u0000\u00f4\u00f5\u0003\b\u0004"+
		"\u0000\u00f5=\u0001\u0000\u0000\u0000\u00f6\u00f9\u0003@ \u0000\u00f7"+
		"\u00f9\u0003B!\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f8\u00f7\u0001"+
		"\u0000\u0000\u0000\u00f9?\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005%\u0000"+
		"\u0000\u00fbA\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005&\u0000\u0000\u00fd"+
		"C\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005-\u0000\u0000\u00ffE\u0001"+
		"\u0000\u0000\u0000\u0100\u0101\u0005.\u0000\u0000\u0101G\u0001\u0000\u0000"+
		"\u0000\u0012_l{\u007f\u0088\u008f\u0094\u00a0\u00a8\u00b0\u00b5\u00b8"+
		"\u00cb\u00ce\u00d6\u00df\u00ec\u00f8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}