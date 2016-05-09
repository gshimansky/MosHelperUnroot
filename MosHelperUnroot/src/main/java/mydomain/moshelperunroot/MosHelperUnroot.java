package mydomain.moshelperunroot;

import static de.robv.android.xposed.XposedHelpers.findAndHookMethod;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam;

public class MosHelperUnroot implements IXposedHookLoadPackage {
    @Override
    public void handleLoadPackage(final LoadPackageParam lpparam) throws Throwable {
        if(!lpparam.packageName.equals("ru.mos.helper")) {
            return;
        }

        findAndHookMethod("ru.deptrans.moshelper.components.q", lpparam.classLoader, "d", "android.content.Context", new XC_MethodReplacement() {
            @Override
            protected Object replaceHookedMethod(MethodHookParam methodHookParam) throws Throwable {
                return false;
            }
        });
    }
}
