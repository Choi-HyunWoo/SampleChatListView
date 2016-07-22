package com.example.hyunwoo.samplechatlistview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hyunwoo on 2016. 7. 22..
 */
public class ChatListAdapter extends BaseAdapter {

    List<String> items = new ArrayList<String>();

    public void add(String message) {
        items.add(message);

        // 화면을 갱신하도록 하는 함수
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {       //안씀
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // position : 리스트상에서 몇 번째 아이템?
        // convertView : 내가 이전에 보고 지나갔던 뷰
        // parent : 컨텍스트를 가져오기 위한 객체 (parent.getContext())

        ChatItemView view;

        if (convertView == null) {  // convertView == null : 내가 봤던 뷰가 아님 (처음 본 뷰)
            view = new ChatItemView(parent.getContext());
        } else {                    // convertView != null : 내가 봤던 뷰가 들어옴
            view = (ChatItemView) convertView;
        }

        // 뷰에 데이터를 세팅
        view.setMessage(items.get(position));

        // 리턴을 통해 실질적으로 뷰를 화면에 출력
        return view;
    }
}












