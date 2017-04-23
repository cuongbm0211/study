package makeMethodCallSimpler;

import junit.framework.TestCase;
import makeMethodCallSimpler.PreserverWholeObject.HeatingPlan;
import makeMethodCallSimpler.PreserverWholeObject.Range;
import makeMethodCallSimpler.PreserverWholeObject.Room;
import org.junit.Test;

/**
 * Created by CuongBM on 4/23/2017.
 */
public class PreserverWholeObjectTest extends TestCase {

    @Test
    public void testWithinPlan_Is_WithinRange() {
        Room room = createRoomWithTempFrom25To27();
        HeatingPlan heatingPlan = createHeatingPlanWithTempFrom24To30();

        assertTrue(room.withinPlan(heatingPlan));
    }

    @Test
    public void testWithinPlan_Is_Not_WithinRange() {
        Room room = createRoomWithTempFrom20To30();
        HeatingPlan heatingPlan = createHeatingPlanWithTempFrom24To30();

        assertFalse(room.withinPlan(heatingPlan));
    }

    private HeatingPlan createHeatingPlanWithTempFrom24To30() {
        Range tempRangeInHeatingPlan = new Range();
        tempRangeInHeatingPlan.setLow(24);
        tempRangeInHeatingPlan.setHigh(30);

        HeatingPlan heatingPlan = new HeatingPlan();
        heatingPlan.setTempRange(tempRangeInHeatingPlan);
        return heatingPlan;
    }

    private Room createRoomWithTempFrom25To27() {
        Range tempRangeInRoom = new Range();
        tempRangeInRoom.setLow(25);
        tempRangeInRoom.setHigh(27);

        Room room = new Room();
        room.setTempRange(tempRangeInRoom);
        return room;
    }

    private Room createRoomWithTempFrom20To30() {
        Range tempRangeInRoom = new Range();
        tempRangeInRoom.setLow(20);
        tempRangeInRoom.setHigh(30);

        Room room = new Room();
        room.setTempRange(tempRangeInRoom);
        return room;
    }
}