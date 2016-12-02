package com.wwren.all.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import butterknife.ButterKnife;

/**
 * Created by 任伟伟
 * Datetime: 2016/10/26-11:07
 * Email: renweiwei@ufashion.com
 */

public abstract class BaseAdapter<T> extends android.widget.BaseAdapter {
    private List<T> list;
    private Context context;

    public BaseAdapter(Context context, List<T> list) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list==null ? 0 : list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(getContentLayout(), null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        return convertView;
    }

    static class ViewHolder {
        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
    protected abstract int getContentLayout();
}
