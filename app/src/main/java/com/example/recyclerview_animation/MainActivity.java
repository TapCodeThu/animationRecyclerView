package com.example.recyclerview_animation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private RecyclerView recyclerView;
    private UserAdapter userAdapter;
    private Button LeftToRight, RightToLeft, UpToBottom, BottomToUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
       userAdapter = new UserAdapter();
       recyclerView.setLayoutManager(new LinearLayoutManager(this));
       recyclerView.setHasFixedSize(true);


       LeftToRight = findViewById(R.id.btn_left_to_right);
       RightToLeft = findViewById(R.id.btn_right_to_left);
       UpToBottom = findViewById(R.id.btn_up_to_bottom);
       BottomToUp = findViewById(R.id.btn_bottom_to_up);
       LeftToRight.setOnClickListener(this);
       RightToLeft.setOnClickListener(this);
       UpToBottom.setOnClickListener(this);
       BottomToUp.setOnClickListener(this);

    }
    private void setAnimation(int animResource){
        LayoutAnimationController layoutAnimationController = AnimationUtils.loadLayoutAnimation(this,animResource);
        recyclerView.setLayoutAnimation(layoutAnimationController);
        userAdapter.setData(getListData());
        recyclerView.setAdapter(userAdapter);


    }

    private List<User> getListData() {
        List<User> list = new ArrayList<>();
        list.add(new User(R.drawable.anhgaixinh,"Ngọc Huyền"));
        list.add(new User(R.drawable.anhgaixinh3,"Lan Anh"));
        list.add(new User(R.drawable.fb,"Face book"));
        list.add(new User(R.drawable.google,"Google"));
        list.add(new User(R.drawable.twitter,"Twitter"));
        list.add(new User(R.drawable.anhgaixinh,"Ngọc Huyền"));
        list.add(new User(R.drawable.anhgaixinh3,"Lan Anh"));
        list.add(new User(R.drawable.fb,"Face book"));
        list.add(new User(R.drawable.google,"Google"));
        list.add(new User(R.drawable.twitter,"Twitter"));
        list.add(new User(R.drawable.anhgaixinh,"Ngọc Huyền"));
        list.add(new User(R.drawable.anhgaixinh3,"Lan Anh"));
        list.add(new User(R.drawable.fb,"Face book"));
        list.add(new User(R.drawable.google,"Google"));
        list.add(new User(R.drawable.twitter,"Twitter"));
        list.add(new User(R.drawable.anhgaixinh,"Ngọc Huyền"));
        list.add(new User(R.drawable.anhgaixinh3,"Lan Anh"));
        list.add(new User(R.drawable.fb,"Face book"));
        list.add(new User(R.drawable.google,"Google"));
        list.add(new User(R.drawable.twitter,"Twitter"));
        return list;
    }

    @Override
    public void onClick(View v) {
      int ID = v.getId();
      if(ID == R.id.btn_left_to_right){
          setAnimation(R.anim.layout_animation_lefttoright);

      }
      else if(ID == R.id.btn_right_to_left){
          setAnimation(R.anim.layout_animation_righttoleft);

      }
      else if(ID == R.id.btn_up_to_bottom){
          setAnimation(R.anim.layout_animation_uptodown);

      }
      else if(ID == R.id.btn_bottom_to_up){
          setAnimation(R.anim.layout_animation_downtoup);

      }

    }
}