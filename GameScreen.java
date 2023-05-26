package com.example.kingsguardian;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GameScreen extends AppCompatActivity {
    ImageView image;
    TextView text;
    Button button1, button2;

    Story story = new Story(this);
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);
        mediaPlayer = MediaPlayer.create(this, R.raw.dead);
        soundPlay(mediaPlayer);
        image = (ImageView)findViewById(R.id.gameimageView);
        text = (TextView)findViewById(R.id.gametextView);
        button1 = (Button)findViewById(R.id.choicebutton1);
        button2 = (Button)findViewById(R.id.choicebutton2);

        button1.setTransformationMethod(null);
        button2.setTransformationMethod(null);

        story.startingPoint();


    }

    public void soundPlay(MediaPlayer sound){
        sound.start();
        sound.setLooping(true);
    }
    public void button1(View view){
        story.selectPosition(story.nextPosition1);
    }
    public void button2(View view){
        story.selectPosition(story.nextPosition2);
    }
}