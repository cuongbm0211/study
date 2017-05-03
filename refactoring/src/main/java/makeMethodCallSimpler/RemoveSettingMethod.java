package makeMethodCallSimpler;

/**
 * Created by CuongBM on 5/3/2017.
 */
public class RemoveSettingMethod {
    private String id;

    public RemoveSettingMethod(String id) {
        initializeId(id);
    }

    private void initializeId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
