package ltdd.lt.bt_recyclerview;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements HaiTacListener
{

    private ArrayList<HaiTacModel> mHaiTacList;
    private RecyclerView mRecyclerStudent;
    private HaiTacAdapter mHaiTacAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerStudent = findViewById(R.id.recyclerViewHaiTac); // Sửa ID nếu bạn dùng ID khác
        mHaiTacList = new ArrayList<>();
        createHaiTacList();

        // SỬA ĐỔI 2: Khởi tạo Adapter và truyền 'this' vào làm Listener
        mHaiTacAdapter = new HaiTacAdapter(this, mHaiTacList, this);

        mRecyclerStudent.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerStudent.setAdapter(mHaiTacAdapter);
    }

    private void createHaiTacList() {
        // (Giữ nguyên hàm tạo danh sách của bạn)
        mHaiTacList.add(new HaiTacModel("HT001", "MONKEY D. LUFFY", "3,000,000,000", R.drawable.luffy, false));
        mHaiTacList.add(new HaiTacModel("HT002", "RORONOA ZORO", "1,111,000,000", R.drawable.zoro, false));
        mHaiTacList.add(new HaiTacModel("HT005", "SANJI", "1,032,000,000", R.drawable.sanji, false));
        mHaiTacList.add(new HaiTacModel("HT011", "PORTGAS D. ACE", "550,000,000", R.drawable.ace, false));
        mHaiTacList.add(new HaiTacModel("HT012", "DRACULE MIHAWK", "3,590,000,000", R.drawable.mihawk, false));
        mHaiTacList.add(new HaiTacModel("HT013", "SHANKS", "4,048,900,000", R.drawable.shank, false));
    }

    // SỬA ĐỔI 3: Implement phương thức của interface
    @Override
    public void onHaiTacClick(HaiTacModel haiTac) {
        String message = haiTac.getTenHaiTac() + " - " + haiTac.getTienTruyNa();

        // Hiển thị thông báo (Toast)
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}