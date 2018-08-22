
package response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WebThumbnailDetailsExtensionData {

    @SerializedName("excludeFromVpl")
    @Expose
    private Boolean excludeFromVpl;

    public Boolean getExcludeFromVpl() {
        return excludeFromVpl;
    }

    public void setExcludeFromVpl(Boolean excludeFromVpl) {
        this.excludeFromVpl = excludeFromVpl;
    }

}
