package com.example.android.quakereport;

/**
 * {@link Earthquake} represents a single Earthqake event.
 * Each object has 3 properties: magnitude, place, and date.
 */
public class Earthquake {
    // Magnitude of the earthquake (e.g. 4.1, 6,7)
    private String mMagnitude;

    // Place where the earthquake occurred (e.g. San Francisco, London, Tokyo)
    private String mPlace;

    // Date where the earthquake occurred (e.g. Feb 2 2016, Aug 15 1915)
    private String mDate;

    /**
     * Create a new Earthquake object
     *
     * @param vMag is the magnitude of the earthquake (e.g. 4.1, 6,7)
     * @param vPlace is the place where the earthquake occurred (e.g. San Francisco, London, Tokyo)
     * @param vDate is the date where the earthquake occurred (e.g. Feb 2 2016, Aug 15 1915)
     */
    public Earthquake(String vMag, String vPlace, String vDate) {
        mMagnitude = vMag;
        mPlace = vPlace;
        mDate = vDate;
    }

    /**
     * @return magnitude of the earthquake
     */
    public String getMagnitude() {
        return mMagnitude;
    }

    /**
     * @return place where the earthquake occurred
     */
    public String getPlace() {
        return mPlace;
    }

    /**
     * @return date where the earthquake occurred
     */
    public String getDate() {
        return mDate;
    }
}
