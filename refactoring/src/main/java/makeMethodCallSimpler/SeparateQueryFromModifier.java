package makeMethodCallSimpler;

import java.util.List;

/**
 * Created by CuongBM on 4/20/2017.
 */
public class SeparateQueryFromModifier {

    public void checkSecurity(List<String> peoples) {
        sendMiscreantNotification(peoples);
        String miscreant = findMiscreant(peoples);
        someLaterCode(miscreant);
    }

    private void someLaterCode(String miscreant) {
        // Do something with miscreant
        System.out.println("Add miscreant [" + miscreant + "] to DB for trace later");
    }

    private void sendMiscreantNotification(List<String> people) {
        if (findMiscreant(people) != null) {
            sendEmailAlert();
        }
    }

    private String findMiscreant(List<String> people) {
        for (String person : people) {
            if (person.equalsIgnoreCase("Don")) {
                return person;
            }

            if (person.equalsIgnoreCase("John")) {
                return person;
            }
        }

        return null;
    }

    private void sendEmailAlert() {
        System.out.println("Has miscreant person on system !!!");
    }
}
