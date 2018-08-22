
package response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GuideEntryRenderer {

    @SerializedName("formattedTitle")
    @Expose
    private FormattedTitle formattedTitle;
    @SerializedName("navigationEndpoint")
    @Expose
    private NavigationEndpoint navigationEndpoint;
    @SerializedName("thumbnail")
    @Expose
    private Thumbnail thumbnail;
    @SerializedName("trackingParams")
    @Expose
    private String trackingParams;
    @SerializedName("entryData")
    @Expose
    private EntryData entryData;

    public FormattedTitle getFormattedTitle() {
        return formattedTitle;
    }

    public void setFormattedTitle(FormattedTitle formattedTitle) {
        this.formattedTitle = formattedTitle;
    }

    public NavigationEndpoint getNavigationEndpoint() {
        return navigationEndpoint;
    }

    public void setNavigationEndpoint(NavigationEndpoint navigationEndpoint) {
        this.navigationEndpoint = navigationEndpoint;
    }

    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getTrackingParams() {
        return trackingParams;
    }

    public void setTrackingParams(String trackingParams) {
        this.trackingParams = trackingParams;
    }

    public EntryData getEntryData() {
        return entryData;
    }

    public void setEntryData(EntryData entryData) {
        this.entryData = entryData;
    }

}
