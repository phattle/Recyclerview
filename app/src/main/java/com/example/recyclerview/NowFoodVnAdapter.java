package com.example.recyclerview;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NowFoodVnAdapter extends RecyclerView.Adapter<NowFoodVnAdapter.NowFoodViewHolder>{

    //constructor : phuong thuc khoi tao
    List<NowFoodVn> mArrNowFoodVn;
    String mCategory = "";

    public NowFoodVnAdapter(List<NowFoodVn> mArrNowFoodVn) {
        this.mArrNowFoodVn = mArrNowFoodVn;
    }


    @NonNull
    @Override
    public NowFoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.layout_item_nowfood,parent,false);
        return new NowFoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NowFoodViewHolder holder, int position) {
        mCategory = "";
         NowFoodVn nowFoodVn =mArrNowFoodVn.get(position);

        if (nowFoodVn.getStatus()){
            holder.imgStatus.setImageResource(R.drawable.ic_status_online);
        }else{
            holder.imgStatus.setImageResource(R.drawable.ic_status_offline);
        }
        holder.imgNowFood.setImageResource(nowFoodVn.getImage());
        holder.txtName.setText(nowFoodVn.getName());
        if (nowFoodVn.getArrayAddress().length > 1){
            holder.txtAddress.setVisibility(View.VISIBLE);
            holder.txtDetailAddress.setVisibility(View.GONE);
            holder.txtAddress.setText(nowFoodVn.getArrayAddress().length + " địa điểm");
        }else{
            holder.txtDetailAddress.setVisibility(View.VISIBLE);
            holder.txtAddress.setVisibility(View.GONE);
            holder.txtDetailAddress.setText(nowFoodVn.getArrayAddress()[0]);
        }
        holder.txtMinPrice.setText("Tối thiểu " + nowFoodVn.getMinPrice() + "k");
        holder.txtPrice.setText("Giá " + nowFoodVn.getPrice() + "k");

        if (!nowFoodVn.getSaleOff().isEmpty()){
            holder.containerSaleOff.setVisibility(View.VISIBLE);
            holder.txtCategory.setVisibility(View.GONE);
            holder.txtSaleOff.setText(nowFoodVn.getSaleOff());
        }else{
            holder.txtCategory.setVisibility(View.VISIBLE);
            holder.containerSaleOff.setVisibility(View.GONE);
            for (int i = 0; i < nowFoodVn.getCategory().length; i++) {
                mCategory += nowFoodVn.getCategory()[i] + ", ";
            }
            mCategory = mCategory.substring(0 , mCategory.length() - 3);
            holder.txtCategory.setText(mCategory);
        }

    }

    @Override
    public int getItemCount() {
        if (mArrNowFoodVn == null){
            return 0;
        }else{
            return  mArrNowFoodVn.size();
        }
    }

    class NowFoodViewHolder extends RecyclerView.ViewHolder{
        ImageView imgStatus,imgNowFood;
        TextView txtName,txtAddress,txtDetailAddress,txtMinPrice,txtPrice,txtSaleOff,txtCategory;
        LinearLayout containerSaleOff;
        public NowFoodViewHolder(@NonNull View itemView) {
            super(itemView);

            imgStatus = itemView.findViewById(R.id.imageStatus);
            imgNowFood=itemView.findViewById(R.id.imageNowFood);
            txtName=itemView.findViewById(R.id.textViewName);
            txtAddress=itemView.findViewById(R.id.textViewAddress);
            txtDetailAddress=itemView.findViewById(R.id.textViewDetailAddress);
            txtMinPrice=itemView.findViewById(R.id.textViewMinPrice);
            txtPrice=itemView.findViewById(R.id.textViewPrice);
            txtSaleOff=itemView.findViewById(R.id.textViewSaleOff);
            txtCategory=itemView.findViewById(R.id.textViewCategory);
            containerSaleOff=itemView.findViewById(R.id.linearContainerSaleOff);


        }
    }
}
