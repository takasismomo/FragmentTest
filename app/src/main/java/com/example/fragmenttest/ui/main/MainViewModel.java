package com.example.fragmenttest.ui.main;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private MutableLiveData<String> str;

    public void init(){
        str= new MutableLiveData<String>();
        str.setValue("Push the Button!");
    }

    public void onClick(){
        str.setValue("Pushed!");
    }

}