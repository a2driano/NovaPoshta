package ua.work.api.novaposhta;

import android.app.Application;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ua.work.api.novaposhta.data.remote.AddressApi;

import static ua.work.api.novaposhta.AppConstant.NovaPoshtaApi.URI_COMMON;

/**
 * Created by Andrii Papai on 02.12.2017.
 */

public class App extends Application {
//    private static AddressApi mAddressApi;

    @Override
    public void onCreate() {
        super.onCreate();

//        init();
    }

    private void init() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URI_COMMON)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

//        mAddressApi = retrofit.create(AddressApi.class);
    }

//    public static AddressApi getAddressRetrofit() {
//        return mAddressApi;
//    }
}
