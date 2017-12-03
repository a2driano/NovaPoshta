package ua.work.api.novaposhta.domain.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Andrii Papai on 02.12.2017.
 */

public class AreaModel {
    private String Description;
    private String Ref;
    private String AreasCenter;

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

    public String getAreasCenter() {
        return AreasCenter;
    }

    public void setAreasCenter(String areasCenter) {
        AreasCenter = areasCenter;
    }
}
