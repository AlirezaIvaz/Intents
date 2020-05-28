package ir.android.intent;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

public class Myket {
    private static String MARKET_NAME = "مایکت";
    public static void Details (Context context, String packageName) {
        try {
            Uri uri = Uri.parse("myket://details?id=" + packageName);
            Intent intentMarket = new Intent(Intent.ACTION_VIEW, uri);
            intentMarket.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intentMarket);
        } catch (Exception e) {
            Toast.makeText(context, String.format(context.getResources().getString(R.string.market_not_found), MARKET_NAME), Toast.LENGTH_SHORT).show();
        }
    }
    public static void Developer (Context context, String packageName) {
        try {
            Uri uri = Uri.parse("myket://developer/" + packageName);
            Intent intentMarket = new Intent(Intent.ACTION_VIEW, uri);
            intentMarket.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intentMarket);
        } catch (Exception e) {
            Toast.makeText(context, String.format(context.getResources().getString(R.string.market_not_found), MARKET_NAME), Toast.LENGTH_SHORT).show();
        }
    }
    public static void Comment (Context context, String packageName) {
        try {
            Uri uri = Uri.parse("myket://comment?id=" + packageName);
            Intent intentMarket = new Intent(Intent.ACTION_VIEW, uri);
            intentMarket.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intentMarket);
        } catch (Exception e) {
            Toast.makeText(context, String.format(context.getResources().getString(R.string.market_not_found), MARKET_NAME), Toast.LENGTH_SHORT).show();
        }
    }
    public static void Download (Context context, String packageName) {
        try {
            Uri uri = Uri.parse("myket://download/" + packageName);
            Intent intentMarket = new Intent(Intent.ACTION_VIEW, uri);
            intentMarket.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intentMarket);
        } catch (Exception e) {
            Toast.makeText(context, String.format(context.getResources().getString(R.string.market_not_found), MARKET_NAME), Toast.LENGTH_SHORT).show();
        }
    }
    public static void Video (Context context, String packageName) {
        try {
            Uri uri = Uri.parse("myket://video?id=" + packageName);
            Intent intentMarket = new Intent(Intent.ACTION_VIEW, uri);
            intentMarket.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intentMarket);
        } catch (Exception e) {
            Toast.makeText(context, String.format(context.getResources().getString(R.string.market_not_found), MARKET_NAME), Toast.LENGTH_SHORT).show();
        }
    }
}