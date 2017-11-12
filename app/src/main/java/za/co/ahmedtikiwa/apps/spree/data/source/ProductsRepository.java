package za.co.ahmedtikiwa.apps.spree.data.source;

import android.support.annotation.NonNull;
import android.util.Log;

import com.google.firebase.crash.FirebaseCrash;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import za.co.ahmedtikiwa.apps.spree.data.Product;
import za.co.ahmedtikiwa.apps.spree.data.source.remote.api.SpreeApi;

import static com.google.common.base.Preconditions.checkNotNull;

public class ProductsRepository implements ProductsDataSource {

    public static final String TAG = ProductsRepository.class.getSimpleName();

    private static ProductsRepository INSTANCE = null;

    private final ProductsDataSource mProductDataSource;

    private ProductsRepository(@NonNull ProductsDataSource productDataSource) {
        mProductDataSource = checkNotNull(productDataSource);
    }

    public static ProductsRepository getInstance(ProductsDataSource productsDataSource) {
        if (INSTANCE == null) {
            INSTANCE = new ProductsRepository(productsDataSource);
        }

        return INSTANCE;
    }

    @Override
    public void getProduct(@NonNull String sku, @NonNull final GetProductCallback callback) {
        checkNotNull(sku);
        checkNotNull(callback);

        // fetch the product information from the Spree API
        Call<Product> productCall = SpreeApi.getSpreeApiClient().loadProduct(sku);
        productCall.enqueue(new Callback<Product>() {
            @Override
            public void onResponse(Call<Product> call, Response<Product> response) {
                if (response.isSuccessful()) {
                    Product product = response.body();
                    callback.onProductLoaded(product);
                } else {
                    callback.onDataNotAvailable();
                    FirebaseCrash.log(response.message());
                    Log.d(TAG, response.message());
                }
            }

            @Override
            public void onFailure(Call<Product> call, Throwable t) {
                callback.onDataNotAvailable();
                FirebaseCrash.logcat(Log.ERROR, TAG, t.getMessage());
                FirebaseCrash.report(t);
                Log.d(TAG, t.getMessage());
            }
        });
    }
}
