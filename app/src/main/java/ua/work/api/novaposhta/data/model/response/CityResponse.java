package ua.work.api.novaposhta.data.model.response;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Andrii Papai on 02.12.2017.
 */

public class CityResponse {
    @SerializedName("Description")
    private String Description;
    @SerializedName("Ref")
    private String Ref;
    @SerializedName("Area")
    private String Area;
    @SerializedName("SettlementType")
    private String SettlementType;
    @SerializedName("CityID")
    private String CityID;
    @SerializedName("SettlementTypeDescription")
    private String SettlementTypeDescription;

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getRef() {
        return Ref;
    }

    public void setRef(String ref) {
        Ref = ref;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }

    public String getSettlementType() {
        return SettlementType;
    }

    public void setSettlementType(String settlementType) {
        SettlementType = settlementType;
    }

    public String getCityID() {
        return CityID;
    }

    public void setCityID(String cityID) {
        CityID = cityID;
    }

    public String getSettlementTypeDescription() {
        return SettlementTypeDescription;
    }

    public void setSettlementTypeDescription(String settlementTypeDescription) {
        SettlementTypeDescription = settlementTypeDescription;
    }
}
