package splashscreen.com.example.mitchel.splashscreen;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends Activity {

    EditText displ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displ = (EditText) findViewById(R.id.txt_tlphone);

    }

    public void onClick(View view){
        Editable str = displ.getText();

        switch(view.getId()){
            case R.id.one:
                displ.setText(str + "1");
                break;
            case R.id.two:
                displ.setText(str + "2");
                break;
            case R.id.three:
                displ.setText(str + "3"); 
                break;
            case R.id.four:
                displ.setText(str + "4");
                break;
            case R.id.five:
                displ.setText(str + "5");
                break;
            case R.id.six:
                displ.setText(str + "6");
                break;
            case R.id.seven:
                displ.setText(str + "7");
                break;
            case R.id.eight:
                displ.setText(str + "8");
                break;
            case R.id.nine:
                displ.setText(str + "9");
                break;
            case R.id.zero:
                displ.setText(str + "0");
                break;
            case R.id.wisnumber:
                if(str.toString().length() > 0){
                    StringBuilder strb = new StringBuilder(str.toString());
                    strb.deleteCharAt(str.toString().length()-1);
                    String tekst = strb.toString();
                    displ.setText(tekst);
                }
                break;
        }
    }

 public void onClickCheckNumber(View view){

 }

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
}
