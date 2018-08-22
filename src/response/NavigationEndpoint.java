
package response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NavigationEndpoint {

    @SerializedName("clickTrackingParams")
    @Expose
    private String clickTrackingParams;
    @SerializedName("commandMetadata")
    @Expose
    private CommandMetadata commandMetadata;
    @SerializedName("browseEndpoint")
    @Expose
    private BrowseEndpoint browseEndpoint;

    public String getClickTrackingParams() {
        return clickTrackingParams;
    }

    public void setClickTrackingParams(String clickTrackingParams) {
        this.clickTrackingParams = clickTrackingParams;
    }

    public CommandMetadata getCommandMetadata() {
        return commandMetadata;
    }

    public void setCommandMetadata(CommandMetadata commandMetadata) {
        this.commandMetadata = commandMetadata;
    }

    public BrowseEndpoint getBrowseEndpoint() {
        return browseEndpoint;
    }

    public void setBrowseEndpoint(BrowseEndpoint browseEndpoint) {
        this.browseEndpoint = browseEndpoint;
    }

}
