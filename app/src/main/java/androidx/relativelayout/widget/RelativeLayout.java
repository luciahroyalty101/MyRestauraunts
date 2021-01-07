package androidx.relativelayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class RelativeLayout extends View {
    public RelativeLayout(Context context) {
        this(context, null);
    }

    public RelativeLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RelativeLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
}
