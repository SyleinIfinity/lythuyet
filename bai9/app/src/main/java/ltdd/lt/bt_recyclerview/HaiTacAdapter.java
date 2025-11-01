package ltdd.lt.bt_recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide; // Cần thư viện Glide

import java.util.ArrayList;

public class HaiTacAdapter extends RecyclerView.Adapter<HaiTacAdapter.ViewHolder> {

    private Context mContext;
    private ArrayList<HaiTacModel> mHaiTacList;

    public HaiTacAdapter(Context context, ArrayList<HaiTacModel> haiTacList) {
        this.mContext = context;
        this.mHaiTacList = haiTacList;
    }

    // Lớp ViewHolder (tích hợp trong Adapter)
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgBackgroundPoster;
        ImageView imgNhanDien;
        TextView tvTenHaiTac;
        TextView tvTienTruyNa;
        TextView tvYeuCauTruyNa;
        TextView tvMarine; // TextView cho chữ MARINE

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgBackgroundPoster = itemView.findViewById(R.id.imgBackgroundPoster);
            imgNhanDien = itemView.findViewById(R.id.imgNhanDien);
            tvTenHaiTac = itemView.findViewById(R.id.tvTenHaiTac);
            tvTienTruyNa = itemView.findViewById(R.id.tvTienTruyNa);
            tvYeuCauTruyNa = itemView.findViewById(R.id.tvYeuCauTruyNa);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // "Thổi phồng" (inflate) layout item_hai_tac.xml
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_hai_tac, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // Lấy đối tượng HaiTacModel tại vị trí hiện tại
        HaiTacModel currentHaiTac = mHaiTacList.get(position);

        // Gắn ảnh nhận diện (ảnh chân dung)
        // Glide sẽ giúp tải và hiển thị ảnh hiệu quả
        Glide.with(mContext)
                .load(currentHaiTac.getAnhNhanDien())
                .into(holder.imgNhanDien);

        // Gắn tên
        holder.tvTenHaiTac.setText(currentHaiTac.getTenHaiTac());

        // Gắn tiền truy nã (thêm ký hiệu tiền tệ)
        holder.tvTienTruyNa.setText("฿ " + currentHaiTac.getTienTruyNa() + "-");

        // Gắn yêu cầu truy nã (ALIVE hoặc DEAD OR ALIVE)
        if (currentHaiTac.isAlive()) {
            holder.tvYeuCauTruyNa.setText("ALIVE");
        } else {
            holder.tvYeuCauTruyNa.setText("DEAD OR ALIVE");
        }

        // Bạn có thể giữ chữ MARINE cố định hoặc thay đổi nếu cần
        // holder.tvMarine.setText("MARINE");
    }

    @Override
    public int getItemCount() {
        return mHaiTacList.size();
    }
}
