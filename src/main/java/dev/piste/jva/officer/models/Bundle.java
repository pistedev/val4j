package dev.piste.jva.officer.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author Piste | https://github.com/PisteDev
 */
@SuppressWarnings("unused")
public class Bundle {

    @SerializedName("uuid")
    private String uuid;
    @SerializedName("displayName")
    private String displayName;
    @SerializedName("displayNameSubText")
    private String displayNameSubText;
    @SerializedName("description")
    private String description;
    @SerializedName("extraDescription")
    private String extraDescription;
    @SerializedName("promoDescription")
    private String promoDescription;
    @SerializedName("useAdditionalContext")
    private boolean usingAdditionalContext;
    @SerializedName("displayIcon")
    private String displayIcon;
    @SerializedName("displayIcon2")
    private String displayIcon2;
    @SerializedName("verticalPromoImage")
    private String verticalPromoImage;
    @SerializedName("assetPath")
    private String assetPath;

    public String getUUID() {
        return uuid;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getDisplayNameSubText() {
        return displayNameSubText;
    }

    public String getDescription() {
        return description;
    }

    public String getExtraDescription() {
        return extraDescription;
    }

    public String getPromoDescription() {
        return promoDescription;
    }

    public boolean isUsingAdditionalContext() {
        return usingAdditionalContext;
    }

    public String getDisplayIcon() {
        return displayIcon;
    }

    public String getDisplayIcon2() {
        return displayIcon2;
    }

    public String getVerticalPromoImage() {
        return verticalPromoImage;
    }

    public String getAssetPath() {
        return assetPath;
    }

}