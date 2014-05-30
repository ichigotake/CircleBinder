package circlebinder.common.event;

import android.os.Parcel;
import android.os.Parcelable;

public class Block implements Parcelable {
    private final int id;
    private final Area area;
    private final String name;

    Block(BlockBuilder builder) {
        id = builder.id;
        area = builder.area;
        name = builder.name;
    }

    public int getId() {
        return id;
    }

    public Area getArea() {
        return area;
    }

    public String getName() {
        return name;
    }

    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeParcelable(this.area, 0);
        dest.writeString(this.name);
    }

    private Block(Parcel in) {
        this.id = in.readInt();
        this.area = in.readParcelable(Area.class.getClassLoader());
        this.name = in.readString();
    }

    public static Parcelable.Creator<Block> CREATOR = new Parcelable.Creator<Block>() {
        public Block createFromParcel(Parcel source) {
            return new Block(source);
        }

        public Block[] newArray(int size) {
            return new Block[size];
        }
    };

}
