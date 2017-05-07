package SimplifyingConditionalExpressions;

import java.util.List;

/**
 * Created by CuongBM on 5/7/2017.
 */
public class RemoveControlFlag {

    public void checkSecurity(List<String> people) {
        for (String person : people) {
            if (person.equalsIgnoreCase("Don")) {
                sendMailAlert();
                break;
            }
            if (person.equalsIgnoreCase("John")) {
                sendMailAlert();
                break;
            }
        }
    }

    private void sendMailAlert() {
    }
}
