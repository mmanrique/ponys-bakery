package com.mmanrique.bakery.servlet

import org.scalatra.ScalatraServlet
import org.scalatra.scalate.ScalateSupport

class BakeryServlet extends ScalatraServlet with ScalateSupport {

  get("/") {
    contentType = "text/html"
    ssp("/index")
  }
}
