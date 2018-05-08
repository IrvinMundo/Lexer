// Generated from Datalog.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DatalogParser}.
 */
public interface DatalogListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DatalogParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(DatalogParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(DatalogParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(DatalogParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(DatalogParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#esquema}.
	 * @param ctx the parse tree
	 */
	void enterEsquema(DatalogParser.EsquemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#esquema}.
	 * @param ctx the parse tree
	 */
	void exitEsquema(DatalogParser.EsquemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#listaesquemas}.
	 * @param ctx the parse tree
	 */
	void enterListaesquemas(DatalogParser.ListaesquemasContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#listaesquemas}.
	 * @param ctx the parse tree
	 */
	void exitListaesquemas(DatalogParser.ListaesquemasContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#listaid}.
	 * @param ctx the parse tree
	 */
	void enterListaid(DatalogParser.ListaidContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#listaid}.
	 * @param ctx the parse tree
	 */
	void exitListaid(DatalogParser.ListaidContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#hecho}.
	 * @param ctx the parse tree
	 */
	void enterHecho(DatalogParser.HechoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#hecho}.
	 * @param ctx the parse tree
	 */
	void exitHecho(DatalogParser.HechoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#listahechos}.
	 * @param ctx the parse tree
	 */
	void enterListahechos(DatalogParser.ListahechosContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#listahechos}.
	 * @param ctx the parse tree
	 */
	void exitListahechos(DatalogParser.ListahechosContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#regla}.
	 * @param ctx the parse tree
	 */
	void enterRegla(DatalogParser.ReglaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#regla}.
	 * @param ctx the parse tree
	 */
	void exitRegla(DatalogParser.ReglaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#listareglas}.
	 * @param ctx the parse tree
	 */
	void enterListareglas(DatalogParser.ListareglasContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#listareglas}.
	 * @param ctx the parse tree
	 */
	void exitListareglas(DatalogParser.ListareglasContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#cabezapredicado}.
	 * @param ctx the parse tree
	 */
	void enterCabezapredicado(DatalogParser.CabezapredicadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#cabezapredicado}.
	 * @param ctx the parse tree
	 */
	void exitCabezapredicado(DatalogParser.CabezapredicadoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#predicado}.
	 * @param ctx the parse tree
	 */
	void enterPredicado(DatalogParser.PredicadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#predicado}.
	 * @param ctx the parse tree
	 */
	void exitPredicado(DatalogParser.PredicadoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#listapredicados}.
	 * @param ctx the parse tree
	 */
	void enterListapredicados(DatalogParser.ListapredicadosContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#listapredicados}.
	 * @param ctx the parse tree
	 */
	void exitListapredicados(DatalogParser.ListapredicadosContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(DatalogParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(DatalogParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#listaparametros}.
	 * @param ctx the parse tree
	 */
	void enterListaparametros(DatalogParser.ListaparametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#listaparametros}.
	 * @param ctx the parse tree
	 */
	void exitListaparametros(DatalogParser.ListaparametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(DatalogParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(DatalogParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#operador}.
	 * @param ctx the parse tree
	 */
	void enterOperador(DatalogParser.OperadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#operador}.
	 * @param ctx the parse tree
	 */
	void exitOperador(DatalogParser.OperadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#consulta}.
	 * @param ctx the parse tree
	 */
	void enterConsulta(DatalogParser.ConsultaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#consulta}.
	 * @param ctx the parse tree
	 */
	void exitConsulta(DatalogParser.ConsultaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#listaconsultas}.
	 * @param ctx the parse tree
	 */
	void enterListaconsultas(DatalogParser.ListaconsultasContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#listaconsultas}.
	 * @param ctx the parse tree
	 */
	void exitListaconsultas(DatalogParser.ListaconsultasContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#listastrings}.
	 * @param ctx the parse tree
	 */
	void enterListastrings(DatalogParser.ListastringsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#listastrings}.
	 * @param ctx the parse tree
	 */
	void exitListastrings(DatalogParser.ListastringsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(DatalogParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(DatalogParser.SelectContext ctx);
}