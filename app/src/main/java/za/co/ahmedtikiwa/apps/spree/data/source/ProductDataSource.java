package za.co.ahmedtikiwa.apps.spree.data.source;

import android.support.annotation.NonNull;

import za.co.ahmedtikiwa.apps.spree.data.Product;

public interface ProductDataSource {

    interface GetProductCallback {

        void onProductLoaded(Product product);

        void onDataNotAvailable();
    }

    void getProduct(@NonNull String sku, @NonNull GetProductCallback callback);
}
