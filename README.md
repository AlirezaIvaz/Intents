# Intents &nbsp;&nbsp;[![](https://jitpack.io/v/ir.alirezaivaz/intents.svg)](https://jitpack.io/#ir.alirezaivaz/intents)
An easy way for using markets intents!
## Supported Markets

 - CafeBazaar
 - Myket
 - Jhoobin Markets
	 - Charkhoneh
	 - Parshub
 - IranApps
 - Future
	 - Google Play

## How to use
### Implement library
1. Add [JitPack](https://jitpack.io/) to your build file
```gradle
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
```

2. Add the gradle dependency
```gradle
dependencies {
  implementation 'ir.alirezaivaz:intents:1.2'
}
```
---
### CafeBazaar
#### Display app details
```java
CafeBazaar.Details(Context context, String  packageName);
```
Example:
```java
CafeBazaar.Details (MainActivity.this, "com.example.app");
```
> **Warning:** This intent some times not works correct
#### Display list of developer apps
```java
CafeBazaar.Developer(Context context, String developerId);
```
Example:
```java
CafeBazaar.Developer(MainActivity.this, "alirezaivaz");
```
> **Notice:** You can get your developer id in CafeBazaar developers panel. More details are in  [my website](https://alirezaivaz.ir/).
#### Open comment dialog for rating
```java
CafeBazaar.Comment(Context context, String packageName);
```
Example:
```java
CafeBazaar.Comment(MainActivity.this, "com.example.app");
```
#### Open user page
```java
CafeBazaar.UserPage(Context context);
```
Example:
```java
CafeBazaar.UserPage(MainActivity.this);
```
---
### Myket
#### Display app details
```java
Myket.Details(Context context, String packageName);
```
Example:
```java
Myket.Details(MainActivity.this, "com.example.app");
```
#### Display list of developer apps
```java
Myket.Developer(Context context, String packageName);
```
Example:
```java
Myket.Developer(MainActivity.this, "com.example.app");
```
#### Open comment dialog for rating
```java
Myket.Comment(Context context, String packageName);
```
Example:
```java
Myket.Comment(MainActivity.this, "com.example.app");
```
#### Download an application
```java
Myket.Download(Context context, String packageName);
```
Example:
```java
Myket.Download(MainActivity.this, "com.example.app");
```
#### Display video of application
> **Warning:** This intent has been deprecated and will be removed in the next update

```java
Myket.Video(Context context, String packageName);
```
Example:
```java
Myket.Video(MainActivity.this, "com.example.app");
```
---
### Jhoobin Markets
If you release your app in Charkhoneh and Parshub at onetime, you can use this methods. In this method, if one of Charkhone or Parshub markets is installed, open intents and works.
#### Display app details
**By application id:**
```java
Jhoobin.Details(Context context, String type, String appId);
```
Example:
```java
Jhoobin.Details(MainActivity.this, "APP", "1");
```
> **Notice:** You can get your ApplicationId id in [Jhoobin Markets developers panel](https://seller.jhoobin.com/).

**By package name:**
```java
Jhoobin.DetailsByPackage(Context context, String packageName);
```
Example:
```java
Jhoobin.DetailsByPackage(MainActivity.this, "com.example.app");
```
#### Open comment dialog for rating
**By application id:**
```java
Jhoobin.Comment(Context context, String type, String appId);
```
Example:
```java
Jhoobin.Comment(MainActivity.this, "APP", "1");
```
**By package name:**
```java
Jhoobin.CommentByPackage(Context context, String packageName);
```
Example:
```java
Jhoobin.CommentByPackage(MainActivity.this, "com.example.app");
```
#### Open support section
**By application id:**
```java
Jhoobin.Support(Context context, String type, String appId);
```
Example:
```java
Jhoobin.Support(MainActivity.this, "APP", "1");
```
**By package name:**
```java
Jhoobin.SupportByPackage(Context context, String packageName);
```
Example:
```java
Jhoobin.SupportByPackage(MainActivity.this, "com.example.app");
```
#### Display list of collection
```java
Jhoobin.Developer(Context context, String type, String collectionId);
```
Example:
```java
Jhoobin.Developer(MainActivity.this, "APP", "27501");
```
> **Notice:** You can get your CollectionId id in [Jhoobin Markets developers panel](https://seller.jhoobin.com/).
---
### Charkhoneh
If you release your app only in Charkhoneh, you can use this methods. If you release your app in Charkhoneh and Parshub markets at onetime, I recommend to use Jhoobin Markets method at top.
#### Display app details
**By application id:**
```java
Charkhoneh.Details(Context context, String type, String appId);
```
Example:
```java
Charkhoneh.Details(MainActivity.this, "APP", "1");
```
> **Notice:** You can get your ApplicationId id in [Charkhoneh developers panel](https://seller.charkhoneh.com/).

**By package name:**
```java
Charkhoneh.DetailsByPackage(Context context, String packageName);
```
Example:
```java
Charkhoneh.DetailsByPackage(MainActivity.this, "com.example.app");
```
#### Open comment dialog for rating
**By application id:**
```java
Charkhoneh.Comment(Context context, String type, String appId);
```
Example:
```java
Charkhoneh.Comment(MainActivity.this, "APP", "1");
```
**By package name:**
```java
Charkhoneh.CommentByPackage(Context context, String packageName);
```
Example:
```java
Charkhoneh.CommentByPackage(MainActivity.this, "com.example.app");
```
#### Open support section
**By application id:**
```java
Charkhoneh.Support(Context context, String type, String appId);
```
Example:
```java
Charkhoneh.Support(MainActivity.this, "APP", "1");
```
**By package name:**
```java
Charkhoneh.SupportByPackage(Context context, String packageName);
```
Example:
```java
Charkhoneh.SupportByPackage(MainActivity.this, "com.example.app");
```
#### Display list of collection
```java
Charkhoneh.Developer(Context context, String type, String collectionId);
```
Example:
```java
Charkhoneh.Developer(MainActivity.this, "APP", "27501");
```
> **Notice:** You can get your CollectionId id in [Charkhoneh developers panel](https://seller.charkhoneh.com/).

### ParsHub
If you release your app only in Parshub, you can use this methods. If you release your app in Charkhoneh and Parshub markets at onetime, I recommend to use Jhoobin Markets method at top.
#### Display app details
**By application id:**
```java
Parshub.Details(Context context, String type, String appId);
```
Example:
```java
Parshub.Details(MainActivity.this, "APP", "1");
```
> **Notice:** You can get your ApplicationId id in [Jhoobin Markets developers panel](https://seller.jhoobin.com/).

**By package name:**
```java
Parshub.DetailsByPackage(Context context, String packageName);
```
Example:
```java
Parshub.DetailsByPackage(MainActivity.this, "com.example.app");
```
#### Open comment dialog for rating
**By application id:**
```java
Parshub.Comment(Context context, String type, String appId);
```
Example:
```java
Parshub.Comment(MainActivity.this, "APP", "1");
```
**By package name:**
```java
Parshub.CommentByPackage(Context context, String packageName);
```
Example:
```java
Parshub.CommentByPackage(MainActivity.this, "com.example.app");
```
#### Open support section
**By application id:**
```java
Parshub.Support(Context context, String type, String appId);
```
Example:
```java
Parshub.Support(MainActivity.this, "APP", "1");
```
**By package name:**
```java
Parshub.SupportByPackage(Context context, String packageName);
```
Example:
```java
Parshub.SupportByPackage(MainActivity.this, "com.example.app");
```
#### Display list of collection
```java
Parshub.Developer(Context context, String type, String collectionId);
```
Example:
```java
Parshub.Developer(MainActivity.this, "APP", "27501");
```
> **Notice:** You can get your CollectionId id in [Jhoobin Markets developers panel](https://seller.jhoobin.com/).
---
### IranApps
#### Display app details
```java
IranApps.Details(Context context, String packageName);
```
Example:
```java
IranApps.Details(MainActivity.this, "com.example.app");
```
#### Display list of developer apps
```java
IranApps.Developer(Context context, String userName);
```
Example:
```java
IranApps.Developer(MainActivity.this, "exampleUser");
```
#### Open comment dialog for rating
```java
IranApps.Comment(Context context, String packageName);
```
Example:
```java
IranApps.Comment(MainActivity.this, "com.example.app");
```
#### Display list of category apps
```java
IranApps.Category(Context context, String categoryName);
```
Example:
```java
IranApps.Category(MainActivity.this, "exampleCategory");
```
#### Run a search in apps
```java
IranApps.Search(Context context, String query);
```
Example:
```java
IranApps.Search(MainActivity.this, "exampleQuery");
```
---
# Developer
**Owner & Author:** *Alireza Ivaz*
**Website:**  *[alirezaivaz.ir](https://alirezaivaz.ir/)*
**E-Mail:**  *[info@alirezaivaz.ir](mailto:info@alirezaivaz.ir)*
[Soroush+](https://sapp.ir/alirezaivaz), [Rubika](https://rubika.ir/AlirezaIvaz) & [Telegram](https://t.me/AlirezaIvaz): *@AlirezaIvaz*