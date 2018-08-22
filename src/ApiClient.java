import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

//User-Agent: Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:61.0) Gecko/20100101 Firefox/61.0
//Accept: */*

public class ApiClient {

    public static final String BASE_URL = "https://www.youtube.com/";
    private static Retrofit retrofit = null;
 
 
    public static Retrofit getClient(String url) {

        if (retrofit==null) {
            OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

            httpClient.addInterceptor(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    Request request = chain.request().newBuilder()
                            .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:61.0) Gecko/20100101 Firefox/61.0")
                            .addHeader("Accept", "*/*")
                            /*Accept-Language: en-US,en;q=0.5
Accept-Encoding: gzip, deflate, br
Referer: https://www.youtube.com/channel/UC9zNlppYFHU9GAbGEYdnkzw
X-YouTube-Client-Name: 1
X-YouTube-Client-Version: 2.20180818
X-Youtube-Identity-Token: QUFFLUhqbEhaUVJYM0IxWkQ2dVJPZml3R3hRcHE1akpIZ3w=
X-YouTube-Page-CL: 209466949
X-YouTube-Page-Label: youtube.ytfe.desktop_20180817_5_RC1
X-YouTube-Variants-Checksum: 8f2e452b871d625646218a60fbc5e297
X-YouTube-Utc-Offset: -420
X-SPF-Referer: https://www.youtube.com/channel/UC9zNlppYFHU9GAbGEYdnkzw
X-SPF-Previous: https://www.youtube.com/channel/UC9zNlppYFHU9GAbGEYdnkzw
Content-Type: application/x-www-form-urlencoded
Content-Length: 666
Cookie: VISITOR_INFO1_LIVE=VObQ3yIwA8Q; PREF=f1=50000000&al=en&f5=30; CONSENT=YES+IN.en+20161218-19-0; GPS=1; YSC=VjtYPwbsTwM; SID=ZAZwucObri_dHYV_lUDVc2Fs_C135Yzf7YP92OYdEf9uoVI0OuMlykF6b0LsflIC80jlDQ.; HSID=Amd1vqPt75gs0eyXh; SSID=AzMrmwZ0aBoc8cNij; APISID=ZaqYs7OAnnsU-dTg/AFd5Svk5g5yXuToZn; SAPISID=TF05gIE4Q4zY_S_A/ApuoRWb7S37YmZwZy; LOGIN_INFO=AFmmF2swRAIgbLzwSXcCnUqWh_WaxX2RGDetKCeY-hVkNvxt_fxeR5cCIDK3SzTdGbptQnd5oqqrQsuReBOgW-orJdcQhX9sCTdn:QUQ3MjNmeVhELWxqdXU3R1gyV29qVjFNU3AzN20yU3Ayal9ocF8xZnRBZWtra2hxTGRNV2p5UmJ5TnloN28ycHR6akdrT3BkWWIyVThXY0RPUkMtOHJ2bG5KLVBGU3NSMU9CSTVwaFR1d2hqQmx1Mk9wZnB0b3ZvNnd4czh5QUtHemJVTkZRQUNPa0RoYnUzQ2g5ck01Zy1jcXhqZTJvTzA5MG5xeUUwT1cwemZPejZacXlkb0hj; ST-x3yacz=itct=CBwQmysiEwikq4vf8YDdAhX9xHMBHbN0BYMomxwyCWNoYW5uZWxzNA%3D%3D&csn=nHV9W6TtPP2Jz7sPs-mVmAg
Connection: keep-alive
Pragma: no-cache
Cache-Control: no-cache*/
                            .addHeader("Accept-Language", "en-US,en;q=0.5")
                            .addHeader("Accept-Encoding", "gzip, deflate, br")
                            .addHeader("Referer", url)
                            .addHeader("X-YouTube-Client-Name", "1")
                            .addHeader("X-YouTube-Client-Version", "2.20180818")
                            .addHeader("X-Youtube-Identity-Token", "QUFFLUhqbEhaUVJYM0IxWkQ2dVJPZml3R3hRcHE1akpIZ3w=")
                            .addHeader("X-YouTube-Page-CL", "209466949")
                            .addHeader("X-YouTube-Page-Label", "youtube.ytfe.desktop_20180817_5_RC1")
                            .addHeader("X-YouTube-Variants-Checksum", "8f2e452b871d625646218a60fbc5e297")
                            .addHeader("X-YouTube-Utc-Offset", "-420")
                            .addHeader("X-SPF-Referer", url)
                            .addHeader("X-SPF-Previous", url)
                            .addHeader("Content-Type", "application/x-www-form-urlencoded")
                            .addHeader("Content-Length", "666")
                            .addHeader("Cookie", "VISITOR_INFO1_LIVE=VObQ3yIwA8Q; PREF=f1=50000000&al=en&f5=30; CONSENT=YES+IN.en+20161218-19-0; GPS=1; YSC=VjtYPwbsTwM; SID=ZAZwucObri_dHYV_lUDVc2Fs_C135Yzf7YP92OYdEf9uoVI0OuMlykF6b0LsflIC80jlDQ.; HSID=Amd1vqPt75gs0eyXh; SSID=AzMrmwZ0aBoc8cNij; APISID=ZaqYs7OAnnsU-dTg/AFd5Svk5g5yXuToZn; SAPISID=TF05gIE4Q4zY_S_A/ApuoRWb7S37YmZwZy; LOGIN_INFO=AFmmF2swRAIgbLzwSXcCnUqWh_WaxX2RGDetKCeY-hVkNvxt_fxeR5cCIDK3SzTdGbptQnd5oqqrQsuReBOgW-orJdcQhX9sCTdn:QUQ3MjNmeVhELWxqdXU3R1gyV29qVjFNU3AzN20yU3Ayal9ocF8xZnRBZWtra2hxTGRNV2p5UmJ5TnloN28ycHR6akdrT3BkWWIyVThXY0RPUkMtOHJ2bG5KLVBGU3NSMU9CSTVwaFR1d2hqQmx1Mk9wZnB0b3ZvNnd4czh5QUtHemJVTkZRQUNPa0RoYnUzQ2g5ck01Zy1jcXhqZTJvTzA5MG5xeUUwT1cwemZPejZacXlkb0hj; ST-x3yacz=itct=CBwQmysiEwikq4vf8YDdAhX9xHMBHbN0BYMomxwyCWNoYW5uZWxzNA%3D%3D&csn=nHV9W6TtPP2Jz7sPs-mVmAg")
                            .addHeader("Connection", "keep-alive")
                            .addHeader("Pragma", "no-cache")
                            .addHeader("Cache-Control", "no-cache")
                            .build();
                    return chain.proceed(request);
                }
            });
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(httpClient.build())
                    .build();
        }
        return retrofit;
    }
}