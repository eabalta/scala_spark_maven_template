import org.apache.log4j._
import org.apache.spark.sql.SparkSession

object Main {
  def main(args: Array[String]): Unit = {
    println("selam2")

    Logger.getLogger("org").setLevel(Level.ERROR)

    //create spark session

    val spark = SparkSession.builder()
      .master("local")
      .appName("deneme")
      .getOrCreate()

    val rdd = spark.sparkContext.parallelize(Seq(1,2,3,4))

    println(rdd.first())
  }
}
