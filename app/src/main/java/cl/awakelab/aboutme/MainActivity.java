package cl.awakelab.aboutme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import cl.awakelab.aboutme.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initListeners();
    }
    private void initListeners() {
            binding.buttonNext.setOnClickListener(v -> {
                Intent goTo = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(goTo);
            });

        }
}
