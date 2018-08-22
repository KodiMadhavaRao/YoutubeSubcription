
package response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NotificationActionRenderer {

    @SerializedName("responseText")
    @Expose
    private ResponseText responseText;
    @SerializedName("trackingParams")
    @Expose
    private String trackingParams;

    public ResponseText getResponseText() {
        return responseText;
    }

    public void setResponseText(ResponseText responseText) {
        this.responseText = responseText;
    }

    public String getTrackingParams() {
        return trackingParams;
    }

    public void setTrackingParams(String trackingParams) {
        this.trackingParams = trackingParams;
    }

}
