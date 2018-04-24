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
		IGUAL=1, DIFER=2, GUION=3, PUNTO=4, COMA=5, INTERROGA=6, PARENTESISI=7, 
		PARENTESISD=8, DOSPUNTOS=9, DOSPUNTOSGUION=10, ESQUEMAS=11, HECHOS=12, 
		REGLAS=13, CONSULTAS=14, MULT=15, SUMA=16, NEWLINE=17, INT=18, TEXTO=19, 
		COMENTARIO=20, ESC_TIPO_C=21, ID=22, WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"IGUAL", "DIFER", "GUION", "PUNTO", "COMA", "INTERROGA", "PARENTESISI", 
		"PARENTESISD", "DOSPUNTOS", "DOSPUNTOSGUION", "ESQUEMAS", "HECHOS", "REGLAS", 
		"CONSULTAS", "MULT", "SUMA", "NEWLINE", "INT", "TEXTO", "COMENTARIO", 
		"ESC_TIPO_C", "ID", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u0098\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\6\22i\n\22\r\22\16\22j\3\23\6\23n\n\23"+
		"\r\23\16\23o\3\24\3\24\3\24\7\24u\n\24\f\24\16\24x\13\24\3\24\3\24\3\25"+
		"\3\25\7\25~\n\25\f\25\16\25\u0081\13\25\3\25\5\25\u0084\n\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\27\3\27\7\27\u008d\n\27\f\27\16\27\u0090\13\27\3\30"+
		"\6\30\u0093\n\30\r\30\16\30\u0094\3\30\3\30\2\2\31\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\3\2\t\4\2\f\f\17\17\3\2\62;\4\2))^^\t\2))^^ddhhpp"+
		"ttvv\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17\17\"\"\2\u009f\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5"+
		"\63\3\2\2\2\7\66\3\2\2\2\t8\3\2\2\2\13:\3\2\2\2\r<\3\2\2\2\17>\3\2\2\2"+
		"\21@\3\2\2\2\23B\3\2\2\2\25D\3\2\2\2\27G\3\2\2\2\31O\3\2\2\2\33U\3\2\2"+
		"\2\35[\3\2\2\2\37c\3\2\2\2!e\3\2\2\2#h\3\2\2\2%m\3\2\2\2\'q\3\2\2\2){"+
		"\3\2\2\2+\u0087\3\2\2\2-\u008a\3\2\2\2/\u0092\3\2\2\2\61\62\7?\2\2\62"+
		"\4\3\2\2\2\63\64\7#\2\2\64\65\7?\2\2\65\6\3\2\2\2\66\67\7\u0080\2\2\67"+
		"\b\3\2\2\289\7\60\2\29\n\3\2\2\2:;\7.\2\2;\f\3\2\2\2<=\7A\2\2=\16\3\2"+
		"\2\2>?\7*\2\2?\20\3\2\2\2@A\7+\2\2A\22\3\2\2\2BC\7<\2\2C\24\3\2\2\2DE"+
		"\7<\2\2EF\7/\2\2F\26\3\2\2\2GH\7U\2\2HI\7e\2\2IJ\7j\2\2JK\7g\2\2KL\7o"+
		"\2\2LM\7g\2\2MN\7u\2\2N\30\3\2\2\2OP\7H\2\2PQ\7c\2\2QR\7e\2\2RS\7v\2\2"+
		"ST\7u\2\2T\32\3\2\2\2UV\7T\2\2VW\7w\2\2WX\7n\2\2XY\7g\2\2YZ\7u\2\2Z\34"+
		"\3\2\2\2[\\\7S\2\2\\]\7w\2\2]^\7g\2\2^_\7t\2\2_`\7k\2\2`a\7g\2\2ab\7u"+
		"\2\2b\36\3\2\2\2cd\7,\2\2d \3\2\2\2ef\7-\2\2f\"\3\2\2\2gi\t\2\2\2hg\3"+
		"\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2k$\3\2\2\2ln\t\3\2\2ml\3\2\2\2no\3"+
		"\2\2\2om\3\2\2\2op\3\2\2\2p&\3\2\2\2qv\7)\2\2ru\5+\26\2su\n\4\2\2tr\3"+
		"\2\2\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2\2\2yz\7"+
		")\2\2z(\3\2\2\2{\177\7%\2\2|~\n\2\2\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3"+
		"\2\2\2\177\u0080\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0082\u0084"+
		"\7\17\2\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2"+
		"\u0085\u0086\7\f\2\2\u0086*\3\2\2\2\u0087\u0088\7^\2\2\u0088\u0089\t\5"+
		"\2\2\u0089,\3\2\2\2\u008a\u008e\t\6\2\2\u008b\u008d\t\7\2\2\u008c\u008b"+
		"\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		".\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0093\t\b\2\2\u0092\u0091\3\2\2\2"+
		"\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096"+
		"\3\2\2\2\u0096\u0097\b\30\2\2\u0097\60\3\2\2\2\13\2jotv\177\u0083\u008e"+
		"\u0094\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}