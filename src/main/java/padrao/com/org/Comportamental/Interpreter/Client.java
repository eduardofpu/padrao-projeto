package padrao.com.org.Comportamental.Interpreter;

public class Client {

    public static void main(String[] args) {

        //Deveria ter um parser para montar a árvore sintática

        // 10 + 20 * 30
        //     Abs Exp
        // <expr> + <term>
        //<term>     <term> * const
        //const      const    30
        //10         20


        //Sera executado  a seguinte expressão     10 + (20 * 30)

        Const c10 = new Const(10);
        Const c20 = new Const(20);
        Const c30 = new Const(30);

        Term t10 = new Term(c10);
        Term t20 = new Term(c20);

        //20 * 30
        Term tt20c30 = new Term(t20, c30);     //600
        Expression e10 = new Expression(t10);



        //10 + 600
        AbstractExpression e = new Expression(e10, tt20c30);  //610
        System.out.println(e.interpret());
    }
}
