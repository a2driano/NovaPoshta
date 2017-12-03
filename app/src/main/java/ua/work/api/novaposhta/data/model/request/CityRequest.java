package ua.work.api.novaposhta.data.model.request;

import com.google.gson.annotations.SerializedName;

import static ua.work.api.novaposhta.AppConstant.API_KEY;

/**
 * Created by Andrii Papai on 03.12.2017.
 */

public class CityRequest {
    @SerializedName("modelName")
    private String modelName;
    @SerializedName("calledMethod")
    private String calledMethod;
    @SerializedName("apiKey")
    private String apiKey;

    public CityRequest() {
        modelName = "Address";
        calledMethod = "getCities";
        apiKey = API_KEY;
    }

    public CityRequest(String modelName, String calledMethod, String apiKey) {
        this.modelName = modelName;
        this.calledMethod = calledMethod;
        this.apiKey = apiKey;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getCalledMethod() {
        return calledMethod;
    }

    public void setCalledMethod(String calledMethod) {
        this.calledMethod = calledMethod;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
}
