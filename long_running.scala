import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

    val duration = 72 * 60 * 60 * 1000 // Duration in milliseconds (72 hours)
    val endTime = System.currentTimeMillis() + duration
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")

    while (System.currentTimeMillis() < endTime) {
      val currentTime = LocalDateTime.now().format(formatter)
      println(currentTime)
      Thread.sleep(5 * 60 * 1000) // Sleep for 5 minutes (300000 milliseconds)
    }
