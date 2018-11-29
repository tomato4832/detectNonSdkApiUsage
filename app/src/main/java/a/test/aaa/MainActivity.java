package a.test.aaa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();

        //try {
        //    //测试dark grey list
        //    test();
        //} catch (Exception e) {
        //    e.printStackTrace();
        //}
    }

    ///**
    // * 测试使用dark greylist中的API
    // *
    // * @throws Exception
    // */
    //private void test() throws Exception {
    //    Class c = Class.forName("android.util.MathUtils");
    //    Method m = c.getDeclaredMethod("dist", Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE);
    //    Object o = m.invoke(null, 0, 0, 4, 2);
    //    Log.i("test", "O=" + o);
    //}
}
