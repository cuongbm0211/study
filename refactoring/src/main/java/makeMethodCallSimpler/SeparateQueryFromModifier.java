package makeMethodCallSimpler;

import java.util.List;

/**
 * Created by CuongBM on 4/20/2017.
 */
public class SeparateQueryFromModifier {

    public void checkSecurity(List<String> peoples) {
        String miscreant = findMiscreant(peoples);
        someLaterCode(miscreant);
    }

    private void someLaterCode(String miscreant) {
        // Do something with miscreant
        System.out.println("Add miscreant [" + miscreant + "] to DB for trace later");
    }

    private String findMiscreant(List<String> people) {
        for (String person : people) {
            if (person.equalsIgnoreCase("Don")) {
                sendEmailAlert();
                return findPerson(people);
            }

            if (person.equalsIgnoreCase("John")) {
                sendEmailAlert();
                return findPerson(people);
            }

        }
        return findPerson(people);
    }

    private String findPerson(List<String> people) {
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

    private String findPerson(List<String> people) {
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
