[![Build Status](https://travis-ci.org/teverett/osgi-example.png?branch=master)](https://travis-ci.org/teverett/osgi-example)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/578be0a3eb514286b36688ac3e6e0579)](https://www.codacy.com/app/teverett/osgi-example?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=teverett/osgi-example&amp;utm_campaign=Badge_Grade)

osgi-example 
============

A simple example which publishes an OSGI service

Building & testing
------

Simply use maven:

`mvn clean package`

Installing and running in Felix
------

Firstly get the Felix framework from [http://felix.apache.org/downloads.cgi](http://felix.apache.org/downloads.cgi)

Secondly extract the Felix runtime and copy the jar file into the `/bundles/` directory.

Finally, run felix

`java -jar bin\felix.jar`

Checking that the bundle is installed
------

From the Felix gogo console type `lb`. You should see something like this:

```
____________________________
Welcome to Apache Felix Gogo

g! lb
START LEVEL 1
   ID|State      |Level|Name
    0|Active     |    0|System Bundle (4.2.1)
    1|Active     |    1|Apache Felix Bundle Repository (1.6.6)
    2|Active     |    1|Apache Felix Gogo Command (0.12.0)
    3|Active     |    1|Apache Felix Gogo Runtime (0.10.0)
    4|Active     |    1|Apache Felix Gogo Shell (0.10.0)
    5|Active     |    1|khubla.com OSGI example jar (1.0.0.SNAPSHOT)
```

To check that the service installed, use the `inspect cap service` command.  In thie case our service id is "5" so:

`inspect cap service` shows:

```
g! inspect cap service 5
osgi-example [5] provides:
--------------------------
service; com.khubla.osgiexample.service.HelloService with properties:
   Language = English
   service.id = 17
```
