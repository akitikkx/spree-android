package za.co.ahmedtikiwa.apps.spree.productDetail;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.google.common.base.Strings;

import za.co.ahmedtikiwa.apps.spree.data.Product;
import za.co.ahmedtikiwa.apps.spree.data.source.ProductsDataSource;
import za.co.ahmedtikiwa.apps.spree.data.source.ProductsRepository;

import static com.google.common.base.Preconditions.checkNotNull;

public class ProductDetailPresenter implements ProductDetailContract.Presenter {

    private final ProductsRepository mProductsRepository;

    private final ProductDetailContract.View mView;

    @Nullable
    private String mSku;

    private static final String IMAGE_PREFIX = "https://www.spree.co.za/api/v1/catalog/product/thumbnail/";
    private static final String IMAGE_SIZE_DEFINITIONS = "/thumbnail/345x464";

    public ProductDetailPresenter(@Nullable String sku,
                                  @NonNull ProductsRepository productsRepository,
                                  @NonNull ProductDetailContract.View productDetailView) {

        mSku = sku;
        mProductsRepository = checkNotNull(productsRepository, "productsRepository cannot be null");
        mView = checkNotNull(productDetailView, "productDetailView cannot be null");

        mView.setPresenter(this);
    }



    @Override
    public void start() {
        openProduct();
    }

    private void openProduct() {
        mView.showLoadingProgress(true);
        mProductsRepository.getProduct(mSku, new ProductsDataSource.GetProductCallback() {
            @Override
            public void onProductLoaded(Product product) {
                mView.showLoadingProgress(false);
                mView.showEmptyState(false);
                showProduct(product);
            }

            @Override
            public void onDataNotAvailable() {
                mView.showLoadingProgress(false);
                mView.showEmptyState(true);
            }
        });
    }

    private void showProduct(@NonNull Product product) {
        String title = product.getTitle();
        int price = product.getPrice().getSelling();
        String image = IMAGE_PREFIX + mSku + IMAGE_SIZE_DEFINITIONS + product.getPics().getSmall();

        if (Strings.isNullOrEmpty(title)) {
            mView.hideTitle();
        } else {
            mView.showTitle(title);
        }

        if (Strings.isNullOrEmpty(String.valueOf(price))) {
            mView.hidePrice();
        } else {
            mView.showPrice(price);
        }

        if (Strings.isNullOrEmpty(image)) {
            mView.hideImage();
        } else {
            mView.showImage(image);
        }
    }
}
