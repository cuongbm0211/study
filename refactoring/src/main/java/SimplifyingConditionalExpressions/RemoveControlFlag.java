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
        String foundPerson = getMiscreant(people);
        someLaterCode(foundPerson);
    }

    public String getMiscreant(List<String> people) {
        for (String person : people) {
            if (person.equalsIgnoreCase("Don")) {
                sendMailAlert();
                return person;
            }
            if (person.equalsIgnoreCase("John")) {
                sendMailAlert();
                return person;
            }
        }
        return "";
    }

    private void someLaterCode(String foundPerson) {
    }
}
