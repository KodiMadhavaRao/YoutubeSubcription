
package response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CommandMetadata {

    @SerializedName("webCommandMetadata")
    @Expose
    private WebCommandMetadata webCommandMetadata;

    public WebCommandMetadata getWebCommandMetadata() {
        return webCommandMetadata;
    }

    public void setWebCommandMetadata(WebCommandMetadata webCommandMetadata) {
        this.webCommandMetadata = webCommandMetadata;
    }

}
