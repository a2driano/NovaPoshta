package ua.work.api.novaposhta.view.main;

import java.util.List;

import ua.work.api.novaposhta.domain.model.AreaModel;
import ua.work.api.novaposhta.domain.model.CityModel;

/**
 * Created by Andrii Papai on 02.12.2017.
 */

public interface ContractMain {
    interface IViewMain {

        void setAreas(List<AreaModel> list);

        void setCities(List<CityModel> list);

        void showError();
    }

    interface IPresenerMain {

        void getAreas();

        void getCities();
    }
}
