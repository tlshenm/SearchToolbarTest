package com.sishin.phone.searchtoolbartest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class NoticeRecyclerAdapter extends RecyclerView.Adapter<NoticeRecyclerAdapter.ViewHolder> {

    private final List<NoticeItem> mValues;
    private Context mContext = null;

    public NoticeRecyclerAdapter(Context context, List<NoticeItem> items) {
        this.mContext = context;
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.notice_item, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public int getItemCount() {
        return mValues.size();
    }

    //이부분 중요!! 검색 리스트를 나오게하기 위해 꼭 필요
    public void setFilter(List<NoticeItem> items) {
        mValues.clear();
        mValues.addAll(items);
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        holder.mItem = mValues.get(position);
        holder.mTitleText.setText(mValues.get(position).getTitle());
        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mTitleText;

        public NoticeItem mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mTitleText = (TextView) view.findViewById(R.id.notice_item_title);
        }
    }
}

