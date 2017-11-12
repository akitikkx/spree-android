package za.co.ahmedtikiwa.apps.spree.productDetail;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.FrameLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import za.co.ahmedtikiwa.apps.spree.R;
import za.co.ahmedtikiwa.apps.spree.data.source.ProductsRepository;
import za.co.ahmedtikiwa.apps.spree.data.source.remote.ProductsRemoteDataSource;

public class ProductDetailActivity extends AppCompatActivity {

    private static final String TEST_PRODUCT_SKU = "C93665S";
    @BindView(R.id.container)
    FrameLayout container;
    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.productdetail_act);

        ButterKnife.bind(this);

        setSupportActionBar(toolbar);

        // todo hardcoded for demo purposes
        String sku = TEST_PRODUCT_SKU;

        ProductDetailFragment productDetailFragment = (ProductDetailFragment) getSupportFragmentManager()
                .findFragmentById(R.id.container);

        if (productDetailFragment == null) {
            productDetailFragment =ProductDetailFragment.newInstance(sku);

            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.container, productDetailFragment);
            transaction.commit();
        }

        // instantiate the presenter
        new ProductDetailPresenter(
                sku,
                ProductsRepository.getInstance(ProductsRemoteDataSource.getInstance()),
                productDetailFragment
        );
    }

}