package com.example.android.miwok;

public class Word {
    private String mDefaulTranslation;
    private String mMiwokTranslation;

    public Word(String mDefaulTranslation, String mMiwokTranslation) {
        this.mDefaulTranslation = mDefaulTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public String getDefaulTranslation() {
        return mDefaulTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}
