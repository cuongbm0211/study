import javax.jms.JMSException;
import javax.swing.text.BadLocationException;

/**
 * Created by CuongBM on 2/23/2017.
 */
public class Test {
    public static void main(String[] args) throws Exception {


        try {
            throw new BadLocationException("ddd", 3);
        }catch (BadLocationException e) {
            throw new Exception("catch");
        } finally {
            throw new Exception("final");
        }

//        throw new Exception();
    }
}
