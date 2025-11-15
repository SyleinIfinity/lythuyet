package ltdd.lt.bai11;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import ltdd.lt.bai11.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding; // ViewBinding
    private ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // 1. Khởi tạo ViewPagerAdapter
        viewPagerAdapter = new ViewPagerAdapter(this);
        binding.viewPager.setAdapter(viewPagerAdapter);

        // 2. Liên kết TabLayout (top_tabLayout) với ViewPager2
        new TabLayoutMediator(binding.topTabLayout, binding.viewPager,
                (tab, position) -> {
                    // Đặt tên cho các tab ở trên cùng
                    switch (position) {
                        case 0:
                            tab.setText("Dọc");
                            break;
                        case 1:
                            tab.setText("Ngang");
                            break;
                        case 2:
                            tab.setText("Lưới");
                            break;
                        case 3:
                            tab.setText("Mới");
                            break;
                    }
                }
        ).attach();

        // 3. Xử lý sự kiện khi vuốt ViewPager2 -> Cập nhật BottomNavigation
        binding.viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                // Đồng bộ item được chọn ở BottomNavigation
                switch (position) {
                    case 0:
                        binding.bottomNavigation.setSelectedItemId(R.id.nav_page_first);
                        break;
                    case 1:
                        binding.bottomNavigation.setSelectedItemId(R.id.nav_page_second);
                        break;
                    case 2:
                        binding.bottomNavigation.setSelectedItemId(R.id.nav_page_third);
                        break;
                    case 3:
                        binding.bottomNavigation.setSelectedItemId(R.id.nav_page_fourth);
                        break;
                }
            }
        });

        // 4. Xử lý sự kiện khi nhấn vào BottomNavigation -> Cập nhật ViewPager2
        binding.bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();
                if (itemId == R.id.nav_page_first) {
                    binding.viewPager.setCurrentItem(0);
                } else if (itemId == R.id.nav_page_second) {
                    binding.viewPager.setCurrentItem(1);
                } else if (itemId == R.id.nav_page_third) {
                    binding.viewPager.setCurrentItem(2);
                } else if (itemId == R.id.nav_page_fourth) {
                    binding.viewPager.setCurrentItem(3);
                }
                return true; // Đã xử lý
            }
        });
    }
}