import ch.qos.logback.classic.Level
import ch.qos.logback.classic.filter.ThresholdFilter

def standardPattern = "%d [%t] %-5p %c - %X{X-B3-SpanId} - %X{X-B3-TraceId} - %X{X-B3-ParentSpanId}: %replace(%replace(%msg){'\n',''}){'\r',''} %n"

scan("30 seconds")
appender("CONSOLE", ConsoleAppender) {
    encoder(PatternLayoutEncoder) {
        pattern = standardPattern
    }
    filter(ThresholdFilter) {
        level = TRACE
    }
}

appender("LOGFILE", RollingFileAppender) {
    file = "c:/temp/zuul-application.log"
    rollingPolicy(FixedWindowRollingPolicy) {
        fileNamePattern = "c:/temp/zuul-application_%i.log"
        maxIndex = 10
    }
    triggeringPolicy(SizeBasedTriggeringPolicy) {
        maxFileSize = "5MB"
    }
    encoder(PatternLayoutEncoder) {
        pattern = standardPattern
    }
    filter(ThresholdFilter) {
        level = TRACE
    }
}

logger('net.bull.javamelody', ERROR, ['LOGFILE'], false)
logger('javamelody', ERROR, ['LOGFILE'], false)
logger('org.hibernate', OFF)
logger('org.springframework', OFF)
logger('org.apache', ERROR)
logger('springfox.documentation', OFF)
logger('javax', OFF)
logger('org.aspectj', OFF)
logger('com.netflix', OFF)

root(INFO, ["CONSOLE","LOGFILE"])