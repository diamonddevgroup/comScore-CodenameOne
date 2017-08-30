package com.diamonddevgroup.comscore;

import com.codename1.system.NativeInterface;

/**
 * @deprecated don't use native interface directly
 *
 * @author Diamond
 */
public interface ComScoreNative extends NativeInterface {

    public void initComScore(String c2Value, String publisherSecretCode, boolean foregroundOnly, int interval);

    public void notifyEnterForeground();

    public void notifyExitForeground();

    public void notifyUserInteraction();

    public void notifyUxActive();

    public void notifyUxInactive();

    public void notifyViewEvent(String key, String value);

    public void notifyHiddenEvent(String key, String value);

    public void setPersistentLabel(String key, String value);

}
