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

public class PersonalMFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.personal_m_fragment, container, false);


        ListView officalMListview = (ListView) rootView.findViewById(R.id.personalMListView);
        CustomAdapter adapter = new CustomAdapter(this.getActivity(), getPersonalMs());
        officalMListview.setAdapter(adapter);


        return rootView;
    }
    private ArrayList<officialM_used_mData> getPersonalMs() {

        ArrayList<officialM_used_mData> officialM = new ArrayList<>();

        officialM_used_mData  officialM_used_mData
                = new officialM_used_mData("유지현", "음료수 ", "3,000원");

        officialM.add(officialM_used_mData);

        /*officialM_used_mData  officialM_used_mData
                = new officialM_used_mData("최보윤", "음료수 ", "3,000원");

        officialM.add(officialM_used_mData);

        officialM_used_mData  officialM_used_mData2
                = new officialM_used_mData("김유빈", "아이스크림 ", "2,000원", "물", "1,700원");

        officialM.add(officialM_used_mData2);

        officialM_used_mData  officialM_used_mData3
                = new officialM_used_mData("안아영", "물", "1,700원");

        officialM.add(officialM_used_mData3);

        officialM_used_mData  officialM_used_mData4
                = new officialM_used_mData("유지현", "물티슈", "1,500원", "음료수", " 700원");

        officialM.add(officialM_used_mData4);
*/
        return  officialM;
    }

    @Override
    public String toString() {
        return "개인";
    }
}
