package circlebinder.common.circle;

import net.ichigotake.common.widget.CursorAdapter;
import net.ichigotake.common.widget.CursorAdapterParameter;

import circlebinder.common.event.Circle;

public final class CircleAdapter extends CursorAdapter<Circle, CircleViewHolder> {

    public CircleAdapter(CursorAdapterParameter<Circle, CircleViewHolder> parameter) {
        super(parameter);
    }
}
