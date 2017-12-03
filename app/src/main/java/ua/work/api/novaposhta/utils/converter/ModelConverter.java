package ua.work.api.novaposhta.utils.converter;

import java.util.ArrayList;
import java.util.List;

import ua.work.api.novaposhta.data.model.response.AreaResponse;
import ua.work.api.novaposhta.data.model.response.CityResponse;
import ua.work.api.novaposhta.domain.model.AreaModel;
import ua.work.api.novaposhta.domain.model.CityModel;

/**
 * Created by Andrii Papai on 03.12.2017.
 */

public class ModelConverter {

    public static AreaModel convertToAreaModel(AreaResponse response) {
        AreaModel areaModel = new AreaModel();

        areaModel.setAreasCenter(response.getAreasCenter());
        areaModel.setDescription(response.getDescription());
        areaModel.setRef(response.getRef());

        return areaModel;
    }

    public static List<AreaModel> convertToListAreaModel(List<AreaResponse> responseList) {
        List<AreaModel> list = new ArrayList<>();

        for (AreaResponse response : responseList) {
            list.add(convertToAreaModel(response));
        }
        return list;
    }

    public static CityModel convertToCityModel(CityResponse response) {
        CityModel cityModel = new CityModel();

        cityModel.setArea(response.getArea());
        cityModel.setCityID(response.getCityID());
        cityModel.setDescription(response.getDescription());
        cityModel.setSettlementType(response.getSettlementType());
        cityModel.setSettlementTypeDescription(response.getSettlementTypeDescription());
        cityModel.setRef(response.getRef());

        return cityModel;
    }

    public static List<CityModel> convertToListCityModel(List<CityResponse> responseList) {
        List<CityModel> list = new ArrayList<>();

        for (CityResponse response : responseList) {
            list.add(convertToCityModel(response));
        }
        return list;
    }
}
