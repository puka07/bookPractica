package com.example.myapplication;


import androidx.fragment.app.Fragment;

public class BookListActivity extends SingleFragmentActivity{
    @Override
    protected Fragment createFragment(){
        return new BookListFragment();
    }

}

