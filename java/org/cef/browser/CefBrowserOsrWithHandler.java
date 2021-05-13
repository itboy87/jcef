package org.cef.browser;

import org.cef.CefClient;
import org.cef.handler.CefClientHandler;
import org.cef.handler.CefRenderHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.concurrent.CompletableFuture;

/**
 * Cef offscreen browser that forwards all events to {@link CefRenderHandler}
 *
 * @since api-1.3
 */
public class CefBrowserOsrWithHandler extends CefBrowser_N  {
    private final CefRenderHandler renderHandler_;
    private final Component component_;

    /**
     * @see #CefBrowserOsrWithHandler(CefClient, String, CefRequestContext, CefRenderHandler, Component)
     */
    public CefBrowserOsrWithHandler(CefClient client, String url, CefRequestContext context, CefRenderHandler renderHandler) {
        this(client, url, context, renderHandler, null);
    }

    /**
     * In order for the browser to start loading call {@link #createImmediately()}.
     */
    public CefBrowserOsrWithHandler(CefClient client, String url, CefRequestContext context, CefRenderHandler renderHandler, Component component) {
        this(client, url, context, renderHandler, component, null, null);
    }

    /**
     * Creates a DevTools browser for the provided parent.
     */
    public CefBrowserOsrWithHandler(CefClient client,
                                    String url,
                                    CefRequestContext context,
                                    CefRenderHandler renderHandler,
                                    Component component,
                                    CefBrowser parent,
                                    Point inspectAt)
    {
        super(client, url, context, (CefBrowser_N)parent, inspectAt);
        assert renderHandler != null : "Handler can't be null";
        this.renderHandler_ = renderHandler;
        this.component_ = component;
    }

    @Override
    public CefRenderHandler getRenderHandler() {
        return renderHandler_;
    }

    @Override
    public void createImmediately() {
        if (getParentBrowser() == null) {
            createBrowser(getClient(), 0, getUrl(), true, false, null, getRequestContext());
        } else {
            createDevTools(getParentBrowser(), getClient(), 0, true, false, null, getInspectAt());
        }
    }

    @Override
    public Component getUIComponent() {
        return component_;
    }

    /**
     * Override it in subclasses.
     */
    @Override
    protected CefBrowser createDevToolsBrowser(CefClient client, String url, CefRequestContext context, CefBrowser parent, Point inspectAt) {
        return new CefBrowserOsrWithHandler(client, url, context, renderHandler_);
    }

    @Override
    public CompletableFuture<BufferedImage> createScreenshot(boolean nativeResolution) {
        throw new UnsupportedOperationException("createScreenshot is not yet supported in this class");
    }
}
