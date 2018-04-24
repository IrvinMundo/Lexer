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
		T__0=1, ID=2, WS=3, IGUAL=4, DIFER=5, GUION=6, PUNTO=7, COMA=8, INTERROGA=9, 
		PARENTESISI=10, PARENTESISD=11, DOSPUNTOS=12, DOSPUNTOSGUION=13, ESQUEMAS=14, 
		HECHOS=15, REGLAS=16, CONSULTAS=17, MULT=18, SUMA=19, NEWLINE=20, INT=21, 
		TEXTO=22, COMENTARIO=23, ESC_TIPO_C=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "ID", "WS", "IGUAL", "DIFER", "GUION", "PUNTO", "COMA", "INTERROGA", 
		"PARENTESISI", "PARENTESISD", "DOSPUNTOS", "DOSPUNTOSGUION", "ESQUEMAS", 
		"HECHOS", "REGLAS", "CONSULTAS", "MULT", "SUMA", "NEWLINE", "INT", "TEXTO", 
		"COMENTARIO", "ESC_TIPO_C"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00a0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\7\3<\n\3\f\3\16\3?\13\3\3\4\6\4"+
		"B\n\4\r\4\16\4C\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3"+
		"\25\6\25\177\n\25\r\25\16\25\u0080\3\26\6\26\u0084\n\26\r\26\16\26\u0085"+
		"\3\27\3\27\3\27\7\27\u008b\n\27\f\27\16\27\u008e\13\27\3\27\3\27\3\30"+
		"\3\30\7\30\u0094\n\30\f\30\16\30\u0097\13\30\3\30\5\30\u009a\n\30\3\30"+
		"\3\30\3\31\3\31\3\31\2\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\3\2\t\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\3\2\62;"+
		"\4\2))^^\t\2))^^ddhhppttvv\2\u00a7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\59\3\2\2"+
		"\2\7A\3\2\2\2\tG\3\2\2\2\13I\3\2\2\2\rL\3\2\2\2\17N\3\2\2\2\21P\3\2\2"+
		"\2\23R\3\2\2\2\25T\3\2\2\2\27V\3\2\2\2\31X\3\2\2\2\33Z\3\2\2\2\35]\3\2"+
		"\2\2\37e\3\2\2\2!k\3\2\2\2#q\3\2\2\2%y\3\2\2\2\'{\3\2\2\2)~\3\2\2\2+\u0083"+
		"\3\2\2\2-\u0087\3\2\2\2/\u0091\3\2\2\2\61\u009d\3\2\2\2\63\64\7j\2\2\64"+
		"\65\7g\2\2\65\66\7n\2\2\66\67\7n\2\2\678\7q\2\28\4\3\2\2\29=\t\2\2\2:"+
		"<\t\3\2\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\6\3\2\2\2?=\3\2\2\2"+
		"@B\t\4\2\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\b\4\2\2"+
		"F\b\3\2\2\2GH\7?\2\2H\n\3\2\2\2IJ\7#\2\2JK\7?\2\2K\f\3\2\2\2LM\7\u0080"+
		"\2\2M\16\3\2\2\2NO\7\60\2\2O\20\3\2\2\2PQ\7.\2\2Q\22\3\2\2\2RS\7A\2\2"+
		"S\24\3\2\2\2TU\7*\2\2U\26\3\2\2\2VW\7+\2\2W\30\3\2\2\2XY\7<\2\2Y\32\3"+
		"\2\2\2Z[\7<\2\2[\\\7/\2\2\\\34\3\2\2\2]^\7U\2\2^_\7e\2\2_`\7j\2\2`a\7"+
		"g\2\2ab\7o\2\2bc\7g\2\2cd\7u\2\2d\36\3\2\2\2ef\7H\2\2fg\7c\2\2gh\7e\2"+
		"\2hi\7v\2\2ij\7u\2\2j \3\2\2\2kl\7T\2\2lm\7w\2\2mn\7n\2\2no\7g\2\2op\7"+
		"u\2\2p\"\3\2\2\2qr\7S\2\2rs\7w\2\2st\7g\2\2tu\7t\2\2uv\7k\2\2vw\7g\2\2"+
		"wx\7u\2\2x$\3\2\2\2yz\7,\2\2z&\3\2\2\2{|\7-\2\2|(\3\2\2\2}\177\t\5\2\2"+
		"~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"*\3\2\2\2\u0082\u0084\t\6\2\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2"+
		"\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086,\3\2\2\2\u0087\u008c\7"+
		")\2\2\u0088\u008b\5\61\31\2\u0089\u008b\n\7\2\2\u008a\u0088\3\2\2\2\u008a"+
		"\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\7)\2\2\u0090"+
		".\3\2\2\2\u0091\u0095\7%\2\2\u0092\u0094\n\5\2\2\u0093\u0092\3\2\2\2\u0094"+
		"\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0099\3\2"+
		"\2\2\u0097\u0095\3\2\2\2\u0098\u009a\7\17\2\2\u0099\u0098\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\7\f\2\2\u009c\60\3\2\2"+
		"\2\u009d\u009e\7^\2\2\u009e\u009f\t\b\2\2\u009f\62\3\2\2\2\13\2=C\u0080"+
		"\u0085\u008a\u008c\u0095\u0099\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}