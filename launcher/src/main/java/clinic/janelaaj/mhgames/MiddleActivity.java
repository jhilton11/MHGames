package clinic.janelaaj.mhgames;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.unity3d.player.UnityPlayerActivity;

import java.util.UUID;

public class MiddleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_middle);

        //Generate random id. That's the id to be passed to the unity game.
        String id = UUID.randomUUID().toString();

        Intent intent = new Intent(MiddleActivity.this, UnityPlayerActivity.class);
        //Send random id to unity game
        intent.putExtra("id", id);
        startActivity(intent);
    }
}