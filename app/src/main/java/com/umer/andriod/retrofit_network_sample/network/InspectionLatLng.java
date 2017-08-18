package com.umer.andriod.retrofit_network_sample.network;

import java.io.Serializable;

/**
 * Created by Administrator on 7/25/2016.
 */
public class InspectionLatLng implements Serializable {
    private Double lat;
    private Double lng;

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }
}