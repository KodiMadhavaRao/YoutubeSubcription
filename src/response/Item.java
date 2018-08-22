
package response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("guideEntryRenderer")
    @Expose
    private GuideEntryRenderer guideEntryRenderer;

    public GuideEntryRenderer getGuideEntryRenderer() {
        return guideEntryRenderer;
    }

    public void setGuideEntryRenderer(GuideEntryRenderer guideEntryRenderer) {
        this.guideEntryRenderer = guideEntryRenderer;
    }

}
