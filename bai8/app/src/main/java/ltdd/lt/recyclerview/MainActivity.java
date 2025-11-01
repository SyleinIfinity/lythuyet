package ltdd.lt.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Student> mStudentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Dùng layout activity_main

        RecyclerView mRecyclerStudent = findViewById(R.id.recyclerStudent);

        // 2. Tạo nguồn dữ liệu
        mStudentList = new ArrayList<>();
        createStudentList();

        // 3. Khởi tạo Adapter
        StudentAdapter mStudentAdapter = new StudentAdapter(this, mStudentList);

        // 4. Cấu hình RecyclerView (LayoutManager)
        mRecyclerStudent.setLayoutManager(new LinearLayoutManager(this));

        // 5. Gắn Adapter vào RecyclerView
        mRecyclerStudent.setAdapter(mStudentAdapter);
    }

    private void createStudentList() {
        mStudentList.add(new Student("200119", "Nguyễn", "Văn A", "60TH1", R.drawable.dung));
        mStudentList.add(new Student("200120", "Trần", "Thị B", "60TH2", R.drawable.manh));
        mStudentList.add(new Student("200121", "Lê", "Văn C", "60TH1", R.drawable.nam22));
        mStudentList.add(new Student("200122", "Phạm", "Thị D", "60PM", R.drawable.quan));
        mStudentList.add(new Student("200123", "Hoàng", "Văn E", "60TH3", R.drawable.rung_truc));
        mStudentList.add(new Student("200124", "Vũ", "Thị F", "60TH2", R.drawable.nom23));
    }
}