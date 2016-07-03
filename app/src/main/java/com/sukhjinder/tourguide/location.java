package com.sukhjinder.tourguide;

/**
 * Created by Sukhjinder on 7/2/16.
 */
public class location {

    private String mLocation;
    private String mName;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    public location(String location, String name) {
        mLocation = location;
        mName = name;
    }

    public location(String location, String name, int imageResourceId) {
        mLocation = location;
        mName = name;
        mImageResourceId = imageResourceId;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getName() {
        return mName;
    }

    public String getLocation() {
        return mLocation;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}