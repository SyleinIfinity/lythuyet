package ltdd.lt.bai11;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

// Lớp này tách ra từ Adapter của bài 9
public class HaiTacViewHolder extends RecyclerView.ViewHolder {
    ImageView imgBackgroundPoster, imgNhanDien;
    TextView tvTenHaiTac, tvTienTruyNa, tvYeuCauTruyNa;

    public HaiTacViewHolder(@NonNull View itemView) {
        super(itemView);
        // Ánh xạ các view từ item_hai_tac.xml
        imgBackgroundPoster = itemView.findViewById(R.id.imgBackgroundPoster);
        imgNhanDien = itemView.findViewById(R.id.imgNhanDien);
        tvTenHaiTac = itemView.findViewById(R.id.tvTenHaiTac);
        tvTienTruyNa = itemView.findViewById(R.id.tvTienTruyNa);
        tvYeuCauTruyNa = itemView.findViewById(R.id.tvYeuCauTruyNa);
    }
}