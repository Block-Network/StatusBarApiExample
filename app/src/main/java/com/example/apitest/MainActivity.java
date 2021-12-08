package com.example.apitest;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;

import StatusBarLyric.API.StatusBarLyric;

@SuppressWarnings("deprecation")

@SuppressLint("ExportedPreferenceActivity")
public class MainActivity extends PreferenceActivity {
    private final Activity activity = this;
    private String lyric = "TestTestTestTestTestTestTestTestTestTestTestTestTestTestTestTestTestTestTestTestTestTestTestTestTestTestTestTestTestTest";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.root_preferences);
        setTitle(getString(R.string.app_name));

        @SuppressLint("UseCompatLoadingForDrawables")
        StatusBarLyric api = new StatusBarLyric(activity, getDrawable(R.drawable.ic_icon), "com.example.apitest",false);

        Preference preference = findPreference("testlyric");
        preference.setTitle(String.format("%s (%s)", preference.getTitle(), api.hasEnable() ? getString(R.string.activation) : getString(R.string.notactivation)));
        preference.setOnPreferenceClickListener((preference1) -> {
            api.updateLyric(((int) (Math.random() * 10)) + lyric);
            return true;
        });

        preference = findPreference("teststop");
        preference.setOnPreferenceClickListener((preference1) -> {
            api.stopLyric();
            return true;
        });

        EditTextPreference editTextPreference = (EditTextPreference) findPreference("testlyric1");
        editTextPreference.setOnPreferenceChangeListener((preference1, newValue) -> {
            lyric = newValue.toString();
            return true;
        });

    }
}