package za.co.ahmedtikiwa.apps.spree.data.source;

import android.support.annotation.NonNull;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import za.co.ahmedtikiwa.apps.spree.data.Product;
import za.co.ahmedtikiwa.apps.spree.data.source.remote.api.SpreeApi;

import static com.google.common.base.Preconditions.checkNotNull;

public class ProductsRepository implements ProductDataSource {

    public static final String TAG = ProductsRepository.class.getSimpleName();

    @Override
    public void getProduct(@NonNull String sku, @NonNull final GetProductCallback callback) {
        checkNotNull(sku);
        checkNotNull(callback);

        Call<Product> productCall = SpreeApi.getSpreeApiClient().getProduct(sku);
        productCall.enqueue(new Callback<Product>() {
            @Override
            public void onResponse(Call<Product> call, Response<Product> response) {
                if (response.isSuccessful()) {
                    Product product = response.body();
                    callback.onProductLoaded(product);
                } else {
                    callback.onDataNotAvailable();
                    Log.d(TAG, response.message());
                }
            }

            @Override
            public void onFailure(Call<Product> call, Throwable t) {
                callback.onDataNotAvailable();
                Log.d(TAG, t.getMessage());
            }
        });
    }
}
