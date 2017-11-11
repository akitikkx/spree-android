package za.co.ahmedtikiwa.apps.spree.data.source.remote;

import android.support.annotation.NonNull;

import za.co.ahmedtikiwa.apps.spree.data.source.ProductsDataSource;

public class ProductsRemoteDataSource implements ProductsDataSource{

    private static ProductsRemoteDataSource INSTANCE;

    public static ProductsRemoteDataSource getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ProductsRemoteDataSource();
        }

        return INSTANCE;
    }

    @Override
    public void getProduct(@NonNull String sku, @NonNull GetProductCallback callback) {}
}
