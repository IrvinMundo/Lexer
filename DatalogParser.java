// Generated from Datalog.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DatalogParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, WS=2, IGUAL=3, DIFER=4, GUION=5, PUNTO=6, COMA=7, INTERROGA=8, PARENTESISI=9, 
		PARENTESISD=10, DOSPUNTOS=11, DOSPUNTOSGUION=12, ESQUEMAS=13, HECHOS=14, 
		REGLAS=15, CONSULTAS=16, MULT=17, SUMA=18, NEWLINE=19, INT=20, TEXTO=21, 
		COMENTARIO=22, ESC_TIPO_C=23;
	public static final int
		RULE_prog = 0, RULE_expr = 1, RULE_esquema = 2, RULE_listaesquemas = 3, 
		RULE_listaid = 4, RULE_hecho = 5, RULE_listahechos = 6, RULE_regla = 7, 
		RULE_listareglas = 8, RULE_cabezapredicado = 9, RULE_predicado = 10, RULE_listapredicados = 11, 
		RULE_parametro = 12, RULE_listaparametros = 13, RULE_expresion = 14, RULE_operador = 15, 
		RULE_consulta = 16, RULE_listaconsultas = 17, RULE_listastrings = 18;
	public static final String[] ruleNames = {
		"prog", "expr", "esquema", "listaesquemas", "listaid", "hecho", "listahechos", 
		"regla", "listareglas", "cabezapredicado", "predicado", "listapredicados", 
		"parametro", "listaparametros", "expresion", "operador", "consulta", "listaconsultas", 
		"listastrings"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'='", "'!='", "'~'", "'.'", "','", "'?'", "'('", "')'", 
		"':'", "':-'", "'Schemes'", "'Facts'", "'Rules'", "'Queries'", "'*'", 
		"'+'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ID", "WS", "IGUAL", "DIFER", "GUION", "PUNTO", "COMA", "INTERROGA", 
		"PARENTESISI", "PARENTESISD", "DOSPUNTOS", "DOSPUNTOSGUION", "ESQUEMAS", 
		"HECHOS", "REGLAS", "CONSULTAS", "MULT", "SUMA", "NEWLINE", "INT", "TEXTO", 
		"COMENTARIO", "ESC_TIPO_C"
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
	public String getGrammarFileName() { return "Datalog.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DatalogParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(DatalogParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(DatalogParser.NEWLINE, i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ESQUEMAS) {
				{
				{
				setState(38);
				expr();
				setState(39);
				match(NEWLINE);
				}
				}
				setState(45);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode ESQUEMAS() { return getToken(DatalogParser.ESQUEMAS, 0); }
		public List<TerminalNode> DOSPUNTOS() { return getTokens(DatalogParser.DOSPUNTOS); }
		public TerminalNode DOSPUNTOS(int i) {
			return getToken(DatalogParser.DOSPUNTOS, i);
		}
		public EsquemaContext esquema() {
			return getRuleContext(EsquemaContext.class,0);
		}
		public ListaesquemasContext listaesquemas() {
			return getRuleContext(ListaesquemasContext.class,0);
		}
		public TerminalNode HECHOS() { return getToken(DatalogParser.HECHOS, 0); }
		public ListahechosContext listahechos() {
			return getRuleContext(ListahechosContext.class,0);
		}
		public TerminalNode REGLAS() { return getToken(DatalogParser.REGLAS, 0); }
		public ListareglasContext listareglas() {
			return getRuleContext(ListareglasContext.class,0);
		}
		public TerminalNode CONSULTAS() { return getToken(DatalogParser.CONSULTAS, 0); }
		public ConsultaContext consulta() {
			return getRuleContext(ConsultaContext.class,0);
		}
		public ListaconsultasContext listaconsultas() {
			return getRuleContext(ListaconsultasContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(ESQUEMAS);
			setState(47);
			match(DOSPUNTOS);
			setState(48);
			esquema();
			setState(49);
			listaesquemas();
			setState(50);
			match(HECHOS);
			setState(51);
			match(DOSPUNTOS);
			setState(52);
			listahechos();
			setState(53);
			match(REGLAS);
			setState(54);
			match(DOSPUNTOS);
			setState(55);
			listareglas();
			setState(56);
			match(CONSULTAS);
			setState(57);
			match(DOSPUNTOS);
			setState(58);
			consulta();
			setState(59);
			listaconsultas();
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

	public static class EsquemaContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(DatalogParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DatalogParser.ID, i);
		}
		public TerminalNode PARENTESISI() { return getToken(DatalogParser.PARENTESISI, 0); }
		public ListaidContext listaid() {
			return getRuleContext(ListaidContext.class,0);
		}
		public TerminalNode PARENTESISD() { return getToken(DatalogParser.PARENTESISD, 0); }
		public EsquemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_esquema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterEsquema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitEsquema(this);
		}
	}

	public final EsquemaContext esquema() throws RecognitionException {
		EsquemaContext _localctx = new EsquemaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_esquema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(ID);
			setState(62);
			match(PARENTESISI);
			setState(63);
			match(ID);
			setState(64);
			listaid();
			setState(65);
			match(PARENTESISD);
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

	public static class ListaesquemasContext extends ParserRuleContext {
		public EsquemaContext esquema() {
			return getRuleContext(EsquemaContext.class,0);
		}
		public ListaesquemasContext listaesquemas() {
			return getRuleContext(ListaesquemasContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(DatalogParser.NEWLINE, 0); }
		public ListaesquemasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaesquemas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterListaesquemas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitListaesquemas(this);
		}
	}

	public final ListaesquemasContext listaesquemas() throws RecognitionException {
		ListaesquemasContext _localctx = new ListaesquemasContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_listaesquemas);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				esquema();
				setState(68);
				listaesquemas();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				match(NEWLINE);
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

	public static class ListaidContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(DatalogParser.COMA, 0); }
		public TerminalNode ID() { return getToken(DatalogParser.ID, 0); }
		public ListaidContext listaid() {
			return getRuleContext(ListaidContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(DatalogParser.NEWLINE, 0); }
		public ListaidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterListaid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitListaid(this);
		}
	}

	public final ListaidContext listaid() throws RecognitionException {
		ListaidContext _localctx = new ListaidContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_listaid);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(COMA);
				setState(74);
				match(ID);
				setState(75);
				listaid();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				match(NEWLINE);
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

	public static class HechoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DatalogParser.ID, 0); }
		public TerminalNode PARENTESISI() { return getToken(DatalogParser.PARENTESISI, 0); }
		public TerminalNode TEXTO() { return getToken(DatalogParser.TEXTO, 0); }
		public ListastringsContext listastrings() {
			return getRuleContext(ListastringsContext.class,0);
		}
		public TerminalNode PARENTESISD() { return getToken(DatalogParser.PARENTESISD, 0); }
		public TerminalNode PUNTO() { return getToken(DatalogParser.PUNTO, 0); }
		public HechoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hecho; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterHecho(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitHecho(this);
		}
	}

	public final HechoContext hecho() throws RecognitionException {
		HechoContext _localctx = new HechoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_hecho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(ID);
			setState(80);
			match(PARENTESISI);
			setState(81);
			match(TEXTO);
			setState(82);
			listastrings();
			setState(83);
			match(PARENTESISD);
			setState(84);
			match(PUNTO);
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

	public static class ListahechosContext extends ParserRuleContext {
		public HechoContext hecho() {
			return getRuleContext(HechoContext.class,0);
		}
		public ListahechosContext listahechos() {
			return getRuleContext(ListahechosContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(DatalogParser.NEWLINE, 0); }
		public ListahechosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listahechos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterListahechos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitListahechos(this);
		}
	}

	public final ListahechosContext listahechos() throws RecognitionException {
		ListahechosContext _localctx = new ListahechosContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_listahechos);
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				hecho();
				setState(87);
				listahechos();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(NEWLINE);
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

	public static class ReglaContext extends ParserRuleContext {
		public CabezapredicadoContext cabezapredicado() {
			return getRuleContext(CabezapredicadoContext.class,0);
		}
		public TerminalNode DOSPUNTOSGUION() { return getToken(DatalogParser.DOSPUNTOSGUION, 0); }
		public PredicadoContext predicado() {
			return getRuleContext(PredicadoContext.class,0);
		}
		public ListapredicadosContext listapredicados() {
			return getRuleContext(ListapredicadosContext.class,0);
		}
		public TerminalNode PUNTO() { return getToken(DatalogParser.PUNTO, 0); }
		public ReglaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterRegla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitRegla(this);
		}
	}

	public final ReglaContext regla() throws RecognitionException {
		ReglaContext _localctx = new ReglaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_regla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			cabezapredicado();
			setState(93);
			match(DOSPUNTOSGUION);
			setState(94);
			predicado();
			setState(95);
			listapredicados();
			setState(96);
			match(PUNTO);
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

	public static class ListareglasContext extends ParserRuleContext {
		public ReglaContext regla() {
			return getRuleContext(ReglaContext.class,0);
		}
		public ListareglasContext listareglas() {
			return getRuleContext(ListareglasContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(DatalogParser.NEWLINE, 0); }
		public ListareglasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listareglas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterListareglas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitListareglas(this);
		}
	}

	public final ListareglasContext listareglas() throws RecognitionException {
		ListareglasContext _localctx = new ListareglasContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_listareglas);
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				regla();
				setState(99);
				listareglas();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(NEWLINE);
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

	public static class CabezapredicadoContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(DatalogParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DatalogParser.ID, i);
		}
		public TerminalNode PARENTESISI() { return getToken(DatalogParser.PARENTESISI, 0); }
		public ListaidContext listaid() {
			return getRuleContext(ListaidContext.class,0);
		}
		public TerminalNode PARENTESISD() { return getToken(DatalogParser.PARENTESISD, 0); }
		public CabezapredicadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabezapredicado; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterCabezapredicado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitCabezapredicado(this);
		}
	}

	public final CabezapredicadoContext cabezapredicado() throws RecognitionException {
		CabezapredicadoContext _localctx = new CabezapredicadoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cabezapredicado);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(ID);
			setState(105);
			match(PARENTESISI);
			setState(106);
			match(ID);
			setState(107);
			listaid();
			setState(108);
			match(PARENTESISD);
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

	public static class PredicadoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DatalogParser.ID, 0); }
		public TerminalNode PARENTESISI() { return getToken(DatalogParser.PARENTESISI, 0); }
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public ListaparametrosContext listaparametros() {
			return getRuleContext(ListaparametrosContext.class,0);
		}
		public TerminalNode PARENTESISD() { return getToken(DatalogParser.PARENTESISD, 0); }
		public PredicadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicado; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterPredicado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitPredicado(this);
		}
	}

	public final PredicadoContext predicado() throws RecognitionException {
		PredicadoContext _localctx = new PredicadoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_predicado);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(ID);
			setState(111);
			match(PARENTESISI);
			setState(112);
			parametro();
			setState(113);
			listaparametros();
			setState(114);
			match(PARENTESISD);
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

	public static class ListapredicadosContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(DatalogParser.COMA, 0); }
		public PredicadoContext predicado() {
			return getRuleContext(PredicadoContext.class,0);
		}
		public ListapredicadosContext listapredicados() {
			return getRuleContext(ListapredicadosContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(DatalogParser.NEWLINE, 0); }
		public ListapredicadosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listapredicados; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterListapredicados(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitListapredicados(this);
		}
	}

	public final ListapredicadosContext listapredicados() throws RecognitionException {
		ListapredicadosContext _localctx = new ListapredicadosContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_listapredicados);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(COMA);
				setState(117);
				predicado();
				setState(118);
				listapredicados();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(NEWLINE);
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

	public static class ParametroContext extends ParserRuleContext {
		public TerminalNode TEXTO() { return getToken(DatalogParser.TEXTO, 0); }
		public TerminalNode ID() { return getToken(DatalogParser.ID, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitParametro(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parametro);
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(TEXTO);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(ID);
				}
				break;
			case PARENTESISI:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				expresion();
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

	public static class ListaparametrosContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(DatalogParser.COMA, 0); }
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public ListaparametrosContext listaparametros() {
			return getRuleContext(ListaparametrosContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(DatalogParser.NEWLINE, 0); }
		public ListaparametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaparametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterListaparametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitListaparametros(this);
		}
	}

	public final ListaparametrosContext listaparametros() throws RecognitionException {
		ListaparametrosContext _localctx = new ListaparametrosContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_listaparametros);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(COMA);
				setState(129);
				parametro();
				setState(130);
				listaparametros();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(NEWLINE);
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

	public static class ExpresionContext extends ParserRuleContext {
		public TerminalNode PARENTESISI() { return getToken(DatalogParser.PARENTESISI, 0); }
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public OperadorContext operador() {
			return getRuleContext(OperadorContext.class,0);
		}
		public TerminalNode PARENTESISD() { return getToken(DatalogParser.PARENTESISD, 0); }
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitExpresion(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(PARENTESISI);
			setState(136);
			parametro();
			setState(137);
			operador();
			setState(138);
			parametro();
			setState(139);
			match(PARENTESISD);
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

	public static class OperadorContext extends ParserRuleContext {
		public TerminalNode SUMA() { return getToken(DatalogParser.SUMA, 0); }
		public TerminalNode MULT() { return getToken(DatalogParser.MULT, 0); }
		public OperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterOperador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitOperador(this);
		}
	}

	public final OperadorContext operador() throws RecognitionException {
		OperadorContext _localctx = new OperadorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_la = _input.LA(1);
			if ( !(_la==MULT || _la==SUMA) ) {
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

	public static class ConsultaContext extends ParserRuleContext {
		public PredicadoContext predicado() {
			return getRuleContext(PredicadoContext.class,0);
		}
		public TerminalNode INTERROGA() { return getToken(DatalogParser.INTERROGA, 0); }
		public ConsultaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consulta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterConsulta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitConsulta(this);
		}
	}

	public final ConsultaContext consulta() throws RecognitionException {
		ConsultaContext _localctx = new ConsultaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_consulta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			predicado();
			setState(144);
			match(INTERROGA);
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

	public static class ListaconsultasContext extends ParserRuleContext {
		public ConsultaContext consulta() {
			return getRuleContext(ConsultaContext.class,0);
		}
		public ListaconsultasContext listaconsultas() {
			return getRuleContext(ListaconsultasContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(DatalogParser.NEWLINE, 0); }
		public ListaconsultasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaconsultas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterListaconsultas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitListaconsultas(this);
		}
	}

	public final ListaconsultasContext listaconsultas() throws RecognitionException {
		ListaconsultasContext _localctx = new ListaconsultasContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_listaconsultas);
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				consulta();
				setState(147);
				listaconsultas();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(NEWLINE);
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

	public static class ListastringsContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(DatalogParser.COMA, 0); }
		public TerminalNode TEXTO() { return getToken(DatalogParser.TEXTO, 0); }
		public ListastringsContext listastrings() {
			return getRuleContext(ListastringsContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(DatalogParser.NEWLINE, 0); }
		public ListastringsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listastrings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterListastrings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitListastrings(this);
		}
	}

	public final ListastringsContext listastrings() throws RecognitionException {
		ListastringsContext _localctx = new ListastringsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_listastrings);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(COMA);
				setState(153);
				match(TEXTO);
				setState(154);
				listastrings();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(NEWLINE);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u00a1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\5\5J\n\5\3\6\3\6\3\6\3\6\5\6P\n\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\5\b]\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\5\ni\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\5\r|\n\r\3\16\3\16\3\16\5\16\u0081\n\16\3\17\3\17\3"+
		"\17\3\17\3\17\5\17\u0088\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u0099\n\23\3\24\3\24\3\24\3\24"+
		"\5\24\u009f\n\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&\2\3\3\2\23\24\2\u0098\2-\3\2\2\2\4\60\3\2\2\2\6?\3\2\2\2\bI\3\2\2\2"+
		"\nO\3\2\2\2\fQ\3\2\2\2\16\\\3\2\2\2\20^\3\2\2\2\22h\3\2\2\2\24j\3\2\2"+
		"\2\26p\3\2\2\2\30{\3\2\2\2\32\u0080\3\2\2\2\34\u0087\3\2\2\2\36\u0089"+
		"\3\2\2\2 \u008f\3\2\2\2\"\u0091\3\2\2\2$\u0098\3\2\2\2&\u009e\3\2\2\2"+
		"()\5\4\3\2)*\7\25\2\2*,\3\2\2\2+(\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2"+
		"\2.\3\3\2\2\2/-\3\2\2\2\60\61\7\17\2\2\61\62\7\r\2\2\62\63\5\6\4\2\63"+
		"\64\5\b\5\2\64\65\7\20\2\2\65\66\7\r\2\2\66\67\5\16\b\2\678\7\21\2\28"+
		"9\7\r\2\29:\5\22\n\2:;\7\22\2\2;<\7\r\2\2<=\5\"\22\2=>\5$\23\2>\5\3\2"+
		"\2\2?@\7\3\2\2@A\7\13\2\2AB\7\3\2\2BC\5\n\6\2CD\7\f\2\2D\7\3\2\2\2EF\5"+
		"\6\4\2FG\5\b\5\2GJ\3\2\2\2HJ\7\25\2\2IE\3\2\2\2IH\3\2\2\2J\t\3\2\2\2K"+
		"L\7\t\2\2LM\7\3\2\2MP\5\n\6\2NP\7\25\2\2OK\3\2\2\2ON\3\2\2\2P\13\3\2\2"+
		"\2QR\7\3\2\2RS\7\13\2\2ST\7\27\2\2TU\5&\24\2UV\7\f\2\2VW\7\b\2\2W\r\3"+
		"\2\2\2XY\5\f\7\2YZ\5\16\b\2Z]\3\2\2\2[]\7\25\2\2\\X\3\2\2\2\\[\3\2\2\2"+
		"]\17\3\2\2\2^_\5\24\13\2_`\7\16\2\2`a\5\26\f\2ab\5\30\r\2bc\7\b\2\2c\21"+
		"\3\2\2\2de\5\20\t\2ef\5\22\n\2fi\3\2\2\2gi\7\25\2\2hd\3\2\2\2hg\3\2\2"+
		"\2i\23\3\2\2\2jk\7\3\2\2kl\7\13\2\2lm\7\3\2\2mn\5\n\6\2no\7\f\2\2o\25"+
		"\3\2\2\2pq\7\3\2\2qr\7\13\2\2rs\5\32\16\2st\5\34\17\2tu\7\f\2\2u\27\3"+
		"\2\2\2vw\7\t\2\2wx\5\26\f\2xy\5\30\r\2y|\3\2\2\2z|\7\25\2\2{v\3\2\2\2"+
		"{z\3\2\2\2|\31\3\2\2\2}\u0081\7\27\2\2~\u0081\7\3\2\2\177\u0081\5\36\20"+
		"\2\u0080}\3\2\2\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\33\3\2\2\2\u0082"+
		"\u0083\7\t\2\2\u0083\u0084\5\32\16\2\u0084\u0085\5\34\17\2\u0085\u0088"+
		"\3\2\2\2\u0086\u0088\7\25\2\2\u0087\u0082\3\2\2\2\u0087\u0086\3\2\2\2"+
		"\u0088\35\3\2\2\2\u0089\u008a\7\13\2\2\u008a\u008b\5\32\16\2\u008b\u008c"+
		"\5 \21\2\u008c\u008d\5\32\16\2\u008d\u008e\7\f\2\2\u008e\37\3\2\2\2\u008f"+
		"\u0090\t\2\2\2\u0090!\3\2\2\2\u0091\u0092\5\26\f\2\u0092\u0093\7\n\2\2"+
		"\u0093#\3\2\2\2\u0094\u0095\5\"\22\2\u0095\u0096\5$\23\2\u0096\u0099\3"+
		"\2\2\2\u0097\u0099\7\25\2\2\u0098\u0094\3\2\2\2\u0098\u0097\3\2\2\2\u0099"+
		"%\3\2\2\2\u009a\u009b\7\t\2\2\u009b\u009c\7\27\2\2\u009c\u009f\5&\24\2"+
		"\u009d\u009f\7\25\2\2\u009e\u009a\3\2\2\2\u009e\u009d\3\2\2\2\u009f\'"+
		"\3\2\2\2\f-IO\\h{\u0080\u0087\u0098\u009e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}