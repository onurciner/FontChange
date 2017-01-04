# FontChange <img src="https://jitpack.io/v/10uroi/FontChange.svg"> <a target="_blank" href="https://android-arsenal.com/api?level=14"><img src="https://img.shields.io/badge/API-14%2B-orange.svg"></a>

The easiest way to customize fonts. You can change fonts on direct xml. There are 16 fonts in it. You can directly add your own font to the "assets" folder.

<img src="https://raw.githubusercontent.com/10uroi/FontChange/master/Screenshot/scren1.jpg" height="400" />
 
# How to include
Add the repository to your project **build.gradle**:

```Javascript
repositories {
	maven {
		url "https://jitpack.io"
	}
}
```

And add the library to your module **build.gradle**:

```Javascript
dependencies {
	compile 'com.github.10uroi:FontChange:2.0'
}
```

# Usage
#### Automatically selects the font "Alien_Encounters" installed in
    <com.onurciner.fontchange.FTextView
         app:xfontFamily="Alien_Encounters"
         android:text="Hello World! -> Alien Encounters"
         android:id="@+id/view1"             
         android:layout_marginTop="4dp"
         android:layout_marginBottom="4dp" />
         
#### Selects the font loaded in "Assets->fonts->myfont.tff"
    <com.onurciner.fontchange.FTextView
         app:xfont="fonts/myfont.tff"         
         android:text="My Font"
         android:id="@+id/view1" />
         
#### You can customize the font as you like
    app:xfontFamily="Black_and_White"
    app:xfont="fonts/myfont.tff"
    app:xfontStyle="bold"
    
<h3> You can change EditText, TextView and Button fonts </h3>
 <img src="https://raw.githubusercontent.com/10uroi/FontChange/master/Screenshot/scren3.jpg" height="250" />
 
#### FButton
    <com.onurciner.fontchange.FButton
         android:layout_width="match_parent"
         android:layout_height="wrap_content"
         android:id="@+id/button_my"
         android:text="My Button"
         app:xfontFamily="Friday_13" />

#### FEditText
    <com.onurciner.fontchange.FEditText
         android:layout_width="match_parent"
         android:layout_height="wrap_content"
         android:id="@+id/edittext_my"
         app:xfontFamily="Prismfont" />
