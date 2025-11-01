package ltdd.lt.bt_recyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerViewHaiTac;
    private HaiTacAdapter mHaiTacAdapter;
    private ArrayList<HaiTacModel> mHaiTacList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerViewHaiTac = findViewById(R.id.recyclerViewHaiTac);
        mHaiTacList = new ArrayList<>();
        createHaiTacList();

        mHaiTacAdapter = new HaiTacAdapter(this, mHaiTacList);
        mRecyclerViewHaiTac.setLayoutManager(new LinearLayoutManager(this));

        // 5. Gán Adapter vào RecyclerView
        mRecyclerViewHaiTac.setAdapter(mHaiTacAdapter);
    }

    private void createHaiTacList() {
        // Xóa danh sách cũ nếu có
        mHaiTacList.clear();

        // Thêm hải tặc dựa trên các file ảnh bạn đã cung cấp
        mHaiTacList.add(new HaiTacModel("HT001", "MONKEY D. LUFFY", "3,000,000,000", R.drawable.luffy, false));
        mHaiTacList.add(new HaiTacModel("HT002", "RORONOA ZORO", "1,111,000,000", R.drawable.zoro, false));
        mHaiTacList.add(new HaiTacModel("HT005", "SANJI", "1,032,000,000", R.drawable.sanji, false));
        mHaiTacList.add(new HaiTacModel("HT011", "PORTGAS D. ACE", "550,000,000", R.drawable.ace, false)); // "DEAD OR ALIVE"
        mHaiTacList.add(new HaiTacModel("HT012", "DRACULE MIHAWK", "3,590,000,000", R.drawable.mihawk, false));
        mHaiTacList.add(new HaiTacModel("HT013", "SHANKS", "4,048,900,000", R.drawable.shank, false));
    }
}