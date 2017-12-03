package ua.work.api.novaposhta.data.repository.impl;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import io.reactivex.Single;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ua.work.api.novaposhta.BuildConfig;
import ua.work.api.novaposhta.data.model.request.AreaRequest;
import ua.work.api.novaposhta.data.model.request.CityRequest;
import ua.work.api.novaposhta.data.model.response.DataAreaResponse;
import ua.work.api.novaposhta.data.model.response.DataCityResponse;
import ua.work.api.novaposhta.data.remote.AddressApi;
import ua.work.api.novaposhta.data.repository.RemoteRepository;

import static ua.work.api.novaposhta.AppConstant.NovaPoshtaApi.URI_COMMON;

/**
 * Created by Andrii Papai on 03.12.2017.
 */

public class RemoteRepositoryImpl implements RemoteRepository {
    private static final boolean LOGGING = BuildConfig.DEBUG;
    private static RemoteRepositoryImpl sRemoteRepository;
    private static AddressApi mAddressApi;

    public static RemoteRepositoryImpl getInstance() {
        if (sRemoteRepository == null) {
            sRemoteRepository = new RemoteRepositoryImpl();
        }
        return sRemoteRepository;
    }

    public RemoteRepositoryImpl() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URI_COMMON)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(getHttpClient())
                .build();
        mAddressApi = retrofit.create(AddressApi.class);
    }

    private static OkHttpClient getHttpClient() {
        OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder();
        clientBuilder.followRedirects(false);
        clientBuilder.followSslRedirects(false);
        if (LOGGING) {
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            clientBuilder.addInterceptor(interceptor);
        }
        return clientBuilder.build();
    }

    @Override
    public Single<DataAreaResponse> loadAreas() {
        return mAddressApi.getAreas(new AreaRequest());
    }

    @Override
    public Single<DataCityResponse> loadCities() {
        return mAddressApi.getCities(new CityRequest());
    }
}
