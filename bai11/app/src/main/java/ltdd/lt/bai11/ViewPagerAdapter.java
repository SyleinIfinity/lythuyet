package ltdd.lt.bai11;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new PageFirstFragment(); // Trang dọc
            case 1:
                return new PageSecondFragment(); // Trang ngang
            case 2:
                return new PageThirdFragment(); // Trang lưới
            case 3:
                return new PageFourthFragment(); // Trang kiểu mới
            default:
                return new PageFirstFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 4; // Vì có 4 fragment
    }
}