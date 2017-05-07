package SimplifyingConditionalExpressions;

import java.util.List;

/**
 * Created by CuongBM on 5/7/2017.
 */
public class RemoveControlFlag {

    public void checkSecurity(List<String> people) {
        boolean foundPerson = false;
        for (String person : people) {
            if (!foundPerson) {
                if (person.equalsIgnoreCase("Don")) {
                    sendMailAlert();
                    foundPerson = true;
                }
                if (person.equalsIgnoreCase("John")) {
                    sendMailAlert();
                    foundPerson = true;
                }
            }
        }
    }

    private void sendMailAlert() { }
}
