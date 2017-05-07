package SimplifyingConditionalExpressions;

import java.util.List;

/**
 * Created by CuongBM on 5/7/2017.
 */
public class RemoveControlFlag {

    // Example 1
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

    // Example 2
    public void checkSecurity2(List<String> people) {
        String foundPerson = "";

        for (String person : people) {
            if (foundPerson.equalsIgnoreCase("")) {
                if (person.equalsIgnoreCase("Don")) {
                    sendMailAlert();
                    foundPerson = person;
                }
                if (person.equalsIgnoreCase("John")) {
                    sendMailAlert();
                    foundPerson = person;
                }
            }
        }

        someLaterCode(foundPerson);
    }

    private void someLaterCode(String foundPerson) {
    }
}
