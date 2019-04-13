# proxy Android SDK

## How to
1. Add it in your root build.gradle at the end of repositories:
```gradle
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
2.  Add the dependency in app build.gradle
```gradle
	dependencies {
	        implementation 'com.github.grapefruitmachine:proxy_sdk:0.1.0'
	}
```
