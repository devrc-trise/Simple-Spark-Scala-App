import org.apache.spark.{SparkContext, SparkConf}

/**
 * Created by rcampos on 4/28/15.
 */
object SimpleApp {

  def main(args: Array[String]) {
    // assuming you are using standalone spark, you can use it's own README.md
    val logFile = "README.md"
    // if you are using hdp sandbox, you should upload README.md to hdfs
    // (hdfs dfs -put <path>/<to>/README.md /tmp/) then uncomment line below
    // val logFile = "hdfs://sandbox.hortonworks.com:8020/tmp/README.md"

    val conf = new SparkConf().setAppName("Simple Application")
    val sc= new SparkContext(conf)
    val logData = sc.textFile(logFile, 2).cache()
    val numAs = logData.filter(_.contains("a")).count()
    val numBs = logData.filter(_.contains("b")).count()
    println("Lines with a: %s, Lines with b: %s".format(numAs, numBs))
  }

}

