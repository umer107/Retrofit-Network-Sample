package com.umer.andriod.retrofit_network_sample.network;


import com.umer.andriod.retrofit_network_sample.model.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiService {

    //  (1)
    @FormUrlEncoded
    @POST(AppWebServices.API_USER_LOGIN)
    Call<LoginResponse> login(@Field("Email") String email,
                              @Field("Password") String password);
//
//    //  (2)
//    @POST(AppWebServices.API_UI_LIST)
//    Call<UIListResponse> UIList();
//
//    //  (3)
//    @FormUrlEncoded
//    @POST(AppWebServices.API_OFFICE_SETTINGS)
//    Call<OfficeSettingsResponse> OfficeSettings(@Field("Token") String token);
//
//    //  (4)
//    @FormUrlEncoded
//    @POST(AppWebServices.API_INSPECTIONS_LIST)
//    Call<InspectionsListResponse> InspectionsList(@Field("Token") String token);
//
//    //  (5)
//    @FormUrlEncoded
//    @POST(AppWebServices.API_READ_USER_SIGNATURE)
//    Call<UserSignatureResponse> ReadUserSignature(@Field("Token") String token);
//
//    //  (6)
//    @FormUrlEncoded
//    @POST(AppWebServices.API_STATE_LEVEL_FIELDS)
//    Call<StateLevelFieldsResponse> StateLevelFields(@Field("Token") String token);
//
//    //  (7)
//    @FormUrlEncoded
//    @POST(AppWebServices.API_MASTER_AREA_AND_SETTINGS)
//    Call<MasterAreaAndItemsResponse> MasterAreaAndSettings(@Field("OfficeId") int officeId);
//
//    //  (8)
//    @POST(AppWebServices.API_APP_VERSION)
//    Call<AppVersionResponse> AppVersionCheck(@Header("os") String os);
//
//    //  (9)
//    @FormUrlEncoded
//    @POST(AppWebServices.API_CLOSED_INCPECTIONS)
//    Call<ClosedInspectionsResponse> ClosedInspections(@Field("UserId") int userId);
//
//    //  (10)
//    @FormUrlEncoded
//    @POST(AppWebServices.API_INGOING_LID_REPORT)
//    Call<InspectionReportResponse> getReportIngoingLID(@Field("InspectionId") int inspectionId);
//
//    //  (11)
//    @FormUrlEncoded
//    @POST(AppWebServices.API_OUTGOING_LID_REPORT)
//    Call<InspectionReportResponse> getReportOutgoingLID(@Field("InspectionId") int inspectionId);
//
//    //  (12)
//    @FormUrlEncoded
//    @POST(AppWebServices.API_ROUTINE_LID_REPORT)
//    Call<InspectionReportResponse> getReportRoutineLID(@Field("InspectionId") int inspectionId);
//
//    //  (13)
//    @FormUrlEncoded
//    @POST(AppWebServices.API_INGOING_REPORT)
//    Call<InspectionReportResponse> getReportIngoing(@Field("InspectionId") int inspectionId);
//
//    //  (14)
//    @FormUrlEncoded
//    @POST(AppWebServices.API_OUTGOING_REPORT)
//    Call<InspectionReportResponse> getReportOutgoing(@Field("InspectionId") int inspectionId);
//
//    //  (15)
//    @FormUrlEncoded
//    @POST(AppWebServices.API_ROUTINE_REPORT)
//    Call<InspectionReportResponse> getReportRoutine(@Field("InspectionId") int inspectionId);
//
//    //  (16)
////    @POST(AppWebServices.API_UPDATE_REPORT_STATUS)
////    Call<ServerResponse> updateReportStatus(@Header("deviceId") String deviceId, @Body InspectionStatusDoneNotSyncRequest obj);
////    @Headers("Content-Type:application/x-www-form-urlencoded")
//    @FormUrlEncoded
//    @POST(AppWebServices.API_UPDATE_REPORT_STATUS)
//    Call<ServerResponse> updateReportStatus(@Field("InspectionId") int inspectionId, @Field("InspectionStatusId") int inspectionStatusId, @Header("os") String os,
//                                            @Header("osVersion") String osVersion, @Header("appVersion") String appVersion, @Header("userID") int userID,
//                                            @Header("userEmail") String userEmail, @Header("device") String device,
//                                            @Header("deviceID") String deviceID, @Header("userToken") String userToken, @Header("devicetype") String deviceType);
//
//
//    //  (17)
//    @FormUrlEncoded
//    @POST(AppWebServices.API_CREATE_REPORT)
//    Call<CreateReportResponse> createReport(@Field("InspectionId") int inspectionId, @Field("OfficeId") int officeId);
//
//    //  (18)
//    @Multipart
//    @POST(AppWebServices.API_UPLOAD_FILE)
//    Call<ServerResponse> uploadFile(@Part("os") RequestBody os, @Part("inspectionId") RequestBody inspectionId, @Part("officeId") RequestBody officeId
//            , @Part("reportId") RequestBody reportId, @Part("inspectionCompletedDate") RequestBody inspectionCompletedDate,
//                                    @Part("appVersion") RequestBody appVersion, @Part("deviceID") RequestBody deviceID, @Part("devicetype") RequestBody deviceType,
//                                    @Part MultipartBody.Part file);
//
//    //  (19)
//    @Streaming
//    @GET
//    Call<ResponseBody> downloadLIDImageWithDynamicUrlAsync(@Url String fileUrl);
//
//    //  (20)
//    @Multipart
//    @POST(AppWebServices.API_UPLOAD_SIGNATURE)
//    Call<SignatureSaveDeleteResponse> uploadSignatureImage(@Part("os") RequestBody os, @Part("Token") RequestBody token, @Part("gt") RequestBody gt, @Part("guid") RequestBody guid,
//                                                           @Part MultipartBody.Part file);
//
//    //  (21)
//    @FormUrlEncoded
//    @POST(AppWebServices.API_DELETE_SIGNATURE)
//    Call<SignatureSaveDeleteResponse> deleteSignature(@Field("Token") String token);
//
//    //  (22)
//    @POST(AppWebServices.API_USER_DEVICE_INFORMATION)
//    Call<SignatureSaveDeleteResponse> saveUserDeviceInfo(@Header("devicetype") String deviceType, @Body UserDeviceInformationRequest obj);
//
//    //  (23)
//    @GET("http://maps.googleapis.com/maps/api/geocode/json")
//    Call<UserCoordinatesResponse> getInspectionCoordinates(@Query("address") String address);
//
//    @GET(AppWebServices.API_EDIT_REPORT)
//    Call<EditReportResponse> getEditReportResponse(@Query("inspectionId") int inspectionId);
//
//    @GET(AppWebServices.COUNTRIES_STATES_URL)
//    Call<CountriesStatesResponse> getCountriesAndStates();
//
//
//    @GET(AppWebServices.SIGNUP_URL)
//    Call<CountriesStatesResponse> signupRequest(@Query("firstname") String firstname, @Query("lastname") String lastname, @Query("company") String company, @Query("email") String email,
//                                                @Query("phone") String phone, @Query("country") String country, @Query("state") String state, @Query("source") String source);
//
//    //  (18)
//    @Multipart
//    @POST(AppWebServices.API_UPLOAD_DIAGNOSTIC_FILE)
//    Call<ServerResponse> uploadDiagnosticFile(@Part("os") RequestBody os, @Part("inspectionId") RequestBody inspectionId,
//                                              @Part MultipartBody.Part file);
//
//    //(24)
//    @FormUrlEncoded
//    @POST(AppWebServices.API_FORGET_PASSWORD)
//    Call<LoginResponse> PasswordReset(@Field("Email") String email);
//
//    @POST(AppWebServices.API_THEME)
//    Call<ChristmasThemeResponse> getTheme();
//
//    //(24)
//    @FormUrlEncoded
//    @POST(AppWebServices.API_REPORT_FIELD_NAME_MAPPING)
//    Call<FieldMappingResponse> getFieldMapper(@Field("officeId") int officeId);
//
//    @FormUrlEncoded
//    @POST(AppWebServices.API_SUGGESTION_LIST)
//    Call<MasterAreaAndItemsResponse> getSuggestionList(@Field("OfficeId") int officeId);
//
//    @FormUrlEncoded
//    @POST(AppWebServices.API_MOBILE_OTHER_FIELDS)
//    Call<MobileOtherFieldsResponse> getUrlAndNumber(@Field("token") String token);
//
//    @Multipart
//    @POST(AppWebServices.API_UPLOAD_PROFILE_PICTURE)
//    Call<ProfilePictureResponse> uploadProfilePicture(@Part("os") RequestBody os, @Part("Token") RequestBody token, @Part("userId") RequestBody userId, @Part("guid") RequestBody guid, @Part MultipartBody.Part file);
//
//    @FormUrlEncoded
//    @POST(AppWebServices.API_CHANGE_PASSWORD)
//    Call<ServerResponse> passwordChange(@Field("token") String token, @Field("password") String password, @Field("mobile") String mobile);
}
