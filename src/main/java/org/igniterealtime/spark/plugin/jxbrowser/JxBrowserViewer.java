/*
 * Copyright (C) 2018 Ignite Realtime Foundation. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.igniterealtime.spark.plugin.jxbrowser;

import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import org.jivesoftware.spark.component.browser.BrowserViewer;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * A BrowserViewer Service Provider that is based on JxBrowser.
 *
 * Spark uses JxBrowser http://www.teamdev.com/jxbrowser, which is a proprietary software, owned by TeamDev Ltd. The use
 * of JxBrowser is governed by JxBrowser Product Licence Agreement http://www.teamdev.com/jxbrowser-licence-agreement.
 *
 * You may not use JxBrowser separately from the Spark project without explicit permission of TeamDev Ltd.
 *
 * @author Guus der Kinderen, guus.der.kinderen@gmail.com
 * @see <a href="https://www.teamdev.com/jxbrowser">JxBrowser</a>
 */
public class JxBrowserViewer extends BrowserViewer
{
    private Browser browser = new Browser();

    public static void main( String[] args )
    {
        final JxBrowserViewer viewer = new JxBrowserViewer();
        viewer.initializeBrowser();

        final JFrame frame = new JFrame( "Test" );

        frame.getContentPane().setLayout( new BorderLayout() );
        frame.getContentPane().add( viewer, BorderLayout.CENTER );
        frame.setVisible( true );
        frame.pack();
        frame.setSize( 600, 400 );

        viewer.loadURL( "http://igniterealtime.org" );
    }

    @Override
    public void initializeBrowser()
    {
        this.setLayout( new BorderLayout() );

        final BrowserView view = new BrowserView( browser );
        this.add( view, BorderLayout.CENTER );
    }

    @Override
    public void goBack()
    {
        browser.goBack();
    }

    @Override
    public void loadURL( URL url )
    {
        browser.loadURL( url.toExternalForm() );
    }

    @Override
    public void dispose() {
        if ( browser != null )
        {
            browser.dispose();
        }
        browser = null;
    }

    @Override
    public void executeJavaScript( String script ) {
        if ( browser != null )
        {
            browser.executeJavaScript( script );
        }
    }

}
