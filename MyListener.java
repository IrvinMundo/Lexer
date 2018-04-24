import java.util.*;


public class MyListener extends DatalogBaseListener {
  @Override public void exitEsquema(DatalogParser.EsquemaContext ctx) {
    System.out.print("{Esquema => " + ctx.getText() + "}");
  }
  @Override public void exitHecho(DatalogParser.HechoContext ctx) {
    System.out.print("{Hecho => " + ctx.getText() + "}");
  }
  @Override public void exitRegla(DatalogParser.ReglaContext ctx) {
    System.out.print("{Regla => " + ctx.getText() + "}");
  }
  @Override public void exitPredicado(DatalogParser.PredicadoContext ctx) {
    System.out.print("{Pedicado => " + ctx.getText() + "}");
  }
  @Override public void exitParametro(DatalogParser.ParametroContext ctx) {
    System.out.print("{Parámetro => " + ctx.getText() + "}");
  }
  @Override public void exitConsulta(DatalogParser.ConsultaContext ctx) {
    System.out.print("{Consulta => " + ctx.getText() + "}");
  }
  @Override	public void exitProg(DatalogParser.ProgContext ctx) {
		System.out.println (ctx.getText());
	}
}
