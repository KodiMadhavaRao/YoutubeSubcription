
package response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Popup {

    @SerializedName("notificationActionRenderer")
    @Expose
    private NotificationActionRenderer notificationActionRenderer;

    public NotificationActionRenderer getNotificationActionRenderer() {
        return notificationActionRenderer;
    }

    public void setNotificationActionRenderer(NotificationActionRenderer notificationActionRenderer) {
        this.notificationActionRenderer = notificationActionRenderer;
    }

}
