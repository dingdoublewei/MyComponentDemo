package com.dww.demo.componentlib.log;

import com.dww.demo.componentlib.log.impl.DefaultLogger;

/**
 * Created by dww on 2018/7/13.
 */

public interface ILogger {
    String defaultTag = "[DWW-Compo]";
    ILogger logger = new DefaultLogger(defaultTag);

    void showLog(boolean isShowLog);

    void showStackTrace(boolean isShowStackTrace);

    void showMonitor(boolean isShowMonitor);

    void debug(String tag, String message);

    void info(String tag, String message);

    void warning(String tag, String message);

    void error(String tag, String message);

    void monitor(String message);

    boolean isMonitorMode();

    String getDefaultTag();

    void setDefaultTag(String defaultTag);

}
