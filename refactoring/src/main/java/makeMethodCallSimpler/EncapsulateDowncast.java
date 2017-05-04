package makeMethodCallSimpler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CuongBM on 5/4/2017.
 */
public class EncapsulateDowncast {
    // Here is example I see when work in Nextop company
    // In project return a List user, and client user this method should check, get, bla, bla

    public Object getUserById(Object userId) {
        List<Object> users = new ArrayList<>();

        // Should validate here
        if (users == null) throw new RuntimeException("Bad data!");
        if (users.isEmpty()) throw new RuntimeException("Bad data!");

        return users.get(0);
    }
}
