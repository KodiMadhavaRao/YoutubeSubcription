
package response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FormattedTitle {

    @SerializedName("simpleText")
    @Expose
    private String simpleText;

    public String getSimpleText() {
        return simpleText;
    }

    public void setSimpleText(String simpleText) {
        this.simpleText = simpleText;
    }

}
