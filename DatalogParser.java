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
		T__0=1, ID=2, WS=3, IGUAL=4, DIFER=5, GUION=6, PUNTO=7, COMA=8, INTERROGA=9, 
		PARENTESISI=10, PARENTESISD=11, DOSPUNTOS=12, DOSPUNTOSGUION=13, ESQUEMAS=14, 
		HECHOS=15, REGLAS=16, CONSULTAS=17, MULT=18, SUMA=19, NEWLINE=20, INT=21, 
		TEXTO=22, COMENTARIO=23, ESC_TIPO_C=24;
	public static final int
		RULE_r = 0, RULE_prog = 1, RULE_expr = 2, RULE_esquema = 3, RULE_listaesquemas = 4, 
		RULE_listaid = 5, RULE_hecho = 6, RULE_listahechos = 7, RULE_regla = 8, 
		RULE_listareglas = 9, RULE_cabezapredicado = 10, RULE_predicado = 11, 
		RULE_listapredicados = 12, RULE_parametro = 13, RULE_listaparametros = 14, 
		RULE_expresion = 15, RULE_operador = 16, RULE_consulta = 17, RULE_listaconsultas = 18, 
		RULE_listastrings = 19;
	public static final String[] ruleNames = {
		"r", "prog", "expr", "esquema", "listaesquemas", "listaid", "hecho", "listahechos", 
		"regla", "listareglas", "cabezapredicado", "predicado", "listapredicados", 
		"parametro", "listaparametros", "expresion", "operador", "consulta", "listaconsultas", 
		"listastrings"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'hello'", null, null, "'='", "'!='", "'~'", "'.'", "','", "'?'", 
		"'('", "')'", "':'", "':-'", "'Schemes'", "'Facts'", "'Rules'", "'Queries'", 
		"'*'", "'+'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "ID", "WS", "IGUAL", "DIFER", "GUION", "PUNTO", "COMA", "INTERROGA", 
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
	public static class RContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DatalogParser.ID, 0); }
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitR(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(T__0);
			setState(41);
			match(ID);
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
		enterRule(_localctx, 2, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ESQUEMAS) {
				{
				{
				setState(43);
				expr();
				setState(44);
				match(NEWLINE);
				}
				}
				setState(50);
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
		enterRule(_localctx, 4, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(ESQUEMAS);
			setState(52);
			match(DOSPUNTOS);
			setState(53);
			esquema();
			setState(54);
			listaesquemas();
			setState(55);
			match(HECHOS);
			setState(56);
			match(DOSPUNTOS);
			setState(57);
			listahechos();
			setState(58);
			match(REGLAS);
			setState(59);
			match(DOSPUNTOS);
			setState(60);
			listareglas();
			setState(61);
			match(CONSULTAS);
			setState(62);
			match(DOSPUNTOS);
			setState(63);
			consulta();
			setState(64);
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
		enterRule(_localctx, 6, RULE_esquema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(ID);
			setState(67);
			match(PARENTESISI);
			setState(68);
			match(ID);
			setState(69);
			listaid();
			setState(70);
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
		enterRule(_localctx, 8, RULE_listaesquemas);
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				esquema();
				setState(73);
				listaesquemas();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
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
		enterRule(_localctx, 10, RULE_listaid);
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(COMA);
				setState(79);
				match(ID);
				setState(80);
				listaid();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
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
		enterRule(_localctx, 12, RULE_hecho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(ID);
			setState(85);
			match(PARENTESISI);
			setState(86);
			match(TEXTO);
			setState(87);
			listastrings();
			setState(88);
			match(PARENTESISD);
			setState(89);
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
		enterRule(_localctx, 14, RULE_listahechos);
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				hecho();
				setState(92);
				listahechos();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
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
		enterRule(_localctx, 16, RULE_regla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			cabezapredicado();
			setState(98);
			match(DOSPUNTOSGUION);
			setState(99);
			predicado();
			setState(100);
			listapredicados();
			setState(101);
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
		enterRule(_localctx, 18, RULE_listareglas);
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				regla();
				setState(104);
				listareglas();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
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
		enterRule(_localctx, 20, RULE_cabezapredicado);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(ID);
			setState(110);
			match(PARENTESISI);
			setState(111);
			match(ID);
			setState(112);
			listaid();
			setState(113);
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
		enterRule(_localctx, 22, RULE_predicado);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(ID);
			setState(116);
			match(PARENTESISI);
			setState(117);
			parametro();
			setState(118);
			listaparametros();
			setState(119);
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
		enterRule(_localctx, 24, RULE_listapredicados);
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(COMA);
				setState(122);
				predicado();
				setState(123);
				listapredicados();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
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
		enterRule(_localctx, 26, RULE_parametro);
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(TEXTO);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(ID);
				}
				break;
			case PARENTESISI:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
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
		enterRule(_localctx, 28, RULE_listaparametros);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(COMA);
				setState(134);
				parametro();
				setState(135);
				listaparametros();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
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
		enterRule(_localctx, 30, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(PARENTESISI);
			setState(141);
			parametro();
			setState(142);
			operador();
			setState(143);
			parametro();
			setState(144);
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
		enterRule(_localctx, 32, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
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
		enterRule(_localctx, 34, RULE_consulta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			predicado();
			setState(149);
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
		enterRule(_localctx, 36, RULE_listaconsultas);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				consulta();
				setState(152);
				listaconsultas();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
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
		enterRule(_localctx, 38, RULE_listastrings);
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(COMA);
				setState(158);
				match(TEXTO);
				setState(159);
				listastrings();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u00a6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\3\3\3\3\3\7\3\61\n\3\f\3"+
		"\16\3\64\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6O\n\6\3\7\3\7\3\7\3\7"+
		"\5\7U\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\tb\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13n\n\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16\u0081\n\16\3"+
		"\17\3\17\3\17\5\17\u0086\n\17\3\20\3\20\3\20\3\20\3\20\5\20\u008d\n\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\5\24\u009e\n\24\3\25\3\25\3\25\3\25\5\25\u00a4\n\25\3\25\2\2\26"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\3\3\2\24\25\2\u009c\2"+
		"*\3\2\2\2\4\62\3\2\2\2\6\65\3\2\2\2\bD\3\2\2\2\nN\3\2\2\2\fT\3\2\2\2\16"+
		"V\3\2\2\2\20a\3\2\2\2\22c\3\2\2\2\24m\3\2\2\2\26o\3\2\2\2\30u\3\2\2\2"+
		"\32\u0080\3\2\2\2\34\u0085\3\2\2\2\36\u008c\3\2\2\2 \u008e\3\2\2\2\"\u0094"+
		"\3\2\2\2$\u0096\3\2\2\2&\u009d\3\2\2\2(\u00a3\3\2\2\2*+\7\3\2\2+,\7\4"+
		"\2\2,\3\3\2\2\2-.\5\6\4\2./\7\26\2\2/\61\3\2\2\2\60-\3\2\2\2\61\64\3\2"+
		"\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\5\3\2\2\2\64\62\3\2\2\2\65\66\7\20"+
		"\2\2\66\67\7\16\2\2\678\5\b\5\289\5\n\6\29:\7\21\2\2:;\7\16\2\2;<\5\20"+
		"\t\2<=\7\22\2\2=>\7\16\2\2>?\5\24\13\2?@\7\23\2\2@A\7\16\2\2AB\5$\23\2"+
		"BC\5&\24\2C\7\3\2\2\2DE\7\4\2\2EF\7\f\2\2FG\7\4\2\2GH\5\f\7\2HI\7\r\2"+
		"\2I\t\3\2\2\2JK\5\b\5\2KL\5\n\6\2LO\3\2\2\2MO\7\26\2\2NJ\3\2\2\2NM\3\2"+
		"\2\2O\13\3\2\2\2PQ\7\n\2\2QR\7\4\2\2RU\5\f\7\2SU\7\26\2\2TP\3\2\2\2TS"+
		"\3\2\2\2U\r\3\2\2\2VW\7\4\2\2WX\7\f\2\2XY\7\30\2\2YZ\5(\25\2Z[\7\r\2\2"+
		"[\\\7\t\2\2\\\17\3\2\2\2]^\5\16\b\2^_\5\20\t\2_b\3\2\2\2`b\7\26\2\2a]"+
		"\3\2\2\2a`\3\2\2\2b\21\3\2\2\2cd\5\26\f\2de\7\17\2\2ef\5\30\r\2fg\5\32"+
		"\16\2gh\7\t\2\2h\23\3\2\2\2ij\5\22\n\2jk\5\24\13\2kn\3\2\2\2ln\7\26\2"+
		"\2mi\3\2\2\2ml\3\2\2\2n\25\3\2\2\2op\7\4\2\2pq\7\f\2\2qr\7\4\2\2rs\5\f"+
		"\7\2st\7\r\2\2t\27\3\2\2\2uv\7\4\2\2vw\7\f\2\2wx\5\34\17\2xy\5\36\20\2"+
		"yz\7\r\2\2z\31\3\2\2\2{|\7\n\2\2|}\5\30\r\2}~\5\32\16\2~\u0081\3\2\2\2"+
		"\177\u0081\7\26\2\2\u0080{\3\2\2\2\u0080\177\3\2\2\2\u0081\33\3\2\2\2"+
		"\u0082\u0086\7\30\2\2\u0083\u0086\7\4\2\2\u0084\u0086\5 \21\2\u0085\u0082"+
		"\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\35\3\2\2\2\u0087"+
		"\u0088\7\n\2\2\u0088\u0089\5\34\17\2\u0089\u008a\5\36\20\2\u008a\u008d"+
		"\3\2\2\2\u008b\u008d\7\26\2\2\u008c\u0087\3\2\2\2\u008c\u008b\3\2\2\2"+
		"\u008d\37\3\2\2\2\u008e\u008f\7\f\2\2\u008f\u0090\5\34\17\2\u0090\u0091"+
		"\5\"\22\2\u0091\u0092\5\34\17\2\u0092\u0093\7\r\2\2\u0093!\3\2\2\2\u0094"+
		"\u0095\t\2\2\2\u0095#\3\2\2\2\u0096\u0097\5\30\r\2\u0097\u0098\7\13\2"+
		"\2\u0098%\3\2\2\2\u0099\u009a\5$\23\2\u009a\u009b\5&\24\2\u009b\u009e"+
		"\3\2\2\2\u009c\u009e\7\26\2\2\u009d\u0099\3\2\2\2\u009d\u009c\3\2\2\2"+
		"\u009e\'\3\2\2\2\u009f\u00a0\7\n\2\2\u00a0\u00a1\7\30\2\2\u00a1\u00a4"+
		"\5(\25\2\u00a2\u00a4\7\26\2\2\u00a3\u009f\3\2\2\2\u00a3\u00a2\3\2\2\2"+
		"\u00a4)\3\2\2\2\f\62NTam\u0080\u0085\u008c\u009d\u00a3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}