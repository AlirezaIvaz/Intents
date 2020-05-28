package ir.android.intent;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

public class Jhoobin {
    private static String MARKET_NAME = "چارخونه";
    public static void Details (Context context, String type, String appId) {
        try {
            Uri uri = Uri.parse("jhoobin://" + type + "?uuidString=" + appId);
            Intent intentMarket = new Intent(Intent.ACTION_VIEW, uri);
            intentMarket.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intentMarket);
        } catch (Exception e) {
            Toast.makeText(context, String.format(context.getResources().getString(R.string.market_not_found), MARKET_NAME), Toast.LENGTH_SHORT).show();
        }
    }
    public static void DetailsByPackage (Context context, String packageName) {
        try {
            Uri uri = Uri.parse("jhoobin://search?q=" + packageName);
            Intent intentMarket = new Intent(Intent.ACTION_VIEW, uri);
            intentMarket.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intentMarket);
        } catch (Exception e) {
            Toast.makeText(context, String.format(context.getResources().getString(R.string.market_not_found), MARKET_NAME), Toast.LENGTH_SHORT).show();
        }
    }
    public static void Comment (Context context, String type, String appId) {
        try {
            Uri uri = Uri.parse("jhoobin://comment/" + type + "/" + appId);
            Intent intentMarket = new Intent(Intent.ACTION_VIEW, uri);
            intentMarket.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intentMarket);
        } catch (Exception e) {
            Toast.makeText(context, String.format(context.getResources().getString(R.string.market_not_found), MARKET_NAME), Toast.LENGTH_SHORT).show();
        }
    }
    public static void CommentByPackage (Context context, String packageName) {
        try {
            Uri uri = Uri.parse("jhoobin://comment?q=" + packageName);
            Intent intentMarket = new Intent(Intent.ACTION_VIEW, uri);
            intentMarket.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intentMarket);
        } catch (Exception e) {
            Toast.makeText(context, String.format(context.getResources().getString(R.string.market_not_found), MARKET_NAME), Toast.LENGTH_SHORT).show();
        }
    }
    public static void Support (Context context, String type, String appId) {
        try {
            Uri uri = Uri.parse("jhoobin://support/" + type + "/" + appId);
            Intent intentMarket = new Intent(Intent.ACTION_VIEW, uri);
            intentMarket.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intentMarket);
        } catch (Exception e) {
            Toast.makeText(context, String.format(context.getResources().getString(R.string.market_not_found), MARKET_NAME), Toast.LENGTH_SHORT).show();
        }
    }
    public static void SupportByPackage (Context context, String packageName) {
        try {
            Uri uri = Uri.parse("jhoobin://support?q=" + packageName);
            Intent intentMarket = new Intent(Intent.ACTION_VIEW, uri);
            intentMarket.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intentMarket);
        } catch (Exception e) {
            Toast.makeText(context, String.format(context.getResources().getString(R.string.market_not_found), MARKET_NAME), Toast.LENGTH_SHORT).show();
        }
    }
    public static void Developer (Context context, String type, String collectionId) {
        try {
            Uri uri = Uri.parse("jhoobin://collection?type=" + type + "&id=" + collectionId);
            Intent intentMarket = new Intent(Intent.ACTION_VIEW, uri);
            intentMarket.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intentMarket);
        } catch (Exception e) {
            Toast.makeText(context, String.format(context.getResources().getString(R.string.market_not_found), MARKET_NAME), Toast.LENGTH_SHORT).show();
        }
    }
}