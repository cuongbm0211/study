package makeMethodCallSimpler;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by CuongBM on 5/3/2017.
 */
public class IntroduceParameterObject {
    static class Account {
        private List<Entry> entries;

        public double getFlowBetween(LocalDate startDate, LocalDate endDate) {
            double result = 0;
            for (Entry entry : entries) {
                if (startDate.isBefore(entry.getChargeDate()) && endDate.isAfter(entry.getChargeDate())) {
                    result += entry.getValue();
                }
            }
            return result;
        }
    }

    static class Entry {
        private double value;
        private LocalDate chargeDate;

        public double getValue() {
            return value;
        }

        public void setValue(double value) {
            this.value = value;
        }

        public LocalDate getChargeDate() {
            return chargeDate;
        }

        public void setChargeDate(LocalDate chargeDate) {
            this.chargeDate = chargeDate;
        }
    }

}
