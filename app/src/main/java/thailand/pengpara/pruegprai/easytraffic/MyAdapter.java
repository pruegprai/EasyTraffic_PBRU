package thailand.pengpara.pruegprai.easytraffic;

import android.content.Context;
import android.media.Image;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import thailand.pengpara.pruegprai.easytraffic.R;

/**
 * Created by forest on 17/8/2558.
 */
public class MyAdapter  extends BaseAdapter{
    private Context objContext;
    private int[] trafficInts;
    private String[] trafficStrings;

    public MyAdapter(Context objContext, int[] trafficInts, int[] trafficInts1, String[] trafficStrings) {
        this.objContext = objContext;
        this.trafficInts = trafficInts1;
        this.trafficStrings = trafficStrings;
    }

    @Override
    public int getCount() {
        return trafficStrings.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater objLayoutInflater =(LayoutInflater)objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1=objLayoutInflater.inflate(R.layout.my_listview, viewGroup, false);
        ImageView iconImageView=(ImageView) view1.findViewById(R.id.imvShowIcon);
        iconImageView.setBackgroundResource(trafficInts[i]);

        TextView titleTextView=(TextView) view1.findViewById(R.id.txtShowTitle);
        titleTextView.setText(trafficStrings[i]);

        return view1;
    }
}

