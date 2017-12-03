package ua.work.api.novaposhta.data.model.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Andrii Papai on 02.12.2017.
 */

public class DataCityResponse {
    @SerializedName("success")
    private boolean success;
    @SerializedName("data")
    private List<CityResponse> mCityResponses;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<CityResponse> getCityResponses() {
        return mCityResponses;
    }

    public void setCityResponses(List<CityResponse> cityResponses) {
        mCityResponses = cityResponses;
    }
}
