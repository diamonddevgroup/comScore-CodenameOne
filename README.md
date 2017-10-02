# comScore-CodenameOne
comScore mobile metrix / analytics support for Codename One


comScore Version
================
5.+

Client Keys
===========

Obtain your **C2 Value** and **Publisher Secret Code** by following these steps:

 - Sign up at https://direct.comscore.com/Signup/Signup.aspx
 - Login at https://direct.comscore.com/clients/MobileApp.aspx.
 - If you are redirected to `reset password` page, ignore and enter https://direct.comscore.com/clients/MobileApp.aspx again
 - On Mobile App page, Click **Get Tag** button at the top-center and a Dialog with your **C2 Value** and **Publisher Secret Code** should be shown.


Installation
============

- Download comScore-CodenameOne.cn1lib to your project from CodenameOne Extensions Library (Right-click -> Codename One -> CodenameOne Settings -> Extensions -> Search for comScore)

- Right-click your project and do `Refresh cn1Libs` to generate the necessary classes.


Configuration
=============

Initialize comScore in your `init()` method:

    ComScore.init(context, "your_c2_value", "your_publisher_secret_code");


Usage
=====

**ComScore.notifyEnterForeground();**

Call this method to notify that the application appears on the device screen. Recommend calling this in the `start()` method of Codename One.

**ComScore.notifyExitForeground();**

Call this method to notify that the application no longer appears on the device screen. Recommend calling this in the `stop()` method of Codename One.

**ComScore.notifyUserInteraction();**

Call this method to notify that the user interacted with the application. Recommend calling this in the `actionListener` of button clicks you want track.

**ComScore.notifyUxActive();**

Call this method to notify that the application is executing a task that provides a user experience (e.g. playing music). When the user experience is over you should call `notifyUxActive` to notify it.

**ComScore.notifyUxInactive();**

Call this method to notify that the application finished executing a task that provides a user experience (e.g. playing music). If no user experience task was notified using `notifyUxActive`, calling this method has no effect.

**ComScore.notifyViewEvent(key, value);**

Notifies of a view event. The key-value pair passed as a parameter will override any existing persistent label.

**ComScore.notifyHiddenEvent(key, value);**

Notifies of a hidden event. The key-value pair passed as a parameter will override any existing persistent label.

**ComScore.setPersistentLabel(key, value);**

Sets a persistent label. If the provided key exists, it will be overridden with the new value and if the value is *null*, the label with this key will be removed.

**ComScore.setPersistentLabels(persistentLabels);**

Adds or update the given persistent labels. If any of the provided labels have a *null* value, that label will be removed from the persistent labels. Existing labels that are not present on the given `persistentLabels HashMap`  won't be modified.


Author
======

Diamond Dev Group.


Credits 
======

[comScore][1], for providing the library used for free

[Fabricio Cabeca][2], he wrote the initial version of comScore for Codename One which is based on *comScore version 3.*\*


License
=======

MIT License

Copyright (c) 2017 Diamond Dev Group

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.


  [1]: http://www.comscore.com
  [2]: https://github.com/FabricioCabeca
