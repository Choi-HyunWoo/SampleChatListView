package com.example.hyunwoo.samplechatlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    EditText inputView;
    Button sendBtn;

    ChatListAdapter mAdpater;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // View Initialize
        listView = (ListView) findViewById(R.id.listView);
        inputView = (EditText) findViewById(R.id.inputView);
        sendBtn = (Button) findViewById(R.id.sendBtn);

        mAdpater = new ChatListAdapter();
        listView.setAdapter(mAdpater);


        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String input = inputView.getText().toString();
                mAdpater.add(input);
                inputView.setText("");

                listView.smoothScrollToPosition(mAdpater.getCount());
            }
        });


    }

}








