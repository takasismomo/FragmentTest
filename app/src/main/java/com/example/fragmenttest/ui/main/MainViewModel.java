package com.example.fragmenttest.ui.main;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel<str> extends ViewModel {
    // TODO: Implement the ViewModel
    boolean flagButton;
    private MutableLiveData<String> mstr;
    public LiveData<String> str;

    public void init(){
        mstr= new MutableLiveData<String>();
        mstr.setValue("Push the Button!");

    }

    public void onClick(){
        mstr.setValue("Pushed!");
        str = this.mstr;
    }

}