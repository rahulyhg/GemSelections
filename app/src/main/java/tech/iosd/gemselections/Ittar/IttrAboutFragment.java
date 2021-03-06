package tech.iosd.gemselections.Ittar;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by anonymous on 19/6/17.
 */

public class IttrAboutFragment extends Fragment {

    private ImageView banner;
    private ScrollView view1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(tech.iosd.gemselections.R.layout.frag_ittr_about, container, false);

        view1 = (ScrollView)view.findViewById(tech.iosd.gemselections.R.id.scroll_ittar);
        view1.setBackground(getResources().getDrawable(tech.iosd.gemselections.R.drawable.back));

        banner = (ImageView)view.findViewById(tech.iosd.gemselections.R.id.ittar_banner1);
        InputStream is=null;
        try {
            is = getActivity().getAssets().open("logo/perf_logo.jpg");
        } catch (IOException e) {
            e.printStackTrace();
        }
        banner.setImageBitmap(BitmapFactory.decodeStream(is));
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
