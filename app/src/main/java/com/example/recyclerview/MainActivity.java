package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRcvNowFoodVn;
    List<NowFoodVn> mArrNowFoodVns;
    NowFoodVnAdapter mNowFoodVnAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRcvNowFoodVn = findViewById(R.id.recycleNowVn);

        mArrNowFoodVns = NowFoodVn.getMock();
//        mRcvNowFoodVn.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        mNowFoodVnAdapter = new NowFoodVnAdapter(mArrNowFoodVns);
        mRcvNowFoodVn.addItemDecoration(new DividerItemDecoration(this , DividerItemDecoration.VERTICAL));
        mRcvNowFoodVn.setAdapter(mNowFoodVnAdapter);

//        mArrNowFoodVns = new ArrayList<>();
//data mock : data giả

//        mArrNowFoodVns.add(new NowFoodVn(true, R.drawable.highland, "Sữa Chua Trân Châu Hạ Long HCM", new String[64], 20, 37,"FREE SHIP", new String[0]));
//        mArrNowFoodVns.add(new NowFoodVn(true, R.drawable.hamberger, "HAMBERGER", new String[]{"33 Lương Hưu Khánh, Quận 1, TPHCM"}, 20, 60,"", new String[]{"QUÁN ĂN","ĂN VẶT/VỈA HÈ"}));
//        mArrNowFoodVns.add(new NowFoodVn(true, R.drawable.Cheese, "Cheese coffee", new String[6], 20, 54,"MÃ GIẢM GIÁ 30K", new String[0]));
//        mArrNowFoodVns.add(new NowFoodVn(true, R.drawable.milk, "TRÀ SỮA", new String[8], 20, 33,"DEAL 12K", new String[0]));
//        mArrNowFoodVns.add(new NowFoodVn(true, R.drawable.rauma, "RAU MÁ MIX", new String[]{"174/73 Nguyễn Thiện Thuật, P.3, Quận 3, TPHCM"}, 20, 57,"", new String[]{"ĂN VẶT/VỈA HÈ"}));

        // Array : Dang mang Array
    // Cach 1: Khoi tao va gan gia tri
//                            0 , 1 ,2
//        String[] arrNames = {"Teo","Ti","Tun"};
//        arrNames[0] = "Tien";
//        Log.d("BBB",arrNames[0]);
//        Cach 2 : Khoi tao kich thuoc
//        String[] arrNames2 = new String[2];
//        Log.d("BBB",arrNames2[0] +"");
    // Collection : Dang mang theo nhom cau truc collection

//        ArrayList<String> stringArrayList = new ArrayList<>();
//          List<String> strings= new ArrayList<>();
//          Them du lieu
//        strings.add("Teo");
//        strings.add("Ti");
//          Cap nhat
//        strings.set(0,"Tien");
//          Xoa
//        strings.remove(0);
//         Lay gia phan tu
//        Log.d("BBB",strings.get(0));
//        Lay kich thuoc mang
//        Log.d("BBB",strings.size()+"");

        // data mock : data giả
    }
}

