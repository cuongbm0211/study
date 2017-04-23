package makeMethodCallSimpler;

/**
 * Created by CuongBM on 4/23/2017.
 */
public class PreserverWholeObject {
    static class Room {
        private Range tempRange;

        public boolean withinPlan(HeatingPlan plan) {
            return plan.isWithinRange(tempRange);
        }

        public void setTempRange(Range tempRange) {
            this.tempRange = tempRange;
        }
    }

    static class HeatingPlan {
        private Range tempRange;

        public boolean isWithinRange(Range givenRange) {
            return (givenRange.getLow() >= tempRange.getLow() && givenRange.getHigh() <= tempRange.getHigh());
        }

        public void setTempRange(Range tempRange) {
            this.tempRange = tempRange;
        }
    }

    static class Range {
        private int low;
        private int high;

        public int getLow() {
            return low;
        }

        public void setLow(int low) {
            this.low = low;
        }

        public int getHigh() {
            return high;
        }

        public void setHigh(int high) {
            this.high = high;
        }
    }

}
