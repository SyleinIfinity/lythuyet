package ltdd.lt.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide; // <-- Vẫn dùng Glide như code Hero của bạn
import java.util.ArrayList;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.ViewHolder> {

    private Context mContext;
    private ArrayList<Student> mStudentList;

    public StudentAdapter(Context mContext, ArrayList<Student> mStudentList) {
        this.mContext = mContext;
        this.mStudentList = mStudentList;
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        // Khai báo các View có trong row_student.xml
        private ImageView mImageAvatar;
        private TextView mTextHoTen;
        private TextView mTextMaSV;
        private TextView mTextLop;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            // Ánh xạ các View
            mImageAvatar = itemView.findViewById(R.id.image_avatar);
            mTextHoTen = itemView.findViewById(R.id.text_ho_ten);
            mTextMaSV = itemView.findViewById(R.id.text_ma_sv);
            mTextLop = itemView.findViewById(R.id.text_lop);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        // Inflate layout R.layout.row_student
        View studentView = inflater.inflate(R.layout.row_student, parent, false);
        ViewHolder viewHolder = new ViewHolder(studentView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Student currentStudent = mStudentList.get(position);

        String hoTen = currentStudent.getHo() + " " + currentStudent.getTen();

        Glide.with(mContext)
                .load(currentStudent.getAnhDaiDien())
                .into(holder.mImageAvatar);

        holder.mTextHoTen.setText(hoTen);
        holder.mTextMaSV.setText("Mã SV: " + currentStudent.getMaSV());
        holder.mTextLop.setText("Lớp: " + currentStudent.getLop());
    }

    @Override
    public int getItemCount() {
        return (mStudentList != null) ? mStudentList.size() : 0;
    }
}