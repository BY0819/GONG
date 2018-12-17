package com.example.vmfld.gonggumi.Activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.vmfld.gonggumi.Adapter.HistoryListAdapter;
import com.example.vmfld.gonggumi.ApiData.HistoryData;
import com.example.vmfld.gonggumi.ApiData.PublicInsertData;
import com.example.vmfld.gonggumi.ApiData.PublicTabData;
import com.example.vmfld.gonggumi.ApiData.PublicTabDetailData;
import com.example.vmfld.gonggumi.R;
import com.example.vmfld.gonggumi.interfaces.PublicTabApi;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HistoryActivity extends AppCompatActivity {


    int roomid ;
    int temp_check;
    List<HistoryData> publicInsertData = new ArrayList<>();
    List<PublicTabDetailData> publicTabDetailData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowTitleEnabled(false); // 커스텀 타이틀 사용으로 실제 타이틀 삭제
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // 뒤로가기 버튼 생성


        /** 넘어온 데이터 맞는지 확인 **/

        if(getIntent() != null){
            roomid = getIntent().getIntExtra("roomid", 0);
            temp_check = getIntent().getIntExtra("temp_check", 0);
            Log.e("RA에서 넘어온 roomid :" ,roomid+"");
        }



        /** Retrofit으로 통신하기 **/

        final ListView list_history =  (ListView) findViewById(R.id.list_history);
        list_history.setDivider(null);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(PublicTabApi.PublicTabURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        final PublicTabApi publicTabApi  = retrofit.create(PublicTabApi.class);

        Call<PublicTabData> call =  publicTabApi.postRoomid(roomid);

        call.enqueue(new Callback<PublicTabData>() {
            @Override
            public void onResponse(Call<PublicTabData> call, Response<PublicTabData> response) {
                PublicTabData publicTabData = response.body();
               // publicTabDetailData = response.body().detail;

                ArrayList<PublicTabDetailData> historyinput = new ArrayList<>();

                PublicTabDetailData publicTabDetailData = new PublicTabDetailData(-48000, "12-14");

                historyinput.add(publicTabDetailData);

              /*  PublicTabDetailData publicTabDetailData2 = new PublicTabDetailData(-25000, "10-20");

                historyinput.add(publicTabDetailData2);

                PublicTabDetailData publicTabDetailData3 = new PublicTabDetailData(-93000, "10-21");

                historyinput.add(publicTabDetailData3);

                PublicTabDetailData publicTabDetailData4 = new PublicTabDetailData(-55700, "10-22");

                historyinput.add(publicTabDetailData4);

                PublicTabDetailData publicTabDetailData5 = new PublicTabDetailData(-97000, "10-23");

                historyinput.add(publicTabDetailData5);

                PublicTabDetailData publicTabDetailData6 = new PublicTabDetailData(-32200, "10-24");

                historyinput.add(publicTabDetailData6);
*/
            if(temp_check != 0){
                list_history.setAdapter(new HistoryListAdapter(getApplicationContext(), historyinput));
            }



                Log.e("RA_통신 값 :", response.code() + "");
                // Log.e("RA_잘 들어왔나 확인 : ", publicTabDetailData.get().getMemo() + "");

                Integer nowTotal = publicTabData.getPublicMoneyprice();
                Log.e("RA_총금액 : ",  nowTotal+"");

                //list_history.setAdapter(new HistoryListAdapter(getApplicationContext(), publicTabDetailData ));

            }

            @Override
            public void onFailure(Call<PublicTabData> call, Throwable t) {
                Log.e("에러 발생 : ", t.getMessage());
            }
        });

    }

    @Override
    public void onBackPressed() {
        //Toast.makeText(this,"사용 내역 입력을 취소하셨습니다.", Toast.LENGTH_SHORT).show();
        super.onBackPressed();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:{
                //Toast.makeText(this,"사용 내역 입력을 취소하셨습니다.", Toast.LENGTH_SHORT).show();
                finish();
                return true;
            }
        }

        return super.onOptionsItemSelected(item);
    }


}
