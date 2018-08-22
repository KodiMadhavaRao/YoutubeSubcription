
package response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WebCommandMetadata {

    @SerializedName("webPageType")
    @Expose
    private String webPageType;
    @SerializedName("url")
    @Expose
    private String url;

    public String getWebPageType() {
        return webPageType;
    }

    public void setWebPageType(String webPageType) {
        this.webPageType = webPageType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
