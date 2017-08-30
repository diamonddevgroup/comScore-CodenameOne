package com.diamonddevgroup.comscore;

import com.codename1.impl.android.CodenameOneActivity;
import com.comscore.Analytics;
import com.comscore.PublisherConfiguration;
import com.comscore.UsagePropertiesAutoUpdateMode;
import java.util.HashMap;

public class ComScoreNativeImpl {

    private static CodenameOneActivity app;

    public void initComScore(final String param, final String param1, final boolean param2, final int param3) {
        app = (CodenameOneActivity) ComScore.getContext();
        app.runOnUiThread(new Runnable() {
            public void run() {
                PublisherConfiguration myPublisherConfig = new PublisherConfiguration.Builder()
                        .publisherId(param).publisherSecret(param1)
                        .usagePropertiesAutoUpdateMode(param2 ? UsagePropertiesAutoUpdateMode.FOREGROUND_ONLY
                                : UsagePropertiesAutoUpdateMode.FOREGROUND_AND_BACKGROUND)
                        .usagePropertiesAutoUpdateInterval(param3)
                        .build();
                Analytics.getConfiguration().addClient(myPublisherConfig);
                Analytics.start(app);
            }
        });
    }

    public void notifyExitForeground() {
        app.runOnUiThread(new Runnable() {
            public void run() {
                Analytics.notifyExitForeground();
            }
        });
    }

    public void notifyEnterForeground() {
        app.runOnUiThread(new Runnable() {
            public void run() {
                Analytics.notifyEnterForeground();
            }
        });
    }

    public void notifyUxActive() {
        app.runOnUiThread(new Runnable() {
            public void run() {
                Analytics.notifyUxActive();
            }
        });
    }

    public void notifyViewEvent(final String param, final String param1) {
        final HashMap map = new HashMap();
        map.put(param, param1);
        app.runOnUiThread(new Runnable() {
            public void run() {
                Analytics.notifyViewEvent(map);
            }
        });
    }

    public void notifyUxInactive() {
        app.runOnUiThread(new Runnable() {
            public void run() {
                Analytics.notifyUxInactive();
            }
        });
    }

    public void notifyHiddenEvent(final String param, final String param1) {
        final HashMap map = new HashMap();
        map.put(param, param1);
        app.runOnUiThread(new Runnable() {
            public void run() {
                Analytics.notifyHiddenEvent(map);
            }
        });
    }

    public void notifyUserInteraction() {
        app.runOnUiThread(new Runnable() {
            public void run() {
                Analytics.notifyUserInteraction();
            }
        });
    }

    public void setPersistentLabel(final String param, final String param1) {
        app.runOnUiThread(new Runnable() {
            public void run() {
                Analytics.getConfiguration().setPersistentLabel(param, param1);
            }
        });
    }

    public boolean isSupported() {
        return true;
    }

}
