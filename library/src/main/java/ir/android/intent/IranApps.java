package ir.android.intent;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

public class IranApps {
    private static String MARKET_NAME = "ایران‌اپس";
    private static String MARKET_PACKAGE = "ir.tgbs.android.iranapp";
    public static void Details (Context context, String packageName) {
        try {
            Intent intentMarket = new Intent(Intent.ACTION_VIEW);
            intentMarket.setPackage(MARKET_PACKAGE);
            intentMarket.setData(Uri.parse("iranapps://app/" + packageName));
            intentMarket.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intentMarket);
        } catch (Exception e) {
            Toast.makeText(context, String.format(context.getResources().getString(R.string.market_not_found), MARKET_NAME), Toast.LENGTH_SHORT).show();
        }
    }
    public static void Developer (final Context context, final String userName) {
        try {
            Intent intentMarket = new Intent(Intent.ACTION_VIEW);
            intentMarket.setPackage(MARKET_PACKAGE);
            intentMarket.setData(Uri.parse("iranapps://user/" + userName));
            intentMarket.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intentMarket);
        } catch (Exception e) {
            Toast.makeText(context, String.format(context.getResources().getString(R.string.market_not_found), MARKET_NAME), Toast.LENGTH_SHORT).show();
        }
    }
    public static void Comment (final Context context, final String packageName) {
        try {
            Intent intentMarket = new Intent(Intent.ACTION_VIEW);
            intentMarket.setPackage(MARKET_PACKAGE);
            intentMarket.setData(Uri.parse("iranapps://app/" + packageName + "?a=comment&r=5"));
            intentMarket.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intentMarket);
        } catch (Exception e) {
            Toast.makeText(context, String.format(context.getResources().getString(R.string.market_not_found), MARKET_NAME), Toast.LENGTH_SHORT).show();
        }
    }
    public static void Category (final Context context, final String categoryName) {
        try {
            Intent intentMarket = new Intent(Intent.ACTION_VIEW);
            intentMarket.setPackage(MARKET_PACKAGE);
            intentMarket.setData(Uri.parse("iranapps://category/" + categoryName));
            intentMarket.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intentMarket);
        } catch (Exception e) {
            Toast.makeText(context, String.format(context.getResources().getString(R.string.market_not_found), MARKET_NAME), Toast.LENGTH_SHORT).show();
        }
    }
    public static void Search (final Context context, final String query) {
        try {
            Intent intentMarket = new Intent(Intent.ACTION_VIEW);
            intentMarket.setPackage(MARKET_PACKAGE);
            intentMarket.setData(Uri.parse("iranapps://search/" + query));
            intentMarket.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intentMarket);
        } catch (Exception e) {
            Toast.makeText(context, String.format(context.getResources().getString(R.string.market_not_found), MARKET_NAME), Toast.LENGTH_SHORT).show();
        }
    }
}