package net.ichigotake.circlebinder.common;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * アプリ内データのローカルストレージ
 */
public final class AppStorage {

    private final SharedPreferences pref;
    private final Context context;

    public AppStorage(Context context) {
        this.context = context;
        this.pref = context.getSharedPreferences(
                context.getString(R.string.circlebinder_pref_app_storage), Context.MODE_PRIVATE);
    }

    public boolean isInitialized() {
        return pref.getBoolean(context.getString(R.string.circlebinder_pref_app_storage_is_initialize), false);
    }

    public void setInitialized(boolean complete) {
        pref.edit()
                .putBoolean(context.getString(R.string.circlebinder_pref_app_storage_is_initialize), complete)
                .commit();
    }
}