package com.aistriesking.parkspaceinc.ui.search;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SearchViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public SearchViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Welcome to parkspace SearchView Module");
    }

    public LiveData<String> getText() {
        return mText;
    }
}