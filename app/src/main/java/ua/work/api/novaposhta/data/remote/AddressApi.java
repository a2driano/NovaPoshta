package ua.work.api.novaposhta.data.remote;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.POST;
import ua.work.api.novaposhta.data.model.request.AreaRequest;
import ua.work.api.novaposhta.data.model.request.CityRequest;
import ua.work.api.novaposhta.data.model.response.DataAreaResponse;
import ua.work.api.novaposhta.data.model.response.DataCityResponse;

/**
 * Created by Andrii Papai on 03.12.2017.
 */

public interface AddressApi {

    @POST("json/")
    Single<DataAreaResponse> getAreas(@Body AreaRequest areaRequest);

    @POST("json/")
    Single<DataCityResponse> getCities(@Body CityRequest cityRequest);

}
