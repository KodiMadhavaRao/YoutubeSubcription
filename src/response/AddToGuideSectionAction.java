
package response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AddToGuideSectionAction {

    @SerializedName("handlerData")
    @Expose
    private String handlerData;
    @SerializedName("items")
    @Expose
    private List<Item> items = null;

    public String getHandlerData() {
        return handlerData;
    }

    public void setHandlerData(String handlerData) {
        this.handlerData = handlerData;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

}
