package com.crisalida.codx;
import static org.junit.Assert.*;
import android.content.Context;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(sdk=34)
public class MainActivityTest {
 @Test public void loginScreenOpens(){ MainActivity a=Robolectric.buildActivity(MainActivity.class).create().start().resume().get(); assertNotNull(a.getWindow()); }
 @Test public void authenticatedHomeOpens(){ Context c=org.robolectric.RuntimeEnvironment.getApplication(); c.getSharedPreferences("account",0).edit().clear().putBoolean("logged",true).putString("name","teste").apply(); MainActivity a=Robolectric.buildActivity(MainActivity.class).create().start().resume().get(); assertNotNull(a.getWindow()); }
}
