package za.co.ahmedtikiwa.apps.spree.productDetail;

import za.co.ahmedtikiwa.apps.spree.BasePresenter;
import za.co.ahmedtikiwa.apps.spree.BaseView;

public class ProductDetailContract {

    interface View extends BaseView<Presenter> {

        void showLoadingProgress(boolean show);

        void showTitle(String title);

        void hideTitle();

        void showImage(String path);

        void hideImage();

        void showPrice(int price);

        void hidePrice();

        void showEmptyState(boolean show);
    }

    interface Presenter extends BasePresenter {

    }
}
