package cl.awakelab.aboutme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import cl.awakelab.aboutme.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
    private ActivitySecondBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        initListeners();
    }

    private void initListeners(){


        binding.buttonLinkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLinkedin = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/fabi%C3%A1n-navarro-5745b8227/"));
                startActivity(intentLinkedin);
            }
        });

        binding.buttonWhatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentWhatsapp = new Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send?phone=56984682042&text=Hola!%20me%20gustar%C3%ADa%20realizar%20una%20entrevista%20contigo."));
                startActivity(intentWhatsapp);
            }
        });

        binding.buttonMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMail = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:contactofnavarro@gmail.com?subject=Entrevista%20de%20trabajo"));
                startActivity(intentMail);
            }
        });


    }

}