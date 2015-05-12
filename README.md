# Simple-Spark-Scala-App

* Clone and cd to the app's base dir
* Build the project: ```sbt packge```
* This will create a jar file: ```target/scala-2.10/simpleapp_2.10-1.0.jar```
* Use spark-submit to run your application: ```<YOUR_SPARK_HOME>/bin/spark-submit --class "SimpleApp" --master local[4] target/scala-2.10/simpleapp_2.10-1.0.jar```
