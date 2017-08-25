package com.mmanrique.bakery

import com.mmanrique.bakery.servlet.BakeryServlet
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.web.servlet.ServletRegistrationBean
import org.springframework.context.annotation.Bean

@SpringBootApplication
class Application {

  @Bean
  def addServlet() = new ServletRegistrationBean(getScalatraServlet, "/*")

  @Bean
  def getScalatraServlet = new BakeryServlet
}

object Application {
  def main(args: Array[String]): Unit = {
    SpringApplication.run(classOf[Application], args: _*)
  }

}