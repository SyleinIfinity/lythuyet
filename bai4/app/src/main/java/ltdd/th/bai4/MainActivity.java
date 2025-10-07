package ltdd.th.bai4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button btnLogin = findViewById(R.id.btnLogin);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnLogin.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, AccountActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("fullName", "Nguyễn Văn A");
            bundle.putString("email", "vana@gmail.com");
            bundle.putString("phone", "0123456789");
            bundle.putString("branch", "Khách sạn Đà Nẵng");
            bundle.putString("joinDate", "12/02/2024");
            bundle.putString("status", "Đang hoạt động");
            intent.putExtras(bundle);
            startActivity(intent);
        });

    }
}