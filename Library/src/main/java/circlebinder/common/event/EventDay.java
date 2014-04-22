package circlebinder.common.event;

import android.os.Parcel;
import android.os.Parcelable;

public final class EventDay implements Parcelable {

    public static class Builder {

        private String name;

        public EventDay build() {
            return new EventDay(this);
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }
    }

    private final String name;

    public EventDay(Builder builder) {
        name = builder.name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
    }

    private EventDay(Parcel in) {
        this.name = in.readString();
    }

    public static Creator<EventDay> CREATOR = new Creator<EventDay>() {
        public EventDay createFromParcel(Parcel source) {
            return new EventDay(source);
        }

        public EventDay[] newArray(int size) {
            return new EventDay[size];
        }
    };

}
