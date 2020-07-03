package com.example.miwork;

import android.media.MediaPlayer;

public class word {

    private String mdefaultTranslation;
    private String mMiwokTranslation;
    private int imageResourceID = NO_IMAGE_PROVIED;
    private MediaPlayer player ;
    private static final int NO_IMAGE_PROVIED = -1 ;
    public word(String defaultTranslation , String MiwokTranslation , int imageResourceID ){
        mdefaultTranslation = defaultTranslation ;
        mMiwokTranslation = MiwokTranslation ;
        this.imageResourceID = imageResourceID ;
    }

    public String getDefaultTranslation() {
        return mdefaultTranslation ;
    }

    public String getMiwokTranslation (){
        return mMiwokTranslation;
    }
    public int getImageReasourceID(){
        return imageResourceID ;
    }
    public word(String defaultTranslation , String MiwokTranslation) {
        mdefaultTranslation = defaultTranslation;
        mMiwokTranslation = MiwokTranslation;
    }
    // this test has the image or be hidden for phrases Activity
    public boolean hasImage(){
        return imageResourceID != NO_IMAGE_PROVIED;

    }
}
