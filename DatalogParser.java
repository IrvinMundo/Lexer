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
		IGUAL=1, DIFER=2, GUION=3, PUNTO=4, COMA=5, INTERROGA=6, PARENTESISI=7, 
		PARENTESISD=8, DOSPUNTOS=9, DOSPUNTOSGUION=10, ESQUEMAS=11, HECHOS=12, 
		REGLAS=13, CONSULTAS=14, MULT=15, SUMA=16, NEWLINE=17, INT=18, TEXTO=19, 
		COMENTARIO=20, ESC_TIPO_C=21, ID=22, WS=23;
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
		null, "'='", "'!='", "'~'", "'.'", "','", "'?'", "'('", "')'", "':'", 
		"':-'", "'Schemes'", "'Facts'", "'Rules'", "'Queries'", "'*'", "'+'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IGUAL", "DIFER", "GUION", "PUNTO", "COMA", "INTERROGA", "PARENTESISI", 
		"PARENTESISD", "DOSPUNTOS", "DOSPUNTOSGUION", "ESQUEMAS", "HECHOS", "REGLAS", 
		"CONSULTAS", "MULT", "SUMA", "NEWLINE", "INT", "TEXTO", "COMENTARIO", 
		"ESC_TIPO_C", "ID", "WS"
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ESQUEMAS) | (1L << HECHOS) | (1L << REGLAS) | (1L << CONSULTAS))) != 0)) {
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
		public TerminalNode DOSPUNTOS() { return getToken(DatalogParser.DOSPUNTOS, 0); }
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
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ESQUEMAS:
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
				}
				break;
			case HECHOS:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				match(HECHOS);
				setState(52);
				match(DOSPUNTOS);
				setState(53);
				listahechos();
				}
				break;
			case REGLAS:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				match(REGLAS);
				setState(55);
				match(DOSPUNTOS);
				setState(56);
				listareglas();
				}
				break;
			case CONSULTAS:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				match(CONSULTAS);
				setState(58);
				match(DOSPUNTOS);
				setState(59);
				consulta();
				setState(60);
				listaconsultas();
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
			setState(64);
			match(ID);
			setState(65);
			match(PARENTESISI);
			setState(66);
			match(ID);
			setState(67);
			listaid();
			setState(68);
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
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				esquema();
				setState(71);
				listaesquemas();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
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
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(COMA);
				setState(77);
				match(ID);
				setState(78);
				listaid();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
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
			setState(82);
			match(ID);
			setState(83);
			match(PARENTESISI);
			setState(84);
			match(TEXTO);
			setState(85);
			listastrings();
			setState(86);
			match(PARENTESISD);
			setState(87);
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
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				hecho();
				setState(90);
				listahechos();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
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
			setState(95);
			cabezapredicado();
			setState(96);
			match(DOSPUNTOSGUION);
			setState(97);
			predicado();
			setState(98);
			listapredicados();
			setState(99);
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
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				regla();
				setState(102);
				listareglas();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
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
			setState(107);
			match(ID);
			setState(108);
			match(PARENTESISI);
			setState(109);
			match(ID);
			setState(110);
			listaid();
			setState(111);
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
			setState(113);
			match(ID);
			setState(114);
			match(PARENTESISI);
			setState(115);
			parametro();
			setState(116);
			listaparametros();
			setState(117);
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
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(COMA);
				setState(120);
				predicado();
				setState(121);
				listapredicados();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
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
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(TEXTO);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				match(ID);
				}
				break;
			case PARENTESISI:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
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
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(COMA);
				setState(132);
				parametro();
				setState(133);
				listaparametros();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
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
			setState(138);
			match(PARENTESISI);
			setState(139);
			parametro();
			setState(140);
			operador();
			setState(141);
			parametro();
			setState(142);
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
			setState(144);
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
			setState(146);
			predicado();
			setState(147);
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
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				consulta();
				setState(150);
				listaconsultas();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
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
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(COMA);
				setState(156);
				match(TEXTO);
				setState(157);
				listastrings();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u00a4\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3A\n\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5M\n\5\3\6\3\6\3\6\3\6\5\6S\n\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b`\n\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\5\nl\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5\r\177\n\r\3\16\3\16\3\16\5\16\u0084"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u008b\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u009c\n\23\3\24"+
		"\3\24\3\24\3\24\5\24\u00a2\n\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&\2\3\3\2\21\22\2\u009e\2-\3\2\2\2\4@\3\2\2\2\6B\3\2\2"+
		"\2\bL\3\2\2\2\nR\3\2\2\2\fT\3\2\2\2\16_\3\2\2\2\20a\3\2\2\2\22k\3\2\2"+
		"\2\24m\3\2\2\2\26s\3\2\2\2\30~\3\2\2\2\32\u0083\3\2\2\2\34\u008a\3\2\2"+
		"\2\36\u008c\3\2\2\2 \u0092\3\2\2\2\"\u0094\3\2\2\2$\u009b\3\2\2\2&\u00a1"+
		"\3\2\2\2()\5\4\3\2)*\7\23\2\2*,\3\2\2\2+(\3\2\2\2,/\3\2\2\2-+\3\2\2\2"+
		"-.\3\2\2\2.\3\3\2\2\2/-\3\2\2\2\60\61\7\r\2\2\61\62\7\13\2\2\62\63\5\6"+
		"\4\2\63\64\5\b\5\2\64A\3\2\2\2\65\66\7\16\2\2\66\67\7\13\2\2\67A\5\16"+
		"\b\289\7\17\2\29:\7\13\2\2:A\5\22\n\2;<\7\20\2\2<=\7\13\2\2=>\5\"\22\2"+
		">?\5$\23\2?A\3\2\2\2@\60\3\2\2\2@\65\3\2\2\2@8\3\2\2\2@;\3\2\2\2A\5\3"+
		"\2\2\2BC\7\30\2\2CD\7\t\2\2DE\7\30\2\2EF\5\n\6\2FG\7\n\2\2G\7\3\2\2\2"+
		"HI\5\6\4\2IJ\5\b\5\2JM\3\2\2\2KM\7\23\2\2LH\3\2\2\2LK\3\2\2\2M\t\3\2\2"+
		"\2NO\7\7\2\2OP\7\30\2\2PS\5\n\6\2QS\7\23\2\2RN\3\2\2\2RQ\3\2\2\2S\13\3"+
		"\2\2\2TU\7\30\2\2UV\7\t\2\2VW\7\25\2\2WX\5&\24\2XY\7\n\2\2YZ\7\6\2\2Z"+
		"\r\3\2\2\2[\\\5\f\7\2\\]\5\16\b\2]`\3\2\2\2^`\7\23\2\2_[\3\2\2\2_^\3\2"+
		"\2\2`\17\3\2\2\2ab\5\24\13\2bc\7\f\2\2cd\5\26\f\2de\5\30\r\2ef\7\6\2\2"+
		"f\21\3\2\2\2gh\5\20\t\2hi\5\22\n\2il\3\2\2\2jl\7\23\2\2kg\3\2\2\2kj\3"+
		"\2\2\2l\23\3\2\2\2mn\7\30\2\2no\7\t\2\2op\7\30\2\2pq\5\n\6\2qr\7\n\2\2"+
		"r\25\3\2\2\2st\7\30\2\2tu\7\t\2\2uv\5\32\16\2vw\5\34\17\2wx\7\n\2\2x\27"+
		"\3\2\2\2yz\7\7\2\2z{\5\26\f\2{|\5\30\r\2|\177\3\2\2\2}\177\7\23\2\2~y"+
		"\3\2\2\2~}\3\2\2\2\177\31\3\2\2\2\u0080\u0084\7\25\2\2\u0081\u0084\7\30"+
		"\2\2\u0082\u0084\5\36\20\2\u0083\u0080\3\2\2\2\u0083\u0081\3\2\2\2\u0083"+
		"\u0082\3\2\2\2\u0084\33\3\2\2\2\u0085\u0086\7\7\2\2\u0086\u0087\5\32\16"+
		"\2\u0087\u0088\5\34\17\2\u0088\u008b\3\2\2\2\u0089\u008b\7\23\2\2\u008a"+
		"\u0085\3\2\2\2\u008a\u0089\3\2\2\2\u008b\35\3\2\2\2\u008c\u008d\7\t\2"+
		"\2\u008d\u008e\5\32\16\2\u008e\u008f\5 \21\2\u008f\u0090\5\32\16\2\u0090"+
		"\u0091\7\n\2\2\u0091\37\3\2\2\2\u0092\u0093\t\2\2\2\u0093!\3\2\2\2\u0094"+
		"\u0095\5\26\f\2\u0095\u0096\7\b\2\2\u0096#\3\2\2\2\u0097\u0098\5\"\22"+
		"\2\u0098\u0099\5$\23\2\u0099\u009c\3\2\2\2\u009a\u009c\7\23\2\2\u009b"+
		"\u0097\3\2\2\2\u009b\u009a\3\2\2\2\u009c%\3\2\2\2\u009d\u009e\7\7\2\2"+
		"\u009e\u009f\7\25\2\2\u009f\u00a2\5&\24\2\u00a0\u00a2\7\23\2\2\u00a1\u009d"+
		"\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\'\3\2\2\2\r-@LR_k~\u0083\u008a\u009b"+
		"\u00a1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}