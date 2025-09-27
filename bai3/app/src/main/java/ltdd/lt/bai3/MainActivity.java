package ltdd.lt.bai3;

import android.os.Bundle;
import android.widget.*;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

//    private TextView textView;
//    private EditText editText_user;
//    private EditText editText_pass;
//    private Button btnLOGIN;
//    private TextView textView_forgot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        init();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

//    public void init()
//    {
//        editText_user = findViewById(R.id.editText_user);
//        editText_pass = findViewById(R.id.editText_pass);
//        btnLOGIN = findViewById(R.id.btnLOGIN);
//        textView_forgot = findViewById(R.id.textView_forgot);
//    }
}