package com.umer.andriod.retrofit_network_sample.network;

public interface AppWebServices {

    //    public static final String BASE_URL = "http://192.168.9.78:8089/"; // Asad
//    public static final String BASE_URL = "http://192.168.9.77:8089/"; // Okasha
    //public static final String  BASE_URL  = "http://192.168.9.61:8089/"; // Wasif
//public static final String  BASE_URL = "http://cms.inspectionmanager.com.au:8089/"   ; // Dev
    public static final String BASE_URL = "http://imtest.net:9834/";  // Beta
//    public static final String BASE_URL = "https://cms.inspectionmanager.com.au:83/";    // Live with https

   // public static final String BASE_URL = "http://cms.inspectionmanager.com.au:9888/";  // Beta for android only

    public static final String API_THEME_IMAGES_URL = "http://cms.inspectionmanager.com.au:8087/applogos/";
    public static final String API_USER_LOGIN = "api/mobilelogon";

    public static final String API_UI_LIST = "api/MobileUIList";
    public static final String API_OFFICE_SETTINGS = "api/mobileOffice";
    public static final String API_MASTER_AREA_AND_SETTINGS = "api/MobileGlobalAreasAndItems";
    public static final String API_APP_VERSION = "api/MobileVersionCheck";
    public static final String API_CLOSED_INCPECTIONS = "api/MobileClosedInspections";
    public static final String API_INSPECTIONS_LIST = "api/mobileInspections";
    public static final String API_STATE_LEVEL_FIELDS = "api/mobileConditionCodes";
    public static final String API_READ_USER_SIGNATURE = "SignatureRead.ashx";

    public static final String API_INGOING_LID_REPORT = "api/MobileReportIngoingLID";
    public static final String API_OUTGOING_LID_REPORT = "api/MobileReportOutgoingLID";
    public static final String API_ROUTINE_LID_REPORT = "api/MobileReportRoutineLID";
    public static final String API_INGOING_REPORT = "api/mobileReportIngoing";
    public static final String API_OUTGOING_REPORT = "api/mobileReportOutgoing";
    public static final String API_ROUTINE_REPORT = "api/mobileReportRoutine";
    public static final String API_UPDATE_REPORT_STATUS = "api/MobileUpdateInspectionStatus";
    public static final String API_CREATE_REPORT = "api/MobileCreateReport";
    public static final String API_UPLOAD_FILE = "syncviazip.ashx";
    public static final String API_UPLOAD_DIAGNOSTIC_FILE = "syncdiagnosticdata.ashx";
    public static final String API_UPLOAD_SIGNATURE = "SignatureUpload.ashx";
    public static final String API_THEME = "api/MobileAppThemeUI";
    public static final String API_DELETE_SIGNATURE = "SignatureDelete.ashx";

    public static final String API_USER_MESSAGE = "/messages/inbox/{page_number}";

    public static final String API_EDIT_REPORT = "api/MobileReportEdit";
    public static final String API_USER_REFRESH_MESSAGE = "/messages/inbox/{page_number}/refresh";
    public static final String API_UPLOAD_PROFILE_PICTURE = "UploadProfilepicture.ashx";

    public static final String API_USER_DEVICE_INFORMATION = "api/MobileSaveUserDeviceInformation";
    public static final String API_REPORT_FIELD_NAME_MAPPING = "api/ReportFieldNameMapper";
    public static final String API_SUGGESTION_LIST = "api/MobileSettingSuggestedItems";
    public static final String ABOUT_URL = "http://www.inspectionmanager.com.au/about";
    public static final String HOW_IT_WORKS_URL = "http://www.inspectionmanager.com.au/video-tour";

    public static final String API_MESSAGE_DELETE = "/messages/delete";
    public static final String API_USER_REGISTER = "/users/register";

    public static final String API_FORGET_PASSWORD = "api/mobileforgotpassword";
    public static final String API_CHANGE_PASSWORD = "api/MobileSavePassword";
    public static final String API_MOBILE_OTHER_FIELDS = "api/mobileotherfields";

    // sales force api's
    public static final String SALES_FORCE_BASE_URL = "https://developer-inspectionmanager.cs6.force.com/services/apexrest/";
    public static final String COUNTRIES_STATES_URL = "IM_App_CountryState";
    public static final String SIGNUP_URL = "IM_HomePage_Lead?method=apilead";

}
