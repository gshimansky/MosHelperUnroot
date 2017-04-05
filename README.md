# MosHelperUnroot
Xposed framework module to remove root check from Moscow Helper (https://play.google.com/store/apps/details?id=ru.mos.helper) application

Application code is obfuscated. Root detection code is in the method ru.deptrans.moshelper.components.v.d(android.content.Context). If this method returns false, it means no root is found. When application version changes sometimes method and its class name changes its name too, so if this module doesn't work, check application binary, maybe "ru.deptrans.moshelper.components.v.d" should be changed to some new string.

Build with gradle under Android Studio.

Module can be downloaded from Xposed repository http://repo.xposed.info/module/mydomain.moshelperunroot

# Русский перевод
Модуль предназначен для удалений проверки на root у андроид приложения "Помощник Москвы" (https://play.google.com/store/apps/details?id=ru.mos.helper).

В коде приложения специально поменяны имена классов и методов с исходных
понятных человеку на одно-двух буквенные обозначения. В данный момент модуль
инструментирует метод с сигнатурой "ru.deptrans.moshelper.components.v.d(android.content.Context)". Инструментированный метод всегда возвращает false, что означает что root не установлен. Но в для будущих версиях приложения это имя может поменяться (это уже неоднократно происходило). Если модуль перестаёт работать после обновления приложения, то необходимо декомпилировать приложение, и проверить какое новое имя было присвоено этому методу.

Модуль собирается с помощью gradle под Android Studio.

Скомпилированную версию можно скачать из репозитория Xposed http://repo.xposed.info/module/mydomain.moshelperunroot
