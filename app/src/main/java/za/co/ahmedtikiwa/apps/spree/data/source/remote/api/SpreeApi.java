package za.co.ahmedtikiwa.apps.spree.data.source.remote.api;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;
import za.co.ahmedtikiwa.apps.spree.data.Product;

public class SpreeApi {

    public static final String BASE_URL = "https://www.spree.co.za/api/";
    private static SpreeApiInterface mSpreeService;

    public static SpreeApiInterface getSpreeApiClient() {
        if (mSpreeService == null) {

            // set the logging for the retrofit calls
            HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

            OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

            // add the logging interceptor to the call
            httpClient.addInterceptor(loggingInterceptor);

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(httpClient.build())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            mSpreeService = retrofit.create(SpreeApiInterface.class);
        }
        return mSpreeService;
    }

    public interface SpreeApiInterface {
        @GET("/v1/catalog/product/{sku}")
        Call<Product> getProduct(@Path("sku") String sku);
    }
}
