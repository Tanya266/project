package Activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.home.Add_Room;
import com.example.home.R;

import java.util.List;

public class AddRoomAdapter extends RecyclerView.Adapter <AddRoomAdapter.ViewHolder> {

    private List <AddRoom> rooms;
    public LayoutInflater inflater;

    public AddRoomAdapter(Add_Room context, List<AddRoom> rooms) {
        this.rooms = rooms;
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public AddRoomAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_list,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AddRoomAdapter.ViewHolder holder, int position) {
        AddRoom room = rooms.get(position);
        holder.tv_name.setText(room.getTv_name());
        holder.im_ic.setImageResource(room.getIm_ic());
    }

    @Override
    public int getItemCount() {
        return rooms.size();
    }

    public class ViewHolder extends  RecyclerView.ViewHolder {
        TextView tv_name;
        ImageView im_ic;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_name = itemView.findViewById(R.id.tv_name);
            im_ic = itemView.findViewById(R.id.im_ic);
        }
    }
}
