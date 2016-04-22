/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: May 21, 2009
 * Time: 11:04:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class UseFunction {
    public String ApplyFunction(PassedFunction pf) {
        return "Answer is " + pf.function(2,3);
    }

    public static void main(String[] args) {
        UseFunction uf = new UseFunction();
        System.out.println("Applying passed function to get, " + uf.ApplyFunction(new PassedFunction()));
    }
}
