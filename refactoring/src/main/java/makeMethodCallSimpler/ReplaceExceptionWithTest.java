package makeMethodCallSimpler;

import com.sun.deploy.security.WrapResource;
import sun.misc.Resource;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by CuongBM on 5/4/2017.
 */
public class ReplaceExceptionWithTest {
    private Map<String, Resource> cache;

    private static final String KEY = "RESOURCE_KEY";

    public Resource getResource() {
        Resource result = null;
        try {
            result = cache.get(KEY); // NullPointerException can throw from here
            return result;
        } catch (Exception e) {
            cache = new HashMap<>();
            result = new WrapResource(result);
            cache.put(KEY, result);
            return result;
        }
    }
}
