# navigationMenuAnimation
A native library for android to animate navigation Menu in DrawerLayout.

# Prerequisites

Add this in your root ```build.gradle``` file (not your module ```build.gradle``` file):

```
 allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}

```

# Dependency

Add this to your module's ```build.gradle``` file (make sure the version matches the JitPack badge above):
```
dependencies {
	...
	implementation 'com.github.rajeshray:navigationMenuAnimation:1.0.1'
}
```

# Usage


```
  DrawerAnimation drawerAnimation = new DrawerAnimation(drawerLayout,app_bar_main_layout_view,content_main_layout_view);
        drawerAnimation.startAnimation();
```
**Disabling scroll view in navigation View gives a better view.**
```
        drawerAnimation.disableNavigationViewScroll(navigationView);
```       

**Pass** ```END_SCALE``` **value to adjust the main activity view.**

```
 DrawerAnimation drawerAnimation = new DrawerAnimation(drawerLayout,app_bar_main_layout_view,content_main_layout_view,0.4f);
```

**For better understanding check out the sample app inside this repository.**



![Alt text](https://thumbs.gfycat.com/DependableScrawnyGoitered-size_restricted.gif)

# License

```
Copyright [2018] [Rajesh kumar]

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
