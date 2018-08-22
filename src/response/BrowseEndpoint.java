
package response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BrowseEndpoint {

    @SerializedName("browseId")
    @Expose
    private String browseId;
    @SerializedName("canonicalBaseUrl")
    @Expose
    private String canonicalBaseUrl;

    public String getBrowseId() {
        return browseId;
    }

    public void setBrowseId(String browseId) {
        this.browseId = browseId;
    }

    public String getCanonicalBaseUrl() {
        return canonicalBaseUrl;
    }

    public void setCanonicalBaseUrl(String canonicalBaseUrl) {
        this.canonicalBaseUrl = canonicalBaseUrl;
    }

}
