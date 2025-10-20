package com.haha.appforrenderdoc;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    
    private ListView listView;
    private List<String> itemList;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // 初始化ListView
        listView = findViewById(R.id.listView);
        
        // 生成1000个模拟数据
        itemList = generateMockData();
        
        // 创建适配器并设置到ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, 
            android.R.layout.simple_list_item_1, itemList);
        listView.setAdapter(adapter);
    }
    
    private List<String> generateMockData() {
        List<String> data = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            data.add("Item " + i + " - it is " + i + " demo data");
        }
        return data;
    }
}