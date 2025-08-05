package org.love2d.android;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import org.love2d.android.databinding.MainBinding;

public class Main extends Activity {
    
    MainBinding binding;
    
    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        binding = MainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); 
        
        /*
            Context context = v.getContext();
            Intent intent = new Intent(context, GameActivity.class);
            intent.setData(Uri.fromFile(file));
            context.startActivity(intent);
        */
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        binding = null;
        // TODO: Implement this method
    }
    
}
