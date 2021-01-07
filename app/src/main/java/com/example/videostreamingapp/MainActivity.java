package com.example.videostreamingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.MediaController;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView videoView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MediaController mediaController=new MediaController(this);

        videoView=findViewById(R.id.vid);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/video-streaming-app-9a611.appspot.com/o/Shaktimaan%20Returns.mp4?alt=media&token=0673c011-3cf4-4868-aac1-54a57ee8c570");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}
