package ir.android.intent;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

public class CafeBazaar {
    private static String MARKET_NAME = "کافه‌بازار";
    private static String MARKET_PACKAGE = "com.farsitel.bazaar";
    public static void Details (Context context, String packageName) {
        try {
            Intent intentMarket = new Intent(Intent.ACTION_VIEW);
            intentMarket.setData(Uri.parse("bazaar://details?id=" + packageName));
            intentMarket.setPackage(MARKET_PACKAGE);
            intentMarket.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intentMarket);
        } catch (Exception e) {
            Toast.makeText(context, String.format(context.getResources().getString(R.string.market_not_found), MARKET_NAME), Toast.LENGTH_SHORT).show();
        }
    }
    public static void Developer (Context context, String developerId) {
        try {
            Intent intentMarket = new Intent(Intent.ACTION_VIEW);
            intentMarket.setData(Uri.parse("bazaar://collection?slug=by_author&aid=" + developerId));
            intentMarket.setPackage(MARKET_PACKAGE);
            intentMarket.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intentMarket);
        } catch (Exception e) {
            Toast.makeText(context, String.format(context.getResources().getString(R.string.market_not_found), MARKET_NAME), Toast.LENGTH_SHORT).show();
        }
    }
    public static void Comment (Context context, String packageName) {
        try {
            Intent intentMarket = new Intent(Intent.ACTION_EDIT);
            intentMarket.setData(Uri.parse("bazaar://details?id=" + packageName));
            intentMarket.setPackage(MARKET_PACKAGE);
            intentMarket.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intentMarket);
        } catch (Exception e) {
            Toast.makeText(context, String.format(context.getResources().getString(R.string.market_not_found), MARKET_NAME), Toast.LENGTH_SHORT).show();
        }
    }
    public static void UserPage (Context context) {
        try {
            Intent intentMarket = new Intent(Intent.ACTION_VIEW);
            intentMarket.setData(Uri.parse("bazaar://login"));
            intentMarket.setPackage(MARKET_PACKAGE);
            intentMarket.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intentMarket);
        } catch (Exception e) {
            Toast.makeText(context, String.format(context.getResources().getString(R.string.market_not_found), MARKET_NAME), Toast.LENGTH_SHORT).show();
        }
    }
}