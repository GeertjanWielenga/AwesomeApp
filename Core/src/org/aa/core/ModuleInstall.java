package org.aa.core;

import static java.lang.Thread.sleep;
import javax.swing.UIManager;
import org.openide.modules.OnStart;
import org.openide.windows.OnShowing;

@OnShowing
@OnStart
public class ModuleInstall implements Runnable {

    @Override
    public void run() {
        try {
            sleep(500);
        } catch (InterruptedException ex) {
        }
        UIManager.put("EditorTabDisplayerUI", "org.aa.core.NoTabsTabDisplayerUI");
    }

}
