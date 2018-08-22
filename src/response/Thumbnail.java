
package response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Thumbnail {

    @SerializedName("thumbnails")
    @Expose
    private List<Thumbnail_> thumbnails = null;
    @SerializedName("webThumbnailDetailsExtensionData")
    @Expose
    private WebThumbnailDetailsExtensionData webThumbnailDetailsExtensionData;

    public List<Thumbnail_> getThumbnails() {
        return thumbnails;
    }

    public void setThumbnails(List<Thumbnail_> thumbnails) {
        this.thumbnails = thumbnails;
    }

    public WebThumbnailDetailsExtensionData getWebThumbnailDetailsExtensionData() {
        return webThumbnailDetailsExtensionData;
    }

    public void setWebThumbnailDetailsExtensionData(WebThumbnailDetailsExtensionData webThumbnailDetailsExtensionData) {
        this.webThumbnailDetailsExtensionData = webThumbnailDetailsExtensionData;
    }

}
