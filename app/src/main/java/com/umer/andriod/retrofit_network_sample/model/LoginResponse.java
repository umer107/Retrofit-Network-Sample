package com.umer.andriod.retrofit_network_sample.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class LoginResponse implements Serializable {
    private Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public class Data implements Serializable {
        private String token;
        private int userId;
        private int officeId;
        private String email;
        private String firstName;
        private String password;
        private String countryName;
//        private String profile_url;
//        private String mobile;

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public int getOfficeId() {
            return officeId;
        }

        public void setOfficeId(int officeId) {
            this.officeId = officeId;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getCountryName() {
            return countryName;
        }

        public void setCountryName(String countryName) {
            this.countryName = countryName;
        }

//        public String getProfile_url() {
//            return profile_url;
//        }
//
//        public void setProfile_url(String profile_url) {
//            this.profile_url = profile_url;
//        }
//
//        public String getMobile() {
//            return mobile;
//        }
//
//        public void setMobile(String mobile) {
//            this.mobile = mobile;
//        }
    }
}
