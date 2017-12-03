package ua.work.api.novaposhta.data.model.request;

import com.google.gson.annotations.SerializedName;

import static ua.work.api.novaposhta.AppConstant.API_KEY;

/**
 * Created by Andrii Papai on 03.12.2017.
 */

public class AreaRequest {
    @SerializedName("apiKey")
    private String apiKey;
    @SerializedName("modelName")
    private String modelName;
    @SerializedName("calledMethod")
    private String calledMethod;

    public AreaRequest() {
        apiKey = API_KEY;
        modelName = "Address";
        calledMethod = "getAreas";
    }

    public AreaRequest(String apiKey, String modelName, String calledMethod) {
        this.apiKey = apiKey;
        this.modelName = modelName;
        this.calledMethod = calledMethod;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
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

    //    {
//        "apiKey":"[ВАШ КЛЮЧ]",
//            "modelName":"Address",
//            "calledMethod":"getAreas",
//            "methodProperties":{
//    }
//    }
}
