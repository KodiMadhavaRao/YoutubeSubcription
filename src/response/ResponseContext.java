
package response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseContext {

    @SerializedName("serviceTrackingParams")
    @Expose
    private List<ServiceTrackingParam> serviceTrackingParams = null;

    public List<ServiceTrackingParam> getServiceTrackingParams() {
        return serviceTrackingParams;
    }

    public void setServiceTrackingParams(List<ServiceTrackingParam> serviceTrackingParams) {
        this.serviceTrackingParams = serviceTrackingParams;
    }

}
