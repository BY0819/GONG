package com.example.vmfld.gonggumi.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.vmfld.gonggumi.Adapter.CustomAdapter;
import com.example.vmfld.gonggumi.ApiData.officialM_used_mData;
import com.example.vmfld.gonggumi.R;

import java.util.ArrayList;

public class OfficialMFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.offical_m_fragment, container, false);


        ListView officalMListview = (ListView) rootView.findViewById(R.id.officialMListView);
        CustomAdapter adapter = new CustomAdapter(this.getActivity(), getOfficalMs());
        officalMListview.setAdapter(adapter);


        return rootView;
    }

    private ArrayList<officialM_used_mData> getOfficalMs() {

        ArrayList<officialM_used_mData> officialM = new ArrayList<>();

        officialM_used_mData  officialM_used_mData
                = new officialM_used_mData("12/14", "점심 : 낙곱새 ", "45,000원" );


        officialM.add(officialM_used_mData);

      /*  officialM_used_mData  officialM_used_mData
                = new officialM_used_mData("10/19", "박물관  티켓 ", "50,000원" ,  "점심: 라멘", "30,000원");

        officialM.add(officialM_used_mData);

        officialM_used_mData  officialM_used_mData2
                = new officialM_used_mData("10/20", "관람차 티켓 ", "25,000원");

        officialM.add(officialM_used_mData2);

        officialM_used_mData  officialM_used_mData3
                = new officialM_used_mData("10/21", "숙소 조식비", "40,000원", "점심 : 스시 ", "50,000원");

        officialM.add(officialM_used_mData3);

        officialM_used_mData  officialM_used_mData4
                = new officialM_used_mData("10/22", "버스 투어", "32,000원", "점심 : 우동 ", "20,000원");

        officialM.add(officialM_used_mData4);

        officialM_used_mData  officialM_used_mData5
                = new officialM_used_mData("10/23", "사진 촬영", "22,000원", "술 파티", "75,000원");

        officialM.add(officialM_used_mData5);

        officialM_used_mData  officialM_used_mData6
                = new officialM_used_mData("10/24", "전통 체험", "30,000원");

        officialM.add(officialM_used_mData6);
*/


        return  officialM;
    }

    @Override
    public String toString() {
        String title="공금";
        return title;
    }
}
