// Generated from Datalog.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DatalogLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IGUAL=1, DIFER=2, GUION=3, GUIONMEDIO=4, PUNTO=5, COMA=6, INTERROGA=7, 
		PARENTESISI=8, PARENTESISD=9, DOSPUNTOS=10, DOSPUNTOSGUION=11, ESQUEMAS=12, 
		HECHOS=13, REGLAS=14, CONSULTAS=15, MULT=16, SUMA=17, NEWLINE=18, INT=19, 
		TEXTO=20, COMENTARIO=21, ESC_TIPO_C=22, ID=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"IGUAL", "DIFER", "GUION", "GUIONMEDIO", "PUNTO", "COMA", "INTERROGA", 
		"PARENTESISI", "PARENTESISD", "DOSPUNTOS", "DOSPUNTOSGUION", "ESQUEMAS", 
		"HECHOS", "REGLAS", "CONSULTAS", "MULT", "SUMA", "NEWLINE", "INT", "TEXTO", 
		"COMENTARIO", "ESC_TIPO_C", "ID", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'!='", "'~'", "'-'", "'.'", "','", "'?'", "'('", "')'", 
		"':'", "':-'", "'Schemes'", "'Facts'", "'Rules'", "'Queries'", "'*'", 
		"'+'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IGUAL", "DIFER", "GUION", "GUIONMEDIO", "PUNTO", "COMA", "INTERROGA", 
		"PARENTESISI", "PARENTESISD", "DOSPUNTOS", "DOSPUNTOSGUION", "ESQUEMAS", 
		"HECHOS", "REGLAS", "CONSULTAS", "MULT", "SUMA", "NEWLINE", "INT", "TEXTO", 
		"COMENTARIO", "ESC_TIPO_C", "ID", "WS"
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


	public DatalogLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Datalog.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u009c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\6\23m\n\23\r\23\16"+
		"\23n\3\24\6\24r\n\24\r\24\16\24s\3\25\3\25\3\25\7\25y\n\25\f\25\16\25"+
		"|\13\25\3\25\3\25\3\26\3\26\7\26\u0082\n\26\f\26\16\26\u0085\13\26\3\26"+
		"\5\26\u0088\n\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\7\30\u0091\n\30\f"+
		"\30\16\30\u0094\13\30\3\31\6\31\u0097\n\31\r\31\16\31\u0098\3\31\3\31"+
		"\2\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\3\2\t\4\2\f\f\17\17"+
		"\3\2\62;\4\2))^^\t\2))^^ddhhppttvv\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17\17"+
		"\"\"\2\u00a3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5\65\3\2\2\2\78\3\2\2\2\t:\3\2"+
		"\2\2\13<\3\2\2\2\r>\3\2\2\2\17@\3\2\2\2\21B\3\2\2\2\23D\3\2\2\2\25F\3"+
		"\2\2\2\27H\3\2\2\2\31K\3\2\2\2\33S\3\2\2\2\35Y\3\2\2\2\37_\3\2\2\2!g\3"+
		"\2\2\2#i\3\2\2\2%l\3\2\2\2\'q\3\2\2\2)u\3\2\2\2+\177\3\2\2\2-\u008b\3"+
		"\2\2\2/\u008e\3\2\2\2\61\u0096\3\2\2\2\63\64\7?\2\2\64\4\3\2\2\2\65\66"+
		"\7#\2\2\66\67\7?\2\2\67\6\3\2\2\289\7\u0080\2\29\b\3\2\2\2:;\7/\2\2;\n"+
		"\3\2\2\2<=\7\60\2\2=\f\3\2\2\2>?\7.\2\2?\16\3\2\2\2@A\7A\2\2A\20\3\2\2"+
		"\2BC\7*\2\2C\22\3\2\2\2DE\7+\2\2E\24\3\2\2\2FG\7<\2\2G\26\3\2\2\2HI\7"+
		"<\2\2IJ\7/\2\2J\30\3\2\2\2KL\7U\2\2LM\7e\2\2MN\7j\2\2NO\7g\2\2OP\7o\2"+
		"\2PQ\7g\2\2QR\7u\2\2R\32\3\2\2\2ST\7H\2\2TU\7c\2\2UV\7e\2\2VW\7v\2\2W"+
		"X\7u\2\2X\34\3\2\2\2YZ\7T\2\2Z[\7w\2\2[\\\7n\2\2\\]\7g\2\2]^\7u\2\2^\36"+
		"\3\2\2\2_`\7S\2\2`a\7w\2\2ab\7g\2\2bc\7t\2\2cd\7k\2\2de\7g\2\2ef\7u\2"+
		"\2f \3\2\2\2gh\7,\2\2h\"\3\2\2\2ij\7-\2\2j$\3\2\2\2km\t\2\2\2lk\3\2\2"+
		"\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2o&\3\2\2\2pr\t\3\2\2qp\3\2\2\2rs\3\2\2"+
		"\2sq\3\2\2\2st\3\2\2\2t(\3\2\2\2uz\7)\2\2vy\5-\27\2wy\n\4\2\2xv\3\2\2"+
		"\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7)\2"+
		"\2~*\3\2\2\2\177\u0083\7%\2\2\u0080\u0082\n\2\2\2\u0081\u0080\3\2\2\2"+
		"\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0087"+
		"\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0088\7\17\2\2\u0087\u0086\3\2\2\2"+
		"\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\7\f\2\2\u008a,\3"+
		"\2\2\2\u008b\u008c\7^\2\2\u008c\u008d\t\5\2\2\u008d.\3\2\2\2\u008e\u0092"+
		"\t\6\2\2\u008f\u0091\t\7\2\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\60\3\2\2\2\u0094\u0092\3\2\2"+
		"\2\u0095\u0097\t\b\2\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\b\31\2\2"+
		"\u009b\62\3\2\2\2\13\2nsxz\u0083\u0087\u0092\u0098\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}