package com.nguyenvanquan7826.fbmessager;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnAdd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showChatActivity();
            }
        });
    }

    private void showChatActivity() {
        Intent i = new Intent(this, ChatActivity.class);
        startActivityForResult(i, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1 && resultCode == RESULT_OK) {
            String userChat = data.getStringExtra("user");
            String content = data.getStringExtra("content");

            Toast.makeText(this, userChat + "/" + content, Toast.LENGTH_SHORT).show();
            // add to list
        }
    }
}