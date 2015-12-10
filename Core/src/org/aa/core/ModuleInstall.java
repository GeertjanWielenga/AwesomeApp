package org.aa.core;

import static java.lang.Thread.sleep;
import javax.swing.BorderFactory;
import javax.swing.UIManager;
import org.netbeans.swing.tabcontrol.plaf.DefaultTabbedContainerUI;
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
        //Optionally, remove the border too:
        //UIManager.put(DefaultTabbedContainerUI.KEY_EDITOR_CONTENT_BORDER, BorderFactory.createEmptyBorder());
    }

}
