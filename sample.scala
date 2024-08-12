import spark.implicits._
import org.apache.spark.storage._
val df = Seq(
  ("John", "Smith", "London"),
  ("David", "Jones", "India"),
  ("Michael", "Johnson", "Indonesia"),
  ("Chris", "Lee", "Brazil"),
  ("Mike", "Brown", "Russia")
).toDF("first_name", "last_name", "country")
 
df.show(false)
