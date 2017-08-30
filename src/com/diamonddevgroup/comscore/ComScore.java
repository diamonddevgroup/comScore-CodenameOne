package com.diamonddevgroup.comscore;

import com.codename1.system.NativeLookup;
import java.util.Map;

/**
 *
 * @author Diamond
 */
public class ComScore {

    private static Object ctx;
    private static ComScoreNative cs = NativeLookup.create(ComScoreNative.class);

    /**
     * Initializes comScore<br>
     * <p>
     * You can obtain your C2Value from
     * <a href="https://direct.comscore.com/clients/MobileApp.aspx">comscore.com</a>.<br>
     * First, you will have to SignUp at
     * <a href="https://direct.comscore.com/Signup/Signup.aspx">comScore
     * Signup</a>, then login at
     * https://direct.comscore.com/clients/MobileApp.aspx You may be taken to
     * resetPassword page, just enter
     * https://direct.comscore.com/clients/MobileApp.aspx to access your
     * dashboard.<br>
     * On the dashboard, click "Get Tag" to reveal your C2Value and
     * publisherSecretCode
     *
     *
     * @param context {@code context} parameter in the {@code init} method of
     * CodenameOne main class should be passed here
     * @param c2Value your comScore publisher C2 value
     * @param publisherSecretCode your comScore publisher secret code
     * @param foregroundOnly if you want to analyze foreground usage only,
     * DEFAULT = false
     * @param interval the interval of polling, DEFAULT = 60
     */
    public static void init(Object context, String c2Value, String publisherSecretCode, boolean foregroundOnly, int interval) {
        if (cs != null && cs.isSupported()) {
            ctx = context;
            cs.initComScore(c2Value, publisherSecretCode, foregroundOnly, interval);
        }
    }

    /**
     * Initializes comScore<br>
     * <p>
     * You can obtain your C2Value from
     * <a href="https://direct.comscore.com/clients/MobileApp.aspx">comscore.com</a>.<br>
     * First, you will have to SignUp at
     * <a href="https://direct.comscore.com/Signup/Signup.aspx">comScore
     * Signup</a>, then login at
     * https://direct.comscore.com/clients/MobileApp.aspx You may be taken to
     * resetPassword page, just enter
     * https://direct.comscore.com/clients/MobileApp.aspx to access your
     * dashboard.<br>
     * On the dashboard, click "Get Tag" to reveal your C2Value and
     * publisherSecretCode
     *
     *
     * @param context {@code context} parameter in the {@code init} method of
     * CodenameOne main class should be passed here
     * @param c2Value your comScore publisher C2 value
     * @param publisherSecretCode your comScore publisher secret code
     * @param foregroundOnly if you want to analyze foreground usage only,
     * DEFAULT = false
     */
    public static void init(Object context, String c2Value, String publisherSecretCode, boolean foregroundOnly) {
        init(context, c2Value, publisherSecretCode, foregroundOnly, 60);
    }

    /**
     * Initializes comScore<br>
     * <p>
     * You can obtain your C2Value from
     * <a href="https://direct.comscore.com/clients/MobileApp.aspx">comscore.com</a>.<br>
     * First, you will have to SignUp at
     * <a href="https://direct.comscore.com/Signup/Signup.aspx">comScore
     * Signup</a>, then login at
     * https://direct.comscore.com/clients/MobileApp.aspx You may be taken to
     * resetPassword page, just enter
     * https://direct.comscore.com/clients/MobileApp.aspx to access your
     * dashboard.<br>
     * On the dashboard, click "Get Tag" to reveal your C2Value and
     * publisherSecretCode
     *
     *
     * @param context {@code context} parameter in the {@code init} method of
     * CodenameOne main class should be passed here
     * @param c2Value your comScore publisher C2 value
     * @param publisherSecretCode your comScore publisher secret code
     */
    public static void init(Object context, String c2Value, String publisherSecretCode) {
        init(context, c2Value, publisherSecretCode, false, 60);
    }

    protected static Object getContext() {
        return ctx;
    }

    /**
     * Call this method to notify that the application appears on the device
     * screen.
     */
    public static void notifyEnterForeground() {
        if (cs != null && cs.isSupported()) {
            cs.notifyEnterForeground();
        }
    }

    /**
     * Call this method to notify that the application no longer appears on the
     * device screen.
     */
    public static void notifyExitForeground() {
        if (cs != null && cs.isSupported()) {
            cs.notifyExitForeground();
        }
    }

    /**
     * Call this method to notify that the user interacted with the application
     * (e.g. pressing a button or skipping a song).
     */
    public static void notifyUserInteraction() {
        if (cs != null && cs.isSupported()) {
            cs.notifyUserInteraction();
        }
    }

    /**
     * Call this method to notify that the application is executing a task that
     * provides a user experience (e.g. playing music). When the user experience
     * is over you should call "{@code notifyUxActive}" to notify it.
     */
    public static void notifyUxActive() {
        if (cs != null && cs.isSupported()) {
            cs.notifyUxActive();
        }
    }

    /**
     * Call this method to notify that the application finished executing a task
     * that provides a user experience (e.g. playing music). If no user
     * experience task was notified using "{@code notifyUxActive}", calling this
     * method has no effect.
     */
    public static void notifyUxInactive() {
        if (cs != null && cs.isSupported()) {
            cs.notifyUxInactive();
        }
    }

    /**
     * Notifies of a view event. The key-value pair passed as parameter will
     * override any persistent label.
     *
     * @param key the label key to set
     * @param value a value to apply or null to remove label
     */
    public static void notifyViewEvent(String key, String value) {
        if (cs != null && cs.isSupported()) {
            cs.notifyViewEvent(key, value);
        }
    }

    /**
     * Notifies of a hidden event. The key-value pair passed as parameter will
     * override any persistent label.
     *
     * @param key the label key to set
     * @param value a value to apply or null to remove label
     */
    public static void notifyHiddenEvent(String key, String value) {
        if (cs != null && cs.isSupported()) {
            cs.notifyHiddenEvent(key, value);
        }
    }

    /**
     * Sets a persistent label. If the provided key exists, it will be override
     * with the new value and if the value is *null*, the label with this key
     * will be removed.
     *
     * @param key the label key to set
     * @param value a value to apply or null to remove label
     */
    public static void setPersistentLabel(String key, String value) {
        if (cs != null && cs.isSupported()) {
            cs.setPersistentLabel(key, value);
        }
    }

    /**
     * Adds or update the given persistent labels. If any of the provided labels
     * have a *null* value, that label will be removed from the persistent
     * labels. Existent labels that are not present on the given HashMap won't
     * be modified.
     *
     * @param persistentLabels the labels to set
     */
    public static void setPersistentLabels(Map<String, String> persistentLabels) {
        if (cs != null && cs.isSupported()) {
            for (Map.Entry<String, String> param : persistentLabels.entrySet()) {
                cs.setPersistentLabel(param.getKey(), param.getValue());
            }
        }
    }
}
