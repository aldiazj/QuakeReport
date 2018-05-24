package com.example.android.quakereport;

/**
 * {@link Earthquake} represents a single Earthqake event.
 * Each object has 3 properties: magnitude, place, and date.
 */
public class Earthquake {
    // Magnitude of the earthquake (e.g. 4.1, 6,7)
    private double mMagnitude;

    // Place where the earthquake occurred (e.g. San Francisco, London, Tokyo)
    private String mLocation;

    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    // URL whit the earthquake's info
    private String mUrl;

    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the city location of the earthquake
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     * @param earthquakeUrl is the web page where the earthquake's info is
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String earthquakeUrl) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = earthquakeUrl;
    }

    /**
     * @return magnitude of the earthquake
     */
    public double getMagnitude() {
        return mMagnitude;
    }

    /**
     * @return place where the earthquake occurred
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * @return the time of the earthquake.
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /**
     * @return the URL of the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }
}
