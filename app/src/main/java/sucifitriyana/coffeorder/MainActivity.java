package sucifitriyana.coffeorder;

import android.icu.text.NumberFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.R.id.message;

public class MainActivity extends AppCompatActivity {
    int quantity=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //method ini dipakai ketika button order ditekan
    public void Order(View view){
        String harga="Total : Rp."+(quantity*10000);
        tampilPesan(harga);
    }
    //method untuk button tambah
    public void tambah(View view){
        quantity++;
        tampil(quantity);
    }
    //method untuk button kurang
    public void kurang(View view){
        quantity--;
        tampil(quantity);
    }
    //method tampilkan harga
    private void tampilHarga(int number){
        TextView tvRp = (TextView)findViewById(R.id.tvRp);
        tvRp.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    //method tampil pesan
    private void tampilPesan(String message){
        TextView tvRp = (TextView)findViewById(R.id.tvRp);
        tvRp.setText(message);
    }
    private void tampil(int number){
        TextView tvQuantity = (TextView)findViewById(R.id.tv_quantity);
        tvQuantity.setText(" "+number);
    }
}
