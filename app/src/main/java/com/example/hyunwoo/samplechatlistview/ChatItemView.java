package com.example.hyunwoo.samplechatlistview;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Hyunwoo on 2016. 7. 22..
 */
public class ChatItemView extends LinearLayout {

    TextView messageView;

    public ChatItemView(Context context) {
        super(context);
        init();
    }

    private void init() {   // 초기화 함수
        inflate(getContext(), R.layout.chat_view, this);

        // View initialize
        messageView = (TextView) findViewById(R.id.messageView);

    }

    public void setMessage(String message) {
        messageView.setText(message);
    }

}










