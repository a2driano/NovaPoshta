package ua.work.api.novaposhta.view.main;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import ua.work.api.novaposhta.domain.InteractorData;
import ua.work.api.novaposhta.domain.impl.InteractorDataImpl;
import ua.work.api.novaposhta.domain.model.AreaModel;
import ua.work.api.novaposhta.domain.model.CityModel;

/**
 * Created by Andrii Papai on 02.12.2017.
 */

public class PresenterMain implements ContractMain.IPresenerMain {
    private InteractorData mInteractorData;
    private ContractMain.IViewMain view;

    public PresenterMain(ContractMain.IViewMain IView) {
        this.view = IView;
        mInteractorData = new InteractorDataImpl();
    }

    @Override
    public void getAreas() {
        mInteractorData.getAreas()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<List<AreaModel>>() {
                    @Override
                    public void accept(List<AreaModel> areaModels) throws Exception {
                        if (areaModels == null) {
                            view.showError();
                        }

                        view.setAreas(areaModels);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        view.showError();
                    }
                });
    }

    @Override
    public void getCities() {
        mInteractorData.getCities()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<List<CityModel>>() {
                    @Override
                    public void accept(List<CityModel> cityModels) throws Exception {
                        if (cityModels == null) {
                            view.showError();
                        }
                        view.setCities(cityModels);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        view.showError();
                    }
                });

    }
}
