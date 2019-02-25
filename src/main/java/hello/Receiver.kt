package hello

import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import java.util.concurrent.CountDownLatch

class Receiver @Autowired constructor(private var latch: CountDownLatch) {
    private val LOGGER = LoggerFactory.getLogger(Receiver::class.java)

    fun handleMessage(message: String) {
        LOGGER.info("Received <$message>")
        latch.countDown()
    }
}