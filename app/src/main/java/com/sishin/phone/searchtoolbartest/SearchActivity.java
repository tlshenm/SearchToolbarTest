package com.sishin.phone.searchtoolbartest;




import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity {

    private NoticeRecyclerAdapter mAdapter;
    private NoticeContent mNoticeContent;
    private SearchView searchView;
    private SearchView.OnQueryTextListener queryTextListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        initView();
    }

    private void initView() {
        getIntentDate();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.notice_search_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //임시데이터를 넣어준다.
        List<NoticeItem> tempNoticeItem = new ArrayList<>();
        for(int i=0;i<mNoticeContent.getNoticeList().size();i++){
            NoticeItem noticeItem = mNoticeContent.getNoticeList().get(i);
            tempNoticeItem.add(noticeItem);
        }
        mAdapter = new NoticeRecyclerAdapter(this, tempNoticeItem); //new NoticeRecyclerAdapter(Context, 당신의 데이터 리스트)
        recyclerView.setAdapter(mAdapter);
    }

    private void getIntentDate(){
        Intent intent = getIntent();
        mNoticeContent =(NoticeContent)intent.getExtras().getSerializable(NoticeContent.NOTICE_CONTENT);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        SearchManager searchManager = (SearchManager) this.getSystemService(Context.SEARCH_SERVICE);
        searchView = (SearchView) findViewById(R.id.notice_search_view);
        searchView.onActionViewExpanded(); //바로 검색 할 수 있도록

        if (searchView != null) {
            searchView.setSearchableInfo(searchManager.getSearchableInfo(this.getComponentName()));
            searchView.setQueryHint(getString(R.string.notice_search_hint));
            queryTextListener = new SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextChange(String newText) {
                    Log.i("onQueryTextChange", newText);

                    mAdapter.setFilter(filter(mNoticeContent.getNoticeList(), newText));
                    return true;
                }

                @Override
                public boolean onQueryTextSubmit(String query) {
                    Log.i("onQueryTextSubmit", query);

                    return true;
                }
            };
            searchView.setOnQueryTextListener(queryTextListener);
        }

        return true;
    }


    private List<NoticeItem> filter(List<NoticeItem> noticeListItem, String query) {
        query = query.toLowerCase();

        final List<NoticeItem> filteredNoticeList = new ArrayList<>();
        if (query != null && !query.equals("")) {
            for (NoticeItem model : noticeListItem) {
                final String title = model.getTitle().toLowerCase();
                final String name = model.getName().toLowerCase();
                if (title.contains(query)) {
                    filteredNoticeList.add(model);
                }else if(name.contains(query)){
                    filteredNoticeList.add(model);
                }
            }
        }
        return filteredNoticeList;
    }

}

