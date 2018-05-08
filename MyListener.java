import java.sql.Array;
import java.util.*;

public class MyListener extends DatalogBaseListener {

  ArrayList<String> parametros = new ArrayList<String>();
  ArrayList<String> tablas = new ArrayList<String>();

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
    System.out.println("el bueno: " + ctx.children.get(0).getText());
    tablas.add(ctx.children.get(0).getText());
  }
  @Override public void exitParametro(DatalogParser.ParametroContext ctx) {
    System.out.println("{Parámetro => " + ctx.getText() + "}");
    parametros.add(ctx.getText());
  }
  @Override public void exitConsulta(DatalogParser.ConsultaContext ctx) {
    System.out.println("{Consulta => " + ctx.getText() + "}");
  }
  @Override	public void exitProg(DatalogParser.ProgContext ctx) {
		//System.out.println(ctx.getText());
    crearSQL();
	}
  @Override public void exitSelect(DatalogParser.SelectContext ctx){
    System.out.println("{SELECT => " + ctx.getText() + "}");
  }

  public void crearSQL(){
    String sentencia = "";
    sentencia = "SELECT ";
    for(int i = 0; i < parametros.size(); i++){
      if(parametros.size() == 1){
        sentencia = sentencia + parametros.get(i) + " ";
      } else if(i == (parametros.size() -1)){
        sentencia = sentencia + parametros.get(i) + " ";
      }else{
        sentencia = sentencia + parametros.get(i)+ ",";
      }
    }
    sentencia = sentencia + "FROM " + tablas.get(0);
    System.out.println(sentencia);
  }
}
