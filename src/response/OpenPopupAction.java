
package response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OpenPopupAction {

    @SerializedName("popupType")
    @Expose
    private String popupType;
    @SerializedName("popup")
    @Expose
    private Popup popup;

    public String getPopupType() {
        return popupType;
    }

    public void setPopupType(String popupType) {
        this.popupType = popupType;
    }

    public Popup getPopup() {
        return popup;
    }

    public void setPopup(Popup popup) {
        this.popup = popup;
    }

}
