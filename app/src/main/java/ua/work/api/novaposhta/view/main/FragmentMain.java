package ua.work.api.novaposhta.view.main;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import ua.work.api.novaposhta.R;
import ua.work.api.novaposhta.domain.model.AreaModel;
import ua.work.api.novaposhta.domain.model.CityModel;

public class FragmentMain extends Fragment implements ContractMain.IViewMain {
    private PresenterMain mPresenterMain;
    private Spinner areaSpinner;
    private Spinner citySpinner;

    public FragmentMain() {
    }

    public static FragmentMain newInstance() {
        FragmentMain fragment = new FragmentMain();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mPresenterMain = new PresenterMain(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        areaSpinner = rootView.findViewById(R.id.areas_spinner);
        citySpinner = rootView.findViewById(R.id.city_spinner);

        mPresenterMain.getAreas();
        mPresenterMain.getCities();
        return rootView;
    }

    @Override
    public void setAreas(List<AreaModel> list) {
        List<String> temp = new ArrayList<>();
        for (AreaModel model : list) {
            temp.add(model.getDescription());
        }
        String[] areas = temp.toArray(new String[0]);
        areaSpinner.setAdapter(new CustomSpinnerAdapter(getActivity(), android.R.layout.simple_spinner_item, areas));
    }

    @Override
    public void setCities(List<CityModel> list) {
        List<String> temp = new ArrayList<>();
        for (CityModel model : list) {
            temp.add(model.getDescription());
        }
        String[] areas = temp.toArray(new String[0]);
        citySpinner.setAdapter(new CustomSpinnerAdapter(getActivity(), android.R.layout.simple_spinner_item, areas));
    }

    @Override
    public void showError() {
        Toast.makeText(getActivity(), "Error", Toast.LENGTH_SHORT).show();
    }
}
