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

import org.jivesoftware.spark.plugin.Plugin;

/**
 * Implementation of a Spark plugin that adds a BrowserViewer Service provider, based on JxBrowser.
 *
 * Spark uses JxBrowser http://www.teamdev.com/jxbrowser, which is a proprietary software, owned by TeamDev Ltd. The use
 * of JxBrowser is governed by JxBrowser Product Licence Agreement http://www.teamdev.com/jxbrowser-licence-agreement.
 *
 * You may not use JxBrowser separately from the Spark project without explicit permission of TeamDev Ltd.
 *
 * @author Guus der Kinderen, guus.der.kinderen@gmail.com
 * @see <a href="https://www.teamdev.com/jxbrowser">JxBrowser</a>
 */
public class JxBrowserPlugin implements Plugin
{
    @Override
    public void initialize()
    {
    }

    @Override
    public void shutdown()
    {
    }

    @Override
    public boolean canShutDown()
    {
        return true;
    }

    @Override
    public void uninstall()
    {
    }
}
