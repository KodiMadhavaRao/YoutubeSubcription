
package response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EntryData {

    @SerializedName("guideEntryData")
    @Expose
    private GuideEntryData guideEntryData;

    public GuideEntryData getGuideEntryData() {
        return guideEntryData;
    }

    public void setGuideEntryData(GuideEntryData guideEntryData) {
        this.guideEntryData = guideEntryData;
    }

}
