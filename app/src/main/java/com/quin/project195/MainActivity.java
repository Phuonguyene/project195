package com.quin.project195;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageView imgEmployee;
    TextView txtEmployee;

    ImageView imgCustomer;
    TextView txtCustomer;

    ImageView imgProduct;
    TextView txtProduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        addViews();
        addEvents();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void addEvents() {
        imgEmployee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //gọi code mở màn hình quản trị Nhân sự
                openEmployeeManagementActivity();
            }
        });
        txtEmployee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //gọi code mở màn hình quản trị nhân sự
                openEmployeeManagementActivity();
            }
        });
        imgCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCustomerManagementActivity();
            }
        });
        txtCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCustomerManagementActivity();
            }
        });
        imgProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openProductManagementActivity();
            }
        });
        txtProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openProductManagementActivity();
            }
        });
    }

    private void openProductManagementActivity() {
        Intent intent=new Intent(MainActivity.this, ProductManagementActivity.class);
        startActivity(intent);
    }

    private void addViews() {
        imgEmployee=findViewById(R.id.imgEmployee);
        txtEmployee=findViewById(R.id.txtEmployee);
        imgCustomer=findViewById(R.id.imgCustomer);
        txtCustomer=findViewById(R.id.txtCustomer);
        imgProduct=findViewById(R.id.imgProduct);
        txtProduct=findViewById(R.id.txtProduct);
    }
    private void openEmployeeManagementActivity()
    {
        Intent intent=new Intent(MainActivity.this, EmployeeManagementActivity.class);
        startActivity(intent);
    }
    private void openCustomerManagementActivity()
    {
        Intent intent=new Intent(MainActivity.this, CustomerManagementActivity.class);
        startActivity(intent);
    }
}