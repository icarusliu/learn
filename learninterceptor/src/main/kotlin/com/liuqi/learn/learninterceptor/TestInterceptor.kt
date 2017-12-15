package com.liuqi.learn.learninterceptor

import org.slf4j.LoggerFactory
import org.springframework.lang.Nullable
import org.springframework.web.servlet.ModelAndView
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class TestInterceptor: HandlerInterceptorAdapter() {
    val logger = LoggerFactory.getLogger(HandlerInterceptorAdapter::class.java)

    /**
     * This implementation always returns `true`.
     */
    @Throws(Exception::class)
    override fun preHandle(request: HttpServletRequest, response: HttpServletResponse, handler: Any): Boolean {
        if (logger.isDebugEnabled) {
            logger.debug("TestInterceptor preHandle begin to execute!");
        }

        return true
    }

    /**
     * This implementation is empty.
     */
    @Throws(Exception::class)
    override fun postHandle(request: HttpServletRequest, response: HttpServletResponse, handler: Any,
                            @Nullable modelAndView: ModelAndView) {
        if (logger.isDebugEnabled) {
            logger.debug("TestInterceptor postHandle begin to execute!");
        }
    }

    /**
     * This implementation is empty.
     */
    @Throws(Exception::class)
    override fun afterCompletion(request: HttpServletRequest, response: HttpServletResponse, handler: Any,
                                 @Nullable ex: Exception) {
        if (logger.isDebugEnabled) {
            logger.debug("TestInterceptor afterCompletion begin to execute!");
        }
    }

    /**
     * This implementation is empty.
     */
    @Throws(Exception::class)
    override fun afterConcurrentHandlingStarted(request: HttpServletRequest, response: HttpServletResponse,
                                                handler: Any) {
        if (logger.isDebugEnabled) {
            logger.debug("TestInterceptor afterConcurrentHandlingStarted begin to execute!");
        }
    }
}