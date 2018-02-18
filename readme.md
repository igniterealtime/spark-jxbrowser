Spark's JxBrowser plugin
========
[![Build Status](https://travis-ci.org/igniterealtime/spark-jxbrowser.svg?branch=master)](https://travis-ci.org/igniterealtime/spark-jxbrowser)

About
-----
This project produces a plugin for the [Spark instant messenger](https://igniterealtime.org/projects/spark/). The plugin
adds support for web browsing to Spark, using [JxBrowser](https://www.teamdev.com/jxbrowser).

Various variants of the plugin are produced: platform-specific ones, as well as a cross-platform one that's much larger
in file size.

Download
--------
The compiled plugin, as well as the source code, is available for download on the ['releases' page](https://github.com/igniterealtime/spark-jxbrowser/releases) of this project.

Building
--------
This project is using a Maven-based build process. To build this project yourself, ensure that the following are available on your local host:

* A Java Development Kit, version 8.
* Apache Maven 3

To build this project, invoke on a command shell:

    $ mvn clean package

Upon completion, platform-specific plugins (as well as a cross-platform one that's much larger) will be available in the
`target` directory.

Usage
-----
You only need to drop your newly created jar file into the plugins directory of your Spark client install.

Disclaimer
----------
Spark uses JxBrowser http://www.teamdev.com/jxbrowser, which is a proprietary software, owned by TeamDev Ltd. The use of
JxBrowser is governed by JxBrowser Product Licence Agreement http://www.teamdev.com/jxbrowser-licence-agreement.

You may not use JxBrowser separately from the Spark project without explicit permission of TeamDev Ltd.
