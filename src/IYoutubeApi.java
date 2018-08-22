import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface IYoutubeApi {
    @POST("service_ajax")
    Call<Void> setYoutubeSubscription(@Query("name")String name, @Body String body);
}
