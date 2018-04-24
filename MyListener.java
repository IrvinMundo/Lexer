import java.util.*;


public class MyListener extends DatalogBaseListener {
  @Override public void exitEsquema(DatalogParser.EsquemaContext ctx) {
    System.out.println("{Esquema => " + ctx.getText() + "}");
  }
  @Override public void exitHecho(DatalogParser.HechoContext ctx) {
    System.out.println("{Hecho => " + ctx.getText() + "}");
  }
  @Override public void exitRegla(DatalogParser.ReglaContext ctx) {
    System.out.println("{Regla => " + ctx.getText() + "}");
  }
  @Override public void exitPredicado(DatalogParser.PredicadoContext ctx) {
    System.out.println("{Pedicado => " + ctx.getText() + "}");
  }
  @Override public void exitParametro(DatalogParser.ParametroContext ctx) {
    System.out.println("{Parámetro => " + ctx.getText() + "}");
  }
  @Override public void exitConsulta(DatalogParser.ConsultaContext ctx) {
    System.out.println("{Consulta => " + ctx.getText() + "}");
  }
  @Override	public void exitProg(DatalogParser.ProgContext ctx) {
		//System.out.println(ctx.getText());
	}
}
