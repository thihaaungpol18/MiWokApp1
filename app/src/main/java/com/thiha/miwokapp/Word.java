package com.thiha.miwokapp;

public class Word {

    private String mMiwokTranslation, mDefaultTranslation;

    private int mImageResource;
    private static int NO_IMAGE_RESOURCE = -1;

    public Word(String defaultTranslation, String miwokTranslation) {

        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;

    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResource) {

        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResource = imageResource;

    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }


    public String getMiwokTranslation() {
        return mMiwokTranslation;

    }

    public int getmImageResource() {
        return mImageResource;
    }


    public boolean hasImage() {
        return mImageResource != NO_IMAGE_RESOURCE;
    }


}
