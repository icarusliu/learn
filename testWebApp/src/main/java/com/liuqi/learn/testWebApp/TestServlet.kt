package com.liuqi.learn.testWebApp

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class TestServlet: HttpServlet() {
    val logger: Logger = LoggerFactory.getLogger(TestServlet::class.java)

    override fun doGet(request: HttpServletRequest, response: HttpServletResponse) {
        logger.info("Test servlet begin to execute!");

        response.outputStream.println("TestServlet");

        logger.info("Test servlet has been executed!")
    }
}
