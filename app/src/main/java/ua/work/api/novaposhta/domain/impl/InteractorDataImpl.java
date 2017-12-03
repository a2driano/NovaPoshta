package ua.work.api.novaposhta.domain.impl;

import java.util.List;

import io.reactivex.Single;
import io.reactivex.functions.Function;
import ua.work.api.novaposhta.data.model.response.AreaResponse;
import ua.work.api.novaposhta.data.model.response.CityResponse;
import ua.work.api.novaposhta.data.model.response.DataAreaResponse;
import ua.work.api.novaposhta.data.model.response.DataCityResponse;
import ua.work.api.novaposhta.data.repository.RemoteRepository;
import ua.work.api.novaposhta.data.repository.impl.RemoteRepositoryImpl;
import ua.work.api.novaposhta.domain.InteractorData;
import ua.work.api.novaposhta.domain.model.AreaModel;
import ua.work.api.novaposhta.domain.model.CityModel;

import static ua.work.api.novaposhta.utils.converter.ModelConverter.convertToListAreaModel;
import static ua.work.api.novaposhta.utils.converter.ModelConverter.convertToListCityModel;

/**
 * Created by Andrii Papai on 03.12.2017.
 */

public class InteractorDataImpl implements InteractorData {
    private RemoteRepository mRemoteRepository;

    public InteractorDataImpl() {
        mRemoteRepository = RemoteRepositoryImpl.getInstance();
    }

    @Override
    public Single<List<AreaModel>> getAreas() {
        return mRemoteRepository.loadAreas()
                .map(new Function<DataAreaResponse, List<AreaModel>>() {
                    @Override
                    public List<AreaModel> apply(DataAreaResponse dataArea) throws Exception {
                        List<AreaResponse> responseList = dataArea.getAreaResponses();
                        if (responseList != null) {
                            return convertToListAreaModel(responseList);
                        }
                        return null;
                    }
                });
    }

    @Override
    public Single<List<CityModel>> getCities() {
        return mRemoteRepository.loadCities()
                .map(new Function<DataCityResponse, List<CityModel>>() {
                    @Override
                    public List<CityModel> apply(DataCityResponse dataCityResponse) throws Exception {
                        List<CityResponse> responseList = dataCityResponse.getCityResponses();
                        if (responseList != null) {
                            return convertToListCityModel(responseList);
                        }
                        return null;
                    }
                });
    }
}
