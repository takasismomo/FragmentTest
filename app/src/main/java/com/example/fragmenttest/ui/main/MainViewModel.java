package com.example.fragmenttest.ui.main;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel<str> extends ViewModel {
    // TODO: Implement the ViewModel
    boolean flagButton;
    private MutableLiveData<String> str;

    public LiveData<String> init(){
        str = new MutableLiveData<>();
        str.postValue("Push!");
        return str;
    }

    public LiveData<String> button(){
        str.setValue("Pushed!");
        return str;
    }

}