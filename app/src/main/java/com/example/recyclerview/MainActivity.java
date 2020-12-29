package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_item_nowfood);


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
          List<String> strings= new ArrayList<>();
//          Them du lieu
        strings.add("Teo");
        strings.add("Ti");
//          Cap nhat
        strings.set(0,"Tien");
//          Xoa
        strings.remove(0);
//         Lay gia phan tu
        Log.d("BBB",strings.get(0));
//        Lay kich thuoc mang
        Log.d("BBB",strings.size()+"");
    }
}

