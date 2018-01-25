package org.jivesoftware.openfire.plugin.tinberry;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.jivesoftware.util.Log;
import org.jivesoftware.openfire.container.Plugin;
import org.jivesoftware.openfire.container.PluginManager;

import java.io.File;

public class TinberryPlugin implements Plugin {



    private Injector injector = Guice.createInjector(new TinberryModule());

    @Override
    public void initializePlugin(PluginManager pluginManager, File file) {
    Log.debug("Lala");
    }

    @Override
    public void destroyPlugin() {

    }
}
