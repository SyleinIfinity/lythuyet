package ltdd.th.bai4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class AccountActivity extends AppCompatActivity {

    private TextView tvFullName, tvEmail, tvPhone, tvBranch, tvJoinDate, tvStatus;
    private ImageButton btnBack, btnSetting;
    private ImageView imgAvatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        // Ánh xạ view
        btnBack = findViewById(R.id.btnBack);
        btnSetting = findViewById(R.id.btnSetting);
        imgAvatar = findViewById(R.id.imgAvatar);
        tvFullName = findViewById(R.id.tvFullName);
        tvEmail = findViewById(R.id.tvEmail);
        tvPhone = findViewById(R.id.tvPhone);
        tvBranch = findViewById(R.id.tvBranch);
        tvJoinDate = findViewById(R.id.tvJoinDate);
        tvStatus = findViewById(R.id.tvStatus);

        // 🔹 Nhận dữ liệu từ Bundle
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            tvFullName.setText(bundle.getString("fullName", "Không xác định"));
            tvEmail.setText(bundle.getString("email", "Không có email"));
            tvPhone.setText(bundle.getString("phone", "Không có số"));
            tvBranch.setText("Chi nhánh: " + bundle.getString("branch", "Chưa rõ"));
            tvJoinDate.setText("Ngày tham gia: " + bundle.getString("joinDate", "N/A"));
            tvStatus.setText("Trạng thái: " + bundle.getString("status", "Không rõ"));
        }

        // 🔙 Nút quay lại
        btnBack.setOnClickListener(v -> finish());

        // ⚙️ Nút setting → về MainActivity
        btnSetting.setOnClickListener(v -> {
            Intent intent = new Intent(AccountActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
