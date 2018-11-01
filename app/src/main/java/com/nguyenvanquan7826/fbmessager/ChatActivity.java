package com.nguyenvanquan7826.fbmessager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class ChatActivity extends AppCompatActivity {

    private EditText editUserChat, editContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        editUserChat = findViewById(R.id.editUserChat);
        editContent = findViewById(R.id.editContent);

        findViewById(R.id.btnSend).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                sendChat();
            }
        });
    }

    // o ben man hinh 2
    private void sendChat() {
        String userChat = editUserChat.getText().toString();
        String content = editContent.getText().toString();

        Intent i = new Intent();
        i.putExtra("user", userChat);
        i.putExtra("content", content);

        setResult(RESULT_OK, i);
        finish();
    }
}
