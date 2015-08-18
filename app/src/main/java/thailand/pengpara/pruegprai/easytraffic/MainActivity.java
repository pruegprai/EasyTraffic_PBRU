package thailand.pengpara.pruegprai.easytraffic;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickAboutMe(View view)
    {
        Intent objIntent = new Intent(Intent.ACTION_VIEW);
        objIntent.setData(Uri.parse("http://andriothai.in.th/about-me.html"));
        startActivity(objIntent);
    } //click♂
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    private void createListView(){
        MyData objMyData=new MyData();
        int[] intIcon=objMyData.icon();
        String[] strTitle=objMyData.title();
        MyAdapter objMyAdapter=new MyAdapter(MainActivity.this, intIcon,strTitle);
        ListView myListView=(ListView) findViewById(R.id.listView);
        myListView.setAdapter(objMyAdapter);


    }
}
