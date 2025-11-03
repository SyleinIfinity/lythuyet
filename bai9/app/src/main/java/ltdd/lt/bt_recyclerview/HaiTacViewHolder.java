package ltdd.lt.bt_recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HaiTacViewHolder extends RecyclerView.ViewHolder {

    // Khai báo các View
    ImageView imgBackgroundPoster;
    ImageView imgNhanDien;
    TextView tvTenHaiTac;
    TextView tvTienTruyNa;
    TextView tvYeuCauTruyNa;
    TextView tvMarine;

    public HaiTacViewHolder(@NonNull View itemView) {
        super(itemView);

        // Ánh xạ View từ layout
        imgBackgroundPoster = itemView.findViewById(R.id.imgBackgroundPoster);
        imgNhanDien = itemView.findViewById(R.id.imgNhanDien);
        tvTenHaiTac = itemView.findViewById(R.id.tvTenHaiTac);
        tvTienTruyNa = itemView.findViewById(R.id.tvTienTruyNa);
        tvYeuCauTruyNa = itemView.findViewById(R.id.tvYeuCauTruyNa);
    }
}
