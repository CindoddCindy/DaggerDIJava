package cindodcindy.sirihpinang.daggerdi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Body body = createBody();

        TextView bloodTV = findViewById(R.id.tv_dagger);

        bloodTV.setText("Kind of Blood: " + body.getBlood().getKindOfBlood());

    }

    private Body createBody() {

        Doctor doctor = DaggerDoctor.create();

        return doctor.injectBlood();

    }
    }
}
