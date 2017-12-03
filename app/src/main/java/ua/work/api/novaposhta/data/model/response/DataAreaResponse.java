package ua.work.api.novaposhta.data.model.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Andrii Papai on 02.12.2017.
 */

public class DataAreaResponse {
    @SerializedName("success")
    private boolean success;
    @SerializedName("data")
    private List<AreaResponse> mAreaResponses;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<AreaResponse> getAreaResponses() {
        return mAreaResponses;
    }

    public void setAreaResponses(List<AreaResponse> areaResponses) {
        mAreaResponses = areaResponses;
    }
}
