package com.befresh.befreshapp.Community.MyRecipe;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.befresh.befreshapp.Community.CommunityModel.CommentInfo;
import com.befresh.befreshapp.R;

import java.util.ArrayList;

/**
 * Created by idongsu on 2017. 7. 2..
 */

public class MyRecipeContentAdapter extends RecyclerView.Adapter<MyRecipeContentViewHolder> {

    Context context;
    ArrayList<CommentInfo> items = new ArrayList<>();

    public MyRecipeContentAdapter(Context context, ArrayList<CommentInfo> items) {
        this.context = context;
        this.items.addAll(items);
    }

    @Override
    public MyRecipeContentViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.comment, parent, false);

        return new MyRecipeContentViewHolder(view);
    }

    public void onUpdateViewHolder(ArrayList<CommentInfo> newItems) {
        items.clear();
        items.addAll(newItems);
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(MyRecipeContentViewHolder holder, int position) {

        Log.i("comment", "댓글어댑터");
        holder.comment_email.setText(items.get(position).commentEmail);
        holder.comment_content.setText(items.get(position).commentContent);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}

