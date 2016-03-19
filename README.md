# MosHelperUnroot
Xposed framework module to remove root check from Moscow Helper (https://play.google.com/store/apps/details?id=ru.mos.helper) application

Application code is obfuscated. Root detection code is in the method ru.deptrans.moshelper.components.o.d(android.content.Context). If this method returns false, it means no root is found.

Build with gradle under Android Studio.
