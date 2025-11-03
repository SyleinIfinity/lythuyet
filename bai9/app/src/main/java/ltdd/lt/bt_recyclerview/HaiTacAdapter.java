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

public class HaiTacAdapter extends RecyclerView.Adapter<HaiTacViewHolder> {

    private Context mContext;
    private ArrayList<HaiTacModel> mHaiTacList;
    private HaiTacListener mListener; // SỬA ĐỔI 2: Thêm biến Listener

    // SỬA ĐỔI 3: Thêm Listener vào constructor
    public HaiTacAdapter(Context context, ArrayList<HaiTacModel> haiTacList, HaiTacListener listener) {
        this.mContext = context;
        this.mHaiTacList = haiTacList;
        this.mListener = listener; // Gán listener
    }

    // SỬA ĐỔI 4: Không còn lớp ViewHolder ở đây

    @NonNull
    @Override
    public HaiTacViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_hai_tac, parent, false);
        // Trả về đối tượng ViewHolder đã tách riêng
        return new HaiTacViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HaiTacViewHolder holder, int position) {
        // Lấy đối tượng HaiTacModel
        HaiTacModel currentHaiTac = mHaiTacList.get(position);

        // --- Gắn dữ liệu (như cũ) ---
        Glide.with(mContext)
                .load(currentHaiTac.getAnhNhanDien())
                .into(holder.imgNhanDien);

        holder.tvTenHaiTac.setText(currentHaiTac.getTenHaiTac());
        holder.tvTienTruyNa.setText("฿ " + currentHaiTac.getTienTruyNa() + "-");

        if (currentHaiTac.isAlive()) {
            holder.tvYeuCauTruyNa.setText("ALIVE");
        } else {
            holder.tvYeuCauTruyNa.setText("DEAD OR ALIVE");
        }

        // SỬA ĐỔI 5: Thêm sự kiện click
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Kiểm tra listener không null trước khi gọi
                if (mListener != null) {
                    mListener.onHaiTacClick(currentHaiTac); // Gọi phương thức của interface
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mHaiTacList.size();
    }
}
