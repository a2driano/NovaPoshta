package ua.work.api.novaposhta.domain.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Andrii Papai on 02.12.2017.
 */

public class CityModel {
    private String Description;
    private String Ref;
    private String Area;
    private String SettlementType;
    private String CityID;
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
