
package response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Action {

    @SerializedName("addToGuideSectionAction")
    @Expose
    private AddToGuideSectionAction addToGuideSectionAction;
    @SerializedName("openPopupAction")
    @Expose
    private OpenPopupAction openPopupAction;
    @SerializedName("updateSubscribeButtonAction")
    @Expose
    private UpdateSubscribeButtonAction updateSubscribeButtonAction;

    public AddToGuideSectionAction getAddToGuideSectionAction() {
        return addToGuideSectionAction;
    }

    public void setAddToGuideSectionAction(AddToGuideSectionAction addToGuideSectionAction) {
        this.addToGuideSectionAction = addToGuideSectionAction;
    }

    public OpenPopupAction getOpenPopupAction() {
        return openPopupAction;
    }

    public void setOpenPopupAction(OpenPopupAction openPopupAction) {
        this.openPopupAction = openPopupAction;
    }

    public UpdateSubscribeButtonAction getUpdateSubscribeButtonAction() {
        return updateSubscribeButtonAction;
    }

    public void setUpdateSubscribeButtonAction(UpdateSubscribeButtonAction updateSubscribeButtonAction) {
        this.updateSubscribeButtonAction = updateSubscribeButtonAction;
    }

}
