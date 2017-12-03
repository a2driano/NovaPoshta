package ua.work.api.novaposhta.domain;

import java.util.List;

import io.reactivex.Single;
import ua.work.api.novaposhta.domain.model.AreaModel;
import ua.work.api.novaposhta.domain.model.CityModel;

/**
 * Created by Andrii Papai on 02.12.2017.
 */

public interface InteractorData {

    /**
     * Load Area`s
     */
    Single<List<AreaModel>> getAreas();

    /**
     * Load Cities
     */
    Single<List<CityModel>> getCities();
}
