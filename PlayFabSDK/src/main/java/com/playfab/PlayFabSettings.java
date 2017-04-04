package com.playfab;

import com.playfab.PlayFabErrors.ErrorCallback;

public class PlayFabSettings {
    public static String SdkVersion = "0.47.170403";
    public static String BuildIdentifier = "jbuild_javasdk_1";
    public static String SdkVersionString = "JavaSDK-0.47.170403";

    public static ErrorCallback GlobalErrorHandler;    
    public static String AdvertisingIdType = null; // Set this to the appropriate AD_TYPE_X constant below
    public static String AdvertisingIdValue = null; // Set this to corresponding device value

    // DisableAdvertising is provided for completeness, but changing it is not suggested
    // Disabling this may prevent your advertising-related PlayFab marketplace partners from working correctly
    public static Boolean DisableAdvertising = false;
    public static final String AD_TYPE_IDFA = "Idfa";
    public static final String AD_TYPE_ANDROID_ID = "Adid";

    public String TitleId;
    public String DeveloperSecretKey;
    
    public PlayFabSettings(final String TitleId, final String DeveloperSecretKey) {
    	this.TitleId = TitleId;
    	this.DeveloperSecretKey = DeveloperSecretKey;
    }
    
    public String GetURL() {
        return "https://" + this.TitleId + ".playfabapi.com";
    }
    
    public String GetTitleId() {
    	return this.TitleId;
    }
    
    public String GetDeveloperSecretKey() {
    	return this.DeveloperSecretKey;
    }
}
