# Spree

This is a basic Android app whose aim is to display a product from the catalogue.

### Application design pattern
MVP as recommended by the Google Android Architecture Blueprints

### Features and libraries
- Google Support Library
- Butterknife for view binding
- Retrofit 2 and OkHTTP 3 for the network communication layer
- Glide to display the product image
- Firebase Crash for crash reporting
- Firebase Analytics for tracking
- For simplicity as this is a basic app no persistence layer like Room was added as this layer
is useful in ensuring that the user's data consumption is reduced and also
giving them the ability to view the product information even when they don't have
an internet connection available.

### Screenshots
![device promo](https://github.com/akitikkx/spree-android/blob/master/screenshots/device-2017-11-11-203909.png "Spree demo on tablet (portrait)")
![device promo](https://github.com/akitikkx/spree-android/blob/master/screenshots/device-2017-11-11-203757.png "Spree demo on tablet (landscape)")
![device promo](https://github.com/akitikkx/spree-android/blob/master/screenshots/device-2017-11-11-214152.png "Spree demo on smartphone (portrait)")
![device promo](https://github.com/akitikkx/spree-android/blob/master/screenshots/device-2017-11-11-214247.png "Spree demo on smartphone (landscape)")