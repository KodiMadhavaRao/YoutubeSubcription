
package response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GuideEntryData {

    @SerializedName("guideEntryId")
    @Expose
    private String guideEntryId;

    public String getGuideEntryId() {
        return guideEntryId;
    }

    public void setGuideEntryId(String guideEntryId) {
        this.guideEntryId = guideEntryId;
    }

}
