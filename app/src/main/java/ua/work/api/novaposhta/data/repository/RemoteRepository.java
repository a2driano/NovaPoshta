package ua.work.api.novaposhta.data.repository;

import io.reactivex.Single;
import ua.work.api.novaposhta.data.model.response.DataAreaResponse;
import ua.work.api.novaposhta.data.model.response.DataCityResponse;

/**
 * Created by Andrii Papai on 03.12.2017.
 */

public interface RemoteRepository {
    /**
     * Load Area`s
     */
    Single<DataAreaResponse> loadAreas();

    /**
     * Load Cities
     */
    Single<DataCityResponse> loadCities();
}
