package com.example.quakereport;

public class Earthquake {

    /** stores Magnitude of earthquake */
    private double mMagnitude;
    /** stores Location of earthquake */
    private String mLocation;
    /** stores Date of earthquake */
    private Long mTimeInMilliseconds;
    /** stores the Url of the earthquake*/
    private String mUrl;

    /**
     * constructs a new {@link Earthquake} object.
     * @param magnitude is the magnitude of the earthquake
     * @param location is the city location of the earthquake
     * @param timeInMilliseconds is the date and time of the earthquake happened in unix epoch time.
     * @param url is used to store the url of the earthquake.
     */
    public Earthquake(double magnitude, String location, Long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    /**
     * @return magnitude of earthquake
     */
    public double getMagnitude() {
        return mMagnitude;
    }

    /**
     * @return location of earthquake
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * @return date of earthquake
     */
    public Long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /**
     * @return url of earthquake website
     */
    public String getUrl() {
        return mUrl;
    }

}
