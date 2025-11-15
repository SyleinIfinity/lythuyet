package ltdd.lt.bai11; // Thay đổi package

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
// ... (các import khác)
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import java.util.ArrayList;

public class HaiTacAdapter extends RecyclerView.Adapter<HaiTacViewHolder> {

    private Context mContext;
    private ArrayList<HaiTacModel> mHaiTacList;
    private HaiTacListener mListener;

    public HaiTacAdapter(Context context, ArrayList<HaiTacModel> haiTacList, HaiTacListener listener) {
        this.mContext = context;
        this.mHaiTacList = haiTacList;
        this.mListener = listener;
    }

    @NonNull
    @Override
    public HaiTacViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_hai_tac, parent, false);
        return new HaiTacViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HaiTacViewHolder holder, int position) {
        HaiTacModel currentHaiTac = mHaiTacList.get(position);

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

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mListener != null) {
                    mListener.onHaiTacClick(currentHaiTac);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mHaiTacList.size();
    }
}