package dev.piste.api.val4j.apis.officer.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author Piste  (<a href="https://github.com/PisteDev">GitHub</a>)
 */
@SuppressWarnings("unused")
public class Equippable {

    @SerializedName("uuid")
    private String uuid;
    @SerializedName("displayName")
    private String name;
    @SerializedName("category")
    private String category;
    @SerializedName("displayIcon")
    private String iconUrl;
    @SerializedName("killStreamIcon")
    private String killfeedIconUrl;
    @SerializedName("assetPath")
    private String assetPath;

    public String getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public String getKillfeedIconUrl() {
        return killfeedIconUrl;
    }

    public String getAssetPath() {
        return assetPath;
    }

}