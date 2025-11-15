package ltdd.lt.bai11;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;

import ltdd.lt.bai11.databinding.FragmentPageSecondBinding; // Đổi tên binding

public class PageSecondFragment extends Fragment implements HaiTacListener {

    private FragmentPageSecondBinding binding; // Đổi tên binding
    private ArrayList<HaiTacModel> mHaiTacList;
    private HaiTacAdapter mHaiTacAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentPageSecondBinding.inflate(inflater, container, false); // Đổi tên binding
        View view = binding.getRoot();

        // ... (Tạo list và adapter y hệt)
        mHaiTacList = new ArrayList<>();
        createHaiTacList();
        mHaiTacAdapter = new HaiTacAdapter(getContext(), mHaiTacList, this);

        // YÊU CẦU: Hiển thị theo chiều ngang
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        binding.recyclerViewPage.setLayoutManager(layoutManager);
        binding.recyclerViewPage.setAdapter(mHaiTacAdapter);

        return view;
    }
    private void createHaiTacList() {
        mHaiTacList.add(new HaiTacModel("HT001", "MONKEY D. LUFFY", "3,000,000,000", R.drawable.luffy, false));
        mHaiTacList.add(new HaiTacModel("HT002", "RORONOA ZORO", "1,111,000,000", R.drawable.zoro, false));
        // ... (Thêm các hải tặc khác như trong file cũ)
        mHaiTacList.add(new HaiTacModel("HT005", "SANJI", "1,032,000,000", R.drawable.sanji, false));
        mHaiTacList.add(new HaiTacModel("HT011", "PORTGAS D. ACE", "550,000,000", R.drawable.ace, false));
        mHaiTacList.add(new HaiTacModel("HT012", "DRACULE MIHAWK", "3,590,000,000", R.drawable.mihawk, false));
        mHaiTacList.add(new HaiTacModel("HT013", "SHANKS", "4,048,900,000", R.drawable.shank, false));
    }

    // Xử lý sự kiện click
    @Override
    public void onHaiTacClick(HaiTacModel haiTac) {
        String message = haiTac.getTenHaiTac() + " - " + haiTac.getTienTruyNa();
        Toast.makeText(getContext(), message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null; // Tránh rò rỉ bộ nhớ
    }
}