package com.sishin.phone.searchtoolbartest;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class NoticeContent implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final String NOTICE_CONTENT = "NOTICE_CONTENT";
    private List<NoticeItem> mNoticeList = null;

    public NoticeContent(){
        mNoticeList = new ArrayList<>();
    }

    public List<NoticeItem> getNoticeList() {
        return mNoticeList;
    }

    public void setNoticeList(List<NoticeItem> noticeList) {
        mNoticeList = noticeList;
    }
}
