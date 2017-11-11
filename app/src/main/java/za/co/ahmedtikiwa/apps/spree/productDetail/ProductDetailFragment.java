package za.co.ahmedtikiwa.apps.spree.productDetail;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

import butterknife.BindView;
import butterknife.ButterKnife;
import za.co.ahmedtikiwa.apps.spree.R;

import static com.google.common.base.Preconditions.checkNotNull;

public class ProductDetailFragment extends Fragment implements ProductDetailContract.View {

    private static final String ARGUMENT_PRODUCT_SKU = "SKU";

    private ProductDetailContract.Presenter mPresenter;

    @BindView(R.id.product_image)
    ImageView mProductImage;
    @BindView(R.id.product_title)
    TextView mProductTitle;
    @BindView(R.id.product_price)
    TextView mProductPrice;
    @BindView(R.id.progress_bar)
    ProgressBar progressBar;
    @BindView(R.id.main_content)
    CoordinatorLayout mainContent;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.productdetail_frag, container, false);

        ButterKnife.bind(this, rootView);

        return rootView;
    }

    public static ProductDetailFragment newInstance(@Nullable String sku) {
        Bundle args = new Bundle();
        args.putString(ARGUMENT_PRODUCT_SKU, sku);
        ProductDetailFragment productDetailFragment = new ProductDetailFragment();
        productDetailFragment.setArguments(args);
        return productDetailFragment;
    }

    @Override
    public void onResume() {
        super.onResume();
        mPresenter.start();
    }

    @Override
    public void setPresenter(ProductDetailContract.Presenter presenter) {
        mPresenter = checkNotNull(presenter);
    }

    @Override
    public void showLoadingProgress(boolean show) {
        if (show) {
            progressBar.setVisibility(ProgressBar.VISIBLE);
            Snackbar.make(mainContent, getString(R.string.loading_content), Snackbar.LENGTH_SHORT).show();
        } else {
            progressBar.setVisibility(ProgressBar.GONE);
        }
    }

    @Override
    public void showTitle(String title) {
        mProductTitle.setVisibility(View.VISIBLE);
        mProductTitle.setText(title);
        getActivity().setTitle(title);
    }

    @Override
    public void hideTitle() {
        mProductTitle.setVisibility(View.GONE);
    }

    @Override
    public void showImage(String path) {
        mProductImage.setVisibility(View.VISIBLE);
        Glide.with(getActivity())
                .load(path)
                .listener(new RequestListener<String, GlideDrawable>() {
                    @Override
                    public boolean onException(Exception e, String model, Target<GlideDrawable> target, boolean isFirstResource) {
                        return false;
                    }

                    @Override
                    public boolean onResourceReady(GlideDrawable resource, String model, Target<GlideDrawable> target, boolean isFromMemoryCache, boolean isFirstResource) {
                        return false;
                    }
                })
                .into(mProductImage);
    }

    @Override
    public void hideImage() {
        mProductImage.setVisibility(View.GONE);
    }

    @Override
    public void showPrice(int price) {
        mProductPrice.setVisibility(View.VISIBLE);
        mProductPrice.setText(String.format(getString(R.string.product_price), price));
    }

    @Override
    public void hidePrice() {
        mProductPrice.setVisibility(View.GONE);
    }
}