package apidez.com.android_mvvm_sample.dependency.module;

import com.google.gson.Gson;

import apidez.com.android_mvvm_sample.model.api.IPurchaseApi;
import apidez.com.android_mvvm_sample.model.api.PurchaseApi;
import apidez.com.android_mvvm_sample.dependency.scope.ViewScope;
import apidez.com.android_mvvm_sample.viewmodel.IPurchaseViewModel;
import apidez.com.android_mvvm_sample.viewmodel.PurchaseViewModel;
import dagger.Module;
import dagger.Provides;

/**
 * Created by nongdenchet on 10/2/15.
 */
@Module
public class PurchaseModule {
    @Provides
    @ViewScope
    public IPurchaseApi providePurchaseApi(Gson gson) {
        return new PurchaseApi(gson);
    }

    @Provides
    @ViewScope
    public IPurchaseViewModel providePurchaseViewModel(IPurchaseApi purchaseApi) {
        return new PurchaseViewModel(purchaseApi);
    }
}
