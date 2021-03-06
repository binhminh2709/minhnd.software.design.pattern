package gangofFour.behavioural.interpreter;

/**
 * Created by binhminh on 11/12/2016.
 */
public class InterpreterClient {

  public InterpreterContext ic;

  public InterpreterClient(InterpreterContext i) {
    this.ic = i;
  }

  public static void main(String args[]) {
    String str1 = "28 in Binary";
    String str2 = "28 in Hexadecimal";

    InterpreterClient ec = new InterpreterClient(new InterpreterContext());
    System.out.println(str1 + "= " + ec.interpret(str1));
    System.out.println(str2 + "= " + ec.interpret(str2));

  }

  public String interpret(String str) {
    IExpression exp = null;
    //create rules for expressions
    if (str.contains("Hexadecimal")) {
      exp = new IntToHexExpressionImpl(Integer.parseInt(str.substring(0, str.indexOf(" "))));
    } else if (str.contains("Binary")) {
      exp = new IntToBinaryExpressionImpl(Integer.parseInt(str.substring(0, str.indexOf(" "))));
    } else {
      return str;
    }

    return exp.interpret(ic);
  }


}
